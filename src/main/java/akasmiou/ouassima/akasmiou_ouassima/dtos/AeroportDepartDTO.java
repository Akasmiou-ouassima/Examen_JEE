package akasmiou.ouassima.akasmiou_ouassima.dtos;

import lombok.Data;

@Data
public class AeroportDepartDTO {
    private Long id;
    private String nom;
    private float longitude;
    private float latitude;
    private float altitude;
}
