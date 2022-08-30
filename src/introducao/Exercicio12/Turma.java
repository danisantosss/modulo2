package introducao.Exercicio12;

import java.util.ArrayList;

public class Turma {
    private String serie;
    private ArrayList<Crianca> listaCriancas = new ArrayList<>();

    public ArrayList<Crianca> getListaCriancas() {
        return listaCriancas;
    }

    public void setListaCriancas(ArrayList<Crianca> listaCriancas) {
        this.listaCriancas = listaCriancas;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }
    public int contaMeninos(){
        int contador = 0;
        for(Crianca umaCrianca : listaCriancas){
            if(umaCrianca.getSexo().equals("Masculino")){
                contador++;
            }
        }
        return contador;
    }
    public int contaMeninas(){
        int contador = 0;
        for(Crianca umaCrianca : listaCriancas){
            if(umaCrianca.getSexo().equals("Feminino")){
                contador++;
            }
        }
        return contador;
    }
    public static void main(String[] args) {
        Turma turma1 = new Turma();
        turma1.setSerie("5 série");
        
        Crianca crianca1 = new Crianca();
        crianca1.setNome("Zezinho");
        crianca1.setSexo("Masculino");

        var crianca2 = new Crianca();
        crianca2.setNome("Mariazinha");
        crianca2.setSexo("Feminino");

        var crianca3 = new Crianca();
        crianca3.setNome("Aninha");
        crianca3.setSexo("Feminino");

        var crianca4 = new Crianca();
        crianca4.setNome("Julinha");
        crianca4.setSexo("Feminino");
        
        turma1.listaCriancas.add(crianca1);
        turma1.listaCriancas.add(crianca2);
        turma1.listaCriancas.add(crianca3);
        turma1.listaCriancas.add(crianca4);

        int meninos = turma1.contaMeninos();
        int meninas = turma1.contaMeninas();
        System.out.println(meninos);
        System.out.println(meninas);
    }
}
