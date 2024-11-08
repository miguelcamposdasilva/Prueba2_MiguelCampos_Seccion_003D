/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package flota;

import flota.newpackage.Auto;
import flota.newpackage.BicicletaElectrica;
import flota.newpackage.Motocicleta;
import flota.newpackage.RegistroAuxiliar;
import flota.newpackage.Vehiculo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class Flota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        RegistroAuxiliar registro1 = new RegistroAuxiliar();
        Auto auto1 = new Auto();
        Motocicleta motocicleta1 = new Motocicleta();
        BicicletaElectrica bicicleta1 = new BicicletaElectrica();
        List <Vehiculo> listadoVehiculos = new ArrayList<>();
        
        
        int opcion = 0; 
        
        while(opcion !=6){
            System.out.println("--TeslaFleet---");
            System.out.println("[1] Registrar Auto");
            System.out.println("[2] Registrar Moto");
            System.out.println("[3] Registrar Bici Electrica");
            System.out.println("[4]Listar Vehiculos"); 
            System.out.println("[5]Costo Total Alquiler");
            System.out.println("[6]Salir del Programa");
            
            opcion = entrada.nextInt();
            entrada.nextLine();
            
            switch(opcion){
                case 1: 
                    System.out.println("Ingrese el codigo del Auto");
                    auto1.setCodigoUnico(entrada.next());
                    
                    System.out.println("Indique Cantidad de Pasajeros que soporta");
                    auto1.setCantidadPasajeros(entrada.nextInt());
                    
                    //stem.out.println("Dispone de AutoPilot?"); 
                    //to1.setAutoPilot(entrada.hasNextBoolean());
                    
                    registro1.agregarVehiculo(auto1);
                    
                    System.out.println("Auto registrado correctamente...");
                    break;
                case 2: 
                    System.out.println("Ingrese el codigo de la moto");
                    motocicleta1.setCodigoUnico(entrada.next());
                    
                    System.out.println("Cual es la capacidad de la bateria");
                    motocicleta1.setCapadicadBateria(entrada.nextInt());
                    System.out.println("Dispone de modo Eco?");
                    motocicleta1.setModoEco(entrada.hasNextBoolean());
                    
                    registro1.agregarVehiculo(motocicleta1);
                    
                    System.out.println("Moto Registrado Correctamente..!");
                    
                case 3: 
                    System.out.println("Ingrese el codigo de la Bici");
                    bicicleta1.setCodigoUnico(entrada.next());
                    
                    System.out.println("Cual es el tipo de freno?");
                    bicicleta1.setTipoDeFreno(entrada.next());
                    
                    System.out.println("Cual es la capacidad de la bateria?");
                    bicicleta1.setCapacidadBateria(entrada.nextInt());
                    
                    registro1.agregarVehiculo(bicicleta1);
                    
                    System.out.println("Bici regitrada correctamente..!!");
                    break;
                    
                case 4:
                    System.out.println(registro1.getListadovehiculos());
                    break; 
                case 5: 
                    System.out.println("Costo total Auto:");
                    auto1.calcularCostoTotalAlquiler();
                    break; 
                    
                    
                    
                    
                    
                    
                    
                    
                    
                
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
            }

        }
        
        
       
    }
    
}
