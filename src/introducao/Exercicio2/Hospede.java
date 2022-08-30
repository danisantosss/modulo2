package introducao.Exercicio2;


public class Hospede {
    private String nome;
    private String CPF;
    private String numero;
    private Reserva hospede;
    

    public Hospede(String CPF) {
        this.CPF = CPF;
    }
    
    public Reserva getHospede() {
        return hospede;
    }

    public void setHospede(Reserva hospede) {
        this.hospede = hospede;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String toString(){
          StringBuilder montadorString = new StringBuilder();
          montadorString.append("Nome: ");
          montadorString.append(getNome());
          montadorString.append(" CPF ");
          montadorString.append(getCPF());
          montadorString.append( "Número " );
          montadorString.append(getNumero());
          return montadorString.toString();
    }
    
}
