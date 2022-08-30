package introducao.Exercicio1;

import java.util.Date;

public class Autor {
    private String nome;
    private Date dataNascimento;

    public Autor(String nome, Date datadenascimento) {
        this.nome = nome;
        this.dataNascimento = datadenascimento;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDatadenascimento() {
        return dataNascimento;
    }

    public void setDatadenascimento(Date datadenascimento) {
        this.dataNascimento = datadenascimento;
    }
    
}
