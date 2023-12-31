package akasmiou.ouassima.akasmiou_ouassima.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateDepart;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateArrivee;

    @OneToOne(mappedBy = "vol" )
    private  AeroportDepart aeroportDepart;
    @OneToOne(mappedBy = "vol" )
    private  AeroportDestination aeroportDestination;
    @OneToOne
    private  Avion avion;
    @OneToOne
    private Ticket ticket;
    @ManyToOne(fetch = FetchType.LAZY)
    private Voyage voyage;
}
