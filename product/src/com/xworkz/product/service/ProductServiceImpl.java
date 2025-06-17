package com.xworkz.product.service;

import com.xworkz.product.dto.ProductDto;
import com.xworkz.product.repo.ProductRepo;
import com.xworkz.product.repo.ProductRepoImpl;

public class ProductServiceImpl implements ProductService{


    @Override
    public void saveProduct(ProductDto dto) {
        System.out.println("invoked the productDto  method");
        if(dto!=null){
            //repo
            ProductRepo repo= new ProductRepoImpl();
            System.out.println("Name: "+dto.getName()+"Password "+dto.getPassword());

            repo.saveProductDto(dto);

        }

    }
}
