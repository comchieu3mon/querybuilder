package com.duccao.querybuilder.mapper;

import com.duccao.querybuilder.dto.ProductDto;
import com.duccao.querybuilder.entity.Product;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring",
    nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface ProductMapper {

  @Mapping(target = "categoryId", source = "product.category.id")
  ProductDto toProductDto(Product product);

  List<ProductDto> toProductDtos(List<Product> productList);
}
