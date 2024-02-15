package com.senai.murilo.prjCliente.controllers;

import java.util.List;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.murilo.prjCliente.entities.Pedido;
import com.senai.murilo.prjCliente.services.PedidoService;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
	private final PedidoService pedidoService;

	public PedidoController(PedidoService pedidoService) {
		this.pedidoService = pedidoService;
	}
	@PostMapping
	public Pedido createPedido(@RequestBody Pedido pedido) {
		return pedidoService.savePedido(pedido);
	}
	@GetMapping("/{id}")
	public Pedido getPedido(@PathVariable Long id) {
	return pedidoService.getPedidoById(id);
	}
	@GetMapping
	public List<Pedido> getAllPedido(){
		return pedidoService.getAllPedido();
	}
	@DeleteMapping
	public void deletePedido(@PathVariable Long id) {
		pedidoService.deletePedido(id);
	}
	}

