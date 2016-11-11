/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formulario;

import CashFlowBO.ProdutoBO;
import CashFlowBO.GrupoProdutoBO;
import ClashFlowObjeto.GrupoProduto;
import ClashFlowObjeto.Produto;
import java.util.List;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Caio Henrique
 */
public class FormNovoProduto extends javax.swing.JFrame {
 Produto p = new Produto();
    /**
     * Creates new form FormNovoPr
     */
    public FormNovoProduto() {
        init();
    }

    
    private void init() {
        
        initComponents();
        
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        ABAS = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ABAS1 = new javax.swing.JPanel();
        CBGrupoProduto = new javax.swing.JComboBox<>();
        txtPrecoCompra = new javax.swing.JTextField();
        txtQuantidadeProduto = new javax.swing.JTextField();
        txtObservacao = new javax.swing.JTextField();
        txtEstoque = new javax.swing.JTextField();
        txtLocal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtDescricaoProduto = new javax.swing.JTextField();
        btnAdicionaGrupo = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPrecoVenda = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtPrCalcFrete = new javax.swing.JTextField();
        txtPrCalcCompra = new javax.swing.JTextField();
        txtPrCalcCusto = new javax.swing.JTextField();
        txtPrCalcICMS = new javax.swing.JTextField();
        txtPrCalcCartao = new javax.swing.JTextField();
        txtPrCalcLucro = new javax.swing.JTextField();
        txtPrecoSugerido = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Produtos");

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("CADASTRAR PRODUTO");

        ABAS1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CBGrupoProduto.setModel(new javax.swing.DefaultComboBoxModel<GrupoProduto>(carregaGrupos()));
        CBGrupoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBGrupoProdutoActionPerformed(evt);
            }
        });
        ABAS1.add(CBGrupoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 120, 20));
        ABAS1.add(txtPrecoCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 100, -1));
        ABAS1.add(txtQuantidadeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 150, 20));
        ABAS1.add(txtObservacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 250, -1));

        txtEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstoqueActionPerformed(evt);
            }
        });
        ABAS1.add(txtEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 80, -1));
        ABAS1.add(txtLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 80, -1));

        jLabel3.setText("Descrição:");
        ABAS1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel4.setText("Quantidade:");
        ABAS1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel5.setText("Observação:");
        ABAS1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel13.setText("Grupo de Produto:");
        ABAS1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, 20));
        ABAS1.add(txtDescricaoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 250, -1));

        btnAdicionaGrupo.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        btnAdicionaGrupo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/MAIS.png"))); // NOI18N
        btnAdicionaGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionaGrupoActionPerformed(evt);
            }
        });
        ABAS1.add(btnAdicionaGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 30, 20));

        jLabel7.setText("Preço de Compra:");
        ABAS1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jLabel6.setText("Preço Venda:");
        ABAS1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));
        ABAS1.add(txtPrecoVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 84, -1));

        jLabel18.setText("Estoque");
        ABAS1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel19.setText("Local");
        ABAS1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btnSalvar.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/product.png"))); // NOI18N

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btnSair.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ABASLayout = new javax.swing.GroupLayout(ABAS);
        ABAS.setLayout(ABASLayout);
        ABASLayout.setHorizontalGroup(
            ABASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ABASLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(273, 273, 273))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ABASLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ABAS1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ABASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ABASLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnSalvar)
                        .addGap(45, 45, 45)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(150, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ABASLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );
        ABASLayout.setVerticalGroup(
            ABASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ABASLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(ABASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ABASLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143)
                        .addGroup(ABASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSair)))
                    .addComponent(ABAS1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dados do Produto", ABAS);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("CÁLCULOS");

        jLabel9.setText("Preço de Compra:");

        jLabel10.setText("Preço de Frete:");

        jLabel11.setText("Percentual de Lucro desejado:");

        jLabel12.setText("Outros Custos:");

        jLabel14.setText("ICMS:");

        jLabel15.setText("Despesas Cartão:");

        jLabel17.setText("Preço sugerido de venda:");

        btnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/1476307695_office-17.png"))); // NOI18N
        btnCalcular.setText(" Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPrCalcCusto, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                            .addComponent(txtPrCalcFrete)
                            .addComponent(txtPrCalcCompra))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPrCalcLucro, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPrCalcICMS, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtPrCalcCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(txtPrecoSugerido, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addComponent(jLabel2)))
                .addContainerGap(247, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCalcular)
                .addGap(302, 302, 302))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel2)
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtPrCalcCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(185, 185, 185))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrCalcCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel9)
                            .addComponent(txtPrCalcCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtPrCalcICMS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrCalcFrete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrCalcLucro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(77, 77, 77)
                        .addComponent(btnCalcular)
                        .addGap(79, 79, 79)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtPrecoSugerido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(161, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cálculos para Sugestão de Venda", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstoqueActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        int aux = 0;
       
        p.setDescricaoProduto(txtDescricaoProduto.getText());
        p.setEstoque(Integer.parseInt(txtEstoque.getText()));
        p.setObservacao(txtObservacao.getText());
        p.setPrecoVenda(Double.parseDouble(txtPrecoVenda.getText()));
        p.setLocal(txtLocal.getText());
        //Pega o item selecionado no combobox de grupos de produtos
        p.setGrupoProduto((GrupoProduto) CBGrupoProduto.getSelectedItem());        
        aux = validaCampos(evt);
        if(aux == 0)
        {
        ProdutoBO produtoBO = new ProdutoBO();
        produtoBO.salvar(p);
        JOptionPane.showMessageDialog(null,"Produto Salvo com Sucesso!");
        btnSairActionPerformed(evt);
        
        }
           
        
              
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAdicionaGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionaGrupoActionPerformed
        //FormGrupoProduto form = new FormGrupoProduto(); //Instanciação do formulário de nova venda
        //form.setVisible(true);
        formNovoGrupo = new FormNovoGrupo(this.callbackGrupo());
        formNovoGrupo.setVisible(true);
    }//GEN-LAST:event_btnAdicionaGrupoActionPerformed
  private int validaCampos(java.awt.event.ActionEvent evt)
     {
        int erro = 0;
        if(txtDescricaoProduto.getText().isEmpty())
        {
           showMessageDialog(null,"Campo Descrição vazio!");
           erro++;
        }
        if(txtQuantidadeProduto.getText().isEmpty())
        {
            showMessageDialog(null,"Campo Quantidade vazio!");
            erro++;
        }
        if(txtEstoque.getText().isEmpty())
        {
            showMessageDialog(null,"Campo Estoque vazio!");
            erro++;
        }
         if(txtLocal.getText().isEmpty())
        {
            showMessageDialog(null,"Campo Local vazio!");
            erro++;
        }
          if(txtPrecoCompra.getText().isEmpty())
        {
            showMessageDialog(null,"Campo Preço Compra vazio!");
            erro++;
        } if(txtPrecoVenda.getText().isEmpty())
        {
            showMessageDialog(null,"Campo Preço venda vazio!");
            erro++;
        }
       
        return erro;
       }
    private CallbackForm callbackGrupo() {
        
        //Instanciando uma classe anonima
        return new CallbackForm<GrupoProduto>() {
            @Override
            
            public void fim(GrupoProduto grupoProduto) {
                formNovoGrupo.setVisible(false);
                //seta o Objeto como null para o GC limpar da memoria
                formNovoGrupo = null;
                CBGrupoProduto.addItem(grupoProduto);
                CBGrupoProduto.setSelectedItem(grupoProduto);
            }
        };
        
    }
    
    private void CBGrupoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBGrupoProdutoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_CBGrupoProdutoActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
       Float resultado;
       resultado = ((Float.parseFloat(txtPrCalcCompra.getText())
               + (Float.parseFloat(txtPrCalcFrete.getText()))
               + (Float.parseFloat(txtPrCalcCusto.getText())))
               * ( 1 + (Float.parseFloat(txtPrCalcCartao.getText())/100))
               * ( 1 + (Float.parseFloat(txtPrCalcICMS.getText())/100))
               * ( 1 + (Float.parseFloat(txtPrCalcLucro.getText())/100)));
       String PrecoSugerido = (String.valueOf(resultado));
       txtPrecoSugerido.setText(PrecoSugerido);
       txtPrecoVenda.setText(PrecoSugerido);
     
    }//GEN-LAST:event_btnCalcularActionPerformed

    private GrupoProduto[] carregaGrupos() {
        GrupoProdutoBO grupoProdutoBO = new GrupoProdutoBO();
        List<GrupoProduto> grupos = grupoProdutoBO.buscarTodos();
        return grupos.toArray(new GrupoProduto[grupos.size()]);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormNovoProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormNovoProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormNovoProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormNovoProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormNovoProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ABAS;
    private javax.swing.JPanel ABAS1;
    private javax.swing.JComboBox<GrupoProduto> CBGrupoProduto;
    private javax.swing.JButton btnAdicionaGrupo;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtDescricaoProduto;
    private javax.swing.JTextField txtEstoque;
    private javax.swing.JTextField txtLocal;
    private javax.swing.JTextField txtObservacao;
    private javax.swing.JTextField txtPrCalcCartao;
    private javax.swing.JTextField txtPrCalcCompra;
    private javax.swing.JTextField txtPrCalcCusto;
    private javax.swing.JTextField txtPrCalcFrete;
    private javax.swing.JTextField txtPrCalcICMS;
    private javax.swing.JTextField txtPrCalcLucro;
    private javax.swing.JTextField txtPrecoCompra;
    private javax.swing.JTextField txtPrecoSugerido;
    private javax.swing.JTextField txtPrecoVenda;
    private javax.swing.JTextField txtQuantidadeProduto;
    // End of variables declaration//GEN-END:variables

    private FormNovoGrupo formNovoGrupo;

}