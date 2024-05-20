package Ejercicio2;

import java.util.ArrayList;

public class Prueba {

    public static void main(String[] args) {

        ArrayList<Figura2D>listaFiguras=new ArrayList<>();

        Circulo circulo=new Circulo("circulo",5);

        Rectangulo rectangulo=new Rectangulo("rectangulo",5,3);

        Triangulo triangulo=new Triangulo("triangulo",3,4,3);

        listaFiguras.add(circulo);
        listaFiguras.add(rectangulo);
        listaFiguras.add(triangulo);

        for(Figura2D figura2D : listaFiguras){


            System.out.println(figura2D);
        }



    }
}
