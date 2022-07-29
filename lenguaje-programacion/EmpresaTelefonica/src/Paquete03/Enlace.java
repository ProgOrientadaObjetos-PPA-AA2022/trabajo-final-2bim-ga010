/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Paquete02.*;

/**
 *
 * @author spart
 */
public class Enlace {

    private Connection conn;

    public void establecerConexion() {

        try {
            // db parameters  
            String url = "jdbc:sqlite:bd/PlanCelular.bd";
            // create a connection to the database  
            conn = DriverManager.getConnection(url);
            // System.out.println(conn.isClosed());
            // System.out.println("Connection to SQLite has been established.");  

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public Connection obtenerConexion() {
        return conn;
    }

    public void insertarPlanPostPagoMegas(PlanPostPagoMegas p1) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO planPostPagoMegas (nombreUsuario,cedulaUsuario,"
                    + "ciudadUsuario,marcaMovil,modeloMovil,numeroMovil,numeroMegasGB,"
                    + "costoGB,tarifaBase) values "
                    + "('%s', '%s', '%s', '%s', '%s', %s, %f, %f, %f)",
                    p1.obtenerNombresUsuario(),
                    p1.obtenerCedulaUsuario(),
                    p1.obtenerCiudadUsuario(),
                    p1.obtenerMarcaMovil(),
                    p1.obtenerModeloMovil(),
                    p1.obtenerNumeroMovil(),
                    p1.obtenerNumeroMegasGB(),
                    p1.obtenerCostoGB(),
                    p1.obtenerTarifaBase());
            System.out.println(data);
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception:");
            System.out.println(e.getMessage());

        }
    }

    public void insertarPlanPostPagoMinutos(PlanPostPagoMinutos p1) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO planPostPagoMinutos (nombreUsuario,cedulaUsuario,"
                    + "ciudadUsuario,marcaMovil,modeloMovil,numeroMovil,minutosNacionales,costoMinutoNacional,"
                    + "minutosInternacionales,costoMinutoInternacional) values "
                    + "('%s', '%s', '%s', '%s', '%s', %s, %d, %f, %d, %f)",
                    p1.obtenerNombresUsuario(), 
                    p1.obtenerCedulaUsuario(),
                    p1.obtenerCiudadUsuario(),
                    p1.obtenerMarcaMovil(), 
                    p1.obtenerModeloMovil(), 
                    p1.obtenerNumeroMovil(),
                    p1.obtenerMinutosNacionales(),
                    p1.obtenerCostoMinutoNacional(),
                    p1.obtenerMinutosInternacionales(),
                    p1.obtenerCostoMinutoInternacional());
            System.out.println(data);
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception:");
            System.out.println(e.getMessage());

        }
    }

    public void insertarPlanPostPagoMinutosMegasEconomico(PlanPostPagoMinutosMegasEconomico p1) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO planPostPagoMinutosMegasEconomico (nombreUsuario,cedulaUsuario,"
                    + "ciudadUsuario,marcaMovil,modeloMovil,numeroMovil,minutos,costoMinutos,"
                    + "numeroMegasGB,costoGB,pDescuento) values "
                    + "('%s', '%s', '%s', '%s', '%s', %s, %d, %f, %d, %f, %f)",
                    p1.obtenerNombresUsuario(),
                    p1.obtenerCedulaUsuario(), 
                    p1.obtenerCiudadUsuario(),
                    p1.obtenerMarcaMovil(),
                    p1.obtenerModeloMovil(), 
                    p1.obtenerNumeroMovil(), 
                    p1.obtenerMinutos(),
                    p1.obtenerCostoMinuto(),
                    p1.obtenerNumeroMegasGB(), 
                    p1.obtenerCostoGB(),
                    p1.obtenerPDescuento());
            System.out.println(data);
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception:");
            System.out.println(e.getMessage());

        }
    }

    public void insertarPlanPostPagoMinutosMegas(PlanPostPagoMinutosMegas p1) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO planPostPagoMinutosMegas (nombreUsuario,cedulaUsuario,"
                    + "ciudadUsuario,marcaMovil,modeloMovil,numeroMovil,minutos,costoMinutos,"
                    + "numeroMegasGB,costoGB) values "
                    + "('%s', '%s', '%s', '%s', '%s', %s, %d, %f, %d, %f)",
                    p1.obtenerNombresUsuario(), 
                    p1.obtenerCedulaUsuario(), 
                    p1.obtenerCiudadUsuario(),
                    p1.obtenerMarcaMovil(),
                    p1.obtenerModeloMovil(),
                    p1.obtenerNumeroMovil(),
                    p1.obtenerMinutos(),
                    p1.obtenerCostoMinuto(), 
                    p1.obtenerNumeroMegasGB(),
                    p1.obtenerCostoGB());
            System.out.println(data);
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception:");
            System.out.println(e.getMessage());

        }
    }

    public ArrayList<PlanPostPagoMegas> obtenerDataPlanPostPagoMegas() {
        ArrayList<PlanPostPagoMegas> lista = new ArrayList<>();
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from planPostPagoMegas;";

            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {
                PlanPostPagoMegas pm = new PlanPostPagoMegas(rs.getString("nombreUsuario"),
                rs.getString("cedulaUsuario"),
                rs.getString("ciudadUsuario"),
                rs.getString("marcaMovil"),
                rs.getString("modeloMovil"),
                rs.getString("numeroMovil"),
                rs.getDouble("numeroMegasGB"),
                rs.getDouble("costoGB"),
                rs.getDouble("tarifaBase"));
                
                pm.calcularPagoMensual();
                lista.add(pm);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarPlanPostPagoMegas");
            System.out.println(e.getMessage());

        }
        return lista;
    }

    public ArrayList<PlanPostPagoMinutos> obtenerDataPlanPostPagoMinutos() {
        ArrayList<PlanPostPagoMinutos> lista = new ArrayList<>();
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from planPostPagoMinutos;";

            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {
                PlanPostPagoMinutos pm = new PlanPostPagoMinutos(rs.getString("nombreUsuario"),
                rs.getString("cedulaUsuario"),
                rs.getString("ciudadUsuario"),
                rs.getString("marcaMovil"),
                rs.getString("modeloMovil"),
                rs.getString("numeroMovil"),
                rs.getInt("minutosNacionales"),
                rs.getDouble("costoMinutoNacional"),
                rs.getInt("minutosInternacionales"),
                rs.getDouble("costoMinutoInternacional"));
                
                pm.calcularPagoMensual();
                lista.add(pm);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarPlanPostPagoMegas");
            System.out.println(e.getMessage());

        }
        return lista;
    }

    public ArrayList<PlanPostPagoMinutosMegas> obtenerDataPlanPostPagoMinutosMegas() {
        ArrayList<PlanPostPagoMinutosMegas> lista = new ArrayList<>();
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from planPostPagoMinutosMegas;";

            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {
                PlanPostPagoMinutosMegas pm = new PlanPostPagoMinutosMegas(rs.getString("nombreUsuario"),
                rs.getString("cedulaUsuario"),
                rs.getString("ciudadUsuario"),
                rs.getString("marcaMovil"),
                rs.getString("modeloMovil"),
                rs.getString("numeroMovil"),
                rs.getInt("minutos"),
                rs.getDouble("costoMinuto"),
                rs.getInt("numeroMegasGB"),
                rs.getDouble("costoGiga"));
                
                pm.calcularPagoMensual();
                lista.add(pm);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarPlanPostPagoMinutosMegas");
            System.out.println(e.getMessage());

        }
        return lista;
    }

    public ArrayList<PlanPostPagoMinutosMegasEconomico> obtenerDataPlanPostPagoMinutosMegasEconomico() {
        ArrayList<PlanPostPagoMinutosMegasEconomico> lista = new ArrayList<>();
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from planPostPagoMinutosMegasEconomico;";

            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {
                PlanPostPagoMinutosMegasEconomico pm = new PlanPostPagoMinutosMegasEconomico(rs.getString("nombrePropietario"),
                rs.getString("cedulaPropietario"),
                rs.getString("ciudadPropietario"),
                rs.getString("marcaCelular"),
                rs.getString("marcaCelular"),
                rs.getString("numeroCelular"),
                rs.getInt("minutos"),
                rs.getDouble("costoMinuto"),
                rs.getInt("numeroMegasGB"),
                rs.getDouble("costoGB"),
                rs.getDouble("pDescuento"));
                
                pm.calcularPagoMensual();
                lista.add(pm);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarPlanPostPagoMinutosMegas");
            System.out.println(e.getMessage());
        }
        return lista;
    }
}
