package com.helpdesk.service;

import com.helpdesk.model.Ticket;
import com.helpdesk.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }

    public Ticket saveTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    public List<Ticket> searchByTitle(String title) {
        return ticketRepository.findByTitleContaining(title);
    }

    public List<Ticket> searchByDate(String date) {
        return ticketRepository.findByCreationDate(date);
    }
}