package practica1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

  public Main() {
    // TODO Auto-generated constructor stub
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    int bandera = 1;
    int bandera2 = 1;

    while (bandera == 1) {
      bandera2 = 1;
      try {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el primer valor del triangulo a evaluar");
        double valor1 = lector.nextDouble();
        if ((valor1 >= 1) && (valor1 <= 200)) {
          System.out.println("Introduce el segundo valor del triangulo");
          double valor2 = lector.nextDouble();
          if ((valor2 >= 1) && (valor2 <= 200)) {
            System.out.println("Introduce el tercer valor del triangulo");
            double valor3 = lector.nextDouble();
            if ((valor3 >= 1) && (valor3 <= 200)) {
              if ((valor1 == valor2) && (valor2 == valor3)) {
                System.out.println("El triangulo introducido es un Equilatero");
              } else if ((valor1 != valor2) && (valor2 != valor3) && (valor3 != valor1)) {
                System.out.println("El triangulo introducido es un Escaleno");
              } else {
                System.out.println("El triangulo introducido es un Equilatero");
              }
            } else {
              System.out.println("El valor debe ser mayoy o igual a 1 y menor o igual a 200");
            }
          } else {
            System.out.println("El valor debe ser mayoy o igual a 1 y menor o igual a 200");
          }
        } else {
          System.out.println("El valor debe ser mayoy o igual a 1 y menor o igual a 200");
        }
        while (bandera2 == 1) {
          try {
            System.out.println("¿Desea Continuar evaluando? \n1=continuar \n2=terminar proceso");
            bandera = lector.nextInt();
            if ((bandera != 1) && (bandera != 2)) {
              System.out.println("Introduzca valores validos 1 o 2");
            } else if (bandera == 2) {
              System.out.println("Proceso terminado");
              bandera2 = 2;
            }
          } catch (InputMismatchException e) {
            System.out.println("Por favor introduzca valores númericos");
            bandera2 = 2;
          }
        }
      } catch (InputMismatchException e) {
        System.out.println("Por favor introduzca valores númericos");
      }

    }

  }

}
