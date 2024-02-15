package com.senai.murilo.prjCliente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.senai.murilo.prjCliente.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
