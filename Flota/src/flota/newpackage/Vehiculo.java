/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flota.newpackage;

/**
 *
 * @author Cetecom
 */
public abstract class Vehiculo implements ITeslaFleet {
    private String tipoDeVehiculo;
    private String codigoUnico; 
    private boolean necesitaMantencion; 

    public Vehiculo() {
    }

    public Vehiculo(String codigoUnico, boolean necesitaMantencion, String tipoDeVehiculo) {
        this.codigoUnico = codigoUnico;
        this.necesitaMantencion = necesitaMantencion;
        this.tipoDeVehiculo = tipoDeVehiculo;
    }

    public String getCodigoUnico() {
        return codigoUnico;
    }

    public void setCodigoUnico(String codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    public boolean isNecesitaMantencion() {
        return necesitaMantencion;
    }

    public void setNecesitaMantencion(boolean necesitaMantencion) {
        this.necesitaMantencion = necesitaMantencion;
    }
    
    public String getTipoDeVehiculo(){
        return tipoDeVehiculo;
        
    }
    
    public void setTipoDeVehiculo(){
        this.tipoDeVehiculo = tipoDeVehiculo;
    }
    
    

    @Override
    public String toString() {
        return "Vehiculo{" + "codigoUnico=" + codigoUnico + ", necesitaMantencion=" + necesitaMantencion + "tipo Vehiculo" + tipoDeVehiculo;
    }
    
    
    
    
    
}
