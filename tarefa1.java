package lista2;

public class tarefa1 {
    public static void main(String[] args) {
// cria um loop em que começa o valor atribuido=1.
        // se for menor ou igual a vinte aumente mais 1 a esse valor.
        // sempre em que isso acontece cria uma nova linha para dizer este valor.
      for (int i = 1; i <=20; i++){
          System.out.println(i);
      }
// cria outro loop que faz a mesma coisa, mas ao invés de criar outras linhas, ele vai mostrar em uma linha só.
      for (int i = 1; i <=20; i++){
          System.out.print( i+" ");
      }
    }
}
