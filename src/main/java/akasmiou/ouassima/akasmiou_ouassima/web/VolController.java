package akasmiou.ouassima.akasmiou_ouassima.web;

import akasmiou.ouassima.akasmiou_ouassima.dao.entities.Vol;
import akasmiou.ouassima.akasmiou_ouassima.dtos.VolDTO;
import akasmiou.ouassima.akasmiou_ouassima.services.ReservationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VolController {
      private ReservationService reservationService;

    public VolController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping("/vols")
    public List<VolDTO> vols(){
        return reservationService.listVols();
    }

    @GetMapping("/vols/{id}")
    public VolDTO getVol(@PathVariable(name = "id") Long volId){
        return reservationService.getVol(volId);
    }
    @PostMapping("vols")
    public VolDTO saveVol(@RequestBody VolDTO volDTO){
        return reservationService.saveVol(volDTO);
    }
    @PutMapping("/vols/{volId}")
    public VolDTO updateVol(@PathVariable Long volId, @RequestBody VolDTO volDTO){
        volDTO.setId(volId);
        return reservationService.updateVol(volDTO);
    }
    @DeleteMapping("/vols/{id}")
    public void deleteVol(@PathVariable Long id){
        reservationService.deleteVol(id);
    }

}
