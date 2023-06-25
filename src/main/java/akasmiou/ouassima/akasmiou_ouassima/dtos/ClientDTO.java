package akasmiou.ouassima.akasmiou_ouassima.dtos;

import akasmiou.ouassima.akasmiou_ouassima.dao.entities.Reservation;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;
@Data
public class ClientDTO {


    private Long id;
    private String nom;
    private String prenom;
    private String email;

}
