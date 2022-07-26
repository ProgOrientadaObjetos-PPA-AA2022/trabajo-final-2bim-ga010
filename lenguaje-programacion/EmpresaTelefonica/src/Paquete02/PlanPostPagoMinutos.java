/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete02;

/**
 *
 * @author spart
 */
public class PlanPostPagoMinutos extends PlanCelular {
    private double minutosNacionales;
    private double costoMinutosNacionales;
    private double minutosInternacionales;
    private double costoMinutoInternacional;

    public PlanPostPagoMinutos(String nom, String ced, String ciu, String mar,
            String mod, String numeroCe, double mN, double cmN, double mI,
            double cmI) {
        super(nom, ced, ciu, mar, mod, numeroCe);
        minutosNacionales = mN;
        costoMinutosNacionales = cmN;
        minutosInternacionales = mI;
        costoMinutoInternacional = cmI;
    }

    public void establecerMinutosNacionales(double mN) {
        minutosNacionales = mN;
    }

    public void establecerCostoMinutosNacionales(double cmN) {
        costoMinutosNacionales = cmN;
    }

    public void establecerMinutosInternacionales(double mI) {
        minutosInternacionales = mI;
    }

    public void establecerCostoMinutoInternacional(double cmI) {
        costoMinutoInternacional = cmI;
    }

    @Override
    public void calcularPagoMensual() {
        pagoMensual = 0;
    }

    public double obtenerMinutosNacionales() {
        return minutosNacionales;
    }

    public double obtenerCostoMinutosNacionales() {
        return costoMinutosNacionales;
    }

    public double obtenerMinutosInternacionales() {
        return minutosInternacionales;
    }

    public double obtenerCostoMinutoInternacional() {
        return costoMinutoInternacional;
    }

    @Override
    public String toString() {
        String cadena = String.format("Plan Post Pago Minutos\n%s"
                + super.toString()
                + "Minutos Nacionales: %.2f\n"
                + "Costo Minuto Nacional: $ %.2f\n"
                + "Minutos Internacionales: %.2f\n"
                + "Costo Minuto Internacional: $ %.2f\n"
                + "Pago Mensual: $ %.2f\n",
                obtenerMinutosNacionales(),
                obtenerCostoMinutosNacionales(),
                obtenerMinutosInternacionales(),
                obtenerCostoMinutoInternacional(),
                obtenerPagoMensual());
        return cadena;
    }
}
