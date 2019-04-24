package com.company;
import java.util.Scanner;

public class Main {


    private static final String lavados[] = {"lavado general", "lavado de motor y chasis","lavado completo"};
    private static final String precios[] = {"300", "200","500"};
    private static final int dinero[] = {300,200,500};

//IMPLEMENTACIÓN DE PATRONES DE DISEÑO EN CÓDIGO DE CARWASH
    //PATRONES DE DISEÑO:  SIGLETON Y FLYWEITH

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int valores;
        int total = 0;
        lavado1 c = lavado1.getMilavado(lavados[1], precios[1]);


        System.out.println("\n  Precio   servicios");
        System.out.println("1)L.300    Lavado General\n" +
                "2)L.200    Lavado de motor y chasis\n" +
                "3)L.500    Lavado completo\n" );

        System.out.println("\nIngrece el numero de Operaciones a realizar: ");
        valores = input.nextInt();

        for (int i = 0; i < valores;++i) {



            int w = (int) (Math.random() * 3);

            c.setPrecio(precios[w]);
            c.setTipo(lavados[w]);

            total += dinero[w];


            c.dibujar();




        }

        System.out.println("\nEl total Gastado es: "+total);



    }
}
