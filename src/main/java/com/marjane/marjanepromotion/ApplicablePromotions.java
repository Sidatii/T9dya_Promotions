package com.marjane.marjanepromotion;

import com.marjane.marjanepromotion.Category.Category;
import com.marjane.marjanepromotion.Product.Product;
import com.marjane.marjanepromotion.Promotion.Promotion;
import jakarta.persistence.*;

import java.util.Date;

@Entity(name = "ApplicablePromotions")
@Table(name = "applicable_promotions")
public class ApplicablePromotions {
    @Id
    @SequenceGenerator(name = "id", sequenceName = "applicable_promotions_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "applicable_promotions_id")
    private Long Id;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "promotion_id")
    private Promotion promotion;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(name = "created_at")
    private Date CreatedAt;

}
