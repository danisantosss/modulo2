package introducao.Exercicio8;

import java.util.Date;

public class Gastos {
    private String tipoGasto;
    private float valorGasto;
    private Date dataGasto;
    private String forma;

    public Gastos(String tipoGasto, float valorGasto, Date dataGasto, String forma) {
        this.tipoGasto = tipoGasto;
        this.valorGasto = valorGasto;
        this.dataGasto = dataGasto;
        this.forma = forma;
        
    }

    public String getTipoGasto() {
        return tipoGasto;
    }
    public float getValorGasto() {
        return valorGasto;
    }

    public Date getDataGasto() {
        return dataGasto;
    }

    public String getForma() {
        return forma;
    }
}

