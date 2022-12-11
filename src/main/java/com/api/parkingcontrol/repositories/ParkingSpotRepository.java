package com.api.parkingcontrol.repositories;

import com.api.parkingcontrol.models.ParkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

    @Repository /* Define que é um repositório do banco de dados*/
    public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {
        boolean existsByLicencePlateCar (String licencePlateCar);
        boolean existsByParkingSpotNumber(String parkingSpotNumber);
        boolean existsByApartamentAndBlock(String apartamentAndBlock, String block);

}
