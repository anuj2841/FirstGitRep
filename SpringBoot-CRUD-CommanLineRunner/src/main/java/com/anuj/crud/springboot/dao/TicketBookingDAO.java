package com.anuj.crud.springboot.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.anuj.crud.springboot.entities.Ticket;

@Repository
public interface TicketBookingDAO extends CrudRepository<Ticket,Integer>{

}
