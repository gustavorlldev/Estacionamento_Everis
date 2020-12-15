package com.estacionamento.park.persistence;

import com.estacionamento.park.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

    Vehicle findByPlate(String plate);

}
