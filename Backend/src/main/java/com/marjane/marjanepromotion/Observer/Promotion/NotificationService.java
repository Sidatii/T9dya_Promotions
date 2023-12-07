package com.marjane.marjanepromotion.Observer.Promotion;

import com.marjane.marjanepromotion.LineResponsible.LineResponsible;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class NotificationService {
    private final List<LineResponsible> lineResponsibles;

    public NotificationService() {
        this.lineResponsibles = new ArrayList<>();
    }

    public void subscribe(LineResponsible lineResponsible) {
        lineResponsibles.add(lineResponsible);
    }

    public void unsubscribe(LineResponsible lineResponsible) {
        lineResponsibles.remove(lineResponsible);
    }

    public void notifyPromotion(){
        lineResponsibles.forEach(LineResponsible::update);
    }
}
