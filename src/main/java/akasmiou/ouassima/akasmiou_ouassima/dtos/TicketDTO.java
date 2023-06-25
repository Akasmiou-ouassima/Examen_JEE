package akasmiou.ouassima.akasmiou_ouassima.dtos;

import akasmiou.ouassima.akasmiou_ouassima.dao.enums.Type;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

@Data
public class TicketDTO {
    private Long id;
    private int numeroPlace;

    private Type type;
}
