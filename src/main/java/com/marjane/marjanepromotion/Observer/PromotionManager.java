package com.marjane.marjanepromotion.Observer;

import org.springframework.stereotype.Component;

@Component
public class PromotionManager implements PromotionListener{
    @Override
    public void notifyPromotion() {
        System.out.println("received promotion notification");
    }
}
