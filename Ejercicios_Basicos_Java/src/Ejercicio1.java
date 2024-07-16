import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime un numero: ");
        int numero=scanner.nextInt();
        if (numero%2 == 0){
            System.out.println("Numero Par");
        }else {
            System.out.println("El numero es impar");
        }
    }
}