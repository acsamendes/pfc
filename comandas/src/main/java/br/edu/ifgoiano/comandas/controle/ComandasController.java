package br.edu.ifgoiano.comandas.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.ifgoiano.comandas.entidade.Pedido;
import br.edu.ifgoiano.comandas.repositorio.PedidoRepository;
import br.edu.ifgoiano.comandas.servico.ComandasService;
import br.edu.ifgoiano.comandas.servico.ComandasServiceImpl;


@Controller
public class ComandasController {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	private final ComandasService comandasServiceImpl;
	
	@GetMapping("/comandas")
	public String principal() {
		return "telaPrincipal";
	}
	
	@GetMapping("/comandas/cadastro")
	public String cadastrar(Model model) {
		Pedido pedido = new Pedido();
		model.addAttribute("pedido", pedido);
		return "cadastro";
	}
	
	@GetMapping("/comandas/pendentes")
	public String pendentes(Pedido pedido) {
		pedidoRepository.save(pedido);
		return "cozinha";
	}
	
	@GetMapping("/comandas/cliente")
	public String cliente() {
		return "cliente";
	}
	
	public ComandasController(ComandasServiceImpl comandasServiceImpl) {
		this.comandasServiceImpl = comandasServiceImpl;
	}
	
	@GetMapping("/comandas/listar")
	public String listarPedidos(Model model) {
		model.addAttribute("pedido",comandasServiceImpl.listarPedidos());		
		return "cozinha";
	}
	
	@PostMapping("/comandas/cadastrar")
	public String cadastrarPedido(Pedido pedido) {
		//inserir o pedido no BD
		pedidoRepository.save(pedido);
		return "cadastro";
	}
	
	
}
