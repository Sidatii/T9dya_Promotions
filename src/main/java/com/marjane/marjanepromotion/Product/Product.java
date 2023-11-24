package com.marjane.marjanepromotion.Product;

import com.marjane.marjanepromotion.Category.Category;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
@Table(name = "product")
public class Product {
    @Id
    @SequenceGenerator(name = "id", allocationSize = 1, sequenceName = "product_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_id")
    @Column(name = "id", nullable = false)
    private Long Id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "quantity")
    private int Quantity;
    @Column(name = "price", nullable = false)
    private Double Price;
    @ManyToOne
    private Category category;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        Product product = (Product) o;
        return getId() != null && Objects.equals(getId(), product.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
