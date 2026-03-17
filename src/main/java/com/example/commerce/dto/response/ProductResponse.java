package com.example.commerce.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductResponse {
    private String name;
    private String description;
    private double price;
    private int stock;
}
