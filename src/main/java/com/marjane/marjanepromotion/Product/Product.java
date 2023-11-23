package com.marjane.marjanepromotion.Product;

import com.marjane.marjanepromotion.Category.Category;
import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long Id;
    private String name;
    private int Quantity;
    @ManyToOne
    private Category category;
}
