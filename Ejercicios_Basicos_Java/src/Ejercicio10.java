import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        List<Integer> lista=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("Dime un numero:(con f terminas) ");
            String numero= scanner.next();
            if (numero.equals("f")){
                break;
            }else{
                lista.add(Integer.parseInt(numero));
            }
        }
        int suma=lista.stream().reduce(0,Integer::sum);
        System.out.println("El resultado es "+suma);
    }
}
