package goias.puc.entities;

import goias.puc.entities.formasDePagamento.FormaPagamento;
import goias.puc.entities.interfaces.IIdentificavel;

public class Pedido implements IIdentificavel {
    private static int contadorId = 1000;
    private int id;
    private Produto produto;
    private int quantidade;
    private double valorTotal;
    private Cliente cliente;
    private FormaPagamento formaPagamento;

    public Pedido(Produto produto, int quantidade, Cliente cliente) {
        gerarIdentificador();
        this.produto = produto;
        this.quantidade = quantidade;
        this.cliente = cliente;
        this.valorTotal = produto.getValorUnitario() * quantidade;
    }

    public double getValorTotal() {
        formaPagamento.getMetodoDePagamento(this.valorTotal);
        return valorTotal;
    }

    @Override
    public void gerarIdentificador() {
        this.id = contadorId++;
    }
}
