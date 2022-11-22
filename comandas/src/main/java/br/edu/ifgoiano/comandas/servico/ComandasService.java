package br.edu.ifgoiano.comandas.servico;

import java.util.List;

import br.edu.ifgoiano.comandas.entidade.Pedido;

public interface ComandasService {
	public List<Pedido> listarPedidos();
	
	public Pedido cadastrarPedido(Pedido pedido);
	
}
