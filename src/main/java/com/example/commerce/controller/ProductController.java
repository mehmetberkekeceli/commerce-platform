package com.example.commerce.controller;

import com.example.commerce.dto.request.ProductRequest;
import com.example.commerce.dto.response.ProductResponse;
import com.example.commerce.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public ProductResponse create(@RequestBody ProductRequest request) {
        return productService.create(request);
    }

    @GetMapping
    public List<ProductResponse> getAll() {
        return productService.getAll();
    }
}
