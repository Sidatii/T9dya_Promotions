package com.marjane.marjanepromotion.SuperAdmin;

import com.marjane.marjanepromotion.City.City;
import com.marjane.marjanepromotion.Person.Person;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "super_admin")
@Getter
@Setter
@ToString
@DiscriminatorValue("SuperAdmin")
public class SuperAdmin extends Person {
    @OneToMany(cascade = CascadeType.ALL, targetEntity = City.class, fetch = FetchType.LAZY, mappedBy = "superAdmin")
//    @JoinColumn(name = "super_admin_id")
    @ToString.Exclude
    private List<City> cities;


}
