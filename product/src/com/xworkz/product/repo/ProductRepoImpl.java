package com.xworkz.product.repo;

import com.xworkz.product.dto.ProductDto;

public class ProductRepoImpl implements ProductRepo{

    @Override
    public void saveProductDto(ProductDto productDto) {
        System.out.println("Repo class :Product From front end"+productDto.getName());

    }
}
