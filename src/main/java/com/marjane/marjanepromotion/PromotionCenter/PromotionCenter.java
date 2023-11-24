package com.marjane.marjanepromotion.PromotionCenter;

import com.marjane.marjanepromotion.Admin.Admin;
import com.marjane.marjanepromotion.Center.Center;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "promotion_center")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class PromotionCenter {
    @Id
    private Long Id;
    @ManyToOne
    @JoinColumn(name = "admin_id")
    private Admin admin;
    @ManyToOne
    @JoinColumn(name = "center_id")
    private Center center;
}
