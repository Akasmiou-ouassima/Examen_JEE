package akasmiou.ouassima.akasmiou_ouassima.dao.repositories;

import akasmiou.ouassima.akasmiou_ouassima.dao.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
