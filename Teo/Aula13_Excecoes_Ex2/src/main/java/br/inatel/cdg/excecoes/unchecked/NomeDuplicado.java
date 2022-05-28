package br.inatel.cdg.excecoes.unchecked;

public class NomeDuplicado extends RuntimeException {

    public NomeDuplicado (String message){
        super(message);
    }


}
