package introducao.Exercicio8;

import java.util.ArrayList;

public class Planilha {
    private ArrayList<Gastos> listaGastos = new ArrayList<Gastos>();
    

    public ArrayList<Gastos> getListaGastos() {
        return listaGastos;
    }
    public void setListaGastos(ArrayList<Gastos> listaGastos) {
        this.listaGastos = listaGastos;
    }
    public float totalGasto(){
    for(int i = 0; i<listaGastos.size(); i++){
        
    }
    return 0;
}

    /*public float totalGasto(){
    for(Gastos valorGasto : listaGastos){
        valorGasto.getValorgasto();
        }
    }*/
 }
