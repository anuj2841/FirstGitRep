package com.anuj.crud.springboot;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.anuj.crud.springboot.dao.TicketBookingDAO;
import com.anuj.crud.springboot.entities.Ticket;

@Service
@ComponentScan (basePackages = {"com.anuj.crud.springboot"})
public class TicketBookingService {

	@Autowired
	private TicketBookingDAO ticketBookingDao;
	public Ticket createTicket(Ticket ticket) {
		return ticketBookingDao.save(ticket);
	}
	public Optional<Ticket> getTicketById(Integer ticketId) {
		return ticketBookingDao.findById(ticketId);
	}
	public Iterable<Ticket> getAllBookedTickets() {
		return ticketBookingDao.findAll();
		
	}
	public void createTicket(Integer ticketId) {
		ticketBookingDao.deleteById(ticketId);
	}
	public Ticket updateTicket(Integer ticketId, String newEmail) {
		Optional<Ticket> ticket=ticketBookingDao.findById(ticketId);
		Ticket updatedTicket=ticket.get();
		updatedTicket.setEmail(newEmail);
		return ticketBookingDao.save(updatedTicket);
	}

}
