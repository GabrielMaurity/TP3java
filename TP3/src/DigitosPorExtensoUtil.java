public class DigitosPorExtensoUtil {
  // Array com os nomes dos números de 0 a 9
  public static final String[] nomes = {
      "zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"
  };

  // Método para converter um número em dígitos por extenso
  public static String converterParaExtenso(int numero) {
    if (numero >= 0 && numero <= 9) {
      return nomes[numero];
    } else {
      String resultado = "";
      while (numero > 0) {
        int digito = numero % 10;
        resultado = nomes[digito] + ", " + resultado;
        numero /= 10;
      }
      return resultado.substring(0, resultado.length() - 2); // Remover a última vírgula e espaço
    }
  }

}