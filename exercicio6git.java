import java.io.*;
public class exercicio6git {
    public static void main(String[] args){
          
        try{   
            
            InputStreamReader dados = new InputStreamReader(System.in);
            BufferedReader teclado = new BufferedReader(dados);
       
            System.out.println("digite um numero"); 
            double num = Double.parseDouble(teclado.readLine());;
            
            if(num % 2 == 1){
                System.out.println("O numero é impar" );
            }else{
                System.out.println("O numero é par" );
            }    
            
            if ((num % 2  != 0) && (num % 3  != 0) && (num % 5  != 0) && (num % 7  != 0) && (num % 11 != 0)){
                System.out.println("e tambem é primo" );
            }
            else if ((num == 2 ) || (num == 3 ) || (num == 5 ) || (num == 7 ) || (num == 11 )){
                System.out.println("e tambem é primo" );
            }

        }
        catch(Exception error){
            System.out.println("[ERRO] – " + "voce digitou um valor invalido" );
        }
    }
}