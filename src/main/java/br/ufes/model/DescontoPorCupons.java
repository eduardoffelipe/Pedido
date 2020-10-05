/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.model;

/**
 *
 * @author Lucas
 */
public class DescontoPorCupons implements IDescontosStrategy{
   public double calculaDesconto(CarrinhoDeCompra carrinhoDeCompra) {
        if (carrinhoDeCompra.getCliente().getCupons() >= 10) {
            carrinhoDeCompra.getCliente().setCupons(carrinhoDeCompra.getCliente().getCupons() - 10);
            return 0.1;
        }
        
        return 0;
    }
}
