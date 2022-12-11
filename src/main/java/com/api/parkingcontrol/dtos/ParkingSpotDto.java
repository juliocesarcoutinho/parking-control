package com.api.parkingcontrol.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data /* Mesma função dos Getters e setters Lombok */
public class ParkingSpotDto {

    /*
    * Pode se usar varias anotações pra validação como anotções de email, cpf, telefone pra validação
    *
    * */

    @NotBlank
    private String parkingSpotNumber;
    @NotBlank
    @Size(max = 7)
    private String licencePlateCar;
    @NotBlank
    private String brandCar;
    @NotBlank
    private String modelCar;
    @NotBlank
    private String colorCar;
    @NotBlank
    private String responsibleName;
    @NotBlank
    private String apartament;
    @NotBlank
    private String block;

}
