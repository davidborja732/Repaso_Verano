import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Dime un numero ");
        int numero=scanner.nextInt();
        String binario=Integer.toBinaryString(numero);
        System.out.println("El numero "+numero+" en binario es "+binario);
    }
}
