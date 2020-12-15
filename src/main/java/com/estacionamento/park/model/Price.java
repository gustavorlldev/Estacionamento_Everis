package com.estacionamento.park.model;

import java.math.BigDecimal;

public class Price {

    private BigDecimal firstHour;
    private BigDecimal extraHour;

    public Price(final BigDecimal firstHour, final BigDecimal extraHour) {
        this.firstHour = firstHour;
        this.extraHour = extraHour;
    }
    Ticket ticket;

    public Price(Ticket ticket){
        this.ticket = ticket;
    }


    public BigDecimal getFirstHour() {
        return firstHour;
    }

    public void setFirstHour(final BigDecimal firstHour) {
        this.firstHour = firstHour;
    }

    public BigDecimal getExtraHour() {
        return extraHour;
    }

    public void setExtraHour(final BigDecimal extraHour) {
        this.extraHour = extraHour;
    }
}
