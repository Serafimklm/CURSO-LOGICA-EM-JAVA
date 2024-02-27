import java.util.Scanner; // Importa a classe Scanner do pacote java.util, que é usada pra receber entrada do usuário.

public class Main { // Define uma classe  Main.
    public static void main(String[] args) { // Define o método principal da classe Main
        boolean temDinheiro = true;
        boolean temTempo = false;
        boolean viajar = temTempo && temDinheiro;  //ambas as condições tem que ser true para ser verdadeiro.
        System.out.println(viajar);

        //operador lógico end

        boolean notaMenor60 = false;
        boolean frequenciaMenor88 = true;
        boolean recuperacao = notaMenor60 || frequenciaMenor88;
        System.out.println(recuperacao);

        // operador de negacao

        boolean inverte = true;
        System.out.println("operador de negacao " +inverte);
        System.out.println("operador de negacao " +!inverte);  // basta adcionar exclamacao que o  operador vai considerar como falso.

        //
        double  retorno = 0;
        retorno = Math.ceil(323.223);
        System.out.println(retorno);
        System.out.println(Math.ceil(323.223)); // aqui é para arredondar um número.

        retorno = Math.abs(-234.23);
        System.out.println(retorno);
        System.out.println(Math.abs(-234.23)); // extrai um número absoluto

        int a = 2;
        int b= 3;
        retorno = Math.pow(a, b); // eleva 2 a 3, que é o mesmo que 2³=2×2×2 = 8
        System.out.println(Math.pow(a, b)); // a segunda  forma de fazer operações
        System.out.println(retorno);

        System.out.println(Math.sqrt(100)); // imprime a raiz quadrada de 100

    }
}