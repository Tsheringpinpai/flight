package com.tshering.flightcheckin.integration;

import com.tshering.flightcheckin.integration.dto.Reservation;
import com.tshering.flightcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {
	
	public Reservation findReservation(Long id);
	
	public Reservation updateReservation(ReservationUpdateRequest request);

}
