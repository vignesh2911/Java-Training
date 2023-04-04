package com.pirai.demo.jpa.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pirai.demo.jpa.entity.Passenger;
@Repository
public interface PassengerRepo extends JpaRepository<Passenger, Integer> {
	Optional<Passenger> findByEmail(String email);
	Optional<Passenger> findBySeatNo(int seatNo);
	@Query("select p from Passenger p where p.firstName=?1")
	List<Passenger> getPassengersByFirstName(String firstName);
	
	@Query("select p from Passenger p where p.lastName=?1")
	List<Passenger> getPassengersByLastName(String firstName);
	
	@Query("select p from Passenger p where p.firstName=?1 or p.lastName=?2")
	List<Passenger> getPassengers(String firstName,String lastName);
}
