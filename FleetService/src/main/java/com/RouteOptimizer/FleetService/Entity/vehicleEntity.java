package com.RouteOptimizer.FleetService.Entity;

import com.RouteOptimizer.FleetService.Enums.TypeVehicle;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "TB_VEHICLE")
public class vehicleEntity implements Serializable {

    @Id
    private UUID id;

    @ManyToOne
    public usersEntity users;

    private String placa;

    private TypeVehicle tipoVeiculo;

    private float pesoCarga;

    private boolean cameraFria;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public usersEntity getUsers() {
        return users;
    }

    public void setUsers(usersEntity users) {
        this.users = users;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public TypeVehicle getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(TypeVehicle tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public float getPesoCarga() {
        return pesoCarga;
    }

    public void setPesoCarga(float pesoCarga) {
        this.pesoCarga = pesoCarga;
    }

    public boolean isCameraFria() {
        return cameraFria;
    }

    public void setCameraFria(boolean cameraFria) {
        this.cameraFria = cameraFria;
    }

    public vehicleEntity(UUID id, usersEntity users, String placa, TypeVehicle tipoVeiculo, float pesoCarga, boolean cameraFria) {
        this.id = id;
        this.users = users;
        this.placa = placa;
        this.tipoVeiculo = tipoVeiculo;
        this.pesoCarga = pesoCarga;
        this.cameraFria = cameraFria;
    }
}
