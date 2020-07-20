package com.tshering.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tshering.flightreservation.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
