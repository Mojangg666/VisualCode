public class exercicio4git {
    public static void main(String[] args){
        long x = 1;
        int l = 0;
        int i;

        for (i = 0; i < 30; i++){
            if(i % 2 == 1){
              l += i; 
            }else{
                if(i > 0){
                  x *= i;
                }
            }   

        }
        System.out.println("a soma dos numeros impares de 0 a 30 é:" + l); 
        System.out.println("a multiplicação dos numeros pares de 0 a 30 é:" + x); 
    }
}
