package goias.puc.entities.formasDePagamento;

public class FormaPagamentoCartao extends FormaPagamento{
    final double TAXA_CARTAO = 0.05;

    @Override
    public double getMetodoDePagamento(double valorPago) {
        return valorPago + (valorPago * TAXA_CARTAO);
    }
}
