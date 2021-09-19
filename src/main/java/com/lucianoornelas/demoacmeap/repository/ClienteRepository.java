package com.lucianoornelas.demoacmeap.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucianoornelas.demoacmeap.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	public Optional<Cliente> findByCpf(String cpf);
	
}
