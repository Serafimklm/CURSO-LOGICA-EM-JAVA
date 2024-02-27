import java.util.Scanner; // Importa a classe Scanner do pacote java.util, que é usada pra receber entrada do usuário.

public class Main { // Define uma classe  Main.
    public static void main(String[] args) { // Define o método principal da classe Main
        boolean resposta;
        int fila = 0;
        fila = fila+10;
        System.out.println("o valor de fila é " +fila);
        resposta = (10 == 20); //o mesmo que perguntar se 10 é o mesmo que 20
        System.out.println(resposta);
        resposta = (fila < 11);
        System.out.println(resposta);
        resposta = (fila <= 11);
        System.out.println(resposta);
        resposta = (fila >= 11);
        System.out.println(resposta);


        String n1 = "March";
        String n2 = "april";
        resposta = (n1 == n2);  // o melhor para comparação seria: resposta = (n1.equals(n2))
        System.out.println("a variavel n1 é o mesmo que N2 :" +resposta);


        String l1 = "april";
        String l2 = "april";
        resposta = (l1.equals(l2));
        System.out.println("a variavel l1 é o mesmo que l2 :" +resposta);
    }
}