import java.util.Scanner;
public class Exercicio1git
{
    public static void main(String[] args) 
    {
        float altura, bmaior, bmenor, area;
        try (Scanner i = new Scanner(System.in)) {
            System.out.println("qual a altura? "); 
            altura = i.nextFloat();   
            System.out.println("qual a base menor? "); 
            bmenor = i.nextFloat(); 
            System.out.println("qual a base maior? "); 
            bmaior = i.nextFloat();
        }
        area = (altura*(bmenor + bmaior))/2;

        System.out.print("O valor da area é "+ area); 
    }
}