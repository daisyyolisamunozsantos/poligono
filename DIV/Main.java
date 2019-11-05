import java.util.*;
import java.lang.Math;

class Main {
  
  public static void main(String[] args) {
    System.out.println("Hola Mundo!");
  
   // Ejercicio
    String LinkPrimario = 
    "https://www.keene.edu/campus/maps/tool/?coordinates=";
    String intermedioVariable = "%2C%20";
    
    String finalVariable = "%0A";
    String resultado;

    Double x1, y1, x2, y2, x3, y3, x4, y4, x5, y5,x6, y6;


    Scanner lector = new Scanner(System.in);

    System.out.print("Ingresa coordenada en x1: ");
    x1 = lector.nextDouble();
    System.out.print("Ingresa coordenada en y1: ");
    y1 = lector.nextDouble();
    System.out.print("Ingresa coordenada en x2: ");
    x2 = lector.nextDouble();
    System.out.print("Ingresa coordenada en y2: ");
    y2 = lector.nextDouble();
     System.out.print("Ingresa coordenada en x3: ");
    x3 = lector.nextDouble();
    System.out.print("Ingresa coordenada en y3: ");
    y3 = lector.nextDouble();
    System.out.print("Ingresa coordenada en x4: ");
    x4 = lector.nextDouble();
    System.out.print("Ingresa coordenada en y4: ");
    y4 = lector.nextDouble();
     System.out.print("Ingresa coordenada en x5: ");
    x5 = lector.nextDouble();
    System.out.print("Ingresa coordenada en y5: ");
    y5 = lector.nextDouble();
    System.out.print("Ingresa coordenada en x6: ");
    x6 = lector.nextDouble();
    System.out.print("Ingresa coordenada en y6: ");
    y6 = lector.nextDouble();
//
    resultado = LinkPrimario + Double.toString(x1)+intermedioVariable + Double.toString(y1) + finalVariable + Double.toString(x2) + intermedioVariable + Double.toString(y2)+ finalVariable + Double.toString(x3) + intermedioVariable + Double.toString(y3) + finalVariable + Double.toString(x4) + intermedioVariable + Double.toString(y4) + finalVariable + Double.toString(x5) + intermedioVariable + Double.toString(y5)+
    finalVariable + Double.toString(x6) + intermedioVariable + Double.toString(y6);
     System.out.println("LINK: " +  resultado);
  }
}