package com.example.springboot.models;

import jakarta.persistence.*;
import lombok.Data;

import javax.annotation.processing.Generated;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "TB_PRODUCTS")
@Data
public class ProductModel implements Serializable {
    private static final long serialVersionID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;
    private BigDecimal value;



}
