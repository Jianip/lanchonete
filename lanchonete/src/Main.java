
import Model.Cliente;
import Model.Hamburguer;
import Model.Pedido;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Jian", "Eduardo");
        Hamburguer hamburguer = new Hamburguer("alface", "pao", "queijo","alface");

        Pedido pedido1 = new Pedido(cliente, hamburguer);

        System.out.println(pedido1.getStatus());







    }
}
