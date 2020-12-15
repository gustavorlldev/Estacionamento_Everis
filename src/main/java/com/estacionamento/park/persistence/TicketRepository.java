package com.estacionamento.park.persistence;

import com.estacionamento.park.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TicketRepository extends JpaRepository <Ticket, Long> {

}
