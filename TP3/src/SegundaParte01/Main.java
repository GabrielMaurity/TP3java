package SegundaParte01;
import java.util.LinkedList;
import java.util.List;
import java.math.BigDecimal;



public class Main {
    public static void main(String[] args) {
        List<CartaoMensagem> cartoes = new LinkedList<>();

        cartoes.add(new DiaDosNamorados("email1@example.com", "Alice"));
        cartoes.add(new Natal("email2@example.com", "Bob"));
        cartoes.add(new Aniversario("email3@example.com", "Charlie"));
        cartoes.add(new Pascoa("email4@example.com", "David"));
        cartoes.add(new DiaDosNamorados("email5@example.com", "Eve"));

        cartoes.forEach(cartao -> System.out.println(cartao.showMessage()));

        System.out.println("------------------Parte 2--------------------");

    }
    Cliente cliente = new ClienteSant("caio", "caio@gmail.com", "", "", "", "", "", "");
        cliente.Deposit(BigDecimal.valueOf(100));
        cliente.Sacar(72);


    Cliente clienteVip = new ClienteVip("caio", "caio@gmail.com", "", "", "", "", "", "");
        clienteVip.Deposit(BigDecimal.valueOf(100));
        clienteVip.Sacar(50);
}
