package goias.puc;

import goias.puc.entities.*;
import goias.puc.enums.Categoria;
import goias.puc.enums.Subcategoria;

public class Main {
    static void main() {

        // INSTANCIAR PRODUTO
        String nomeProduto = "Notebook";
        String descricaoProduto = "Notebook Gamer";
        double valorUnitarioProduto = 20;
        int quantidadeProduto = 90;
        Categoria categoriaProduto = Categoria.ELETRONICOS;
        Subcategoria subcategoriaProduto = Subcategoria.COMPUTADORES;
        Endereco enderecoFabricante = new Endereco("USA Street 123");
        Fabricante fabricanteProduto = new Fabricante("Dell", "123456789", enderecoFabricante);

        Produto produto = new Produto(
                nomeProduto,
                descricaoProduto,
                valorUnitarioProduto,
                quantidadeProduto,
                categoriaProduto,
                subcategoriaProduto,
                fabricanteProduto);

        // INSTANCIAR CLIENTE
        String nomeCliente = "João Alves Silva";
        String telefoneCliente = "(99) 98765-4321";
        Endereco enderecoCliente = new Endereco("Rua fictícia 123");
        String cpf = "12345678-90";
        String dataNascimento = "01/01/2000";

        Cliente cliente = new Cliente (nomeCliente, telefoneCliente, enderecoCliente, cpf, dataNascimento);

        Pedido pedido = new Pedido(produto,20, cliente);

        System.out.println("Cliente Cadastrado: " + cliente.getNome());
        System.out.println("Telefone do Cliente: " + cliente.getTelefone());

        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço unitário " + produto.getValorUnitario());
        System.out.println("Quantidade " + produto.getQuantidade());

        System.out.println("Pedido Id: " + pedido.getId());
    }

}
