package com.senai.murilo.prjCliente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.senai.murilo.prjCliente.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
