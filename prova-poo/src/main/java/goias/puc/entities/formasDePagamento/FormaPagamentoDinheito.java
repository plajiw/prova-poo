package goias.puc.entities.formasDePagamento;

public class FormaPagamentoDinheito extends FormaPagamento{
    final double DESCONTO_DINHEIRO = 0.10;

    @Override
    public double getMetodoDePagamento(double valorPago) {
        return valorPago - (valorPago * DESCONTO_DINHEIRO);
    }
}
