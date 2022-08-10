package com.duccao.querybuilder.entity;

import static lombok.AccessLevel.PACKAGE;
import static lombok.AccessLevel.PRIVATE;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Table(name = "category")
@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = PACKAGE)
@FieldDefaults(level = PRIVATE)
@ToString
@EqualsAndHashCode
public class Category extends BaseTimestampEntity {

  @Column(name = "name")
  String name;

  @Column(name = "description")
  String description;

  @Builder.Default
  @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "category",
      orphanRemoval = true)
  private List<Product> products = new ArrayList<>();

  public void addProduct(Product product) {
    products.add(product);
    product.setCategory(this);
  }

  public void removeProduct(Product product) {
    products.remove(product);
    product.setCategory(null);
  }
}