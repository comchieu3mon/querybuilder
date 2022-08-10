package com.duccao.querybuilder.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Table(name = "product")
@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
public class Product extends BaseTimestampEntity {

  String name;

  double price;

  String description;

  boolean availability;

  String imagePath;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "category_id")
  Category category;
}
