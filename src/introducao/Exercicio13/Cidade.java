package introducao.Exercicio13;

import java.util.ArrayList;

public class Cidade {
    private String nome;
    private ArrayList<Municipe> listaMunicipes = new ArrayList<>();

    public ArrayList<Municipe> getListaMunicipes() {
        return listaMunicipes;
    }

    public void setListaMunicipes(ArrayList<Municipe> listaMunicipes) {
        this.listaMunicipes = listaMunicipes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int contaApartamento(){
        int contadorAp = 0;
        for(Municipe umMunicipe : listaMunicipes){
            if(umMunicipe.getTipo().getNome().equals("Apartamento")){
                contadorAp++;
            }
        }
        return contadorAp;
    }

    public int contaCasa(){
        int contadorCasa = 0;
        for(Municipe umMunicipe : listaMunicipes){
            if(umMunicipe.getTipo().getNome().equals("Casa")){
                contadorCasa++;
            }
        }
        return contadorCasa;
    }

    public static void main(String[] args) {
        Cidade cidade1 = new Cidade();
        cidade1.setNome("Joinville");
        
        TipoResidencia tipo1 = new TipoResidencia();
        tipo1.setNome("Apartamento");
        var tipo2 = new TipoResidencia();
        tipo2.setNome("Casa");

        Municipe mun1 = new Municipe();
        mun1.setNome("Zezinho");
        mun1.setTipo(tipo1);
        Municipe mun2 = new Municipe();
        mun2.setNome("Mariazinho");
        mun2.setTipo(tipo1);
        Municipe mun3 = new Municipe();
        mun3.setNome("Huguinho");
        mun3.setTipo(tipo1);
        Municipe mun4 = new Municipe();
        mun4.setNome("Jorginho");
        mun4.setTipo(tipo2);
        Municipe mun5 = new Municipe();
        mun5.setNome("Luizinho");
        mun5.setTipo(tipo2);

        cidade1.getListaMunicipes().add(mun1);
        cidade1.getListaMunicipes().add(mun2);
        cidade1.getListaMunicipes().add(mun3);
        cidade1.getListaMunicipes().add(mun4);
        cidade1.getListaMunicipes().add(mun5);

        int apartamento = cidade1.contaApartamento();
        int casa = cidade1.contaCasa();

        System.out.println(apartamento);
        System.out.println(casa);
    }
}
