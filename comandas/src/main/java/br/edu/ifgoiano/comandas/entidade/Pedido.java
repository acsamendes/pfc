package br.edu.ifgoiano.comandas.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	public String nome;
	
	@Column
	public boolean sanduiche;
	
	@Column
	public boolean bebida;
	
	@Column
	public boolean adicional;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isSanduiche() {
		return sanduiche;
	}

	public void setSanduiche(boolean sanduiche) {
		this.sanduiche = sanduiche;
	}

	public boolean isBebida() {
		return bebida;
	}

	public void setBebida(boolean bebida) {
		this.bebida = bebida;
	}

	public boolean isAdicional() {
		return adicional;
	}

	public void setAdicional(boolean adicional) {
		this.adicional = adicional;
	}
}
