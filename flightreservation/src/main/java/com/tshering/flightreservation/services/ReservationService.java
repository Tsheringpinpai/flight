package com.tshering.flightreservation.services;

import com.tshering.flightreservation.dto.ReservationRequest;
import com.tshering.flightreservation.entities.Reservation;

public interface ReservationService {
	
	public Reservation bookFlight(ReservationRequest request);

}
