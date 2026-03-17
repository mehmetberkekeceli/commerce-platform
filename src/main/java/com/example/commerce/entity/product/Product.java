package com.example.commerce.entity.product;

import com.example.commerce.entity.base.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "products")
@Getter
@Setter
public class Product extends BaseEntity {

    private String name;

    private String description;

    private double price;

    private int stock;
}
