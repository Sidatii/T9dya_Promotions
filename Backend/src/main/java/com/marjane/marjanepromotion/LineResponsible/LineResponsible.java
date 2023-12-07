package com.marjane.marjanepromotion.LineResponsible;

import com.marjane.marjanepromotion.Category.Category;
import com.marjane.marjanepromotion.Observer.Promotion.EventListener;
import com.marjane.marjanepromotion.Person.Person;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "line_responsible")
@Setter
@Getter
@ToString
@DiscriminatorValue("LineResponsible")
public class LineResponsible extends Person implements EventListener {
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, targetEntity = Category.class)
    @JoinColumn(name = "category_id")
    private Category category;

    @Override
    public void update() {

    }
}
