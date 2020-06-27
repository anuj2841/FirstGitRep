package com.anuj.crud.mysql.springboot.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.anuj.crud.mysql.springboot.entites.Ticket;
import com.anuj.crud.mysql.springboot.service.TicketBookingService;

@RestController
@RequestMapping(value="/api/tickets")
public class MySqlRestController {
	
	@Autowired
	TicketBookingService ticketBookingService;
	
	@RequestMapping(value="/createTicket",method = RequestMethod.POST)
	public Ticket createTicket(Ticket ticket) {
		return ticketBookingService.createTicket(ticket);
	}
	
	@RequestMapping(value="/find/{ticketId}",method=RequestMethod.GET)
	public Optional<Ticket> findByTicktId(@PathVariable("ticketId")Integer ticketId) {
		return ticketBookingService.findByTicktId(ticketId);
	}
	
	@RequestMapping(value="/delete/{ticketId}",method=RequestMethod.DELETE)
	public void deleteTicket(@PathVariable("ticketId")Integer ticketId) {
		ticketBookingService.deleteTicket(ticketId);
	}
	
	@RequestMapping(value="/alltickets",method=RequestMethod.GET)
	public Iterable<Ticket> getAllTickets() {
		return ticketBookingService.getAllTickets();
	}
	
	@RequestMapping(value="/update/{ticketId}/{newEmail}")
	public Ticket updateTicketEmail(@PathVariable("ticketId")Integer ticketId,@PathVariable("newEmail")String newEmail) {
		return ticketBookingService.updateTicketEmail(ticketId,newEmail);
	}
}
