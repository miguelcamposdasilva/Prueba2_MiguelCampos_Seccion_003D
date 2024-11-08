/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flota.newpackage;

/**
 *
 * @author Cetecom
 */
public class Auto extends Vehiculo{
    private int cantidadPasajeros; 
    private boolean autoPilot;

    public Auto() {
    }

    public Auto(int cantidadPasajeros, boolean autoPilot) {
        this.cantidadPasajeros = cantidadPasajeros;
        this.autoPilot = autoPilot;
    }

    public Auto(int cantidadPasajeros, boolean autoPïlot, String codigoUnico, boolean necesitaMantencion) {
        super(codigoUnico, necesitaMantencion, codigoUnico);
        this.cantidadPasajeros = cantidadPasajeros;
        this.autoPilot = autoPilot;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public boolean isAutoPilot() {
        return autoPilot;
    }

    public void setAutoPilot(boolean autoPilot) {
        this.autoPilot = autoPilot;
    }
    
    

    @Override
    public String toString() {
        return "Auto{" + "cantidadPasajeros=" + cantidadPasajeros + ", autoP\u00eflot=" + autoPilot + '}';
    }
    
    public double calcularCostoTotalAlquiler(){
        double costoBase = VALOR_HORA_ALQUILER;
        if(isAutoPilot() == true){
            costoBase *= 1.10;
            
        }
        return costoBase; 
            
            
    }
    
    
}
