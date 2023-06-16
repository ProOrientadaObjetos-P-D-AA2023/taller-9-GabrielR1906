/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete2.Prestamo;

/**
 *
 * @author Gabriel
 */
public class PrestamoAutomovil extends Prestamo{
    private String tipoAuto;
    private String marcaAuto;
    private String garante1;
    private double valorAuto;
    private double valorM;

    public PrestamoAutomovil() {
        tipoAuto = "Deportivo";
        marcaAuto = "Chevrolet";
        garante1 = "Renato G Rojas";
        valorAuto = 50000;
    }
    
    public PrestamoAutomovil(String tipoAuto, String marcaAuto,
            String garante1, double valorAuto, double valorM) {
        this.tipoAuto = tipoAuto;
        this.marcaAuto = marcaAuto;
        this.garante1 = garante1;
        this.valorAuto = valorAuto;
        this.valorM = valorM;
    }

    public String getTipoAuto() {
        return tipoAuto;
    }

    public void setTipoAuto(String tipoAuto) {
        this.tipoAuto = tipoAuto;
    }

    public String getMarcaAuto() {
        return marcaAuto;
    }

    public void setMarcaAuto(String marcaAuto) {
        this.marcaAuto = marcaAuto;
    }

    public String getGarante1() {
        return garante1;
    }

    public void setGarante1(String garante1) {
        this.garante1 = garante1;
    }

    public double getValorAuto() {
        return valorAuto;
    }

    public void setValorAuto(double valorAuto) {
        this.valorAuto = valorAuto;
    }

    public double getValorM() {
        return valorM;
    }

    public void setValorM(double valorM) {
        this.valorM = valorM;
    }
    
    
    public double obtenerValorMensual(){
        valorM = valorAuto / meses;
        return valorM;
    }
    
    public String obtenerciudad(String ciudad){
        ciudad = ciudad.toLowerCase();
        return ciudad;
    }
}
