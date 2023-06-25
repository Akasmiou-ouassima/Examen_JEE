package akasmiou.ouassima.akasmiou_ouassima.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AeroportDepart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private float longitude;
    private float latitude;
    private float altitude;
    @OneToOne
    private Vol vol;
    @OneToOne
    private Ville ville;
}
