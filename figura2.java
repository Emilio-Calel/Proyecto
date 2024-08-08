import java.util.Scanner;
/**
 * @author Emilio Calel
 * @since 2024-08-02
 */
public class figura2 {
/**
 * Metodo principal de la clase figura
 */
public static void main(String [] args){
Scanner scan = new Scanner(System.in);
//Ingreso de datos y asignacion de valores
System.out.println("Coloca la base del triangulo: ");
double base = scan.nextInt();
System.out.println("Coloca la altura del triangulo: ");
double altura = scan.nextInt();
System.out.println("Coloca radio del circulo: ");
double radio = scan.nextInt();
//calculos para obtener area
double area_trian = base * (altura/2);
double area_circ = 0.50 * 3.1416 * (radio*radio);
double area = area_trian + area_circ;
//Respuesta
System.out.println("La figura tiene un area de: "+area);
}

}