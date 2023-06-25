package akasmiou.ouassima.akasmiou_ouassima.mappers;

import akasmiou.ouassima.akasmiou_ouassima.dao.entities.*;
import akasmiou.ouassima.akasmiou_ouassima.dtos.*;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class ReservationMapperImpl {
    public VolDTO fromVol(Vol vol) {
        VolDTO volDTO = new VolDTO();
        BeanUtils.copyProperties(vol, volDTO);
        volDTO.setAvionDTO(fromAvion(vol.getAvion()));
        volDTO.setVoyageDTO(fromVoyage(vol.getVoyage()));
        return volDTO;
    }
    public Vol fromVolDTO(VolDTO volDTO) {
        Vol  vol= new Vol();
        BeanUtils.copyProperties(volDTO, vol);
        return vol;
    }
    public ReservationDTO fromReservation(Reservation reservation) {
        ReservationDTO reservationDTO = new ReservationDTO();
        BeanUtils.copyProperties(reservation, reservationDTO);
        reservationDTO.setClientDTO(fromClient(reservation.getClient()));
        reservationDTO.setVoyageDTO(fromVoyage(reservation.getVoyage()));
        return reservationDTO;
    }
    public Reservation fromReservationDTO(ReservationDTO reservationDTO) {
        Reservation reservation = new Reservation();
        BeanUtils.copyProperties(reservationDTO, reservation);
        return reservation;
    }

    public AvionDTO fromAvion(Avion avion) {
        AvionDTO avionDTO = new AvionDTO();
        BeanUtils.copyProperties(avion, avionDTO);
        return avionDTO;
    }
    public Avion fromAvionDTO(AvionDTO avionDTO) {
        Avion avion= new Avion();
        BeanUtils.copyProperties(avionDTO, avion);
        return avion;
    }
    public VoyageDTO fromVoyage(Voyage voyage) {
        VoyageDTO voyageDTO = new VoyageDTO();
        BeanUtils.copyProperties(voyage, voyageDTO);
        return voyageDTO;
    }
    public Voyage fromVoyageDTO(VoyageDTO voyageDTO) {
        Voyage voyage = new Voyage();
        BeanUtils.copyProperties(voyageDTO, voyage);
        return voyage;
    }
    public ClientDTO fromClient(Client client) {
        ClientDTO clientDTO = new ClientDTO();
        BeanUtils.copyProperties(client, clientDTO);
        return clientDTO;
    }
    public Client fromClientDTO(ClientDTO clientDTO) {
        Client client = new Client();
        BeanUtils.copyProperties(clientDTO, client);
        return client;
    }
}
