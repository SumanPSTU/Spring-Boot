package com.example.RestController.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductsDTO {

    private Long id;
    private String name;
    private String description;
    private double price;
    private Long categoryId;
}
