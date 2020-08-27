package com.sinensia.micro1azul.integration.repostory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sinensia.micro1azul.integration.model.CodigoProductoDTO;
import com.sinensia.micro1azul.integration.model.ProductoDTO;

public interface ProductoRepository extends JpaRepository<ProductoDTO, CodigoProductoDTO>{

}
