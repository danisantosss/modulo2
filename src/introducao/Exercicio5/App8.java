package introducao.Exercicio5;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class App8 {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente();
        paciente1.setId(001);
        paciente1.setNome("Xande");
        paciente1.setTelefone("(47)96882917");

        var paciente2 = new Paciente();
        paciente2.setId(002);
        paciente2.setNome("Pedro");
        paciente2.setTelefone("(47)96665483");

        var paciente3 = new Paciente();
        paciente3.setId(003);
        paciente3.setNome("Tonho");
        paciente3.setTelefone("(47)97282091");

        var paciente4 = new Paciente();
        paciente4.setId(004);
        paciente4.setNome("Ruivo");
        paciente4.setTelefone("(47)99984212");

        Medico medico1 = new Medico();
        medico1.setCRM("CRM/SC 123456");
        medico1.setId(1);
        medico1.setNome("Bruno");

        var medico2 = new Medico();
        medico2.setCRM("CRM/SC 654321");
        medico2.setId(2);
        medico2.setNome("Alves");

        Agenda agenda1 = new Agenda();
        agenda1.setId(01);
        agenda1.setMedico(medico1);
        
        var agenda2 = new Agenda();
        agenda2.setId(02);
        agenda2.setMedico(medico2);

        Agendamento agendamento1 = new Agendamento();
        Calendar calendario1 = new GregorianCalendar();
        calendario1.set(2022, 5, 9, 14, 30, 00);
        agendamento1.setDataHora(calendario1.getTime());
        agendamento1.setId(1001);
        agendamento1.setPaciente(paciente1);
        agendamento1.setMedico(medico1);

        Agendamento agendamento2 = new Agendamento();
        Calendar calendario2 = new GregorianCalendar();
        calendario2.set(2022, 5, 9, 15, 00, 00);
        agendamento2.setDataHora(calendario2.getTime());
        agendamento2.setId(1002);
        agendamento2.setPaciente(paciente1);
        agendamento2.setMedico(medico2);

        Agendamento agendamento3 = new Agendamento();
        Calendar calendario3 = new GregorianCalendar();
        calendario3.set(2022, 5, 9, 15, 30, 00);
        agendamento3.setDataHora(calendario3.getTime());
        agendamento3.setId(1003);
        agendamento3.setPaciente(paciente2);
        agendamento3.setMedico(medico1);

        Agendamento agendamento4 = new Agendamento();
        Calendar calendario4 = new GregorianCalendar();
        calendario4.set(2022, 5, 9, 16, 00, 00);
        agendamento4.setDataHora(calendario4.getTime());
        agendamento4.setId(1004);
        agendamento4.setPaciente(paciente2);
        agendamento4.setMedico(medico2);

        Agendamento agendamento5 = new Agendamento();
        Calendar calendario5 = new GregorianCalendar();
        calendario5.set(2022, 5, 9, 16, 30, 00);
        agendamento5.setDataHora(calendario5.getTime());
        agendamento5.setId(1005);
        agendamento5.setPaciente(paciente3);
        agendamento5.setMedico(medico1);

        Agendamento agendamento6 = new Agendamento();
        Calendar calendario6 = new GregorianCalendar();
        calendario6.set(2022, 5, 9, 17, 00, 00);
        agendamento6.setDataHora(calendario6.getTime());
        agendamento6.setId(1006);
        agendamento6.setPaciente(paciente3);
        agendamento6.setMedico(medico2);

        Agendamento agendamento7 = new Agendamento();
        Calendar calendario7 = new GregorianCalendar();
        calendario7.set(2022, 5, 9, 17, 30, 00);
        agendamento7.setDataHora(calendario7.getTime());
        agendamento7.setId(1007);
        agendamento7.setPaciente(paciente4);
        agendamento7.setMedico(medico1);

        Agendamento agendamento8 = new Agendamento();
        Calendar calendario8 = new GregorianCalendar();
        calendario8.set(2022, 5, 9, 18, 00, 00);
        agendamento8.setDataHora(calendario8.getTime());
        agendamento8.setId(1008);
        agendamento8.setPaciente(paciente4);
        agendamento8.setMedico(medico2);

        agenda1.getListaAgendamentos().add(agendamento1);
        agenda1.getListaAgendamentos().add(agendamento2);
        agenda2.getListaAgendamentos().add(agendamento3);
        agenda2.getListaAgendamentos().add(agendamento4);

        agenda1.imprimirAgenda();
        agenda2.imprimirAgenda();



    }
}
