package introducao.Exercicio10;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<Produto> listaProdutos = new ArrayList<>();

    public ArrayList<Produto> getListaProdutos() {
        return listaProdutos;
    }
    public void setListaProdutos(ArrayList<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }
    public float calcSomaProdutos(){
        float total = 0;
        for(int i = 0; i < getListaProdutos().size(); i++){
            total = total + getListaProdutos().get(i).getValor();
        }
        /*for(Produto umProduto : getListaProdutos()){
            total = total + umProduto.getValor();
        } */ 
        return total;
        }
        public static void main(String[] args) {
            Pedido pedido1 = new Pedido();

            Produto prod1 = new Produto();
            prod1.setNome("Banana");
            prod1.setValor(3.5f);
            pedido1.getListaProdutos().add(prod1);

            Produto prod2 = new Produto();
            prod2.setNome("Laranja");
            prod2.setValor(2.2f);
            pedido1.getListaProdutos().add(prod2);

            Produto prod3 = new Produto();
            prod3.setNome("Maçã");
            prod3.setValor(7.2f);
            pedido1.getListaProdutos().add(prod3);

            Produto prod4 = new Produto();
            prod4.setNome("Pera");
            prod4.setValor(25f);
            pedido1.getListaProdutos().add(prod4);

            float guardar = pedido1.calcSomaProdutos();
            System.out.println(guardar);
    }
}
