package akasmiou.ouassima.akasmiou_ouassima.services;

import akasmiou.ouassima.akasmiou_ouassima.dao.entities.Vol;
import akasmiou.ouassima.akasmiou_ouassima.dtos.ReservationDTO;
import akasmiou.ouassima.akasmiou_ouassima.dtos.VolDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReservationService {
    VolDTO saveVol(VolDTO volDTO);
    List<VolDTO> listVols();
    VolDTO getVol(Long volId);
    VolDTO updateVol(VolDTO volDTO);
    void deleteVol(Long volId);
    ReservationDTO saveReservation(ReservationDTO reservationDTO);
    List<ReservationDTO> listReservations();
    ReservationDTO getReservation(Long reservationId);
    ReservationDTO updateReservation(ReservationDTO reservationDTO);
    void deleteReservation(Long reservationId);

}
