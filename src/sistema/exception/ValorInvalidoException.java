package sistema.exception;

public class ValorInvalidoException extends Exception {
    //mensagem do erro + campo + exception
    private String nomeCampo = "";
    String irineu = nomeCampo;

    //Sobrecargas de construtor
    public ValorInvalidoException(String mensagem, Exception origem, String nomeCampo) {
        this(mensagem, origem); //this chama construtor da própria classe
        this.nomeCampo = nomeCampo;

    }
    //Sobrecargas de construtor
    public ValorInvalidoException(String mensagem, Exception origem) {
        super(mensagem, origem); //super se refere a SuperClasse (PAI) Exception
        //super(); chama o construtor da classe SuperClass
    }
}
