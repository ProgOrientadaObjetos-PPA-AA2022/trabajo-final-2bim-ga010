/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Paquete01;

import java.sql.SQLException;
import java.util.Locale;
import java.util.Scanner;
import Paquete02.*;
import Paquete03.Enlace;

/**
 *
 * @author spart
 */
public class Ejecutor1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Enlace c = new Enlace();
        leer.useLocale(Locale.US);
        int op;
        int opcion = 0;
        //String continuar;

        System.out.println("--------        Grupo 10        --------");
        System.out.println("           Empresa Telefonica           ");

        while (opcion != 5) {
            System.out.println("--------    Elija una Opcion   --------");
            System.out.println(" ");
            System.out.println("[1]" + "             Plan de Megas             " + "[1]");
            System.out.println("[2]" + "             Plan de Minutos           " + "[2]");
            System.out.println("[3]" + "             Plan de Megas Y Minutos   " + "[3]");
            System.out.println("[4]" + "   Plan de Minutos Y Megas Economico   " + "[4]");
            System.out.println("[5]" + "             Salir                     " + "[5]");
            System.out.println(" ");
            opcion = leer.nextInt();
            leer.nextLine();
            
            if (opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4) {
                
                System.out.println("Ingrese el nombre del Propietario:");
                String nom = leer.nextLine();
                System.out.println("Ingrese el número de Cédula del Propietario:");
                String ced = leer.nextLine();
                System.out.println("Ingrese la Ciudad del Propietario:");
                String ciu = leer.nextLine();
                System.out.println("Ingrese la Marca del celular:");
                String mar = leer.nextLine();
                System.out.println("Ingrese el Modelo del celular:");
                String mod = leer.nextLine();
                System.out.println("Ingrese el Número de telefono:");
                String nume = leer.nextLine();

                switch (opcion) {
                    case 1:

                        System.out.println("Ingrese el Número de Megas (Gb):");
                        double nMegas = leer.nextDouble();
                        System.out.println("Ingrese el Costo por Mega:");
                        double cMega = leer.nextDouble();
                        PlanPostPagoMegas me = new PlanPostPagoMegas(nom, ced, ciu,
                                mar, mod, nume, nMegas, cMega, 12.0);

                        me.calcularPagoMensual();
                        //c.insertarPlanMegas(me);
                        break;

                    case 2:

                        System.out.println("Ingrese el Número de Minutos nacionales:");
                        int mNacionales = leer.nextInt();
                        System.out.println("Ingrese el Costo por Minuto nacional:");
                        double cNacionales = leer.nextDouble();
                        System.out.println("Ingrese el Número de Minutos internacionales:");
                        int mInternacionales = leer.nextInt();
                        System.out.println("Ingrese el Costo por Minuto internacional:");
                        double cInternacionales = leer.nextDouble();
                        PlanPostPagoMinutos mi = new PlanPostPagoMinutos(nom, ced,
                                ciu, mar, mod, nume, mNacionales, cNacionales, mInternacionales, cInternacionales);

                        mi.calcularPagoMensual();
                        //c.insertarPlanMinutos(mi);
                        break;

                    case 3:

                        System.out.println("Ingrese el Número de minutos:");
                        int nMinutos1 = leer.nextInt();
                        System.out.println("Ingrese el Costo por minuto:");
                        double cMinutos1 = leer.nextDouble();
                        System.out.println("Ingrese el Número de Megas (Gb):");
                        int nMegas1 = leer.nextInt();
                        System.out.println("Ingrese el Costo por Mega:");
                        double cMegas1 = leer.nextDouble();
                        PlanPostPagoMinutosMegas mm = new PlanPostPagoMinutosMegas(nom, ced,
                                ciu, mar, mod, nume, nMinutos1, cMinutos1, nMegas1, cMegas1);

                        mm.calcularPagoMensual();
                        //c.insertarPlanMinutosMegas(mm);
                        break;

                    case 4:
                        System.out.println("Ingrese el Número de minutos:");
                        int nMinutos2 = leer.nextInt();
                        System.out.println("Ingrese el Costo por minuto:");
                        double cMinutos2 = leer.nextDouble();
                        System.out.println("Ingrese el Número de Megas (Gb):");
                        int nMegas2 = leer.nextInt();
                        System.out.println("Ingrese el Costo por Mega:");
                        double cMegas2 = leer.nextDouble();
                        PlanPostPagoMinutosMegasEconomico mmE = new PlanPostPagoMinutosMegasEconomico(nom, ced,
                                ciu, mar, mod, nume, nMinutos2, cMinutos2, nMegas2, cMegas2, 10);

                        mmE.calcularPagoMensual();
                        //c.insertarPlanMinutosMegasEc(mmE);
                        break;
                        
                    case 5:
                        
                        System.out.println(" ");
                        System.out.println("Gracias Por Usar Este Programa ");
                        System.out.println(" ");
                        
                        break;
                    default:
                        System.out.println(" ");
                        System.out.println("Escoja la opcion correcta");
                        System.out.println(" ");
                }
            }
        }
    }
}
/*
}
        
        //terminar
        for (int i = 0; i < c.obtenerDataPlanMegas().size(); i++) {
            System.out.printf("%s", c.obtenerDataPlanMegas().get(i));
        }

        for (int i = 0; i < c.obtenerDataPlanMinutos().size(); i++) {
            System.out.printf("%s", c.obtenerDataPlanMinutos().get(i));
        }

        for (int i = 0; i < c.obtenerDataPlanMinutosMegas().size(); i++) {
            System.out.printf("%s", c.obtenerDataPlanMinutosMegas().get(i));
        }

        for (int i = 0; i < c.obtenerDataPlanMinutosMegasEconomico().size(); i++) {
            System.out.printf("%s", c.obtenerDataPlanMinutosMegasEconomico().get(i));
        }

    }

}
*/