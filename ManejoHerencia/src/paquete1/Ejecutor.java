/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Scanner;
import paquete2.Prestamo;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;

/**
 *
 * @author Gabriel
 */
public class Ejecutor {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int opcion1;
        String opcion2;
        boolean bandera = true;
        String nombrePersona;
        String mensaje = "";
        
        Persona pers = new Persona();
        Prestamo prest = new Prestamo();
        PrestamoAutomovil prestauto = new PrestamoAutomovil();
        PrestamoEducativo prestedu = new PrestamoEducativo();
        
            System.out.println("Ingrese su nombre:");
            pers.setNombre(entrada.nextLine());
            System.out.println("Ingrese su apellido:");
            pers.setApellido(entrada.nextLine());
            System.out.println("Ingrese su username:");
            pers.setUsername(entrada.nextLine());
            nombrePersona = pers.getNombre() + " " + pers.getApellido();
            
        while(bandera){
            System.out.println("Ingrese [1] para ingresar datos para un préstamo"
                + " de tipo PrestamoAutomovil\ningrese [2] para ingresar "
                + "datos para un préstamo de tipo PrestamoEducativo.");
            opcion1 = entrada.nextInt();
            
            prest.setBeneficiario(nombrePersona);
            System.out.println("Ingrese el tiempo del prestamo en meses:");
            prest.setMeses(entrada.nextDouble());
            System.out.println("Ingrese la ciudad:");
            entrada.nextLine();
            String ciudad = entrada.nextLine();
            prest.setCiudad(ciudad);
            
            if (opcion1 == 1) {
                System.out.println("Ingrese el tipo de automovil:");
                prestauto.setTipoAuto(entrada.nextLine());
                System.out.println("Ingrese la marca del auto:");
                prestauto.setMarcaAuto(entrada.nextLine());
                System.out.println("Ingrese el nombre del garante:");
                prestauto.setGarante1(entrada.nextLine());
                System.out.println("Ingrese el valor del auto:");
                prestauto.setValorAuto(entrada.nextDouble());
                mensaje = String.format("%sPrestamo para automovil:\nTipo de "
                        + "automovil: %s\nMarca: %s\n"
                        + "Nombre del garante: %s\nValor del auto: %s\nValor"
                        + " mensual a pagar: %.2f\nCiudad: %s\n\n", mensaje, 
                        prestauto.getTipoAuto(), prestauto.getMarcaAuto(),
                        prestauto.getGarante1(), prestauto.getValorAuto(),
                        prestauto.obtenerValorMensual(),
                        prestauto.obtenerciudad(ciudad));
            } else {
                if (opcion1 == 2) {
                    System.out.println("Ingrese el nivel de estudio:");
                    prestedu.setNivelEstudio(entrada.nextLine());
                    System.out.println("Ingrese el centro educativo:");
                    prestedu.setCentroEdu(entrada.nextLine());
                    System.out.println("Ingrese el Valor de la carrera:");
                    prestedu.setValorCarrera(entrada.nextDouble());
                    mensaje = String.format("%sPrestamo Educativo:\n"
                            + "Nivel de estudio: %s\nCentro "
                            + "educativo: %s\nValor de la carrera: %.2f\n"
                            + "Valor a pagar mensualmente: %.2f\n"
                            + "Ciudad: %s\n\n", mensaje,
                            prestedu.getNivelEstudio(), prestedu.getCentroEdu(),
                            prestedu.getValorCarrera(),
                            prestedu.obtenerValorMensualPrestamoCarrera(),
                            prestedu.obtenerciudad(ciudad));
                }
            }
            
            System.out.println("Ingrese s para salir y presentar o "
                    + "cualquier otra LETRA para continuar:");
            entrada.nextLine();
            opcion2 = entrada.nextLine();
            
            if(opcion2.equals("s")){
                bandera = false;
            }
        }
        
        System.out.println("\nDATOS:");
        System.out.println("Nombre: " + pers.getNombre());
        System.out.println("Apellido: " + pers.getApellido());
        System.out.println("Username: " + pers.getUsername());
        System.out.println("\n" + mensaje);
        
        
        
        
        
    }
}
