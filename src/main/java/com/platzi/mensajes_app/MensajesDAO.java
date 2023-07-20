package com.platzi.mensajes_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//DATA ACCES OBJECT
//METODOS QUE NOS VAN A PERMITIR CONEXION A BASE DE DATOS
public class MensajesDAO {
    public static void CrearMensajeDB(Mensajes mensaje) { //create
        Conexion db_connect = new Conexion();
        try (Connection conexion = db_connect.get_connection()) {
            PreparedStatement ps = null;
                try {
                    String query = "INSERT INTO mensajes (mensaje, autor_mensaje ) VALUES (?,?);";
                    ps=conexion.prepareStatement(query);
                    ps.setString(1, mensaje.getMensaje());
                    ps.setString(2, mensaje.getAutor_mensaje());
                    ps.executeUpdate();
                    System.out.println("Mensaje creado correctamente");
                    }   catch (SQLException ex) {
                        System.out.println(ex);
                        }

            }catch (SQLException e) {
                System.out.println(e);
            }
        }
    public static void leerMensajeDB() {    //read

    }
    public static void actualizarMensajeDB(Mensajes mensaje) {     //update

    }
    public static void borrarMensajeDB(int id_mensaje) {    //delete

    }

}
