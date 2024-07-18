import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        List<Integer> lista=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("¿Cuantos numeros quieres introducir? ");
        int nintro= scanner.nextInt();
        int cuenta=0;
        while (cuenta<nintro){
            System.out.println("Dime un numero: ");
            int numero = scanner.nextInt();
            lista.add(numero);
            cuenta++;
        }
        int maximo=lista.stream().reduce(0,Integer::max);
        System.out.println("El numero maximo es "+maximo);
    }
}
