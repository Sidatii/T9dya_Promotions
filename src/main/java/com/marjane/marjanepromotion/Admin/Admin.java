package com.marjane.marjanepromotion.Admin;

import com.marjane.marjanepromotion.Person.Person;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.util.Objects;


@Entity(name = "Admin")
@Getter
@Setter
@ToString
@Table(name = "admin")
@DiscriminatorValue("Admin")
public class Admin extends Person {

}
