package introducao.Exercicio11;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private ArrayList<Nota> listaNotas = new ArrayList<>();

    public ArrayList<Nota> getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(ArrayList<Nota> listaNotas) {
        this.listaNotas = listaNotas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public float calcMediaNotas(){
        float media = 0;
        float valornotas = 0;
        int contador = 0;
        for(Nota umaNota : listaNotas){
            valornotas = valornotas + umaNota.getNota();
            contador++;
        }
        media = valornotas / contador;
        return media;
    }
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Zezinho da Silva");

        Nota nota1 = new Nota();
        nota1.setNota(5);
        var nota2 = new Nota();
        nota2.setNota(7);
        var nota3 = new Nota();
        nota3.setNota(6);

        aluno1.getListaNotas().add(nota1);
        aluno1.getListaNotas().add(nota2);
        aluno1.getListaNotas().add(nota3);

        float guardar = aluno1.calcMediaNotas();
        System.out.println(guardar);
    }
}
