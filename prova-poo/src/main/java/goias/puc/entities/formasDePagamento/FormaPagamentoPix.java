package goias.puc.entities.formasDePagamento;

public class FormaPagamentoPix extends FormaPagamento{
    final double DESCONTO_PIX = 0.08;

    @Override
    public double getMetodoDePagamento(double valorPago) {
        return valorPago - (valorPago * DESCONTO_PIX);
    }
}
