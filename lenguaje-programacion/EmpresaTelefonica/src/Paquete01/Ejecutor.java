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
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Enlace c = new Enlace();
        entrada.useLocale(Locale.US);
        int op;
        String continuar;

        do {

            System.out.println("\t------Plan Celular------\n"
                    + "Ingrese (1) para un Plan de Megas\n"
                    + "Ingrese (2) para un Plan de Minutos\n"
                    + "Ingrese (3) para un Plan de Megas y Minutos\n"
                    + "Ingrese (4) para un Plan de  Minutos y Megas Económico\n");
            op = entrada.nextInt();

            entrada.nextLine();
            if (op == 1 || op == 2 || op == 3 || op == 4) {
                System.out.println("Ingrese el nombre del Propietario:");
                String nom = entrada.nextLine();
                System.out.println("Ingrese el número de Cédula del Propietario:");
                String ced = entrada.nextLine();
                System.out.println("Ingrese la Ciudad del Propietario:");
                String ciu = entrada.nextLine();
                System.out.println("Ingrese la Marca del celular:");
                String mar = entrada.nextLine();
                System.out.println("Ingrese el Modelo del celular:");
                String mod = entrada.nextLine();
                System.out.println("Ingrese el Número de telefono:");
                String nume = entrada.nextLine();

                switch (op) {
                    case 1 -> {
                        System.out.println("Ingrese el Número de Megas (Gb):");
                        int giga = entrada.nextInt();
                        System.out.println("Ingrese el Costo por Mega:");
                        double gicos = entrada.nextDouble();
                        PlanPostPagoMegas me = new PlanPostPagoMegas(nom, ced, ciu,
                                mar, mod, nume, giga, gicos, 12.0);
                        me.calcularPagoMensual();

                        c.insertarPlanMegas(me);
                    }
                    case 2 -> {
                        System.out.println("Ingrese el Número de Minutos nacionales:");
                        int mina = entrada.nextInt();
                        System.out.println("Ingrese el Costo por Minuto nacional:");
                        double cosMn = entrada.nextDouble();
                        System.out.println("Ingrese el Número de Minutos internacionales:");
                        int mini = entrada.nextInt();
                        System.out.println("Ingrese el Costo por Minuto internacional:");
                        double cosMi = entrada.nextDouble();
                        PlanPostPagoMinutos mi = new PlanPostPagoMinutos(nom, ced,
                                ciu, mar, mod, nume, mina, cosMn, mini, cosMi);
                        mi.calcularPagoMensual();

                        c.insertarPlanMinutos(mi);
                    }
                    case 3 -> {
                        System.out.println("Ingrese el Número de minutos:");
                        int min = entrada.nextInt();
                        System.out.println("Ingrese el Costo por minuto:");
                        double cost = entrada.nextDouble();
                        System.out.println("Ingrese el Número de Megas (Gb):");
                        int giga = entrada.nextInt();
                        System.out.println("Ingrese el Costo por Mega:");
                        double gicos = entrada.nextDouble();
                        PlanPostPagoMinutosMegas mm = new PlanPostPagoMinutosMegas(nom, ced,
                                ciu, mar, mod, nume, min, cost, giga, gicos);
                        mm.calcularPagoMensual();

                        c.insertarPlanMinutosMegas(mm);
                    }
                    case 4 -> {
                        System.out.println("Ingrese el Número de minutos:");
                        int min = entrada.nextInt();
                        System.out.println("Ingrese el Costo por minuto:");
                        double cost = entrada.nextDouble();
                        System.out.println("Ingrese el Número de Megas (Gb):");
                        int giga = entrada.nextInt();
                        System.out.println("Ingrese el Costo por Mega:");
                        double gicos = entrada.nextDouble();
                        PlanPostPagoMinutosMegasEconomico mmE = new PlanPostPagoMinutosMegasEconomico(nom, ced,
                                ciu, mar, mod, nume, min, cost, giga, gicos, 10);
                        mmE.calcularPagoMensual();

                        c.insertarPlanMinutosMegasEc(mmE);
                    }

                }
            }
            if (op < 1 || op > 4) {
                System.out.println("Opción inválida. Ingrese un número entre"
                        + " 1 y 4");
            }
            entrada.nextLine();
            System.out.print("¿Desea ingresar otro Plan Celular?: ");
            continuar = entrada.nextLine();

        } while (continuar.equals("Si"));

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
