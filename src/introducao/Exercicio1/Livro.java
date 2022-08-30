package introducao.Exercicio1;

public class Livro {
    private String titulo;
    private float valor;
    private boolean esgotado;
    private Autor escritor;

    public Livro(String titulo) {
       this.titulo = titulo;
    }

    public Autor getEscritor() {
        return escritor;
    }


    public void setEscritor(Autor escritor) {
        this.escritor = escritor;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public boolean isEsgotado() {
        return esgotado;
    }

    public void setEsgotado(boolean esgotado) {
        this.esgotado = esgotado;
    }
    public String toString(){
        StringBuilder montadorString = new StringBuilder();
        montadorString.append("Titulo: ");
        montadorString.append(getTitulo());
        montadorString.append(" Valor: ");
        montadorString.append(getValor());
        montadorString.append(" Esgotado: ");
        montadorString.append(isEsgotado());
        montadorString.append(" Nome Do Autor: ");
        montadorString.append(getEscritor().getNome());
        montadorString.append(" Autor Data Nascimento: ");
        montadorString.append(getEscritor().getDatadenascimento());

        return montadorString.toString();

       /* return "Titulo: " + getTitulo() + 
                "\n Valor: " + getValor() + 
                "\n Esgotado: " + isEsgotado() +
                "\n Autor nome: " + getEscritor().getNome() +
                "\n Autor Data Nascimento " + getEscritor().getDatadenascimento(); */
    }
    
}
