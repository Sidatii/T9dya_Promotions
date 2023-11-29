package com.marjane.marjanepromotion.Promotion;

import Enums.Status;
import com.marjane.marjanepromotion.ApplicablePromotions.ApplicablePromotions;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

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
    @Enumerated
    private Status Status;

    @OneToMany(mappedBy = "promotion", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<ApplicablePromotions> applicablePromotions;

    @Column(name = "created_at")
    @CreationTimestamp
    private Date CreatedAt;
    @Column(name = "updated_at")
    @UpdateTimestamp
    private Date UpdatedAt;
}
