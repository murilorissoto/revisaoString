package com.senai.murilo.prjCliente.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.senai.murilo.prjCliente.entities.Pedido;
import com.senai.murilo.prjCliente.repositories.PedidoRepository;
@Service
public class PedidoService {
	private final PedidoRepository pedidoRepository;

	public PedidoService(PedidoRepository pedidoRepository) {
		this.pedidoRepository = pedidoRepository;
	}

	public Pedido savePedido(Pedido pedido) {
		return pedidoRepository.save(pedido);
	}

	public Pedido getPedidoById(Long id) {
		return pedidoRepository.findById(id).orElse(null);
	}

	public List<Pedido> getAllPedido() {
		return pedidoRepository.findAll();
	}

	public void deleteCliente(Long id) {
		pedidoRepository.deleteById(id);
	}

	public void deletePedido(Long id) {
		// TODO Auto-generated method stub

	}
}