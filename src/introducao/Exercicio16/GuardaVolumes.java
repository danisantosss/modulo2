package introducao.Exercicio16;

import java.util.ArrayList;

public class GuardaVolumes {
    private ArrayList<Item> listaItens = new ArrayList<>();

    public ArrayList<Item> getListaItens() {
        return listaItens;
    }

    public void setListaItens(ArrayList<Item> listaItens) {
        this.listaItens = listaItens;
    }
    public String gerarListaItens(){
        StringBuilder montadorstring = new StringBuilder();
        for(Item umItem : listaItens){
            montadorstring.append("Item: " + umItem.getNome() + "\n ");
            montadorstring.append("Proprietario: " + umItem.getProprietario().getNome() + "\n");
        }
        return montadorstring.toString();
    }
    public static void main(String[] args) {
        GuardaVolumes guarda1 = new GuardaVolumes();
        Item item1 = new Item();
        item1.setNome("Chave de casa");
        Item item2 = new Item();
        item2.setNome("Celular");
        Item item3 = new Item();
        item3.setNome("Chave de casa");
        Item item4 = new Item();
        item4.setNome("Celular");
        Item item5 = new Item();
        item5.setNome("Carteira");
        Item item6 = new Item();
        item6.setNome("Escova de cabelos");

        Proprietario prop1 = new Proprietario();
        prop1.setNome("Zezinho");
        var prop2 = new Proprietario();
        prop2.setNome("Mariazinha");

        item1.setProprietario(prop1);
        item2.setProprietario(prop1);
        item3.setProprietario(prop2);
        item4.setProprietario(prop2);
        item5.setProprietario(prop2);
        item6.setProprietario(prop2);

        guarda1.getListaItens().add(item1);
        guarda1.getListaItens().add(item2);
        guarda1.getListaItens().add(item3);
        guarda1.getListaItens().add(item4);
        guarda1.getListaItens().add(item5);
        guarda1.getListaItens().add(item6);

        String itens = guarda1.gerarListaItens();
        System.out.println(itens);
    }
}
