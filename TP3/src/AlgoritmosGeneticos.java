
import java.util.Random;

public class AlgoritmosGeneticos {
  public static String[] recombinacao(String s1, String s2) {
    Random random = new Random();
    int pontoDeCorte = random.nextInt(s1.length());

    String s1a = s1.substring(0, pontoDeCorte) + s2.substring(pontoDeCorte);
    String s2a = s2.substring(0, pontoDeCorte) + s1.substring(pontoDeCorte);

    String[] filhos = { s1a, s2a };
    return filhos;
  }

}
