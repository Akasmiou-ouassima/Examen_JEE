package akasmiou.ouassima.akasmiou_ouassima.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Passager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String email;
    @ManyToOne
    private Voyage voyage;
    @OneToOne(mappedBy = "passager")
    private Ticket ticket;
}
