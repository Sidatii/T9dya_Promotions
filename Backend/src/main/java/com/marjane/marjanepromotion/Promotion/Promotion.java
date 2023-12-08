package com.marjane.marjanepromotion.Promotion;

import Enums.Status;
import com.marjane.marjanepromotion.ApplicablePromotions.ApplicablePromotions;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Time;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

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
    @Column(name = "status", nullable = false, columnDefinition = "VARCHAR(255) DEFAULT 'defaultValue'")
    private Status Status;

    @OneToMany(mappedBy = "promotion", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @ToString.Exclude
    private List<ApplicablePromotions> applicablePromotions;

    @Column(name = "expiry_date")
    private Date Expiry;

    @Transient
    private int Validity;

    @Column(name = "created_at")
    @CreationTimestamp
    private Date CreatedAt;
    @Column(name = "updated_at")
    @UpdateTimestamp
    private Date UpdatedAt;

    public int getValidity(){
        long diff = this.Expiry.getTime() - this.CreatedAt.getTime();
        return (int) TimeUnit.MILLISECONDS.toDays(diff);

    }
}
