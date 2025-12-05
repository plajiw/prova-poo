package goias.puc.entities;

public class Fabricante extends EntidadeBase {
    private String cnpj;

    public Fabricante(String nome, String telefone, Endereco endereco) {
        super(nome, telefone, endereco);
    }
}
