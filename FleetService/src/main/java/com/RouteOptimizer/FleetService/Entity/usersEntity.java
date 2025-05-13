package com.RouteOptimizer.FleetService.Entity;

import com.RouteOptimizer.FleetService.Enums.TypeUsers;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "TB_USERS")
public class usersEntity {

    @Id
    private UUID id;
    private String name;
    private TypeUsers tipo_usuario;
    private String cnpj;
    private String cpf;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeUsers getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(TypeUsers tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public usersEntity(UUID id, String name, TypeUsers tipo_usuario) {
        this.id = id;
        this.name = name;
        this.tipo_usuario = tipo_usuario;
    }
}
