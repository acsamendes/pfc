package br.edu.ifgoiano.comandas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifgoiano.comandas.entidade.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
