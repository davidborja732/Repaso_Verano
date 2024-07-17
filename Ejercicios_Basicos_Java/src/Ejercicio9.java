import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime el primer numero: ");
        int num1=scanner.nextInt();
        System.out.println("Dime el segundo numero: ");
        int num2=scanner.nextInt();
        int cociente=0;
        while (num1>=num2){
            cociente++;
            num1-=num2;
        }
        System.out.println("Cociente= "+cociente+" Resto= "+num1);
    }
}
