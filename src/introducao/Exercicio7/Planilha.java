package introducao.Exercicio7;

import java.util.ArrayList;

public class Planilha {
    private ArrayList<ContaDeLuz> listaContasDeLuz = new ArrayList<ContaDeLuz>();
    
    public ArrayList<ContaDeLuz> getListaContasDeLuz() {
        return listaContasDeLuz;
    }
    public void setListaContasDeLuz(ArrayList<ContaDeLuz> listaContasDeLuz) {
        this.listaContasDeLuz = listaContasDeLuz;
    }
    public float calcUltimoValorMedio(){
        float soma = 0;
        float media = 0;
        for(int i = 0; i<listaContasDeLuz.size();i++){
            ContaDeLuz umaConta = listaContasDeLuz.get(i);
            soma = soma + umaConta.getValorDaConta();
        }
        media = soma / listaContasDeLuz.size();
        return media;
    }
    public float calcUltimoValorMedio2(){
        float soma = 0;
        float media = 0;
        for(ContaDeLuz umaConta : listaContasDeLuz){
            soma = soma + umaConta.getValorDaConta();
        }
        media = soma / listaContasDeLuz.size();
        return media;
    }
    public float calcUltimoValorMedio3(){
        return(float)listaContasDeLuz.stream().mapToDouble(a -> a.getValorDaConta()).sum() / listaContasDeLuz.size();
    }

    public float calcMaiorValor(){
        float maiornumero = 0;
        for(int i = 0; i<listaContasDeLuz.size();i++){
            ContaDeLuz umaConta = listaContasDeLuz.get(i);
            if(umaConta.getValorDaConta() > maiornumero){
                maiornumero = umaConta.getValorDaConta();
            }
        }
        return maiornumero;
    }
    public float calcMenorValor(){
        float menornumero = 0;
        if(listaContasDeLuz.size() >=1){
            menornumero = listaContasDeLuz.get(0).getValorDaConta();
        }
        for(ContaDeLuz umaConta:listaContasDeLuz){
            if(umaConta.getValorDaConta() < menornumero){
                menornumero = umaConta.getValorDaConta();
            }
        
        }
        return menornumero;
    }
}
