package com.example.commerce.service;

import com.example.commerce.dto.request.ProductRequest;
import com.example.commerce.dto.response.ProductResponse;
import com.example.commerce.entity.product.Product;
import com.example.commerce.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public ProductResponse create(ProductRequest request) {
        Product product = new Product();
        product.setName(request.getName());
        product.setDescription(request.getDescription());
        product.setPrice(request.getPrice());
        product.setStock(request.getStock());

        Product saved = productRepository.save(product);

        ProductResponse response = new ProductResponse();
        response.setName(saved.getName());
        response.setDescription(saved.getDescription());
        response.setPrice(saved.getPrice());
        response.setStock(saved.getStock());

        return response;
    }

    public List<ProductResponse> getAll() {

        return productRepository.findAll()
                .stream()
                .map(product -> {
                    ProductResponse response = new ProductResponse();
                    response.setName(product.getName());
                    response.setDescription(product.getDescription());
                    response.setPrice(product.getPrice());
                    response.setStock(product.getStock());
                    return response;
                })
                .toList();
    }
}
