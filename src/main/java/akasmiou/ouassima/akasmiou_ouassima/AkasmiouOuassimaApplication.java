package akasmiou.ouassima.akasmiou_ouassima;

import akasmiou.ouassima.akasmiou_ouassima.dao.entities.*;
import akasmiou.ouassima.akasmiou_ouassima.dao.repositories.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class AkasmiouOuassimaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AkasmiouOuassimaApplication.class, args);
    }
    @Bean
    CommandLineRunner start(AeroportDepartRepository aeroportDepartRepository,
                            AeroportDestinationRepository aeroportDestinationRepository,
                            ClientRepository clientRepository,
                            ReservationRepository reservationRepository,
                            VolRepository volRepository,
                            VoyageRepository voyageRepository,
                             VilleRepository villeRepository,
                            PaysRepository paysRepository,
                             PassagerRepository passagerRepository,
                            TicketRepository ticketRepository,
                            AvionRepository avionRepository
                            ){
        return args -> {
                List<Client> clients = new ArrayList<>();
                Stream.of("ouassima","mohamed","jinan").forEach(name ->{
                    Client client = new Client();
                    client.setNom(Math.random()<0.5? "akasmiou": "khladi");
                    client.setPrenom(name);
                     client.setEmail(name+"@gmail.com");
                     clientRepository.save(client);
                    clients.add(client);
                        });


            Reservation reservation1 = new Reservation();
            reservation1.setDate(new Date());
            reservation1.setSiteReservation("www.reservation.com");
            reservation1.setClient(clients.get(0));
            reservationRepository.save(reservation1);
            Reservation reservation2 = new Reservation();
            reservation2.setDate(new Date());
            reservation2.setSiteReservation("www.reservation.com");
            reservation2.setClient(clients.get(1));
            reservationRepository.save(reservation2);
            Reservation reservation3 = new Reservation();
            reservation3.setDate(new Date());
            reservation3.setSiteReservation("www.reservation.com");
            reservation3.setClient(clients.get(2));
            reservationRepository.save(reservation3);

            Voyage voyage1 = new Voyage();
            voyage1.setDate(new Date());
            voyage1.setReservation(reservation1);
            voyageRepository.save(voyage1);

            Voyage voyage2 = new Voyage();
            voyage2.setDate(new Date());
            voyage2.setReservation(reservation2);
            voyageRepository.save(voyage2);

            Voyage voyage3 = new Voyage();
            voyage3.setDate(new Date());
            voyage3.setReservation(reservation3);
            voyageRepository.save(voyage3);

            Vol vol1= new Vol();
            vol1.setNom("vol1");
            vol1.setDateDepart(new Date());
            vol1.setDateArrivee(new Date());
            vol1.setVoyage(voyage1);
            volRepository.save(vol1);
            Vol vol2= new Vol();
            vol2.setNom("vol2");
            vol2.setDateDepart(new Date());
            vol2.setDateArrivee(new Date());
            vol2.setVoyage(voyage2);
            volRepository.save(vol2);
            Vol vol3= new Vol();
            vol3.setNom("vol3");
            vol3.setDateDepart(new Date());
            vol3.setDateArrivee(new Date());
            vol3.setVoyage(voyage3);
            volRepository.save(vol3);
            Vol vol4= new Vol();
            vol4.setNom("vol4");
            vol4.setDateDepart(new Date());
            vol4.setDateArrivee(new Date());
            vol4.setVoyage(voyage3);
            volRepository.save(vol4);


            Avion avion1 = new Avion();
            avion1.setNom("avion1");
            avion1.setNbPlace(100);
            avion1.setVol(vol1);
            avionRepository.save(avion1);
            Avion avion2 = new Avion();
            avion2.setNom("avion2");
            avion2.setNbPlace(300);
            avion2.setVol(vol2);
            avionRepository.save(avion2);
            Avion avion3 = new Avion();
            avion3.setNom("avion3");
            avion3.setNbPlace(200);
            avion3.setVol(vol3);
            avionRepository.save(avion3);

         ;


        };
    }
}
