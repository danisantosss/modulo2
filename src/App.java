import introducao.Aplicativo;
import introducao.Celular;
import introducao.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        //Criando uma variavel do tipo pessoa
        //Criando uma instância de objeto a partir da classe Pessoa

        //Passagem de parametros
        Pessoa zezinho = new Pessoa("jorge");

        zezinho.setNome("Zezinho da Silva Sauro");
        zezinho.setIdade(64);
        zezinho.setAltura(1.75f);
        zezinho.setCPF("529.982.247-25");
        zezinho.setRaca("A");
        System.out.println(zezinho.getNome() + " Raça: " + zezinho.getRaca());
        Pessoa.mostraRaca();
        Pessoa.mostraRaca();
        

        Pessoa luizinho = new Pessoa("irineu");

        luizinho.setNome("Luizinho da Silva Sauro Jr");
        luizinho.setIdade(17);
        luizinho.setAltura(1.8f);
        luizinho.setCPF("555.555.555-55");
        //luizinho.setRaca("B");
        System.out.println(luizinho.getNome() + " Raça: " + luizinho.getRaca());
        System.out.println(zezinho.getNome() + " Raça: " + zezinho.getRaca());

        System.out.println(zezinho.getNome());
        System.out.println(zezinho.getCPF());
        System.out.println(zezinho.getAltura());
        System.out.println(zezinho.getIdade());
        System.out.println(luizinho);

        zezinho.podeDirigir();
        luizinho.podeDirigir();

        String guardaResultado = zezinho.podeDirigir();
        System.out.println(guardaResultado);
        guardaResultado = luizinho.podeDirigir();
        System.out.println(guardaResultado);

        zezinho.mostraCPF();
        luizinho.mostraCPF();
        
        Celular xiaomi = new Celular("(47) 996239616");

        xiaomi.setMarca("Redmi 8 Lite");
        xiaomi.setModelo("Android");
        xiaomi.setDono(zezinho);
        
    
        
        Aplicativo app1 = new Aplicativo("Angry birds");
        Aplicativo app2 = new Aplicativo("Whatsapp");
        Aplicativo app3 = new Aplicativo("Tiktok");
        Aplicativo app4 = new Aplicativo("Instagram");
        

        xiaomi.getListaAplicativos().add(app1);
        xiaomi.getListaAplicativos().add(app2);
        xiaomi.getListaAplicativos().add(app3);
        xiaomi.getListaAplicativos().add(app4);

        xiaomi.getListaAplicativos().remove(2);
        xiaomi.getListaAplicativos().set(2, new Aplicativo("grobopray"));
        System.out.println(xiaomi.getListaAplicativos().indexOf(app1));

        //size tamanho variavel, lenght tamanho fixo
        for(int i = 0; i < xiaomi.getListaAplicativos().size() ;i++){
        System.out.println(xiaomi.getListaAplicativos().get(i));
        }
        //for each = PARA CADA
        for(Aplicativo umApp : xiaomi.getListaAplicativos()){
            System.out.println(umApp);
         }             
    }
}
