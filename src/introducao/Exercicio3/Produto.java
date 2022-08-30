package introducao.Exercicio3;

public class Produto {
    private long id;
    private String nome;
    private float valor;
    private ItemPedido produto;

    public ItemPedido getProduto() {
        return produto;
    }
    public void setProduto(ItemPedido produto) {
        this.produto = produto;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
}
