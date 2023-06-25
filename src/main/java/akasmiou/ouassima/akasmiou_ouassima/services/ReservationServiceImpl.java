package akasmiou.ouassima.akasmiou_ouassima.services;

import akasmiou.ouassima.akasmiou_ouassima.dao.entities.Reservation;
import akasmiou.ouassima.akasmiou_ouassima.dao.entities.Vol;
import akasmiou.ouassima.akasmiou_ouassima.dao.repositories.ReservationRepository;
import akasmiou.ouassima.akasmiou_ouassima.dao.repositories.VolRepository;
import akasmiou.ouassima.akasmiou_ouassima.dtos.ReservationDTO;
import akasmiou.ouassima.akasmiou_ouassima.dtos.VolDTO;
import akasmiou.ouassima.akasmiou_ouassima.mappers.ReservationMapperImpl;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
@Transactional
@AllArgsConstructor
public class ReservationServiceImpl implements ReservationService {
    VolRepository volRepository;
    ReservationRepository reservationRepository;
    ReservationMapperImpl dtoMapper;
    @Override
    public VolDTO saveVol(VolDTO volDTO) {
        Vol vol = dtoMapper.fromVolDTO(volDTO);
        Vol savedVol = volRepository.save(vol);
        return dtoMapper.fromVol(savedVol);
    }

    @Override
    public List<VolDTO> listVols() {

        List<Vol> vols = volRepository.findAll();
        List<VolDTO> collect =vols.stream().map(vol -> dtoMapper.fromVol(vol)).collect(Collectors.toList());
        return collect;
    }

    @Override
    public VolDTO getVol(Long volId) {
        Vol vol = volRepository.findById(volId).orElse(null);
        return dtoMapper.fromVol(vol);
    }

    @Override
    public VolDTO updateVol(VolDTO volDTO) {

        Vol vol = dtoMapper.fromVolDTO(volDTO);
        Vol savedVol = volRepository.save(vol);
        return dtoMapper.fromVol(savedVol);

    }

    @Override
    public void deleteVol(Long volId) {
         volRepository.deleteById(volId);
    }

    @Override
    public ReservationDTO saveReservation(ReservationDTO reservationDTO) {
        Reservation reservation = dtoMapper.fromReservationDTO(reservationDTO);
        Reservation savedReservation = reservationRepository.save(reservation);
        return dtoMapper.fromReservation(savedReservation);
    }

    @Override
    public List<ReservationDTO> listReservations() {
        List<ReservationDTO> collect = reservationRepository.findAll().stream().map(reservation -> dtoMapper.fromReservation(reservation)).collect(Collectors.toList());
        return collect;

    }

    @Override
    public ReservationDTO getReservation(Long reservationId) {
        Reservation reservation = reservationRepository.findById(reservationId).orElse(null);
        return dtoMapper.fromReservation(reservation);

    }

    @Override
    public ReservationDTO updateReservation(ReservationDTO reservationDTO) {
        Reservation reservation = dtoMapper.fromReservationDTO(reservationDTO);
        Reservation savedReservation = reservationRepository.save(reservation);
        return dtoMapper.fromReservation(savedReservation);
    }

    @Override
    public void deleteReservation(Long reservationId) {
          reservationRepository.deleteById(reservationId);
    }
}
