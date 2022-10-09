package com.example.projetocarrosmayaramota01212163.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;
import java.time.LocalDate;
@Entity
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCarro;

    @NotBlank(message = "Ops! Temos um limite de letra min 2 e max 12")
    @Size(min = 2, max = 12)
    private String modelo;

    @NotBlank(message = "Ops! Temos um limite de letra min 2 e max 10")
    @Size(min = 2, max = 10)
    private String fabricante;

    @Past
    private LocalDate dataFabricacao;

    @NotNull
    @Min(1960) @Max(2021)
    private Integer anoFabricacao;

    @NotNull
    @DecimalMin("0.2") @DecimalMax("7.0")
    private Double potenciaMotor;

    public Integer getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(Integer idCarro) {
        this.idCarro = idCarro;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Double getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(Double potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }
}
