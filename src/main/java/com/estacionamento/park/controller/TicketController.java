package com.estacionamento.park.controller;

import com.estacionamento.park.model.Ticket;
import com.estacionamento.park.model.Vehicle;
import com.estacionamento.park.service.TicketService;
import com.estacionamento.park.service.VehicleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tickets")
public class TicketController {


     TicketService ticketService;
     Vehicle vehicle;
     Ticket ticket;
     VehicleService vehicleService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @PostMapping()
    public Ticket createTicket(@RequestBody Vehicle vehicle){
        return ticketService.create(new Ticket(vehicle));
    }

    @PutMapping()
    public Ticket update(@RequestBody Ticket ticket) {
        return ticketService.update(ticket);
    }


    @GetMapping()
    public List<Ticket> list() {
        return ticketService.list();
    }



}
