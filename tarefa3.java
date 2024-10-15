package lista2;

import java.util.Scanner;
public class tarefa3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        System.out.println("Digite 5 numeros e veja a soma e a média deles");
        // Cria um loop em que pede um número, e adiciona esse número a variavel soma, 5 vezes.
        for (int i = 1; i <= 5; i++){
            int numero = sc.nextInt();
            soma+= numero;
        }
        // Depois cria uma variavel double para números decimais e para fazer a média precisa da soma divido pelo número de números.
        double media = soma / 5.0;
        // Retorna o resultado.
        System.out.println("A media é "+ media);
        System.out.println("A soma é "+ soma);
    }
}
