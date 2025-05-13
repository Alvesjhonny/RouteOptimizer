package com.RouteOptimizer.FleetService.Enums;

public enum TypeVehicle {
    CARRETA("carreta"),
    TRUCK("truck"),
    TOCO("toco"),
    HR("hr"),
    FIORINO("fiorino");

    private String descricao;

    TypeVehicle(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
}
