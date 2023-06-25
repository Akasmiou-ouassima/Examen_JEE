package akasmiou.ouassima.akasmiou_ouassima.web;

import akasmiou.ouassima.akasmiou_ouassima.dtos.ReservationDTO;
import akasmiou.ouassima.akasmiou_ouassima.services.ReservationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReservationController {
    private ReservationService reservationService;
    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping("/reservations")
    public List<ReservationDTO> reservations(){
        return reservationService.listReservations();
    }

    @GetMapping("/reservations/{id}")
    public ReservationDTO getReservation(@PathVariable(name = "id") Long reservationId){
        return reservationService.getReservation(reservationId);
    }
    @PostMapping("reservations")
    public ReservationDTO saveReservation(@RequestBody ReservationDTO reservationDTO){
        return reservationService.saveReservation(reservationDTO);
    }
    @PutMapping("/reservations/{reservationId}")
    public ReservationDTO updateReservation(@PathVariable Long reservationId, @RequestBody ReservationDTO reservationDTO){
        reservationDTO.setId(reservationId);
        return reservationService.updateReservation(reservationDTO);
    }
    @DeleteMapping("/reservations/{id}")
    public void deleteReservation(@PathVariable Long id){
        reservationService.deleteReservation(id);
    }
}
