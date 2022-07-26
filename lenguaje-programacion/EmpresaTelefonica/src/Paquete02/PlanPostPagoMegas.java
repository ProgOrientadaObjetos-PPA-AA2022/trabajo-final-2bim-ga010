/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete02;

/**
 *
 * @author spart
 */
public class PlanPostPagoMegas extends PlanCelular {

    private double megasGi;
    private double costoGiga;
    private double tarifaBase;

    public PlanPostPagoMegas(double mG, double cG, double tB, String nom,
            String ced, String ciu, String mar, String mod, String numeroCe) {
        super(nom, ced, ciu, mar, mod, numeroCe);
        megasGi = mG;
        costoGiga = cG;
        tarifaBase = tB;
    }

    public void establecerMegasGi(double me) {
        megasGi = me;
    }

    public void establecerCostoMega(double costoM) {
        costoGiga = costoM;
    }

    public void establecerTarifaBase(double tarifaB) {
        tarifaBase = tarifaB;
    }

    @Override
    public void calcularPagoMensual() {
        pagoMensual = 0;
    }

    public double obtenerMegasGi() {
        return megasGi;
    }

    public double obtenerCostoMega() {
        return costoGiga;
    }

    public double obtenerTarifaBase() {
        return tarifaBase;
    }

    @Override
    public String toString() {
        String cadena = String.format("Plan Post Pago Megas\n"
                + super.toString()
                + "Megas en Gigas: %.2f\n"
                + "Costo por cada Giga: $ %.2f\n"
                + "Tarifa Base: %.2f\n"
                + "Pago Mensual: $ %.2f\n",
                obtenerMegasGi(),
                obtenerCostoMega(),
                obtenerTarifaBase(),
                obtenerPagoMensual());
        return cadena;
    }
}
