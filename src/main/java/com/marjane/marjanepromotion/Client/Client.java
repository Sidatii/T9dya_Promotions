package com.marjane.marjanepromotion.Client;

import com.marjane.marjanepromotion.Person.Person;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@DiscriminatorValue("Client")
@Table(name = "client")
@Getter
@Setter
@ToString
public class Client extends Person {


}
