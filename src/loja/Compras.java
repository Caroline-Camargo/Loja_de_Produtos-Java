package loja;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Compras extends javax.swing.JFrame {

    public Compras() {
        initComponents();
        getContentPane().setBackground(Color.white); //COR BRANCA DE PLANO DE FUNDO
    }

    //VARIÁVEIS UTILIZADAS
    int preçoproduto, preçogarantia, preçofrete, quantidadeproduto;
    double preçofinal, preçodesconto;
    String mostra = "";
    String linha = "";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frete = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        precofinal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        preco = new javax.swing.JSlider();
        nome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        desconto = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        express = new javax.swing.JRadioButton();
        convencional = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        garantia = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        retirar = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        endereco = new javax.swing.JTextField();
        comprar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        verpreco = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        quantidade = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        calcular = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        histórico = new javax.swing.JTextArea();
        excluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(586, 600));
        setMinimumSize(new java.awt.Dimension(586, 600));
        setPreferredSize(new java.awt.Dimension(1060, 700));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel2.setText("COMPRAR PRODUTOS:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 10, 210, 70);

        precofinal.setEditable(false);
        precofinal.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        precofinal.setText("0");
        precofinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precofinalActionPerformed(evt);
            }
        });
        getContentPane().add(precofinal);
        precofinal.setBounds(420, 510, 120, 40);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel3.setText("NOME DO PRODUTO:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 80, 170, 70);

        preco.setMaximum(10000);
        preco.setMinorTickSpacing(200);
        preco.setPaintLabels(true);
        preco.setPaintTicks(true);
        preco.setSnapToTicks(true);
        preco.setValue(0);
        preco.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                precoMouseDragged(evt);
            }
        });
        getContentPane().add(preco);
        preco.setBounds(190, 166, 260, 30);

        nome.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });
        getContentPane().add(nome);
        nome.setBounds(190, 100, 350, 40);

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel4.setText("PREÇO DO PRODUTO:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 140, 170, 70);

        desconto.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        desconto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sem Desconto", "10%", "20%", "30%", "40%", "50%", "60%", "70%", "80%", "90%" }));
        desconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descontoActionPerformed(evt);
            }
        });
        getContentPane().add(desconto);
        desconto.setBounds(130, 240, 120, 40);

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel5.setText("DESCONTO:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 210, 170, 70);

        frete.add(express);
        express.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        express.setText("EXPRESS");
        express.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expressActionPerformed(evt);
            }
        });
        getContentPane().add(express);
        express.setBounds(370, 270, 90, 25);

        frete.add(convencional);
        convencional.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        convencional.setSelected(true);
        convencional.setText("CONVENCIONAL");
        convencional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convencionalActionPerformed(evt);
            }
        });
        getContentPane().add(convencional);
        convencional.setBounds(370, 240, 120, 25);

        jScrollPane1.setToolTipText("");

        garantia.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        garantia.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "SEM GARANTIA", "1 ANO ", "2 ANOS", "3 ANOS ", "4 ANOS", "5 ANOS" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        garantia.setSelectedIndex(2);
        jScrollPane1.setViewportView(garantia);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(120, 320, 140, 160);

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel7.setText("ENDEREÇO:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(310, 350, 100, 60);

        retirar.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        retirar.setText("RETIRAR NA LOJA");
        retirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retirarActionPerformed(evt);
            }
        });
        getContentPane().add(retirar);
        retirar.setBounds(310, 320, 160, 30);

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel8.setText("FRETE:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(310, 220, 80, 60);

        endereco.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        endereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoActionPerformed(evt);
            }
        });
        getContentPane().add(endereco);
        endereco.setBounds(310, 400, 230, 80);

        comprar.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        comprar.setText("FINALIZAR COMPRA");
        comprar.setMaximumSize(new java.awt.Dimension(586, 1000));
        comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarActionPerformed(evt);
            }
        });
        getContentPane().add(comprar);
        comprar.setBounds(320, 580, 180, 40);

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel6.setText("QUANTIDADE:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 490, 110, 70);

        verpreco.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        verpreco.setText("0");
        verpreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verprecoActionPerformed(evt);
            }
        });
        getContentPane().add(verpreco);
        verpreco.setBounds(460, 160, 80, 40);

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel9.setText("PREÇO FINAL:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(310, 490, 110, 70);

        quantidade.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        quantidade.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        getContentPane().add(quantidade);
        quantidade.setBounds(160, 510, 100, 40);

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel10.setText("GARANTIA:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 290, 80, 70);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 20, 520, 50);

        calcular.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        calcular.setText("CALCULAR PREÇO FINAL");
        calcular.setMaximumSize(new java.awt.Dimension(586, 560));
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });
        getContentPane().add(calcular);
        calcular.setBounds(70, 580, 230, 40);

        histórico.setEditable(false);
        histórico.setColumns(20);
        histórico.setRows(5);
        jScrollPane2.setViewportView(histórico);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(590, 100, 420, 450);

        excluir.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        excluir.setText("EXCLUIR HISTÓRICO");
        excluir.setMaximumSize(new java.awt.Dimension(586, 1000));
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });
        getContentPane().add(excluir);
        excluir.setBounds(720, 580, 180, 40);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CalcularPreçoFinal() {
        //MÉTODO QUE CALCULA O PREÇO TOTAL DO PRODUTO
        preçofinal = 0;

        preçoproduto = Integer.valueOf(verpreco.getText());
        quantidadeproduto = (int) quantidade.getValue();

        if (!retirar.isSelected()) { //TESTE PARA VER QUAL TIPO DE ENTREGA FOI ESCOLHIDO
            if (convencional.isSelected()) {
                preçofrete = 10;
            }
            if (express.isSelected()) {
                preçofrete = 15;
            }
        } else {
            preçofrete = 0;
        }

        if (garantia.isSelectedIndex(0)) { //TESTE PARA VER QUANTOS ANOS DE GARANTIA FOI ESCOLHIDO
            preçogarantia = 0;
        } else if (garantia.isSelectedIndex(1)) {
            preçogarantia = 100;
        } else if (garantia.isSelectedIndex(2)) {
            preçogarantia = 200;
        } else if (garantia.isSelectedIndex(3)) {
            preçogarantia = 300;
        } else if (garantia.isSelectedIndex(4)) {
            preçogarantia = 400;
        } else {
            preçogarantia = 500;
        }

        if (desconto.getSelectedIndex() == 0) { //TESTE E CÁCLULO PARA VER QUANTO DE DESCONTO FOI ESCOLHIDO
            preçodesconto = 0;
        } else if (desconto.getSelectedIndex() == 1) {
            preçodesconto = 0.1 * preçoproduto;
        } else if (desconto.getSelectedIndex() == 2) {
            preçodesconto = 0.2 * preçoproduto;
        } else if (desconto.getSelectedIndex() == 3) {
            preçodesconto = 0.3 * preçoproduto;
        } else if (desconto.getSelectedIndex() == 4) {
            preçodesconto = 0.4 * preçoproduto;
        } else if (desconto.getSelectedIndex() == 5) {
            preçodesconto = 0.5 * preçoproduto;
        } else if (desconto.getSelectedIndex() == 6) {
            preçodesconto = 0.6 * preçoproduto;
        } else if (desconto.getSelectedIndex() == 7) {
            preçodesconto = 0.7 * preçoproduto;
        } else if (desconto.getSelectedIndex() == 8) {
            preçodesconto = 0.8 * preçoproduto;
        } else {
            preçodesconto = 0.9 * preçoproduto;
        }

        //EXPRESSÃO E CÁLCULO FINAL PARA SABER O PREÇO TOTAL
        preçofinal = ((preçoproduto * quantidadeproduto) - preçodesconto) + preçofrete + (preçogarantia * quantidadeproduto);
        precofinal.setText(String.valueOf(preçofinal));
    }


    private void precofinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precofinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precofinalActionPerformed

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void convencionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convencionalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_convencionalActionPerformed

    private void expressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_expressActionPerformed

    private void descontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descontoActionPerformed

    private void retirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retirarActionPerformed
        //INTERAÇÕES ENTRE OS BOTÕES DE ESCOLHA DE ENTREGA
        if (retirar.isSelected()) { //RETIRA O PRODUTO NA LOJA
            convencional.setEnabled(false);
            express.setEnabled(false);
            endereco.setEnabled(false);
        } else { //PRODUTO ENTREGUE EM CASA POR FRETE
            convencional.setEnabled(true);
            express.setEnabled(true);
            endereco.setEnabled(true);
        }
    }//GEN-LAST:event_retirarActionPerformed

    private void enderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecoActionPerformed

    private void verprecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verprecoActionPerformed

    }//GEN-LAST:event_verprecoActionPerformed

    private void precoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_precoMouseDragged
        //INTERAÇÕES ENTRE A BARRA DE ROLAGEM COM O VISOR DO PREÇO DO PRODUTO
        int valor = 0;
        valor = preco.getValue();
        verpreco.setText(String.valueOf(valor));
    }//GEN-LAST:event_precoMouseDragged

    private void comprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarActionPerformed
        CalcularPreçoFinal(); //FUNÇÃO PARA SABER O PREÇO FINAL DO PRODUTO

        mostra = ""; //REINICIALIZA AS VARIÁVEIS PARA NÃO OCORRER DUPLICAÇÃO NO ARQUIVO DE TEXTO
        linha = "";

        if (nome.getText().equals("")) { //TESTE PARA VER SER O CAMPO NOME FOI PREENCHIDO
            JOptionPane.showMessageDialog(null, "PRENCHER CAMPO NOME!");
        } else if (verpreco.getText().equals("0")) { //TESTE PARA VER SER O PREÇO DO PRODUTO FOI ESCOLHIDO
            JOptionPane.showMessageDialog(null, "ESCOLHER PREÇO!");
        } else if (!retirar.isSelected() && endereco.getText().equals("")) { //TESTE PARA VER O CAMPO ENDEREÇO FOI PREENCHIDO CASO A ENTREGA SEJA FEITA POR MEIO DE FRETR
            JOptionPane.showMessageDialog(null, "PREENCHER ENDEREÇO!");
        } else { //CASO AS EXEIGENCIAS FORAM COMPRIDAS O ARQUIVO DE TEXTO PODERA SER CRIADO
            FileWriter arquivo;
            try {
                arquivo = new FileWriter(new File("ArquivoCompras.txt"), true);
                arquivo.write("\r\n------ RESUMO DE COMPRAS ------ \r\n");
                arquivo.write("\r\n  Nome do Produto: " + nome.getText()); //GRAVANDO AS INFORMAÇÕES DA COMPRA NO ARQUIVO DE TEXTO
                arquivo.write("\r\n  Preço Unitário: " + verpreco.getText());
                arquivo.write("\r\n  Quantidade: " + quantidade.getValue());
                arquivo.write("\r\n  Desconto: " + desconto.getSelectedItem());
                arquivo.write("\r\n  Garantia: " + garantia.getSelectedValue());
                arquivo.write("\r\n  Modo de Entrega: ");
                if (retirar.isSelected()) { //TESTE PARA SABER QUAL MÉTODO DE ENTREGA FOI ESCOLHIDO
                    arquivo.write("Retirar na Loja");
                } else {
                    if (convencional.isSelected()) {
                        arquivo.write("Frete Convencional");
                    }
                    if (express.isSelected()) {
                        arquivo.write("Frete Express");
                    }
                    arquivo.write("\r\n  Endereço: " + endereco.getText());
                }
                arquivo.write("\r\n  Preço Total: " + String.valueOf(preçofinal) + " Reais \r\n");
                arquivo.write("\r\n    ");
                arquivo.close();

                //LENDO O ARQUIVO DE TEXTO
                File arq = new File("ArquivoCompras.txt");

                if (arq.exists()) { //SE O ARQUIVO EXISTIR
                    try {
                        FileReader reader = new FileReader("ArquivoCompras.txt");
                        BufferedReader leitor = new BufferedReader(reader);
                        while (true) { //LENDO ATÉ A ÚLTIMA LINHA  
                            linha = leitor.readLine();
                            if (linha == null) {
                                break;
                            }
                            mostra += linha + "\n";
                        }
                    } catch (Exception erro) {
                        JOptionPane.showMessageDialog(null, mostra, "arquivo", 1);
                    }
                } else { //CASO O ARQUIVO NÃO EXISTA
                    JOptionPane.showMessageDialog(null, "Arquivo nao existe!", "Erro", 0);
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "ERROOO", "Erro", 0);
            }
            //DEPOIS DE TUDO ISSO É FINALIZADA A COMPRA E MOSTRADO O HISTÓRICO PARA O USUÁRIO
            JOptionPane.showMessageDialog(null, "COMPRA EFETUADA COM SUCESSO");
            histórico.setText(mostra);
        }
    }//GEN-LAST:event_comprarActionPerformed

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        //CHAMA O MÉTODO QUE CALCULA O PREÇO FINAL DA COMPRA
        CalcularPreçoFinal();
    }//GEN-LAST:event_calcularActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        //QUANDO A PESSOA DESEJA EXCLUIR TODO O CONTEÚDO DO ARQUIVO DE TEXTO 
        FileWriter arquivo;
        try {
            arquivo = new FileWriter(new File("ArquivoCompras.txt"));
            arquivo.write("");
            arquivo.close();
        } catch (IOException ex) {
        }
        histórico.setText("");
    }//GEN-LAST:event_excluirActionPerformed

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
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Compras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcular;
    private javax.swing.JButton comprar;
    private javax.swing.JRadioButton convencional;
    private javax.swing.JComboBox<String> desconto;
    private javax.swing.JTextField endereco;
    private javax.swing.JButton excluir;
    private javax.swing.JRadioButton express;
    private javax.swing.ButtonGroup frete;
    private javax.swing.JList<String> garantia;
    private javax.swing.JTextArea histórico;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nome;
    private javax.swing.JSlider preco;
    private javax.swing.JTextField precofinal;
    private javax.swing.JSpinner quantidade;
    private javax.swing.JCheckBox retirar;
    private javax.swing.JTextField verpreco;
    // End of variables declaration//GEN-END:variables
}
