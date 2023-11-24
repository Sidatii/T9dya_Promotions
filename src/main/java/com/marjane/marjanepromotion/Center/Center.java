package com.marjane.marjanepromotion.Center;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "center")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
//@NoArgsConstructor
public class Center {
    @Id
    @SequenceGenerator(name = "id", allocationSize = 1, sequenceName = "center_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "center_id")
    private Long Id;
    @Column(name = "name", nullable = false)
    private String Name;
}
