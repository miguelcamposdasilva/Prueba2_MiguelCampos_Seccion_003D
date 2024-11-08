/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flota.newpackage;

/**
 *
 * @author Cetecom
 */
public class BicicletaElectrica extends Vehiculo{
    private String tipoDeFreno; 
    private int capacidadBateria; 

    public BicicletaElectrica() {
    }

    public BicicletaElectrica(String tipoDeFreno, int capacidadBateria) {
        this.tipoDeFreno = tipoDeFreno;
        this.capacidadBateria = capacidadBateria;
    }

    public BicicletaElectrica(String tipoDeFreno, int capacidadBateria, String codigoUnico, boolean necesitaMantencion) {
        super(codigoUnico, necesitaMantencion, tipoDeFreno);
        this.tipoDeFreno = tipoDeFreno;
        this.capacidadBateria = capacidadBateria;
    }

    public String getTipoDeFreno() {
        return tipoDeFreno;
    }

    public void setTipoDeFreno(String tipoDeFreno) {
        this.tipoDeFreno = tipoDeFreno;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    @Override
    public String toString() {
        return "BicicletaElectrica{" + "tipoDeFreno=" + tipoDeFreno + ", capacidadBateria=" + capacidadBateria + '}';
    }
    
    public double calcularCostoTotalAlquiler(){
        double costoBase = VALOR_HORA_ALQUILER;
        if(capacidadBateria > 20){
            costoBase *= 0.95;
            
        }
        return costoBase; 
           
    
}
}
