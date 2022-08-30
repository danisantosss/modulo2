package introducao.Exercicio18;

import java.util.ArrayList;

public class Loja {
    private ArrayList<Setor> listaSetores = new ArrayList<>();

    public ArrayList<Setor> getListaSetores() {
        return listaSetores;
    }

    public void setListaSetores(ArrayList<Setor> listaSetores) {
        this.listaSetores = listaSetores;
    }
    public String gerarCatologo(){
        StringBuilder montadorstring = new StringBuilder();
        for(Setor umSetor : listaSetores){
            montadorstring.append("\nNome do Setor: " + umSetor.getNome());
            for(Produto umProduto : umSetor.getListaProdutos()){
                montadorstring.append("\nNome do Produto: " + umProduto.getNome());
                montadorstring.append("\nPreço do Produto: " + umProduto.getPreco());
                montadorstring.append("\nNome do Fornecedor: " + umProduto.getFornecedor().getNome() + "\n");
            }
        }
        return montadorstring.toString();
    }
    public static void main(String[] args) {
        var setor1 = new Setor();
        var setor2 = new Setor();
        var setor3 = new Setor();
        setor1.setNome("Cama");
        setor2.setNome("Mesa");
        setor3.setNome("Banho");
        var prod1 = new Produto();
        var prod2 = new Produto();
        var prod3 = new Produto();
        var prod4 = new Produto();
        var prod5 = new Produto();
        prod1.setNome("Travesseiro");
        prod1.setPreco(70f);
        prod2.setNome("Cobertor");
        prod2.setPreco(250f);
        prod3.setNome("Toalha");
        prod3.setPreco(100f);
        prod4.setNome("Toalha de banho");
        prod4.setPreco(60f);
        prod5.setNome("Toalha de rosto");
        prod5.setPreco(30f);
        var forn1 = new Fornecedor();
        var forn2 = new Fornecedor();
        forn1.setNome("Karsten");
        forn2.setNome("Dohler");
        prod1.setFornecedor(forn1);
        prod2.setFornecedor(forn1);
        prod3.setFornecedor(forn1);
        prod4.setFornecedor(forn2);
        prod5.setFornecedor(forn2);
        setor1.getListaProdutos().add(prod1);
        setor1.getListaProdutos().add(prod2);
        setor2.getListaProdutos().add(prod3);
        setor3.getListaProdutos().add(prod4);
        setor3.getListaProdutos().add(prod5);
        var loja1 = new Loja();
        loja1.getListaSetores().add(setor1);
        loja1.getListaSetores().add(setor2);
        loja1.getListaSetores().add(setor3);
        String catalogo = loja1.gerarCatologo();

        System.out.println(catalogo);
    }
}
