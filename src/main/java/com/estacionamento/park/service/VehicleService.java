package com.estacionamento.park.service;

import com.estacionamento.park.model.Ticket;
import com.estacionamento.park.model.Vehicle;
import com.estacionamento.park.persistence.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class VehicleService {

     VehicleRepository vehicleRepository;


    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public Vehicle saveIfNotExists(final Vehicle vehicle) {
        Vehicle entity = vehicleRepository.findByPlate(vehicle.getPlate());
        if (entity == null) {
            return vehicleRepository.save(vehicle);
        }
        return entity;
    }




    public List<Vehicle> list() {
        return vehicleRepository.findAll();
    }
}
