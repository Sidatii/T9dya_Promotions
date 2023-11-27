package com.marjane.marjanepromotion.LoyaltyCard;

import com.marjane.marjanepromotion.Client.Client;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.proxy.HibernateProxy;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "loyalty_card")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class LoyaltyCard {
    @Id
    @SequenceGenerator(name = "id", allocationSize = 1, sequenceName = "loyalty_card_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "loyalty_card_id")
    private Long Id;
    @Column(name = "total")
    private Double Total;
    @OneToOne(targetEntity = Client.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Client client;
    @Column(name = "created_at")
    @CreationTimestamp
    private Date CreatedAt;
    @Column(name = "updated_at")
    @UpdateTimestamp
    private Date UpdatedAt;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        LoyaltyCard that = (LoyaltyCard) o;
        return getId() != null && Objects.equals(getId(), that.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
