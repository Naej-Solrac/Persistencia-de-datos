package com.platzi.mensajes_app;

import java.io.StringReader;
import java.util.Scanner;

//vapa intermedia entre el menu principal y la capa de acceso
public class mensajesService {
    public static void  crearMensaje () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu mensajes");
        String mensaje = sc.nextLine();
        System.out.println("Escribe tu nombre");
        String nombre = sc.nextLine();

        Mensajes registro  = new Mensajes();
        registro.setMensaje(mensaje);
        registro.setAutor_mensaje(nombre);

        MensajesDAO.CrearMensajeDB(registro);
    }
    public static void listarMensaje () {
        MensajesDAO.leerMensajeDB();
    }
    public static void  borrarMensaje () {

    }
    public static void editarMensaje () {

    }
}
