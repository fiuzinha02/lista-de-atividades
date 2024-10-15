package lista2;
import java.util.Scanner;
public class tarefa2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // cria uma variavel para comparar se é um numero possivel dentro do java
        int maior = -2147483647;
        // pede 5 numeros para o usuario
        System.out.println("Digite 5 numeros");
        //cria um loop em que se repete 5 vezes
        for (int i = 0; i < 5; i++) {
            int numero = sc.nextInt();
            // aqui ele pega dentre os números o maior deles que corresponde mais a condição
            if (numero > maior) {
                // e atribui a variavel maior
                maior = numero;
            }

        }
        // retorna a variavel maior.
        System.out.println("O maior numero é " + maior);
        sc.close();
    }
}
