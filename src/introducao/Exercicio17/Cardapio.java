package introducao.Exercicio17;

import java.util.ArrayList;

public class Cardapio {
    private ArrayList<ItemCardapio> listaItensCardapio = new ArrayList<>();

    public ArrayList<ItemCardapio> getListaItensCardapio() {
        return listaItensCardapio;
    }

    public void setListaItensCardapio(ArrayList<ItemCardapio> listaItensCardapio) {
        this.listaItensCardapio = listaItensCardapio;
    }
    public String gerarCardapio(){
        StringBuilder montadorstring = new StringBuilder();
        for(ItemCardapio umItem : listaItensCardapio){
            if(umItem.isDisponivel()){
                montadorstring.append("\nNome do prato: " + umItem.getPrato().getNome());
                montadorstring.append("\nPreço do prato: " + umItem.getPrato().getPreco() + "\n");
            }
        }
        return montadorstring.toString();
    }
    public static void main(String[] args) {

        ItemCardapio item1 = new ItemCardapio();
        item1.setDisponivel(true);
        var item2 = new ItemCardapio();
        item2.setDisponivel(true);
        var item3 = new ItemCardapio();
        item3.setDisponivel(false);
        var item4 = new ItemCardapio();
        item4.setDisponivel(true);

        Prato prato1 = new Prato();
        prato1.setNome("Bifão");
        prato1.setPreco(10f);
        var prato2 = new Prato();
        prato2.setNome("Feijoada");
        prato2.setPreco(30f);
        var prato3 = new Prato();
        prato3.setNome("Dobradinha");
        prato3.setPreco(50f);
        var prato4 = new Prato();
        prato4.setNome("Hamburguer");
        prato4.setPreco(20f);

        item1.setPrato(prato1);
        item2.setPrato(prato2);
        item3.setPrato(prato3);
        item4.setPrato(prato4);

        Cardapio card = new Cardapio();
        card.getListaItensCardapio().add(item1);
        card.getListaItensCardapio().add(item2);
        card.getListaItensCardapio().add(item3);
        card.getListaItensCardapio().add(item4);

        String cardapio = card.gerarCardapio();
        System.out.println(cardapio);
    }
}
