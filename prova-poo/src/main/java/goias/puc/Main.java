package goias.puc;

import goias.puc.entities.*;
import goias.puc.enums.Categoria;
import goias.puc.enums.Subcategoria;

public class Main {
    static void main() {
        // INSTANCIAR PRODUTO
        String nomeProduto = "Notebook";
        String descricaoProduto = "Notebook Gamer";
        double valorUnitarioProduto = -1;
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
    }
}
