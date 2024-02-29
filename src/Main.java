import java.util.Scanner; // Importa a classe Scanner do pacote java.util, que é usada pra receber entrada do usuário.
public class Main { // Define uma classe  Main.
    public static <Scnner> void main(String[] args) { // Define o método principal da classe Main
     /*   boolean temDinheiro = true;
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
     ======================================================================================================
      */




                       /* LÓGICA DA PROGRAMAÇAO, ESTRUTRUTURA CONDICIONAL IF

        ===================================================================================================
        int sorte = 0;

        Scanner scanner = new Scanner(System.in);


        System.out.println("Para iniciar o processo digite a sua idade");

        idade += scanner.nextInt(); // lê o valor de scanner digitado pelo usuário e adciona ao total IDADE


            if (idade < 16){
                System.out.println("você é menor de idade, não pode votar");
            }
            if (idade >= 16 &&  idade <= 17){
                System.out.println("seu voto é facultativo");
            }
            if (idade >= 18 && idade <= 60){
                System.out.println("seu voto é obrigatório");
            }
            if (idade >=61){
                System.out.println("seu voto é facultativo");
            }
             ========================================================================================================*/
/*
                                     //ESTRUTURA CONDICIONAL IF

        int numero = 0;
        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;
        int maisVelho = 0;

        Scanner leitura = new Scanner(System.in);
        System.out.println("digite a primeira idade");
        numero += leitura.nextInt();

        System.out.println("digite a segunda idade");
        numero1 += leitura.nextInt();

        System.out.println("digite a terceira");
        numero2 += leitura.nextInt();

        System.out.println("digite a quarta idade");
        numero3 += leitura.nextInt();


        if (numero > maisVelho) {
            maisVelho = numero;
        }   // se o numero for maior que o maiasVelho, maisVelho recebe, numero.. O mais velho poderia também ser iniciado com mais velho = numero

        if (numero1 > maisVelho) {  // se o numero1 for maior que maisVelho, mais velho recebe numero1
            maisVelho = numero1;
        }

        if (numero2 > maisVelho) { // se o numero1 for maior que maisVelho, mais velho recebe numero 3
            maisVelho = numero2;
        }

        if (numero3 > maisVelho) { // se o numero1 for maior que maisVelho, mais velho recebe numero 3. no fim das contas, mais velho vai armazenar o maior numero
            maisVelho = numero3;
        }


        System.out.println("as idade digitadas, respectivamente, foram " + numero + " " + numero1 + " " + numero2 + " e " + numero3 +
                "e o participacipante mais velhor é " + maisVelho);

                ===========================================================================================================================

                                    ESTRUTUR CONDICIONAL, IF  */
         /*

        double nota = 0;
        double nota1 = 0;
        double nota2 = 0;

        double media = 0;

        Scanner leitura = new Scanner(System.in);

        System.out.println("digite o numero 1");
        nota += leitura.nextDouble();

        System.out.println("digitie o numero 2");
        nota1 += leitura.nextDouble();

        System.out.println("digitie o numero 3");
        nota2 += leitura.nextDouble();

        media = (nota + nota1 +nota2) / 3;   //MEDIA RECEBE AS 3 NOTAS E DIVIDE POR 3

        System.out.println("a media do aluno é " +media);



    ===========================================================================================================================*/
                               // ESTRUTURA ELSE IF //
/*

        double livroDeitei = 0;
        double livroBancoDados =0;
        double livrojava = 0;
        double total = 0;

        Scanner leitura = new Scanner(System.in);

        System.out.println("digite o valor do livro de Deitei");
        livroDeitei += leitura.nextDouble();

        System.out.println("digite o valor do livro Banco de dados ");
        livroBancoDados += leitura.nextDouble();

        System.out.println("digite o valor do livro de Java ");
        livrojava += leitura.nextDouble();

        //======================livro deitei===================================
        if (livroDeitei < 77){
            System.out.println("o preço do livro de Deitei está bom");
        }
        else if (livroDeitei > 77 &&  livroDeitei < 100 ){
            System.out.println("o preço do livro de Deitei está razoavel");
            }
        else System.out.println("o preço do livro de Deitei está alto");


        //====================banco de dados=======================================
        if (livroBancoDados < 77){
            System.out.println("o preço do livro banco de dados está bom");
        }
        else if (livroBancoDados > 77 &&  livroBancoDados < 100 ){
            System.out.println("o preço do livro Banco de dados está razoavel");
        }
        else System.out.println("o preço do livro banco de dados está alto");

        //======================java=============================================
        if (livrojava < 77){
            System.out.println("o preço do livro de java está bom");
        }
        else if (livrojava > 77 &&  livrojava < 100 ){
            System.out.println("o preço do livro de java está razoavel");
        }
        else System.out.println("o preço do livro de java está alto");




        //====================================================================================================
                                       COMANDO SWITCH CASE
                                      VALOR ALUGUEL ALTOMOVEIS
 */
        /*
        int sorte = 0;
        int sorte1 = 0;
        int sorte2 = 0;
        int sorte3= 0;

        Scanner leitura = new Scanner(System.in);

        System.out.println("digite valores aleatorios de 1 a 100 ");
        sorte  += leitura.nextInt();
        System.out.println(sorte);
        switch (sorte) {
            case 10:
                System.out.println("você acertou o número da sorte");
                break;
            case 77:
                System.out.println("você acertou o número da sorte");
                break;
            default:
                System.out.println("você não acertou, sorte na proxima ");
        }

        System.out.println("digite o valor da sorte2 ");
        sorte2  += leitura.nextInt();
        System.out.println(sorte2);
        switch (sorte) {
            case 101:
                System.out.println("você acertou o número da sorte");
                break;
            case 74:
                System.out.println("você acertou o número da sorte");
                break;
            default:
                System.out.println("você não acertou, sorte na proxima ");
        }

        System.out.println("digite o valor da sorte3 ");
        sorte3  += leitura.nextInt();
        System.out.println(sorte3);
        switch (sorte) {
            case 101:
                System.out.println("você acertou o número da sorte");
                break;
            case 74:
                System.out.println("você acertou o número da sorte");
                break;
            default:
                System.out.println("você não acertou, sorte na proxima ");
        }


        System.out.println("digite o valor da sorte 4 ");
        sorte1  += leitura.nextInt();
        System.out.println(sorte1);
        switch (sorte) {
            case 31:
                System.out.println("você acertou o número da sorte");
                break;
            case 54:
                System.out.println("você acertou o número da sorte");
                break;
            default:
                System.out.println("você não acertou, essa foi sua ultima tentativa ");
        }
        */

        //====================================================================================================

        //   COMANDO SWITCH CASE //

       /*  Scanner leitura = new Scanner(System.in);

        System.out.println("digite a operação matematica desejada");
        char  operacaoDesejada = leitura.next().charAt(0); // Lê o primeiro caractere da entrada do usuário e armazena na variável operacaoDesejada.
        switch (operacaoDesejada){
            case '+':
                System.out.println("operador de soma selecionado");
                break;
            case '*':
                System.out.println("operador de multiplicaçao selecionado");
                break;
            case '-':
                System.out.println("operador de subtração selecionado");
                break;
            case '/':
                System.out.println("operador de divisão selecionado");
                break;
            default:
                System.out.println("nenhuma opção valida selecionada");
        }
                 /* CASO NÃO COLOQUE O BREAK ELE VAI IMPRIMIR TODAS AS CONDIÇÕES
                 * EX: digite a operação matematica desejada
                    +
                            operador de soma selecionado
                            operador de multiplicaçao selecionado
                            operador de subtração selecionado
                            operador de divisão selecionado
                            nenhuma opção valida selecionada

Process finished with exit code 0*/

        //=============================================================================================================//
/*
                                     // OPERADOR TERNARIO //

 *//*
        Boolean clienteAtivo = true;
        String mensagem = clienteAtivo == false ? "Cliente ativo" : "Cliente inativo";
        System.out.println(mensagem); // Saída: Cliente ativo

        /*       Se clienteAtivo for true, a expressão retorna "Cliente ativo".
                 Se clienteAtivo for false, a expressão retorna "Cliente inativo".
                 O SINAL DE : FUNCIONA PARA SEPARAR OS PISSÍVEIS RESULTADOS
         */


                                  //  segundo exemplo //
/*
        float x = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o valor da compra:");
        x += entrada.nextFloat();

        System.out.println(x > 100 ? "Valor alto" : "Valor OK"); /*


        //=============================================================================================================//



    }
}

