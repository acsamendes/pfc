package br.edu.ifgoiano.comandas.controle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ComandasController {
	
	@GetMapping("/comandas")
	public String principal() {
		return "telaPrincipal";
	}
	
	@GetMapping("/comandas/cadastro")
	public String cadastrar() {
		return "cadastro";
	}
	
	@GetMapping("/comandas/pendentes")
	public String pendentes() {
		return "cozinha";
	}
	
	@GetMapping("/comandas/cliente")
	public String cliente() {
		return "cliente";
	}
	
}
