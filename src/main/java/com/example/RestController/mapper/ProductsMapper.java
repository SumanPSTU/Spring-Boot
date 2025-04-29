package com.example.RestController.mapper;

import com.example.RestController.dto.ProductsDTO;
import com.example.RestController.entity.Category;
import com.example.RestController.entity.Product;

public class ProductsMapper {
    public static ProductsDTO toProductDTO(Product product){
        return new ProductsDTO(
                product.getId(),
                product.getName(),product.getDescription(),product.getPrice(),product.getCategory().getId()
        );
    }
    public static Product toProductEntity(ProductsDTO productsDTO, Category category){
        Product product = new Product();
        product.setName(productsDTO.getName());
        product.setDescription(productsDTO.getDescription());
        product.setPrice(productsDTO.getPrice());
        product.setCategory(category);

        return product;
    }
}
