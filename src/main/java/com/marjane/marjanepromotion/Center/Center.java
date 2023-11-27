package com.marjane.marjanepromotion.Center;

import com.marjane.marjanepromotion.Admin.Admin;
import com.marjane.marjanepromotion.City.City;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

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
    @Column(name = "id")
    private Long Id;
    @Column(name = "name", nullable = false)
    private String Name;
    @ManyToOne(targetEntity = City.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private City city;

    @Column(name = "created_at")
    @CreationTimestamp
    private Date CreatedAt;
    @Column(name = "updated_at")
    @UpdateTimestamp
    private Date UpdatedAt;

    public Center(String name){
        setName(name);
    }
}
