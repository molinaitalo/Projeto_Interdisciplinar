/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CashFlowBO;

import ClashFlowDAO.ProdutoDAO;
import ClashFlowObjeto.GrupoProduto;
import ClashFlowObjeto.Produto;
import java.util.List;

/**
 *
 * @author Sonia
 */
public class ProdutoBO 
{

    ProdutoDAO produtoDAO;
    
    public ProdutoBO()
    {
        produtoDAO = new ProdutoDAO();
    }
    
    public void salvar(Produto produto)
    {
       
        produtoDAO.add(produto);
    }
    
    public List<Produto> buscarTodos() {
        return produtoDAO.buscarTodos();
    }
     
    public List<Produto> pesquisa(String nome) {
        
        return produtoDAO.buscarNome(nome);
    }
    
}

