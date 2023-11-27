package com.marjane.marjanepromotion.Admin;

import com.marjane.marjanepromotion.Center.Center;
import com.marjane.marjanepromotion.Person.Person;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.proxy.HibernateProxy;

import java.util.Date;
import java.util.Objects;


@Entity(name = "Admin")
@Getter
@Setter
@ToString
@Table(name = "admin")
@DiscriminatorValue("Admin")
@RequiredArgsConstructor
public class Admin extends Person {

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "center_id", referencedColumnName = "id")
    private Center center;
    public Admin(String firstName, String lastName, String email, String password, Center center) {
        super(firstName, lastName, email, password);
        setCenter(center);
    }

}
