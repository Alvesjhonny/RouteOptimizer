package com.RouteOptimizer.FleetService.Entity;

import com.RouteOptimizer.FleetService.Enums.TypeCarga;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "TB_TIPOCARGA")
public class cargaTipo {

    @Id
    private UUID id;

    public vehicleEntity veiculo;

    private TypeCarga tipoCarga;

    public UUID getId() {
        return id;
    }

    public vehicleEntity getVeiculo() {
        return veiculo;
    }

    public TypeCarga getTipoCarga() {
        return tipoCarga;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setVeiculo(vehicleEntity veiculo) {
        this.veiculo = veiculo;
    }

    public void setTipoCarga(TypeCarga tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

    public cargaTipo(UUID id, vehicleEntity veiculo, TypeCarga tipoCarga) {
        this.id = id;
        this.veiculo = veiculo;
        this.tipoCarga = tipoCarga;
    }
}
