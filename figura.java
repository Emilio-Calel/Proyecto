import java.util.Scanner;
/**
 * @author Emilio Calel
 * @since 2024-08-02
 */
public class figura {
/**
 * Metodo principal de la clase figura
 * @param args parametros introducidos en el programa
 */
public static void main(String [] args){
Scanner scan = new Scanner(System.in);
//Ingreso de datos y asignacion de valores
System.out.println("Ingresar base del triangulo: ");
double base = scan.nextInt();
System.out.println("Ingresar altura del triangulo: ");
double altura = scan.nextInt();
System.out.println("Ingresar radio del circulo: ");
double radio = scan.nextInt();
//calculos para obtener area
double area_trian = base * (altura/2);
double area_circ = 0.50 * 3.1416 * (radio*radio);
double area = area_trian + area_circ;
//Respuesta
System.out.println("El area de la figura es: "+area);
}

}