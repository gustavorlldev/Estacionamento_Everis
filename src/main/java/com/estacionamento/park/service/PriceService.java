package com.estacionamento.park.service;

import com.estacionamento.park.model.Price;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class PriceService {

    @Value("${application.price.first}")
    private BigDecimal firstHour;

    @Value("${application.price.extra}")
    private BigDecimal extraHour;

    public Price getPrice() {
        return new Price(firstHour, extraHour);
    }
}
