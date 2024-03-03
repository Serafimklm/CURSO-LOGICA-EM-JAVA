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

                          //   ESTRUTURA DE REPETIÇÃO // ENQUANTO WHILE
 */
  /*
        Scanner leitura = new Scanner(System.in);

        System.out.println("digite um número inteiro acima de 0 ");
        int numero = 0;
        while (numero >= 0 && numero < 33 ) { // Verifica se o número está fora do intervalo
            numero = leitura.nextInt();// Impressão
            System.out.println("Número inserido: " + numero);

        }
        */
        //ESTRUTURA DE REPETIÇÃO WHILE//


        /*
        Scanner leitura = new Scanner(System.in);

        System.out.println("Enquanto o número for maior que zero e menor que 33, o computador vai repetir ");
        int numero = 0;
        while (numero >= 0 && numero <= 33 ) { // enquanto número for maior que 0 e numero for menor de 33, repita
            System.out.println(numero); // imprime o número atual
            numero++; // incremento +1 a variavel número, número recebe mais 1
            System.out.print("Número inserido: " ); // Impressão  */


        //=============================================================================================================//

        //ESTRUTURA DE REPETIÇÃO FOR//
 /*
        System.out.println("digite um numero entre 0 e 50 ");
        int numero = 0;
        for (numero = 0; numero <= 22 ; numero++) {  // numero começa em 0, e conta até 50.
            System.out.println("O numero é " +numero);

        }

        System.out.println();
        System.out.println();

        System.out.println("couter vai imprimir de 1 a 10 ");
        int counter = 0;
        for (counter = 5; counter <= 10; counter++) { // counter começa com 1, counter menor que 10
            System.out.println("o numero digitado é " + counter);
        }

        System.out.println();
        System.out.println();

        //=============================================================================================================//

                                             //ESTRUTURA DE REPETIÇÃO FOR//

            // variável double declarada dentro do proprio laço, fazendo isso, ela só é usada dentro do laço de repetição///
        for (double indice =14; indice >= -20 ; indice-=2) // enquanto o número imprimido for maior ou igual a -20 ele decrementa menos 2
             {
            System.out.println("o valor de indice é " +indice);
        }
        for (int valor = 12; valor >= -20; valor--) {
        System.out.println("valor é " +valor);   // int valor só é válido dentro desse laço, só será imprimido no laço os valore s que esão dentro do for
        }
 */


        //=============================================================================================================//
 /*
                            // Estrutura do while //
        int opcao ;
        String nome = "";
        Scanner leitura = new Scanner(System.in);
        do {
            System.out.println("=============menu=============");
            System.out.println("1. descobrir nome do aluno");
            System.out.println("2. descobir idade do aluno");
            System.out.println("3. encerrar programa");

            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.print("o nome do aluno é jonny");

            } else if (opcao == 2) {
                System.out.println("2. a idade do aluno é 20 ");

            } else if (opcao != 3) {
                System.out.println("3.  opção invalida");

            }
        }while (opcao != 3) ;
        System.out.println("programa encerrado");
         */
        //================================================================================================
 /*
        // ESTRUTURA WILE SIMPES
        int x = 1;
        while (x <= 10) {
            System.out.println("O número atual é " + x);
            x++;
        }

        // ESTRUTURA WILE SIMPES
        int L = 0;
        while (L != 4) {
            System.out.println("o valor de x é " + L);
            L++;
        }
*/
        //==========================================================================================

        // Estrutrua while //
 /*//

        Scanner scanner = new Scanner(System.in);
        int numeroSorteado = 23;
        int numero = 0;
        boolean jogandor = true;

        while (jogandor) {

            System.out.println("digite um numero de 1 a 30 ");
            numero = scanner.nextInt();

            if (numero == numeroSorteado) {
                jogandor = false;
                System.out.println("você acertou");
            } else if (numero > 30) {
                System.out.println("invalido");

            } else if (numero < 0) {
              System.out.println("invalido");
        }

         */


        //======================================================================================
        //DO WHILE //
       /* //
        int xnumer = 0;
        do {
            System.out.println("valor de x é " +xnumer);
            xnumer += 1;

        }
        while (xnumer != 4);
*/
        //////////////////////////////////////////////////////////////////////////////////////////////
      /*  Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("==========menu=============");
            System.out.println("1. mostrar nome da pessoa");
            System.out.println("2. mostar a idade da pessoa");
            System.out.println("3. sair do sistema");
            System.out.println("didite a opção");
            opcao = scanner.nextInt();

            if (opcao == 1){

            System.out.println("nome jonny");}

            else if (opcao == 2){
            System.out.println(" idade 23");}

            else if (opcao != 3){
                System.out.println(" opçcao invalida reiniciando");}
        }
        while (opcao != 3);  // enquanto a opção esta diferente de 3, ele continua repetindo,
        // se for digitado o 3, ele vai considerar como falso e programa vai para o main
*/


        //======================================================================================
      /*     Scanner scanner = new Scanner(System.in);
        int contador = 0;
        while (contador < 10) {
            contador++;

            if (contador == 4) {
                continue;
            }  // ele vai printar de 1 até 10, MENOS o número 4, ele segue o laço de repetição normalmente
            System.out.println("-------> " + contador);
        }

        System.out.println("=========================================");
        System.out.println("=========================================");

        int parada = 0;
        while (parada < 10) {
            parada++;

            if (parada >= 5) {
                break;
            }  // ele vai printar até que parada seja igual a 5, apos isso ele para.
            System.out.println("-------> " + parada);
            */
        //§========================================================================================================
        //ULTIMO   EXERCICIO//
     /*   Scanner scanner = new Scanner(System.in);
                System.out.println("Insira o ano atual: ");
                int anoAtual = scanner.nextInt();

                double salarioInicial = 1500;
                double salarioAtual = salarioInicial;
                double percentual = 2;

                int tempo = anoAtual - 2003;

                for (int i = 0; i < tempo; i++) {
                    salarioAtual = salarioAtual + (salarioAtual * percentual / 100);
                    percentual = 2 * percentual; // Aumenta o percentual em 2% a cada ano
                }

                System.out.println("Salário atual é: " + salarioAtual);
            }

            for (int i=10; i<100;i++){
        System.out.println(“olá mundo”);
    } */

        //--------OPERADOR TERNARIO---------------------
//        Scanner leitura = new Scanner(System.in);
//
//        double notaAluno = 0;
//        String alunoAprovado = "aluno aprovado";
//
//        String Alunoreporvado = "aluno reprovado";
//
//        System.out.println("insira a nota do aluno: ");
//        notaAluno = leitura.nextInt();
//        String s = (notaAluno < 5) ? alunoAprovado : Alunoreporvado;
//        System.out.println(notaAluno);
//====================================================================================================


//        double salario = 0;
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("qual o seu salario ? ");
//        salario = scanner.nextInt();
//        String resultado = salario > 4000? "vou doar uma parte" : "não consigo doar";
//        System.out.println(resultado);
//====================================================================================================
////
//        Scanner scanner = new Scanner(System.in);
//
//       int soma = 0;
//        for (int i = 1; i <= 2; i++) {
//            System.out.println("digite um numero");
//            int num = scanner.nextInt();
//            soma = soma + num;
//        }
//        System.out.println("soma = " +soma);

        //===========================Estrutura  wile (repetindo enquanto a instrução é verdadeira========================================================================
       /* Scanner scanner = new Scanner(System.in);

              int soma = 0;
              int i = 0;
              while ( i < 10)

        {
            System.out.println("insira um numero ");
            i = scanner.nextInt();
            System.out.println("o número insirido é " +i);

            if ( i > 10){
                System.out.println("o número é maior que 10 programa encerrado")        }
; */


          /* int contatodor = 0;
          while (contatodor < 10) {
              contatodor++;
              if (contatodor == 4)
                  break;
              ;
              System.out.println("==> " + contatodor);
          }
              System.out.println("fianl de laço"); */



          }
    }