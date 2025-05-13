package com.RouteOptimizer.FleetService.Enums;

public enum TypeUsers {
    TRANSPORTADORA ("Transportadora"),
    AGREGADO("Agregado");

    private String contrato;

    TypeUsers(String contrato){
        this.contrato = contrato;
    }

    public String getContrato(){
        return contrato;
    }

}
