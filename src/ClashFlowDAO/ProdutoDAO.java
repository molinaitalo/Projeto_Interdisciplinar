/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClashFlowDAO;

import ClashFlowObjeto.GrupoProduto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import utilitario.Conexao;
import ClashFlowObjeto.Produto;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import utilitario.DataUtil;
/**
 *
 * @author Sonia
 */
public class ProdutoDAO
{
    
    private Connection conn;
    private PreparedStatement ps;
    private Statement st;
    private ResultSet rs;
        
    public void add(Produto produto)  {

		try 
                {
                    
			conn = new Conexao().conectar();
			ps = conn.prepareStatement( "INSERT INTO PRODUTOS(prDescricaoProduto, prEstoque,"
                                + " prObservacao, prPrecoVenda, prLocal, gpIdGrupoProduto, prDataCadastro) VALUES(?,?,?,?,?,?, now())");
               
                        ps.setString(1, produto.getDescricaoProduto());
                        ps.setInt(2, produto.getEstoque());
                        ps.setString(3, produto.getObservacao());
                        ps.setDouble(4, produto.getPrecoVenda());
                        ps.setString(5, produto.getLocal());
                        ps.setInt(6, produto.getGrupoProduto().getIdGrupoProduto());
                        ps.execute();
                       
                        
                }
                catch (SQLException e)
                {
                    System.out.println("Não foi possivel salvar no banco " + e.getMessage());
                }
                finally 
                {
			if (ps != null) {
				try {
					ps.close();
				} 
                                catch (SQLException e)
                                {
					System.out.println("Nao foi possivel fechar o Statement");
				}
			}
			if (conn != null) 
                        {
				try 
                                {
					conn.close();
                                }                                 
                                catch (SQLException e)
                                {
					System.out.println("Não foi possivel fechar a conexao");
				}
			}
		}
    }
    
     public List<Produto> buscarTodos()  {
       //lista todos os produtos 
		try 
                {
                    
			conn = new Conexao().conectar();
			st = conn.createStatement();
               
                        rs = st.executeQuery("SELECT * FROM PRODUTOS");
                        
                        List<Produto> produtos = new ArrayList<>();
                 
                        while(rs.next()) {
                            Produto produto = new Produto();
                            produto.setCodigoProduto(rs.getInt("prIdProduto"));
                            produto.setDescricaoProduto(rs.getString("prDescricaoProduto"));
                            produto.setEstoque(rs.getInt("prEstoque"));
                            produto.setObservacao(rs.getString("prObservacao"));
                            produto.setPrecoVenda(rs.getDouble("prPrecoVenda"));
                            produto.setLocal(rs.getString("prLocal"));
                            produto.setDataCadastro(DataUtil.parseDate(rs.getDate("prDataCadastro")));
                            
                            produtos.add(produto);
                        }
                       
                        return produtos;
                        
                }
                catch (SQLException e)
                {
                    System.out.println("Não foi possivel salvar no banco " + e.getMessage());
                    return null;
                }
                finally 
                {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					System.out.println("Nao foi possivel fechar o Statement");
				}
			}
			if (conn != null) 
                        {
				try 
                                {
					conn.close();
                                }                                 
                                catch (SQLException e)
                                {
					System.out.println("Não foi possivel fechar a conexao");
				}
			}
		}
    }
   
     public List<Produto> buscarNome(String nome)  {
       //pesquisa de produtos feita  da tabela de venda
		try 
                {
                    
			conn = new Conexao().conectar();
			st = conn.createStatement();
                        ps = conn.prepareStatement("SELECT * FROM produtos where prDescricaoProduto like ?");
                        ps.setString(1, nome + "%");
                        rs = ps.executeQuery();
                        
                        List<Produto> produtos = new ArrayList<>();
                 
                        while(rs.next()) {
                            Produto produto = new Produto();
                            produto.setCodigoProduto(rs.getInt("prIdProduto"));
                            produto.setDescricaoProduto(rs.getString("prDescricaoProduto"));
                            produto.setEstoque(rs.getInt("prEstoque"));
                            produto.setPrecoVenda(rs.getDouble("prPrecoVenda"));
                            produto.setLocal(rs.getString("prLocal"));
                            
                            
                            produtos.add(produto);
                        }
                       
                        return produtos;
                        
                }
                catch (SQLException e)
                {
                    System.out.println("Não foi possivel salvar no banco " + e.getMessage());
                    return null;
                }
                finally 
                {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					System.out.println("Nao foi possivel fechar o Statement");
				}
			}
			if (conn != null) 
                        {
				try 
                                {
					conn.close();
                                }                                 
                                catch (SQLException e)
                                {
					System.out.println("Não foi possivel fechar a conexao");
				}
			}
		}
    }
     
}
