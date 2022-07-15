import java.util.Scanner;
public class exercicio2git {
    public static void main(String[] args) 
    {
        Double altura, bmaior, bmenor, area;

        try (Scanner i = new Scanner(System.in)) {
            System.out.println("qual a altura? "); 
            altura = i.nextDouble();   
            System.out.println("qual a base menor? "); 
            bmenor = i.nextDouble(); 
            System.out.println("qual a base maior? "); 
            bmaior = i.nextDouble();
        }
        
        area = (altura*(bmenor + bmaior))/2;

        System.out.print("O valor da area é "+ area); 
        System.out.println("O valor da area aredondada é "+ Math.round(area));  
        
    }
    
}
