public class exercicio5git {
    public static void main(String[] args){
        int i;
        for (i = 0; i < 123; i++){ 
            if ((i == 2 ) || (i == 3 ) || (i == 5 ) || (i == 7 ) || (i == 11 )){
                System.out.println(i);
            }
            if ((i%2 != 0) && (i%3 != 0) && (i%5 != 0) && (i%7 != 0)&& (i%11 != 0)){
                System.out.println(i);
            }
        }
    }
}
