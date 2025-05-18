package com.helpdesk.repository;

import com.helpdesk.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
    List<Ticket> findByTitleContaining(String title);
    List<Ticket> findByCreationDate(String creationDate);
}