package com.tshering.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tshering.flightreservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
