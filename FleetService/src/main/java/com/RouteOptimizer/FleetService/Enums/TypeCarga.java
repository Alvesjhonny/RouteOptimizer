package com.RouteOptimizer.FleetService.Enums;

public enum TypeCarga {

    CARGA_SECA("cargaSeca"),
    CAMARA_FRIA("camaraFria"),
    CORRESPONDENCIA("correspondenia");

    private String descrição;

    TypeCarga(String descrição){
        this.descrição = descrição;
    }

    public String getDescrição() {
        return descrição;
    }
}
