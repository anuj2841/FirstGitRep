package com.anuj.crud.mysql.springboot.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anuj.crud.mysql.springboot.dao.MySqlTicketBookingDao;
import com.anuj.crud.mysql.springboot.entites.Ticket;

@Service
public class TicketBookingService {

	@Autowired
	MySqlTicketBookingDao ticketDao;
	
	public Ticket createTicket(Ticket ticket) {
		return ticketDao.save(ticket);
	}

	public void deleteTicket(Integer ticketId) {
		ticketDao.deleteById(ticketId);
	}

	public Optional<Ticket> findByTicktId(Integer ticketId) {
		return ticketDao.findById(ticketId);
	}

	public Iterable<Ticket> getAllTickets() {
		return ticketDao.findAll();
	}

	public Ticket updateTicketEmail(Integer ticketId, String newEmail) {
		Optional<Ticket>ticket=ticketDao.findById(ticketId);
		Ticket t=ticket.get();
		t.setEmail(newEmail);
		return ticketDao.save(t);
	}

	
}
