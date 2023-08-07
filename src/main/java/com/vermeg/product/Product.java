package com.vermeg.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//auto increment
    private Integer idproduit;

    private String nomProduit;
    @Temporal(TemporalType.DATE)
    private Date dataCreation;
}
