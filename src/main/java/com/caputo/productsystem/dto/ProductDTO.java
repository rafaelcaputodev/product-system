package com.caputo.productsystem.dto;

import com.caputo.productsystem.entities.Product;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Positive;
import java.io.Serializable;
import java.time.Instant;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class ProductDTO implements Serializable {
    public static final Long serialVersionUID = 1L;

    @EqualsAndHashCode.Include
    private Long id;

    @NotBlank(message = "Campo Obrigatório")
    private String name;

    @Positive(message = "Preço deve ser positivo")
    private Double price;

    @Positive(message = "Quantidade deve ser superior a 0")
    private Integer quantity;

    @PastOrPresent(message = "Data do produto não pode ser futura")
    private Instant date;

    @PastOrPresent(message = "Data do produto não pode ser futura")
    private Instant update;

    public ProductDTO(Product entity){
            id = entity.getId();
            name = entity.getName();
            price = entity.getPrice();
            quantity = entity.getQuantity();
            date = entity.getDate();
            update = entity.getUpdate();
        }
}

