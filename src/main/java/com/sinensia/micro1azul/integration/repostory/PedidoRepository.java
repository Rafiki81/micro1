package com.sinensia.micro1azul.integration.repostory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sinensia.micro1azul.integration.model.PedidoDTO;

@Repository
public interface PedidoRepository extends JpaRepository<PedidoDTO, Long>{

}
