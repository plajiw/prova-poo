package goias.puc.entities;

public class Cliente extends EntidadeBase {
    private String cpf;
    private String dataNascimento;

    public Cliente(String nome, String telefone, Endereco endereco) {
        super(nome, telefone, endereco);
    }
}
