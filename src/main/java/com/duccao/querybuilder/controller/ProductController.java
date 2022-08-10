package com.duccao.querybuilder.controller;

import com.duccao.querybuilder.dto.ProductDto;
import com.duccao.querybuilder.mapper.ProductMapper;
import com.duccao.querybuilder.repository.ProductRepository;
import com.duccao.querybuilder.repository.specification.ProductSpecification;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

  private final ProductRepository productRepository;
  private final ProductMapper productMapper;

  public ProductController(ProductRepository productRepository, ProductMapper productMapper) {
    this.productRepository = productRepository;
    this.productMapper = productMapper;
  }

  @GetMapping
  public ResponseEntity<List<ProductDto>> findAll() {
    return ResponseEntity.ok(productMapper.toProductDtos(productRepository.findAll(
        ProductSpecification.nameLike("Eazzy"))));
  }

  @GetMapping("/ducaao")
  public ResponseEntity<String> sayHi() {
    return ResponseEntity.ok("Duccao");
  }
}
