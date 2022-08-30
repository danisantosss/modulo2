package introducao.Exercicio6;

import introducao.Exercicio4.Funcionario;

public class Vendedor extends Funcionario {
    private float percComissao;
    private float metaVendas;
    public float getPercComissao() {
        return percComissao;
    }
    public void setPercComissao(float percComissao) {
        this.percComissao = percComissao;
    }
    public float getMetaVendas() {
        return metaVendas;
    }
    public void setMetaVendas(float metaVendas) {
        this.metaVendas = metaVendas;
    }
    
}
