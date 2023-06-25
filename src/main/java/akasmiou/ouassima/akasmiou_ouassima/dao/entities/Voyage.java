package akasmiou.ouassima.akasmiou_ouassima.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Voyage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;
    @OneToMany(mappedBy = "voyage")
    private List<Passager> passagers;
    @OneToOne
    private Reservation reservation;
    @OneToMany(mappedBy = "voyage")
    private List<Ticket> tickets;
    @OneToMany(mappedBy = "voyage")
    private List<Vol> vols;
}
