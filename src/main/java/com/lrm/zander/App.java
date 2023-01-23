package com.lrm.zander;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        final String OTHER="N";
        String respuesta;
        PasswordGenerator generador = new PasswordGenerator();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("contraseña propuesta: " +generador.builderPassword()+"\n"+
                    " si no te gusta y desea generar una nueva pulse:" +OTHER);
            respuesta=sc.next();
        }
        while (respuesta.equalsIgnoreCase(OTHER));
        sc.close();
    }
}
