package com.marjane.marjanepromotion.Client;

import com.marjane.marjanepromotion.LoyaltyCard.LoyaltyCard;
import com.marjane.marjanepromotion.Person.Person;
import jakarta.persistence.*;
import lombok.*;

@Entity
@DiscriminatorValue("Client")
@Table(name = "client")
@Getter
@Setter
@ToString
public class Client extends Person {
    @OneToOne(fetch = FetchType.EAGER, targetEntity = LoyaltyCard.class, cascade = CascadeType.ALL)
    private LoyaltyCard loyaltyCard;


}
