package introducao.Exercicio6;

import java.util.ArrayList;

public class EquipeDeVendas {
    private Gerente gestor;
    private ArrayList<Vendedor> listaVendedores = new ArrayList<Vendedor>();
    

    public ArrayList<Vendedor> getListaVendedores() {
        return listaVendedores;
    }

    public void setListaVendedores(ArrayList<Vendedor> listaVendedores) {
        this.listaVendedores = listaVendedores;
    }

    public Gerente getGestor() {
        return gestor;
    }

    public void setGestor(Gerente gestor) {
        this.gestor = gestor;
    }
    public String listarEquipe(){
        StringBuilder montadorString = new StringBuilder();
        montadorString.append("\nSetor: " + gestor.getSetor());
        for(Vendedor umVendedor : getListaVendedores()){
            montadorString.append("\nVendedor ID: " + umVendedor.getId());
            montadorString.append("\nVendedor Nome: " + umVendedor.getNome());
            montadorString.append("\nVendedor Tel: " + umVendedor.getTelefone());
            montadorString.append("\nMeta Vendas: " + umVendedor.getMetaVendas());
            montadorString.append("\nPorcentagem Comissão: " + umVendedor.getPercComissao());
        }
        return montadorString.toString();
    }
}
