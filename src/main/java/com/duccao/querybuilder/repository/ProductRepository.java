package com.duccao.querybuilder.repository;

import com.duccao.querybuilder.entity.Product;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProductRepository extends JpaRepository<Product, UUID>,
    JpaSpecificationExecutor<Product> {

}
