//Aluna: Andréia Nunes Pereira

import java.util.Scanner;
public class Questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        for(int i = 0; i < n2; i++){
            result += n1;
        }

        System.out.println(result);

        sc.close();
    }
}
