package com.anuj.crud.mysql.springboot.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.anuj.crud.mysql.springboot.entites.Ticket;

@Repository
public interface MySqlTicketBookingDao extends CrudRepository<Ticket,Integer>{

}
