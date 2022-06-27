import java.util.Scanner;
public class exercicio2 {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        double a, b, bm, area;
    
        System.out.println("digite o valor da altura: ");
        a = entrada.nextDouble();
    
        System.out.println("digite o valor da base menor: ");
        b = entrada.nextDouble();
    
        System.out.println("digite o valor da base maior: ");
        bm = entrada.nextDouble();
    
        area = (a*(b+bm))/2;
    
        System.out.println("o tamnho da area é " +  Math.ceil(area));
    } 
}
