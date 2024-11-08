/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flota.newpackage;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cetecom
 */
public class RegistroAuxiliar {
    private String codigoVehiculo;
    List <Vehiculo> listadoVehiculos = new ArrayList<>();

    public RegistroAuxiliar() {
    }

    public RegistroAuxiliar(String codigoVehiculo) {
        this.codigoVehiculo = codigoVehiculo;
    }

    public String getCodigoVehiculo() {
        return codigoVehiculo;
    }

    public void setCodigoVehiculo(String codigoVehiculo) {
        this.codigoVehiculo = codigoVehiculo;
    }

    public List<Vehiculo> getListadovehiculos() {
        return listadoVehiculos;
    }

    public void setListadovehiculos(List<Vehiculo> listadovehiculos) {
        this.listadoVehiculos = listadovehiculos;
    }

    @Override
    public String toString() {
        return "RegistroAuxiliar{" + "codigoVehiculo=" + codigoVehiculo + ", listadovehiculos=" + listadoVehiculos + '}';
    }
    
    public void agregarVehiculo( Vehiculo parVehiculo){
        for (Vehiculo i : listadoVehiculos){
            if(i.getCodigoUnico() == parVehiculo.getCodigoUnico()){
                System.out.println("El codigo del vehiculo ya existe..!!");
            }else{
                listadoVehiculos.add(parVehiculo);
                System.out.println("Vehiculo Agregado Correctamente");
        }
        }
    }
    
    public void listarVehiculos(){
        if(listadoVehiculos.isEmpty()){
            System.out.println("No hay vehiculos en la lista...");
        }else{
            for (Vehiculo i : listadoVehiculos){
                System.out.println(i);
            }
            
        }
    }
    
    public int cantidadTotalVehiculos(){
        System.out.println("La cantidad de vehiculos es de: ");
        return listadoVehiculos.size();
    }
   
        
    
}


