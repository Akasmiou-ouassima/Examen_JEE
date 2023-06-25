package akasmiou.ouassima.akasmiou_ouassima.dao.repositories;

import akasmiou.ouassima.akasmiou_ouassima.dao.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
