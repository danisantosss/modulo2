package introducao.Exercicio2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class App5 {
    public static void main(String[] args) {
        //SimpleDateFormat converte texto pra data ou vice versa
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        Hospede pessoa1 = new Hospede("111.111.111-11");
        pessoa1.setNome("Zezinho");
        pessoa1.setNumero("5555-1234");

        Hospede pessoa2 = new Hospede("222.222.222-11");
        pessoa2.setNome("Irineuzinho");
        pessoa2.setNumero("5555-4321");

        Hospede pessoa3 = new Hospede("333.333.333-33");
        pessoa3.setNome("Luizinho");
        pessoa3.setNumero("5555-1122");

        Hospede pessoa4 = new Hospede("444.444.444-44");
        pessoa4.setNome("Huguinho");
        pessoa4.setNumero("5555-2233");

        Hospede pessoa5 = new Hospede("555.555.555-55");
        pessoa5.setNome("Paulinha");
        pessoa5.setNumero("5555-5555");

        Reserva reserva1 = new Reserva(1001);
        try {
            reserva1.setDataInicial(sdf.parse("22/04/2022"));
            reserva1.setDataFinal(sdf.parse("05/05/2022"));
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 

        Reserva reserva2 = new Reserva(1002);
        
        try {
            reserva2.setDataInicial(sdf.parse("21/04/2022"));
            reserva2.setDataFinal(sdf.parse("28/04/2022"));
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Quarto quarto1 = new Quarto();
        quarto1.setNumero(100);

        Quarto quarto2 = new Quarto();
        quarto2.setNumero(200);

        reserva1.setQuarto(quarto1);
        reserva2.setQuarto(quarto2);
        reserva1.getListaHospedes().add(pessoa1);
        reserva1.getListaHospedes().add(pessoa2);
        reserva2.getListaHospedes().add(pessoa3);
        reserva2.getListaHospedes().add(pessoa4);
        reserva2.getListaHospedes().add(pessoa5);

        System.out.println(reserva1);
        System.out.println(reserva2);
        
        
    }
    
}
