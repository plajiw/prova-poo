package goias.puc.entities;

public abstract class EntidadeBase {
    private String nome;
    private String telefone;
    private Endereco endereco;

    public EntidadeBase(String nome, String telefone, Endereco endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.length() < 4)
        {
            System.out.println("O nome precisa conter mais de 4 caracteres.");
            return;
        }

        this.nome = nome;

    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
