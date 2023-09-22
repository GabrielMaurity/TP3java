package SegundaParte01;

// Classe CartãoWEB
class CartaoWEB {
  private String email;
  private String nome;

  public CartaoWEB(String email, String nome) {
    // Validação do email
    if (isValidEmail(email)) {
      this.email = email;
    } else {
      this.email = "email invalido";
    }
    this.nome = nome;
  }

  public String getEmail() {
    return email;
  }

  public String getNome() {
    return nome;
  }

  // Método para validar email simples
  private boolean isValidEmail(String email) {
    // Você pode adicionar uma lógica de validação mais robusta aqui se necessário
    return email.contains("@");
  }
}

// Interface CartaoMensagem
interface CartaoMensagem {
  String showMessage();
}

// Classes filhas
class DiaDosNamorados extends CartaoWEB implements CartaoMensagem {
  public DiaDosNamorados(String email, String nome) {
    super(email, nome);
  }

  @Override
  public String showMessage() {
    return String.format("mensagem para: %s\nFeliz Dia dos Namorados, %s!\n=======================================",
        getEmail(), getNome());
  }
}

class Natal extends CartaoWEB implements CartaoMensagem {
  public Natal(String email, String nome) {
    super(email, nome);
  }

  @Override
  public String showMessage() {
    return String.format("mensagem para: %s\nFeliz Natal, %s!\n=======================================", getEmail(),
        getNome());
  }
}

class Aniversario extends CartaoWEB implements CartaoMensagem {
  public Aniversario(String email, String nome) {
    super(email, nome);
  }

  @Override
  public String showMessage() {
    return String.format("mensagem para: %s\nFeliz Aniversário, %s!\n=======================================",
        getEmail(), getNome());
  }
}

class Pascoa extends CartaoWEB implements CartaoMensagem {
  public Pascoa(String email, String nome) {
    super(email, nome);
  }

  @Override
  public String showMessage() {
    return String.format("mensagem para: %s\nFeliz Páscoa, %s!\n=======================================", getEmail(),
        getNome());
  }
}
