const fs = require('fs');
const https = require('https');
const http = require('http');

const filePath = 'README.md'; // ou o arquivo que quiser checar
const linkRegex = /\[.*?\]\((https?:\/\/.*?)\)/g;

const readFile = (path) => fs.readFileSync(path, 'utf-8');

const checkUrl = (url) =>
    new Promise((resolve) => {
        const client = url.startsWith('https') ? https : http;
        const req = client.request(url, { method: 'HEAD' }, (res) => {
            resolve({ url, status: res.statusCode, ok: res.statusCode < 400 });
        });
        req.on('error', () => resolve({ url, status: 'Error', ok: false }));
        req.end();
    });

async function main() {
    const content = readFile(filePath);
    const links = [];
    let match;

    while ((match = linkRegex.exec(content)) !== null) {
        links.push(match[1]);
    }

    console.log(`Found ${links.length} links. Verifying...`);

    for (const url of links) {
        const { status, ok } = await checkUrl(url);
        console.log(`${ok ? '✅' : '❌'} ${url} - Status: ${status}`);
    }
}

main();
