package com.marjane.marjanepromotion.City;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.util.Objects;

@Entity
@Table(name = "city")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class City {
    @Id
    @SequenceGenerator(name = "id", allocationSize = 1, sequenceName = "city_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "city_id")
    @Column(name = "id", nullable = false)
    private Long Id;
    @Column(name = "name", nullable = false)
    private String Name;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        City city = (City) o;
        return getId() != null && Objects.equals(getId(), city.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
