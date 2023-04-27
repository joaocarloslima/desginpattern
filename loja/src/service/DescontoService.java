package service;

import model.Produto;

public class DescontoService {
    public double calcularDesconto(Produto produto){
        if (produto.getQuantidade() > 10){
            return produto.getPreco() * 0.1;
        } else if (produto.getQuantidade() > 5){
            return produto.getPreco() * 0.05;
        } else {
            return 0;
        }
    }
}
