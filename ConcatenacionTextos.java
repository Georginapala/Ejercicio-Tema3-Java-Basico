package com.Openbootcamp;

public class ConcatenacionTextos{
    public static void main(String[] args) {
            String[] DatosPersonales = {"Nombre y Apellido","Direccion", "DNI"};
            for (int i = 0; i < DatosPersonales.length; i++) {
                System.out.print(DatosPersonales[i]);
                if (i < DatosPersonales.length - 1){
                    System.out.print(" ");
                }
            }
        }
    }
