package introducao.Exercicio8;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class App10 {
    public static void main(String[] args) {
        Calendar calendario = GregorianCalendar.getInstance();
        calendario.set(2022, 05, 26);
        Planilha plan1 = new Planilha();

        Gastos gasto1 = new Gastos("Videogame", 300, calendario.getTime(), "PIX");
        
        Gastos gasto2 = new Gastos("Drogas", 420, calendario.getTime(), "Dinheiro");

        plan1.getListaGastos().add(gasto1);
        plan1.getListaGastos().add(gasto2);
    }
}
