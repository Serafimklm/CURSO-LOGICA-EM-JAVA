import java.util.Scanner; // Importa a classe Scanner do pacote java.util, que é usada pra receber entrada do usuário.

public class Main { // Define uma classe  Main.
    public static void main(String[] args) { // Define o método principal da classe Main
        int fila = 0;
        //incremento e decremento
        fila +=1; // o mesmo que +1
        fila +=1; // o mesmo que +1
        fila ++; // o mesmo que +1
        fila ++; // o mesmo que +1
        fila --; // o mesmo que -1


        System.out.println("Na fila há " +fila+ " pessoas");

        fila = 0;
        System.out.println(fila++); /*aqui será imprimido o valor  0 da variável fila, pois o operador
        de decremento está após o nome da variável, o ++ deveria vir antes para ser imprimido, se eu fizesse (++fila) iria imprimir o valor 1*/
        System.out.println(fila); //o anterior adcionou um, aqui mantém o 1
        System.out.println(++fila); // o anterior manteve o 1, aqui adciona +1 = 2
        System.out.println(--fila); // o anterior teve como resultado 2, aqui subtrai 1 = 1
        System.out.println(fila); // o anterior foi igual a 1, aqui matém o 1, sem incremento ou decremento.

    }
}