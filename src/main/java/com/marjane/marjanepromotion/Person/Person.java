package com.marjane.marjanepromotion.Person;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.util.Objects;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name = "Person", discriminatorType = DiscriminatorType.STRING)
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class Person {
    @Id
    @SequenceGenerator(name = "Id", allocationSize = 1, sequenceName = "person_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "person_id")
    private Long Id;
    @Column(name = "first_name", nullable = false)
    private String FirstName;
    @Column(name = "last_name", nullable = false)
    private String LastName;
    @Column(name = "email", unique = true, nullable = false)
    private String Email;
    @Column(name = "password", nullable = false)
    private String Password;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        Person person = (Person) o;
        return getId() != null && Objects.equals(getId(), person.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
