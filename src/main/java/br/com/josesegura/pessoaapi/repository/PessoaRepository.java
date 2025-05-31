package br.com.josesegura.pessoaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.josesegura.pessoaapi.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
