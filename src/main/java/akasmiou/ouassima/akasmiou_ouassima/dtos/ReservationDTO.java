package akasmiou.ouassima.akasmiou_ouassima.dtos;

import akasmiou.ouassima.akasmiou_ouassima.dao.entities.Client;
import akasmiou.ouassima.akasmiou_ouassima.dao.entities.Voyage;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Data
public class ReservationDTO {

    private Long id;

    private Date date;
    private String siteReservation;

    private ClientDTO clientDTO;
    private VoyageDTO voyageDTO;
}
