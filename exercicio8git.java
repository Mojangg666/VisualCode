import java.util.Scanner;
public class exercicio8git {

    public static void main(String[] args){

        float dia = 30 ;
        float Valor;
        float hora;
        try (Scanner i = new Scanner(System.in)) {
            System.out.println("quantas horas você trabalha por dia? "); 
            hora = i.nextFloat(); 
            System.out.println("qual o valor da horas trabalhada? "); 
            Valor = i.nextFloat();
            dia = dia*( Valor *hora );
            if(dia < 50){
                System.out.println("Atenção, dirija-se à direção do Hotel!");   
            }else{
                System.out.println("R$"+dia);
            }              
        }
    }
}