import java.util.Scanner;

class Program {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite uma palavra:");
    String palavra = scanner.nextLine();

    // Letra a)
    int numCaracteres = palavra.length();
    System.out.println("a) Número de caracteres da palavra: " + numCaracteres);

    // Letra b)
    String maiuscula = palavra.toUpperCase();
    System.out.println("b) Palavra em MAIÚSCULA: " + maiuscula);

    // Letra c)
    int numVogais = contarVogais.vogais(palavra);
    System.out.println("c) Número de vogais da palavra: " + numVogais);

    // Letra d)
    boolean comecaComINF = palavra.toLowerCase().startsWith("inf");
    System.out.println("d) Começa com 'INF' (ignorando maiúsculas/minúsculas): " + comecaComINF);

    // Letra e)
    boolean terminaComNET = palavra.toLowerCase().endsWith("net");
    System.out.println("e) Termina com 'NET' (ignorando maiúsculas/minúsculas): " + terminaComNET);

    // Letra f)
    int numDigitos = contarDigitos.countDigits(palavra);
    System.out.println("f) Número de dígitos na string: " + numDigitos);

    // Letra g)
    String doisPrimeirosDigitos = palavra.length() >= 2 ? palavra.substring(0, 2) : palavra;
    System.out.println("g) Os 2 primeiros dígitos da string: " + doisPrimeirosDigitos);

    // Letra h)
    boolean ehPalindromo = Palindromo.isPalindrome(palavra);
    System.out.println("h) A string é um palíndromo: " + ehPalindromo);

    // EXERCICIO 2
    System.out.println("-------------------- EXERCICIO 2-----------------------");
    System.out.println("Entre com um número inteiro: ");
    int numero = scanner.nextInt();
    String resultado = DigitosPorExtensoUtil.converterParaExtenso(numero);
    System.out.println("Resultado: " + resultado);

    // EXERCICIO 3
    System.out.println("-------------------- EXERCICIO 3-----------------------");
    String nome = "Gabriel de Freitas Maurity";
    System.out.println(Inicialutil.PegarIniciais(nome));
    System.out.println(nome);

     System.out.println("-------------------- EXERCICIO4-----------------------");
     System.out.print("Digite o tamanho das cadeias de DNA: ");
     int tamanho = scanner.nextInt();

     // Gerar duas cadeias de DNA aleatórias
     String cadeia1 = CadeiaDeDna.gerarCadeiaDeDna(tamanho);
     String cadeia2 = CadeiaDeDna.gerarCadeiaDeDna(tamanho);

     System.out.println("Cadeia 1: " + cadeia1);
     System.out.println("Cadeia 2: " + cadeia2);

     // Realizar recombinação e mutação
     String[] filhos = AlgoritmosGeneticos.recombinacao(cadeia1, cadeia2);
     String mutacaoFilho = Mutaçao.mutacao(filhos[0]);

     System.out.println("Filho 1 após recombinação: " + filhos[0]);
     System.out.println("Filho 2 após recombinação: " + filhos[1]);
     System.out.println("Filho 1 após mutação: " + mutacaoFilho);
    scanner.close();
  }

}