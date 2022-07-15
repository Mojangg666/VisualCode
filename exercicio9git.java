import java.util.Scanner;
public class exercicio9git {

    public static void main(String[] args){

        float Valor;
        try (Scanner i = new Scanner(System.in)) {
            System.out.println("1-Voce que converter quilos para libras"); 
            System.out.println("2-Voce que converter libras para quilos"); 
            System.out.println("1 ou 2"); 
            Valor = i.nextFloat();

            if(Valor == 1){
                System.out.println("Informe a quantidade de quilos: "); 
                Valor = i.nextFloat();
                Valor = (float) (Valor * 2.2046226218488);
                System.out.println("O valor comvertido para libras é: "+ Valor + "lbs"); 
            }else{
                System.out.println("Informe a quantidade de libras: "); 
                Valor = i.nextFloat();
                Valor = (float) (Valor * 0.45359237);
                System.out.println("O valor comvertido para quilos é: "+ Valor + "Kg");
            }
        }
    }
}
