package com.anuj.crud.springboot;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.anuj.crud.springboot.entities.Ticket;

@SpringBootApplication
public class CrudTicketBokkingManagementAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext=SpringApplication.run(CrudTicketBokkingManagementAppApplication.class, args);
		
		TicketBookingService ticketService=applicationContext.getBean(TicketBookingService.class);
		Ticket ticket=new Ticket();
		ticket.setBookingDate(new Date());
		ticket.setDestination("Lakhimpur");
		ticket.setPassengerName("Anuj Singh");
		ticket.setSourceDestination("Delhi");
		ticket.setEmail("anujsingh2841@gmail.com");
		ticketService.createTicket(ticket);
	}

}
