package goias.puc.entities;

public class Cliente extends EntidadeBase {
    private String cpf;
    private String dataNascimento;

    public Cliente(String nome, String telefone, Endereco endereco, String cpf, String dataNascimento) {
        super(nome, telefone, endereco);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
