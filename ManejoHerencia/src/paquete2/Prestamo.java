/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.Persona;

/**
 *
 * @author Gabriel
 */
public class Prestamo extends Persona{
    private String beneficiario;
    protected double meses;
    protected String ciudad;

    public Prestamo() {
        beneficiario = "Gabo";
        meses = 6;
        ciudad = "Loja";
    }
    
    public Prestamo(String beneficiario, double meses, String ciudad) {
        this.beneficiario = beneficiario;
        this.meses = meses;
        this.ciudad = ciudad;
    }

    public String getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }

    public double getMeses() {
        return meses;
    }

    public void setMeses(double meses) {
        this.meses = meses;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciud) {
        this.ciudad = ciud;
    }
    
    
}
