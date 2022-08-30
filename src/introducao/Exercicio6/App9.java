package introducao.Exercicio6;

public class App9 {
    public static void main(String[] args) {
        Vendedor vendedor1 = new Vendedor();
        vendedor1.setId(1);
        vendedor1.setMetaVendas(500);
        vendedor1.setNome("Murilo");
        vendedor1.setPercComissao(50);
        vendedor1.setTelefone("(47)99887-5643");
        
        Vendedor vendedor2 = new Vendedor();
        vendedor2.setId(2);
        vendedor2.setMetaVendas(800);
        vendedor2.setNome("Yuri");
        vendedor2.setPercComissao(75);
        vendedor2.setTelefone("(47)99837-6643");

        Vendedor vendedor3 = new Vendedor();
        vendedor3.setId(3);
        vendedor3.setMetaVendas(400);
        vendedor3.setNome("Laufer");
        vendedor3.setPercComissao(33);
        vendedor3.setTelefone("(47)94887-5643");

        Vendedor vendedor4 = new Vendedor();
        vendedor4.setId(4);
        vendedor4.setMetaVendas(650);
        vendedor4.setNome("Ressaca");
        vendedor4.setPercComissao(80);
        vendedor4.setTelefone("(47)99887-6663");

        Vendedor vendedor5 = new Vendedor();
        vendedor5.setId(5);
        vendedor5.setMetaVendas(250);
        vendedor5.setNome("Dawn");
        vendedor5.setPercComissao(25);
        vendedor5.setTelefone("(47)99087-5643");

        Gerente gerente1 = new Gerente();
        gerente1.setSetor("Carga");
        gerente1.setId(01);
        gerente1.setMetaVendas(1000f);
        gerente1.setNome("Lucas");
        gerente1.setPercComissao(100f);
        gerente1.setTelefone("(47)90044-4956");

        Gerente gerente2 = new Gerente();
        gerente2.setId(02);
        gerente2.setMetaVendas(1500);
        gerente2.setNome("Gustavo");
        gerente2.setPercComissao(95);
        gerente2.setSetor("Administração");
        gerente2.setTelefone("(47)99886-4212");

        EquipeDeVendas equipe1 = new EquipeDeVendas();
        equipe1.setGestor(gerente1);
        equipe1.getListaVendedores().add(vendedor1);
        equipe1.getListaVendedores().add(vendedor2);
        equipe1.getListaVendedores().add(vendedor3);
        EquipeDeVendas equipe2 = new EquipeDeVendas();
        equipe2.setGestor(gerente2);
        equipe2.getListaVendedores().add(vendedor4);
        equipe2.getListaVendedores().add(vendedor5);

        System.out.println(equipe1.listarEquipe());
        System.out.println(equipe2.listarEquipe());
    }
}
