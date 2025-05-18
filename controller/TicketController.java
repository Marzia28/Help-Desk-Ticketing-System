package com.helpdesk.controller;

import com.helpdesk.model.Ticket;
import com.helpdesk.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/tickets")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @PostMapping("/create")
    public Ticket createTicket(@RequestBody Ticket ticket) {
        return ticketService.saveTicket(ticket);
    }

    @GetMapping("/all")
    public List<Ticket> getAllTickets() {
        return ticketService.getAllTickets();
    }

    @GetMapping("/search/title/{title}")
    public List<Ticket> searchByTitle(@PathVariable String title) {
        return ticketService.searchByTitle(title);
    }

    @GetMapping("/search/date/{date}")
    public List<Ticket> searchByDate(@PathVariable String date) {
        return ticketService.searchByDate(date);
    }
}