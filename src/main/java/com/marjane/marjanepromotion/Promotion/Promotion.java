package com.marjane.marjanepromotion.Promotion;

import Enums.Status;
import jakarta.persistence.*;
import lombok.*;

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
}
