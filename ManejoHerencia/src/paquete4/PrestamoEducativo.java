/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import paquete2.Prestamo;

/**
 *
 * @author Gabo
 */
public class PrestamoEducativo extends Prestamo{
    private String nivelEstudio;
    private String centroEdu;
    private double valorCarrera;
    private double valorMensualCarrera;

    public PrestamoEducativo() {
        nivelEstudio = "Segundo";
        centroEdu = "UTPL";
        valorCarrera = 2000;
    }
    
    public PrestamoEducativo(String nivelEstudio, String centroEdu,
            double valorCarrera, double valorMensualCarrera) {
        this.nivelEstudio = nivelEstudio;
        this.centroEdu = centroEdu;
        this.valorCarrera = valorCarrera;
        this.valorMensualCarrera = valorMensualCarrera;
    }

    public String getNivelEstudio() {
        return nivelEstudio;
    }

    public void setNivelEstudio(String nivelEstudio) {
        this.nivelEstudio = nivelEstudio;
    }

    public String getCentroEdu() {
        return centroEdu;
    }

    public void setCentroEdu(String centroEdu) {
        this.centroEdu = centroEdu;
    }

    public double getValorCarrera() {
        return valorCarrera;
    }

    public void setValorCarrera(double valorCarrera) {
        this.valorCarrera = valorCarrera;
    }

    public double getValorMensualCarrera() {
        return valorMensualCarrera;
    }

    public void setValorMensualCarrera(double valorMensualCarrera) {
        this.valorMensualCarrera = valorMensualCarrera;
    }
    
    
    public double obtenerValorMensualPrestamoCarrera(){
        valorMensualCarrera = (valorCarrera / meses) - 
                ((valorCarrera / meses) * (10 / 100));
        return valorMensualCarrera;
    }
    
    public String obtenerciudad(String ciudad){
        ciudad = ciudad.toUpperCase();
        return ciudad;
    }
}
