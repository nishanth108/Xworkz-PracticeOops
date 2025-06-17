package com.xworkz.product.dto;

public class ProductDto {
   private String name;
   private String password;

   public ProductDto(){
       System.out.println("Creating the dto Constructor");
   }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
