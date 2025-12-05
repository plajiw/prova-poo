package goias.puc.entities;

import goias.puc.enums.Categoria;
import goias.puc.enums.Subcategoria;

public class Produto {
    private String nome;
    private String descricao;
    private double valorUnitario;
    private int quantidade;
    private Categoria categoria;
    private Subcategoria subcategoria;
    private Fabricante fabricante;

    public Produto(String nome, String descricao, double valorUnitario, int quantidade,
                   Categoria categoria, Subcategoria subcategoria, Fabricante fabricante) {
        this.nome = nome;
        this.descricao = descricao;
        this.setValorUnitario(valorUnitario);
        this.quantidade = quantidade;
        this.categoria = categoria;
        this.subcategoria = subcategoria;
        this.fabricante = fabricante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        if (valorUnitario < 0)
            throw new IllegalArgumentException("O valor unitário não pode ser negativo.");

        this.valorUnitario = valorUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 0)
            throw new IllegalArgumentException("O valor unitário não pode ser negativo.");

        this.quantidade = quantidade;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Subcategoria getSubcategoria() {
        return subcategoria;
    }

    public void setSubcategoria(Subcategoria subcategoria) {
        this.subcategoria = subcategoria;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }
}
