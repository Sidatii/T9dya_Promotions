package com.marjane.marjanepromotion.Promotion;

import Enums.Status;
import com.github.javafaker.Cat;
import com.marjane.marjanepromotion.ApplicablePromotions;
import com.marjane.marjanepromotion.Category.Category;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "promotion")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class Promotion {
    @Id
    @SequenceGenerator(name = "id", initialValue = 1, sequenceName = "promotion_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "promotion_id")
    @Column(name = "id", nullable = false)
    private Long Id;
    @Column(name = "rate", nullable = false, precision = 2)
    private Double Rate;
    @Column(name = "status", nullable = false)
    private Status Status;
//    @ManyToMany(
//            cascade = {CascadeType.PERSIST, CascadeType.REMOVE}
//    )
//    @JoinTable(
//            name = "promotion_category",
//            joinColumns = @JoinColumn(
//                    name = "promotion_id",
//                    foreignKey = @ForeignKey(name = "category_promotion_id_fk")
//            ),
//            inverseJoinColumns = @JoinColumn(
//                    name = "category_id",
//                    foreignKey = @ForeignKey(name = "promotion_category_id_fk")
//            )
//    )
//    private List<Category> categories = new ArrayList<>();

    @OneToMany(mappedBy = "promotion", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<ApplicablePromotions> applicablePromotions;

    @Column(name = "created_at")
    @CreationTimestamp
    private Date CreatedAt;
    @Column(name = "updated_at")
    @UpdateTimestamp
    private Date UpdatedAt;
}
