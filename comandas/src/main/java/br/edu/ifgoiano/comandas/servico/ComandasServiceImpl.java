package br.edu.ifgoiano.comandas.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifgoiano.comandas.entidade.Pedido;
import br.edu.ifgoiano.comandas.repositorio.PedidoRepository;

@Service
public class ComandasServiceImpl implements ComandasService{

	@Autowired
	private PedidoRepository pedidoRepository;
	
	@Override
	public List<Pedido> listarPedidos() {
		return pedidoRepository.findAll();
	}

	@Override
	public Pedido cadastrarPedido(Pedido pedido) {
		return this.pedidoRepository.save(pedido);
	}

}
