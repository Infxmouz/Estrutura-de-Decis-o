package mediafaltas;
import java.util.Scanner;

public class MediaFaltas {

    public static void main(String[] args) {
        double m, f;
        Scanner digite = new Scanner(System.in);
        System.out.println("Digite a média: ");
        m = digite.nextDouble();
        System.out.println("Digite o percentual de frequência: ");
        f = digite.nextDouble();
        if(f < 75){
            System.out.println("Reprovado por falta!!");
        }
        if(m < 6){
            System.out.println("Reprovado por nota!!");
        }
        else{
            System.out.println("Aprovado!!");
        }
        
    }
    
}
