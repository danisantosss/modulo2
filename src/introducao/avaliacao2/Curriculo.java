package introducao.avaliacao2;

import java.util.ArrayList;

public class Curriculo {
    private ArrayList<Formacao> listaFormacoes = new ArrayList<Formacao>();
    private Pessoa pessoa;
    private ArrayList<ExperienciaProfissional> listaExperienciaProfissional
    = new ArrayList<ExperienciaProfissional>();

    public String gerarCurriculo(){
        StringBuilder montadorString = new StringBuilder();
        montadorString.append("\nNome da Pessoa: " + pessoa.getNome());
        montadorString.append("\nData de Nascimento: " + pessoa.getDataNascimento());
        for(Formacao umaFormacao : listaFormacoes){
            montadorString.append("\nFormacao: " + umaFormacao.getNome());
            montadorString.append("\nAno de Conclusao: " + umaFormacao.getAnoConclusao());
        }
        for(ExperienciaProfissional experiente : listaExperienciaProfissional){
            montadorString.append("\nExperiencia Profissional: " + experiente.getNome());
            montadorString.append("\nAno de Conclusao: " + experiente.getAnoConclusao());
        }
        return montadorString.toString();
    }
    public int contarNumExperienciasProfissionais(){
        int contador = 0;
        while(contador < listaExperienciaProfissional.size()){
            contador++;
        }
        return contador;
        
    }
    public ArrayList<Formacao> getListaFormacoes() {
        return listaFormacoes;
    }
    public void setListaFormacoes(ArrayList<Formacao> listaFormacoes) {
        this.listaFormacoes = listaFormacoes;
    }
    public Pessoa getPessoa() {
        return pessoa;
    }
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    public ArrayList<ExperienciaProfissional> getListaExperienciaProfissional() {
        return listaExperienciaProfissional;
    }
    public void setListaExperienciaProfissional(ArrayList<ExperienciaProfissional> listaExperienciaProfissional) {
        this.listaExperienciaProfissional = listaExperienciaProfissional;
    }
}
