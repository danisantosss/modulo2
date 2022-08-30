package introducao.Exercicio5;

import java.util.ArrayList;

public class Agenda {
    private long id;
    private ArrayList<Agendamento> listaAgendamentos = new ArrayList<Agendamento>();
    private Medico medico;

    public void imprimirAgenda(){
        System.out.println("Agenda ID: " + getId());
        System.out.println("Médico ID: " + getMedico().getId());
        System.out.println("Médico Nome: " + getMedico().getNome());
        System.out.println("Médico CRM: " + getMedico().getCRM());
        for(var umAgendamento : this.getListaAgendamentos()){
            System.out.println("Agendamento ID: " + umAgendamento.getId());
            System.out.println("Agendamento Data/Hora: " + umAgendamento.getDataHora());
            System.out.println("Paciente ID: " + umAgendamento.getPaciente().getId());
            System.out.println("Paciente Nome: " + umAgendamento.getPaciente().getNome());
            System.out.println("Paciente Tel:: " + umAgendamento.getPaciente().getTelefone());
        }
    }

    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }
    public ArrayList<Agendamento> getListaAgendamentos() {
        return listaAgendamentos;
    }
    public void setListaAgendamentos(ArrayList<Agendamento> listaAgendamentos) {
        this.listaAgendamentos = listaAgendamentos;
    }
    public Medico getMedico() {
        return medico;
    }
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
        
}
