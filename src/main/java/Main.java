// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    System.out.println("Potencia e consumo Elétrico");

    System.out.println(" ");

    System.out.println("Uma TV de 200W fica ligada aproximadamente 5 horas diariamente.Determine o consumo eletrico mensal da TV");

    System.out.println("Potencia:");

    int potencia = 200;

    System.out.println(potencia);

    System.out.println("Tempo:");

    int tempo = 5;

    int mes = 30;

    System.out.println(mes);

    System.out.println(tempo);

    System.out.println("Divisão:");

    int divisao = 1000;

    System.out.println(divisao);

    System.out.println("Resultado:");

    int mensal = potencia * tempo * mes / divisao;

    System.out.println(mensal);
      }
}