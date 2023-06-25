package akasmiou.ouassima.akasmiou_ouassima.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ville {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    @OneToOne(mappedBy = "ville" )
    private  AeroportDepart aeroportDepart;
    @OneToOne(mappedBy = "ville" )
    private  AeroportDestination aeroportDestination;
    @OneToOne(mappedBy = "ville" )
    private  Pays pays;
}
