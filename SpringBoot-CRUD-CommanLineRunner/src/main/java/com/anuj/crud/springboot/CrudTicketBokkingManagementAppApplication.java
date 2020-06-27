package com.anuj.crud.springboot;

import java.util.Date;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.anuj.crud.springboot.entities.Ticket;

@SpringBootApplication
public class CrudTicketBokkingManagementAppApplication implements CommandLineRunner{
	
	@Autowired
	TicketBookingService ticketService;
	@Autowired
	DataSource datasource;
	public static void main(String[] args) {
		SpringApplication.run(CrudTicketBokkingManagementAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Ticket ticket=new Ticket();
		ticket.setBookingDate(new Date());
		ticket.setDestination("Lakhimpur");
		ticket.setPassengerName("Anuj Singh");
		ticket.setSourceDestination("Delhi");
		ticket.setEmail("anujsingh2841@gmail.com");
		ticketService.createTicket(ticket);
		System.out.println("datasource:"+datasource);
		
	}

}
