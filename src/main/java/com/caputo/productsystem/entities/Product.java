package com.caputo.productsystem.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "tb_product")
public class Product implements Serializable {
    public static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    private String name;
    private Double price;
    private Integer quantity;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant date;

    // Atributo acrescentado para atualizar a data de cadastro do produto
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant update;

    @PrePersist
    public void prePersist() {
        date = Instant.now();
    }

    @PreUpdate
    public void preUpdate(){
        update = Instant.now();
    }
}
