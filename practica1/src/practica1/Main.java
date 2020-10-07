package practica1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

  public static boolean variablesSonNulos( int num1, int num2, int num3 ) {
	  return ( num1 < 1 || num2 < 1 || num3 < 1 );  
  }
  
  public static int llenarVariable( Scanner lector ) {
	  int temp = -1;
	  System.out.println( "Introduce un número entero entre 1 y 200." );
	  
	  if( lector.hasNextInt() ){
		  temp = lector.nextInt();
		  lector.nextLine();
	  } else {
		  System.out.println( "Debes introducir un número de tipo entero." );
		  lector.nextLine();
		  return -1;
	  }
	  
	  if( temp >= 1 && temp <= 200 ) {
		  return temp;
	  } else {
		  System.out.println( "Debes introducir un número entre 1 y 200." );
		  return -1;
	  }
  }
  
  public static boolean esUnTriangulo( int num1, int num2, int num3 ) {
	  return ( num1 + num2 > num3 ) && ( num2 + num3 > num1 ) && ( num1 + num3 > num2 );
  }
  
  public static boolean esEquilatero( int num1, int num2, int num3 ) {
	  return num1 == num2 && num1 == num3;
  }
  
  public static boolean esIsosceles( int num1, int num2, int num3 ) {
	  return num1 == num2 || num1 == num3 || num2 == num3;
  }

  public static void main( String[] args ) {

	  Scanner lector = new Scanner( System.in );
	  int num1 = -1;
	  int num2 = -1;
	  int num3 = -1;
	  
	  while( variablesSonNulos( num1, num2, num3 ) )
	  {
		  if( num1 < 1 ) {
			  num1 = llenarVariable( lector );
		  }
		  
		  if( num2 < 1 ) {
			  num2 = llenarVariable( lector );
		  }
		  
		  if( num3 < 1 ) {
			  num3 = llenarVariable( lector );
		  }
	  }
	  
	  if( esUnTriangulo( num1, num2, num3 ) )
	  {
		  if( esEquilatero( num1, num2, num3 ) ) 
		  {
			  System.out.println( "El triángulo es equilatero." );
		  } 
		  else if( esIsosceles( num1, num2, num3 ) ) 
		  {
			  System.out.println( "El triángulo es isosceles." );
		  } 
		  else 
		  {
			  System.out.println( "El triángulo es escaleno." );
		  }
	  } else {
		  System.out.println( "No es un triángulo." );
	  }
	  
	  
	  
	  
	  
/*
    int bandera = 1;
    int bandera2 = 1;
    
    Scanner lector = new Scanner(System.in);

    while (bandera == 1) {
      bandera2 = 1;
      try {
        System.out.println("Introduce el primer valor del triangulo a evaluar");
        double valor1 = lector.nextDouble();
        
        if( ( valor1 >= 1 ) && ( valor1 <= 200 ) ) {
          System.out.println("Introduce el segundo valor del triangulo");
          double valor2 = lector.nextDouble();
          
          if( ( valor2 >= 1 ) && ( valor2 <= 200 ) ) {
            System.out.println("Introduce el tercer valor del triangulo");
            double valor3 = lector.nextDouble();
            
            if( ( valor3 >= 1 ) && ( valor3 <= 200 ) ) {
              if( ( valor1 == valor2 ) && ( valor2 == valor3 ) ) {
                System.out.println("El triangulo introducido es un Equilatero");
              } else if( ( valor1 != valor2 ) && ( valor2 != valor3 ) && ( valor3 != valor1 ) ) {
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
            System.out.println("Â¿Desea Continuar evaluando? \n1=continuar \n2=terminar proceso");
            bandera = lector.nextInt();
            if ((bandera != 1) && (bandera != 2)) {
              System.out.println("Introduzca valores validos 1 o 2");
            } else if (bandera == 2) {
              System.out.println("Proceso terminado");
              bandera2 = 2;
            }
          } catch (InputMismatchException e) {
            System.out.println("Por favor introduzca valores nÃºmericos");
            bandera2 = 2;
          }
        }
      } catch (InputMismatchException e) {
        System.out.println("Por favor introduzca valores nÃºmericos");
      }

    }

  }
*/
}
}
