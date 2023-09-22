
import java.util.Random;

public class Mutaçao {
  public static String mutacao(String s) {
    Random random = new Random();
    int posicao = random.nextInt(s.length());
    char novaBase = CadeiaDeDna.BASES.charAt(random.nextInt(CadeiaDeDna.BASES.length()));

    StringBuilder mutado = new StringBuilder(s);
    mutado.setCharAt(posicao, novaBase);

    return mutado.toString();
  }
}
