package introducao.Exercicio2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Reserva {
    private int numero;
    private Date dataInicial;
    private Date dataFinal;
    private Quarto quarto;
    private ArrayList<Hospede> listaHospedes = new ArrayList<>();

    public Reserva(int numero) {
        this.numero = numero;
    }
    
    public ArrayList<Hospede> getListaHospedes() {
        return listaHospedes;
    }

    public void setListaHospedes(ArrayList<Hospede> listaHospedes) {
        this.listaHospedes = listaHospedes;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;    
    }  
    public String toString(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        StringBuilder montadorString = new StringBuilder();
        montadorString.append("\nReserva: " + numero);
        //montadorString.append(String.format("Reserva: %d" numero));
        montadorString.append("\nData inicial: " + sdf.format(dataInicial));
        montadorString.append("\nData final: " + sdf.format(dataFinal));
        montadorString.append("\nNúmero do quarto: " + quarto.getNumero());
        for(int i = 0; i<listaHospedes.size(); i++){
            Hospede umHospede = listaHospedes.get(i);
            montadorString.append("\n Hospede - Nome: " + umHospede.getNome());
            montadorString.append("\n Hospede - Telefone: " + umHospede.getNumero());
            montadorString.append("\n Hospede - CPF: " + umHospede.getCPF());
        }
        /*FOR EACH
        for(Hospede umHospede : listaHospedes){
            montadorString.append("\n Hospede - Nome: " + umHospede.getNome());
            montadorString.append("\n Hospede - Telefone: " + umHospede.getNumero());
            montadorString.append("\n Hospede - CPF: " + umHospede.getCPF());
        }
        */
        return montadorString.toString();
        }
}
