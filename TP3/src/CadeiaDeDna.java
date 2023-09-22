
import java.util.Random;

class CadeiaDeDna {
  public static final String BASES = "ACGT";

  // Método para gerar uma cadeia de DNA aleatória com o tamanho fornecido
  public static String gerarCadeiaDeDna(int tamanho) {
    StringBuilder cadeia = new StringBuilder();
    Random random = new Random();

    for (int i = 0; i < tamanho; i++) {
      char base = BASES.charAt(random.nextInt(BASES.length()));
      cadeia.append(base);
    }

    return cadeia.toString();
  }
}
