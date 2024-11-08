/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flota.newpackage;

/**
 *
 * @author Cetecom
 */
public class Motocicleta extends Vehiculo{
    private int capadicadBateria;
    private boolean modoEco; 

    public Motocicleta() {
    }

    public Motocicleta(int capadicadBateria, boolean modoEco) {
        this.capadicadBateria = capadicadBateria;
        this.modoEco = modoEco;
    }

    public Motocicleta(int capadicadBateria, boolean modoEco, String codigoUnico, boolean necesitaMantencion) {
        super(codigoUnico, necesitaMantencion, codigoUnico);
        this.capadicadBateria = capadicadBateria;
        this.modoEco = modoEco;
    }

    public int getCapadicadBateria() {
        return capadicadBateria;
    }

    public void setCapadicadBateria(int capadicadBateria) {
        this.capadicadBateria = capadicadBateria;
    }

    public boolean isModoEco() {
        return modoEco;
    }

    public void setModoEco(boolean modoEco) {
        this.modoEco = modoEco;
    }

    @Override
    public String toString() {
        return "Motocicleta{" + "capadicadBateria=" + capadicadBateria + ", modoEco=" + modoEco + '}';
    }
    
    public double calcularCostoTotalAlquiler(){
        double costoBase = VALOR_HORA_ALQUILER;
        if(modoEco == true){
            costoBase *= 1.08;
            
        }
        return costoBase; 
            
    
    
    
}
}
