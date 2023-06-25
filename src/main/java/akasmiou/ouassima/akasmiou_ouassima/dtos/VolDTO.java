package akasmiou.ouassima.akasmiou_ouassima.dtos;

import akasmiou.ouassima.akasmiou_ouassima.dao.entities.*;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class VolDTO {

    private Long id;
    private String nom;

    private Date dateDepart;

    private Date dateArrivee;
    private AvionDTO avionDTO;
    private VoyageDTO voyageDTO;
}
