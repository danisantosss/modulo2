package introducao.avaliacao1;

import java.util.ArrayList;

public class Obra {

    private ArrayList<FaseDaObra> listaFases = new ArrayList<FaseDaObra>();

    public ArrayList<FaseDaObra> getListaFases() {
        return listaFases;
    }

    public void setListaFases(ArrayList<FaseDaObra> listaFases) {
        this.listaFases = listaFases;
    }
    public String listarDadosDaObra(){
        StringBuilder montadorString = new StringBuilder();
        for(FaseDaObra obra : getListaFases()){
            montadorString.append("\nFase da Obra nome: " + obra.getNome());
            montadorString.append("\nEncarregado Formação: " + obra.getEncarregado().getFormacao());
            montadorString.append("\nEncarregado Nome: " + obra.getEncarregado().getNome());
            montadorString.append("\nEncarregado Salário: " + obra.getEncarregado().getSalario());
            montadorString.append("\nEncarregado Número: " + obra.getEncarregado().getNumero());
        for(Construtor construtores : obra.getListaConstrutores()){
            montadorString.append("\nConstrutor Nome: " + construtores.getNome());
            montadorString.append("\nConstrutor Salário: " + construtores.getSalario());
            montadorString.append("\nConstrutor Número: " + construtores.getNumero());
            montadorString.append("\nConstrutor Terceirizado: " + construtores.isTerceirizado());
            for(ItemDeConstrucao itens : obra.getListaItens()){
            montadorString.append("\nQuantidade de itens: " + itens.getQuantidade());
            montadorString.append("\nNome do material: " + itens.getProduto().getNome());
            montadorString.append("\nPreço do material: " + itens.getProduto().getPreco());
                }
            }
        }
       return montadorString.toString();
    }
    public float calcularValorTotalDaObra(){
        float valorTotal = 0;
        for(FaseDaObra obraValor : listaFases){
            valorTotal = valorTotal + obraValor.calcularValorDaFaseDaObra();
        }
        return valorTotal;
    }
   
}
