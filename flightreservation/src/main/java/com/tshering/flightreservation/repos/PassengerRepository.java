package com.tshering.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tshering.flightreservation.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
