package com.capgemini.app;

import com.capgemini.data.Product;

import java.math.BigDecimal;

/**
 *
 * {@code Shop} class represents an application that manages Products
 * @version 4.0
 * @author Ebenezer
 */

public class Shop {
    public static void main(String[] args) {
      Product p1 = new Product();
      p1.setId(101);
      p1.setName("Tea");
      p1.setPrice(BigDecimal.valueOf(1.99));
      System.out.println(p1.getId() + " " + p1.getName() + " " + p1.getPrice() + " " +p1.getDiscount());
    }
}
