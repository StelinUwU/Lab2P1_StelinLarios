/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_stelinlarios;

import java.util.Scanner;

/**
 *
 * @author stelinlarios
 */
public class Lab2P1_StelinLarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                int ladoA;
        int ladoB;
        int ladoC;
        int menuOpt = 0;
        boolean mostrarMenu = true;

        Scanner sc = new Scanner(System.in);

        while (mostrarMenu) {
            System.out.println("Seleccione una opción");
            System.out.println("1. Revisar triangulo");
            System.out.println("2. Calcular area de figuras");
            System.out.println("3. Evaluar numeros");
            System.out.println("4. Salir");
            menuOpt = sc.nextInt();

            if (menuOpt > 0 || menuOpt < 5) {
                mostrarMenu = true;
            }

            if (menuOpt == 1) {

                System.out.println("Ingrese A:");
                ladoA = sc.nextInt();

                System.out.println("Ingrese B:");
                ladoB = sc.nextInt();

                System.out.println("Ingrese C");

                ladoC = sc.nextInt();

                if (ladoA < 1 || ladoB < 1 || ladoC < 1) {
                    System.out.println("Las longitudes no pueden ser negativas");
                } else if (ladoA + ladoB > ladoC && ladoB + ladoC > ladoA && ladoA + ladoC > ladoB) {
                    System.out.println("Las longitudes ingresadas forman un triangulo");
                } else {
                    System.out.println("Las longitudes ingresadas no forman un triángulo");
                }

            } else if (menuOpt == 2) {

                int figurasMenuOpt;
                boolean mostrarMenuFiguras = true;
                while (mostrarMenuFiguras) {
                    System.out.println("Seleccione una opción");
                    System.out.println("1. Triangulo");
                    System.out.println("2. Rectangulo");
                    System.out.println("3. Circulo");
                    figurasMenuOpt = sc.nextInt();

                    if (figurasMenuOpt == 1) {
                        System.out.println("Triangulo seleccionado");
                        float base;
                        float altura;

                        System.out.println("Ingrese la base");
                        base = sc.nextFloat();

                        System.out.println("Ingrese la altura");
                        altura = sc.nextFloat();

                        float areaTriangulo = (base * altura) / 2;

                        System.out.println("Area: " + areaTriangulo);
                    } else if (figurasMenuOpt == 2) {
                        float base;
                        float altura;
                        System.out.println("Rectangulo seleccionado");

                        System.out.println("Ingrese la base");
                        base = sc.nextFloat();

                        System.out.println("Ingrese la altura");
                        altura = sc.nextFloat();

                        float areaRectangulo = base * altura;

                        System.out.println("Area: " + areaRectangulo);

                    } else if (figurasMenuOpt == 3) {
                        float radio;
                        System.out.println("Circulo seleccionado");

                        System.out.println("Ingrese el radio");
                        radio = sc.nextFloat();

                        double areaCirculo = Math.PI * Math.pow(radio, 2);

                        System.out.println("Area: " + areaCirculo);

                    } else {
                        System.out.println("Opción invalida");
                        mostrarMenuFiguras = false;
                    }

                    System.out.println("Desea calcular el area de otra figura? s/n");
                    char calcularOtraFigura = sc.next().charAt(0);

                    if (calcularOtraFigura == 'n') {
                        mostrarMenuFiguras = false;
                    }

                }
            } else if (menuOpt == 3) {
                System.out.println("Ingrese el numero que desea evaluar");

                int numeroAEvaluar;

                numeroAEvaluar = sc.nextInt();

                System.out.print("El número ingresado es ");

                if (numeroAEvaluar % 2 == 0) {
                    System.out.println(" par ");
                } else {
                    System.out.println(" impar ");
                }
            } else if (menuOpt == 4) {
                mostrarMenu = false;
            } else {

                System.out.println("Opcion invalida");
            }

        }

    }
    
}
