package introducao.Exercicio14;

import java.util.ArrayList;

public class ListaTarefas {
    private ArrayList<Tarefa> listaTarefas = new ArrayList<>();

    public ArrayList<Tarefa> getListaTarefas() {
        return listaTarefas;
    }

    public void setListaTarefas(ArrayList<Tarefa> listaTarefas) {
        this.listaTarefas = listaTarefas;
    }
    public float calculaTempoTotal(){
        float tempototal = 0;
        for(Tarefa umaTarefa : listaTarefas){
            tempototal = tempototal + umaTarefa.getTipo().getTempo();
        }
        return tempototal;
    }

    public static void main(String[] args) {
        ListaTarefas lista1 = new ListaTarefas();
        
        Tarefa tarefa1 = new Tarefa();
        tarefa1.setNome("Passear");
        Tarefa tarefa2 = new Tarefa();
        tarefa2.setNome("Pescar");
        Tarefa tarefa3 = new Tarefa();
        tarefa3.setNome("Fazer compras");
        Tarefa tarefa4 = new Tarefa();
        tarefa4.setNome("Estudar");
        Tarefa tarefa5 = new Tarefa();
        tarefa5.setNome("Trabalhar");
        Tarefa tarefa6 = new Tarefa();
        tarefa6.setNome("Aprender Orientação a Objetos");

        TipoTarefa tipo1 = new TipoTarefa();
        tipo1.setNome("Facil");
        tipo1.setTempo(10);
        TipoTarefa tipo2 = new TipoTarefa();
        tipo2.setNome("Médio");
        tipo2.setTempo(15);
        TipoTarefa tipo3 = new TipoTarefa();
        tipo3.setNome("Difícil");
        tipo3.setTempo(20);

        tarefa1.setTipo(tipo1);
        tarefa2.setTipo(tipo1);
        tarefa3.setTipo(tipo2);
        tarefa4.setTipo(tipo2);
        tarefa5.setTipo(tipo3);
        tarefa6.setTipo(tipo3);

        lista1.getListaTarefas().add(tarefa1);
        lista1.getListaTarefas().add(tarefa2);
        lista1.getListaTarefas().add(tarefa3);
        lista1.getListaTarefas().add(tarefa4);
        lista1.getListaTarefas().add(tarefa5);
        lista1.getListaTarefas().add(tarefa6);

        float tempototal = lista1.calculaTempoTotal();
        System.out.println(tempototal);
    }
}
