package com.caputo.productsystem.dto;

import com.caputo.productsystem.entities.Product;
import lombok.*;

import java.io.Serializable;
import java.time.Instant;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ProductUpdateDTO implements Serializable {
    public static final Long serialVersionUID = 1L;

    @EqualsAndHashCode.Include
    private Long id;

    private String name;
    private Double price;
    private Integer quantity;
    private Instant update;

    public ProductUpdateDTO(Product entity){
        id = entity.getId();
        name = entity.getName();
        price = entity.getPrice();
        quantity = entity.getQuantity();
        update = entity.getUpdate();
    }
}
