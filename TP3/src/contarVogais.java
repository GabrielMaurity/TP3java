public class contarVogais {
  public static int vogais(String texto) {
    int countVowels = 0;

    texto = texto.toLowerCase();

    for (int i = 0; i < texto.length(); i++) {
      char c = texto.charAt(i);
      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
        countVowels++;
    }

    return countVowels;
  }
}
