package com.marjane.marjanepromotion.LineResponsible;

import com.marjane.marjanepromotion.Person.Person;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
@Entity
@Table(name = "line_responsible")
@Setter
@Getter
@ToString
@DiscriminatorValue("LineResponsible")
public class LineResponsible extends Person {

}
