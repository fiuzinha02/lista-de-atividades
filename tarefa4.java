package lista2;
public class tarefa4 {
    public static void main(String[] args) {
        //Cria um loop que faz uma variavel caso ela seja menor ou igual a 50, adiciona 1,
        //Dentro desse loop a variavel vai ser dividida por 2 caso o resto não seja 0, então retorne a variavel.
        for (int a = 1 ; a <=50; a++){
            if (a%2  !=0) {
                System.out.println(a);
            }
        }
    }
}
