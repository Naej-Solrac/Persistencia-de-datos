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
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique el ID del mensaje a borrar");
        int id_mensaje = sc.nextInt();
        MensajesDAO.borrarMensajeDB(id_mensaje);
    }
    public static void editarMensaje () {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa tu nuevo mensaje");
        String mensaje = sc.nextLine();

        System.out.println("Ingresa el ID del mensaje a editar");
        int id_mensaje = sc.nextInt();

        Mensajes actualizacion = new Mensajes();
        actualizacion.setId_mensaje(id_mensaje);
        actualizacion.setMensaje(mensaje);
        MensajesDAO.actualizarMensajeDB(actualizacion);
    }
}
