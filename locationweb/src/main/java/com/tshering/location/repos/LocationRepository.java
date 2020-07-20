package com.tshering.location.repos;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tshering.location.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {
	
	@Query(value="select type, count(type) from location group by type",nativeQuery=true)
	public List<Object[]> findByTypeAndTypeCount();

}
