package introducao.Exercicio3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class App6 {
    public static void main(String[] args) {
        
        Comprador zezinho = new Comprador();
        zezinho.setId(300);
        zezinho.setNome("Zezinho da Silva");
        zezinho.setEndereco("Rua Lalala 100");

        Pedido pedido1 = new Pedido();
        pedido1.setId(1);
        Calendar calendario1 = new GregorianCalendar();
        calendario1.set(2022, 04, 29);
        pedido1.setData(calendario1.getTime());
        pedido1.setCliente(zezinho);

        ItemPedido item1 = new ItemPedido();
        item1.setId(1);
        item1.setValorVenda(7500f);
        item1.setQuantidade(1);

        ItemPedido item2 = new ItemPedido();
        item2.setId(2);
        item2.setValorVenda(4000f);
        item2.setQuantidade(1);

        Produto produto1 = new Produto();
        produto1.setId(1001);
        produto1.setNome("PlayStation 5");
        produto1.setValor(8000f);

        Produto produto2 = new Produto();
        produto2.setId(1002);
        produto2.setNome("Xbox Series X");
        produto2.setValor(5000f);

        item1.setProduto(produto1);
        item2.setProduto(produto2);
        pedido1.getListaItens().add(item1);
        pedido1.getListaItens().add(item2);
        
        
        
        float result = pedido1.calcValorTotal();
        System.out.println(String.format("O total do pedido é: %f", result));

        Comprador angelina = new Comprador();
        angelina.setNome("Angelina Kilobyte");
        angelina.setEndereco("Glória alguma rua ae");
        angelina.setId(486);

        Produto produto3 = new Produto();
        produto3.setNome("Minecraft");
        produto3.setId(3);
        produto3.setValor(50f);

        Produto produto4 = new Produto();
        produto4.setNome("Batata frita");
        produto4.setId(4);
        produto4.setValor(5.50f);

        Produto produto5 = new Produto();
        produto5.setNome("Grand Theft Auto V");
        produto5.setId(5);
        produto5.setValor(249.99F);

        Pedido pedido2 = new Pedido();
        pedido2.setCliente(angelina);
        Calendar calendario2 = new GregorianCalendar();
        calendario2.set(2022, 05, 02);
        pedido2.setData(calendario2.getTime());
        pedido2.setId(2);

        ItemPedido item3 = new ItemPedido();
        item3.setId(3);
        item3.setValorVenda(45f);
        item3.setQuantidade(1);
        item3.setProduto(produto3);

        ItemPedido item4 = new ItemPedido();
        item4.setId(4);
        item4.setValorVenda(5.25f);
        item4.setQuantidade(5);
        item4.setProduto(produto4);

        ItemPedido item5 = new ItemPedido();
        item5.setId(5);
        item5.setValorVenda(90f);
        item5.setQuantidade(2);
        item5.setProduto(produto5);

        pedido2.getListaItens().add(item3);
        pedido2.getListaItens().add(item4);
        pedido2.getListaItens().add(item5);
        
        float result2 = pedido2.calcValorTotal();
        System.out.println(String.format("O total do pedido é: %f", result2));

        
    }
    
}
