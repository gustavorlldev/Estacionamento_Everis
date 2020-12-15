package com.estacionamento.park.service;

import com.estacionamento.park.model.Price;
import com.estacionamento.park.model.Ticket;
import com.estacionamento.park.model.Vehicle;
import com.estacionamento.park.persistence.TicketRepository;
import com.estacionamento.park.persistence.VehicleRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.math.BigDecimal;
import java.nio.channels.Pipe;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Optional;

@Service
public class TicketService {

    private final TicketRepository ticketRepository;
    private final VehicleService vehicleService;
    TicketService ticketService;
    VehicleRepository vehicleRepository;
    Vehicle vehicle;
    Ticket ticket;
    Price price;



    public TicketService(TicketRepository ticketRepository, VehicleService vehicleService) {
        this.ticketRepository = ticketRepository;
        this.vehicleService = vehicleService;
    }

    public Ticket create(final Ticket ticket) {
        Vehicle vehicle = vehicleService.saveIfNotExists(ticket.getVehicle());
        ticket.setVehicle(vehicle);
        ticket.setTimeIn(LocalDateTime.now());
        return ticketRepository.save(ticket);
    }


    //Metodo RETIRADA
    public Ticket update(final Ticket ticket) {
        long between = ChronoUnit.MINUTES.between(ticket.getTimeIn(), ticket.getTimeOut());
        return ticketRepository.save(ticket);
    }



    public List<Ticket> list() {
        return ticketRepository.findAll();
    }
}
