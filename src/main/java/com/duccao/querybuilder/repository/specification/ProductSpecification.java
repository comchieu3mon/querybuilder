package com.duccao.querybuilder.repository.specification;

import com.duccao.querybuilder.entity.Product;
import com.duccao.querybuilder.entity.Product_;
import org.apache.logging.log4j.util.Strings;
import org.springframework.data.jpa.domain.Specification;

public class ProductSpecification {

  private static final String PERCENT_CHARACTER = "%";

  private static final StringBuilder builder = new StringBuilder();

  public static Specification<Product> nameLike(String productName) {
    var test = 5;
    return (root, query, criteriaBuilder) ->
        criteriaBuilder.like(root.get(Product_.NAME),
            "%" + productName + "%");
  }

}
