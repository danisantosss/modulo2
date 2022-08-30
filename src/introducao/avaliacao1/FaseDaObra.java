package introducao.avaliacao1;

import java.util.ArrayList;

public class FaseDaObra {
    private String nome;
    private ArrayList<ItemDeConstrucao> listaItens = new ArrayList<ItemDeConstrucao>();
    private ArrayList<Construtor> listaConstrutores = new ArrayList<Construtor>();
    private Engenheiro encarregado;

    public Engenheiro getEncarregado() {
        return encarregado;
    }

    public void setEncarregado(Engenheiro encarregado) {
        this.encarregado = encarregado;
    }

    public ArrayList<Construtor> getListaConstrutores() {
        return listaConstrutores;
    }

    public void setListaConstrutores(ArrayList<Construtor> listaConstrutores) {
        this.listaConstrutores = listaConstrutores;
    }

    public ArrayList<ItemDeConstrucao> getListaItens() {
        return listaItens;
    }

    public void setListaItens(ArrayList<ItemDeConstrucao> listaItens) {
        this.listaItens = listaItens;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public float calcularValorDaFaseDaObra(){
        float valorItem = 0;
        float valorSalario = 0;
        for(ItemDeConstrucao umItem : getListaItens()){
            valorItem = umItem.getQuantidade() * umItem.getProduto().getPreco();
        }
        for(Construtor umConstrutor : listaConstrutores){
            valorSalario = umConstrutor.getSalario() + encarregado.getSalario();
        }
        return valorItem + valorSalario;
    }
}
