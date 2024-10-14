package media;
import java.util.Scanner;

public class Media {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        double n1, n2, m;
        System.out.println("Digite a nota 1");
        n1 = s.nextDouble();
        System.out.println("Digite a nota 2");
        n2 = s.nextDouble();
        m = (n1+n2) / 2;
        if ( m>= 6 ){
            System.out.println("Aprovado!");
        }
        else{
            System.out.println("Reprovado!");
        }
    }
    
}
