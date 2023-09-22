import java.util.Objects;

public class Inicialutil {
  public static String PegarIniciais(String nome) {
    nome = nome.toLowerCase();
    StringBuilder iniciais = new StringBuilder();
    String[] Array1 = nome.split(" ");
    String[] conectors = { "e", "do", "da", "dos", "das", "de", "di", "du" };
    for (int i = 0; i < Array1.length; i++) {
      for (int j = 0; j < conectors.length; j++) {
        if (Objects.equals(Array1[i], conectors[j])) {
          Array1[i] = "";
        }
      }
    }

     for (int i = 0; i < Array1.length; i++) {
     if (Array1[i] != "") {
     iniciais.append(Array1[i].toUpperCase().charAt(0));
     }
     }
    return iniciais.toString();
  }
}