package akasmiou.ouassima.akasmiou_ouassima.dtos;

import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Data
public class VoyageDTO {
    private Long id;

    private Date date;
}
