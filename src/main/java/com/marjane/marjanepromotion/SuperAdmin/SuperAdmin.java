package com.marjane.marjanepromotion.SuperAdmin;

import com.marjane.marjanepromotion.Person.Person;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "super_admin")
@Getter
@Setter
@ToString
@DiscriminatorValue("SuperAdmin")
public class SuperAdmin extends Person {

}
