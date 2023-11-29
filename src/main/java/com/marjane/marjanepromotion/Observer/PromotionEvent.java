package com.marjane.marjanepromotion.Observer;

import com.marjane.marjanepromotion.Promotion.DTO.PromotionRequestDTO;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

@Setter
@Getter
public class PromotionEvent extends ApplicationEvent {
    private final PromotionRequestDTO promotionRequestDTO;

    public PromotionEvent(Object source, PromotionRequestDTO promotionRequestDTO) {
        super(source);
        this.promotionRequestDTO = promotionRequestDTO;
    }
}
