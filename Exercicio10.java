import java.util.Scanner;
import javax.swing.JOptionPane;
public class Exercicio8 {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        int idade;

        System.out.println("informe a idade");
        idade = entrada.nextInt();

        if ( idade <= 3){
            JOptionPane.showMessageDialog(null, "Você é um bebe");
        }
        if ((idade > 3) && (idade <= 9)){
            JOptionPane.showMessageDialog(null, "Você é uma criança");
        }
        if ((idade > 9) && (idade <=13 )){
            JOptionPane.showMessageDialog(null, "Você é um jovem adolecente");
        }
        if ((idade > 13) && (idade <= 17)){
            JOptionPane.showMessageDialog(null, "Você é um adolecente");
        }
        if ((idade > 17) && (idade <= 24)){
            JOptionPane.showMessageDialog(null, "Você é um jovem adulto");
        }
        if ((idade > 24 ) && (idade <= 26)){
            JOptionPane.showMessageDialog(null, "Você é um adulto");
        }
        if ((idade > 26 ) && (idade <= 36)){
            JOptionPane.showMessageDialog(null, "Você é um idoso");
        }
        if (idade > 36 ){
            JOptionPane.showMessageDialog(null, "Você é um ser historicamente antigo");
        }
    }
}
    
