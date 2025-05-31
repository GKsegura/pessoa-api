package br.com.josesegura.pessoaapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.josesegura.pessoaapi.model.Pessoa;
import br.com.josesegura.pessoaapi.repository.PessoaRepository;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository repository;

    public List<Pessoa> listar() {
        return repository.findAll();
    }

    public Optional<Pessoa> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Pessoa salvar(Pessoa pessoa) {
        return repository.save(pessoa);
    }

    public Pessoa atualizar(Long id, Pessoa novaPessoa) {
        return repository.findById(id).map(p -> {
            p.setNome(novaPessoa.getNome());
            p.setEmail(novaPessoa.getEmail());
            p.setIdade(novaPessoa.getIdade());
            p.setDataNascimento(novaPessoa.getDataNascimento());
            return repository.save(p);
        }).orElseThrow(() -> new RuntimeException("Pessoa não encontrada"));
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
