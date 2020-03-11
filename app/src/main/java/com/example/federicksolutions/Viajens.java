package com.example.federicksolutions;

import java.io.Serializable;
import java.text.DateFormatSymbols;
import java.util.Date;

public class Viajens implements Serializable {

    private Integer id;
    private String destino;
    private Date datainicio;
    private String PlacaVeiculo;
    private String CPF;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getDatainicio() {
        return datainicio;
    }

    public void setDatainicio(Date datainicio) {
        this.datainicio = datainicio;
    }

    public String getPlacaVeiculo() {
        return PlacaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        PlacaVeiculo = placaVeiculo;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
