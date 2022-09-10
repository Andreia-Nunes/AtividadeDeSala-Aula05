//Aluna: Andréia Nunes Pereira

public class Questao1 {
    public static void main(String[] args) {

        int soma = 0;
        for (int i = 1; i <= 99; i++){
            if (i % 2 != 0){
                soma += i;
            }
        }

        System.out.println(soma);
    }
}
