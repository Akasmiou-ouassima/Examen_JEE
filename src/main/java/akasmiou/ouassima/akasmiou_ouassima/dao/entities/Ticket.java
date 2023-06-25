package akasmiou.ouassima.akasmiou_ouassima.dao.entities;

import akasmiou.ouassima.akasmiou_ouassima.dao.enums.Type;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int numeroPlace;
    @Enumerated(EnumType.STRING)
    private Type type;
    @OneToOne
    private Passager passager;
    @OneToOne(mappedBy = "ticket")
    private Vol vol;
    @ManyToOne(fetch = FetchType.LAZY)
    private Voyage voyage;

}
