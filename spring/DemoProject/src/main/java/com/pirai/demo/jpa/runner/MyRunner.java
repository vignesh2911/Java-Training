package com.pirai.demo.jpa.runner;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.pirai.demo.jpa.entity.Passenger;
import com.pirai.demo.jpa.repo.PassengerRepo;

@Component
public class MyRunner implements CommandLineRunner{
	@Autowired
	PassengerRepo repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Passenger p = new Passenger();
//		p.setPassengerId(202);
//		p.setFirstName("Vignesh");
//		p.setLastName("waran");
//		p.setEmail("vicky@gmail.com");
//		p.setSeatNo(12);
//		repo.save(p);
		
//		Optional<Passenger> optional = repo.findByEmail("vicky@gmail.com");
//		Passenger p = optional.get();
//		System.out.println(p.getPassengerId()+" "+p.getFirstName()+p.getLastName()+" "+p.getEmail()+" "+p.getSeatNo());

		List<Passenger> listOfPassengers=repo.getPassengersByFirstName("Vignesh");
		listOfPassengers.forEach(pass->{
			System.out.println(pass.getFirstName()+" "+pass.getLastName()+" "+pass.getEmail()+" "+pass.getSeatNo());
		});

		List<Passenger> listOfPassengers1=repo.getPassengers("Vignesh","waran");
		listOfPassengers1.forEach(pass->{
			System.out.println(pass.getFirstName()+" "+pass.getLastName()+" "+pass.getEmail()+" "+pass.getSeatNo());
		});
		}
	
}
