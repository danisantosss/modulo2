package introducao.avaliacao2;

import java.util.GregorianCalendar;

public class AppAvaliacao20 {
    public static void main(String[] args) {
        GregorianCalendar calendario = new GregorianCalendar();
        calendario.set(1980, 12, 1);
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setDataNascimento(calendario.getTime());
        pessoa1.setNome("Zezinho");

        Curriculo curr1 = new Curriculo();
        curr1.setPessoa(pessoa1);

        Formacao form1 = new Formacao();
        form1.setAnoConclusao(1999);
        form1.setNome("Ensino Médio");
        var form2 = new Formacao();
        form2.setAnoConclusao(2022);
        form2.setNome("Curso Novos Talentos em TI");
        var exp1 = new ExperienciaProfissional();
        exp1.setAnoConclusao("2022");
        exp1.setNome("Monstro em Java");

        curr1.getListaExperienciaProfissional().add(exp1);
        curr1.getListaFormacoes().add(form1);
        curr1.getListaFormacoes().add(form2);

        var pessoa2 = new Pessoa();
        GregorianCalendar calendario2 = new GregorianCalendar();
        calendario2.set(1981, 10, 7);
        pessoa2.setNome("Mariazinha");
        pessoa2.setDataNascimento(calendario2.getTime());

        var curr2 = new Curriculo();
        curr2.setPessoa(pessoa2);

        var form3 = new Formacao();
        form3.setAnoConclusao(2000);
        form3.setNome("Ensino Médio");

        var form4 = new Formacao();
        form4.setAnoConclusao(2022);
        form4.setNome("Curso Novos Talentos em TI");

        var exp2 = new ExperienciaProfissional();
        exp2.setAnoConclusao("Atual");
        exp2.setNome("DBA em MariaDB");

        var exp3 = new ExperienciaProfissional();
        exp3.setAnoConclusao("2021");
        exp3.setNome("Desenvolvedora FullStack");

        curr2.getListaExperienciaProfissional().add(exp2);
        curr2.getListaExperienciaProfissional().add(exp3);
        curr2.getListaFormacoes().add(form4);

        curr1.contarNumExperienciasProfissionais();
        curr2.contarNumExperienciasProfissionais();
        int experiencias1 = curr1.contarNumExperienciasProfissionais();
        int experiencias2 = curr2.contarNumExperienciasProfissionais();
        System.out.println("Numero de Experiencias profissionais no primeiro curriculo: " + experiencias1);
        System.out.println("Numero de Experiencias profissionais no segundo curriculo: " + experiencias2);
        
        
        String curriculo = curr1.gerarCurriculo();
        String curriculo2 = curr2.gerarCurriculo();
        System.out.println(curriculo);
        System.out.println(curriculo2);
    }
}
