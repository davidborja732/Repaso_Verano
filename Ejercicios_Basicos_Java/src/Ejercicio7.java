import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        List<Integer> lista=new ArrayList<>();
        int cuenta=0;
        Scanner scanner=new Scanner(System.in);
        while (cuenta>=0){
            System.out.println("Dime un numero: ");
            int numero= scanner.nextInt();
            if (numero>0){
                lista.add(numero);
                cuenta++;
            }else {
                break;
            }
        }
        int suma=lista.stream().reduce(0,Integer::sum);
        System.out.println("El resultado es "+suma);
    }
}
