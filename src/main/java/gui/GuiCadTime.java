/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.DadosEmpresa;
import dao.DadosFuncao;
import dao.DadosEquipe;
import dao.DadosTipoTime;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Empresa;
import model.Funcao;
import model.Equipe;
import model.CorEquipe;

/**
 *
 * @author Ygor
 */
public class GuiCadTime extends javax.swing.JInternalFrame {

    /**
     * Creates new form GuiTime
     */
    public GuiCadTime() {
        initComponents();
    }
    
    public static GuiCadTime getInstance() {
        if (aberto) return null;
        aberto = true;
        return new GuiCadTime();
    }
    
    private static boolean aberto = false;
    private boolean alterando = false;
    private CorEquipe tipoTime;
    private final DadosTipoTime dadosTipoTime = new DadosTipoTime();
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtDescricao = new javax.swing.JTextField();
        lblTime = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTimes = new javax.swing.JTable();
        btnAlterar = new javax.swing.JToggleButton();
        btnRemover = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Cadastro de Times - Controle de Treinamento");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(187, 199, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtDescricao.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N

        lblTime.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        lblTime.setText("Descrição do Time:");

        btnCadastrar.setBackground(new java.awt.Color(187, 199, 255));
        btnCadastrar.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        tblTimes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblTimes);

        btnAlterar.setBackground(new java.awt.Color(187, 199, 255));
        btnAlterar.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnRemover.setBackground(new java.awt.Color(187, 199, 255));
        btnRemover.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        btnRemover.setText("Excluir");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnVoltar.setBackground(new java.awt.Color(187, 199, 255));
        btnVoltar.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTime)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTime)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar)
                    .addComponent(btnRemover)
                    .addComponent(btnVoltar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 0, 64));

        jLabel1.setBackground(new java.awt.Color(51, 51, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Times");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/JCA_Small.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
        
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
        if (validarCampos()) {
            if (!alterando) {
                String descricao = txtDescricao.getText();
                tipoTime = new CorEquipe (descricao);
                try {
                    dadosTipoTime.incluir(tipoTime);
                    JOptionPane.showMessageDialog(null, "Time cadastrado com sucesso!", "Cadastro de Time", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Cadastro de Time", JOptionPane.ERROR_MESSAGE);
                }
                
            } else {
                tipoTime = (CorEquipe) tblTimes.getValueAt(tblTimes.getSelectedRow(), 0);
                tipoTime.setDescricao(txtDescricao.getText());
                try {
                    dadosTipoTime.alterar();
                    JOptionPane.showMessageDialog(null, "Cadastro alterado com sucesso!", "Cadastro de Time", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Cadastro de Time", JOptionPane.ERROR_MESSAGE);
                }
            }
            
            preencherTabela();
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        // TODO add your handling code here:
        int opcao
        = JOptionPane.showOptionDialog(null,
            "Confirma a exclusão?",
            "Pergunta",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE, null,
            new String[]{"Sim", "Não"}, "Sim");
        if (opcao == 0) {
            this.tipoTime = (CorEquipe) tblTimes.getValueAt(tblTimes.getSelectedRow(), 0);
            try {
                dadosTipoTime.remover(this.tipoTime);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            JOptionPane.showMessageDialog(rootPane, "Time removida com sucesso.");
            
            preencherTabela();
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // TODO add your handling code here:
        preencherTabela();
    }//GEN-LAST:event_formInternalFrameActivated

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // TODO add your handling code here:
        aberto = false;
    }//GEN-LAST:event_formInternalFrameClosed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
        if (alterando) resetarTela();
        else {
            try {
                tipoTime = (CorEquipe) tblTimes.getValueAt(tblTimes.getSelectedRow(), 0);
                String descricaoFuncao = tipoTime.getDescricao();
                txtDescricao.setText(descricaoFuncao);
                txtDescricao.requestFocus();
                txtDescricao.selectAll();
                alterando = true;
                btnAlterar.setText("Alterando");
                btnAlterar.setSelected(true);
                tblTimes.setEnabled(false);
            } catch (Exception headlessException) {
                JOptionPane.showMessageDialog(null, "Por favor, selecione um time.");
                btnAlterar.setSelected(false);
            }
        }
    }//GEN-LAST:event_btnAlterarActionPerformed
    
    public void preencherTabela() {
        DefaultTableModel tbl = (DefaultTableModel) tblTimes.getModel();
        tblTimes.setRowSorter(new TableRowSorter(tbl));

        int qtdLinhas = tbl.getRowCount();
        for (int i = qtdLinhas - 1; i >= 0; i--) {
            tbl.removeRow(0);
        }

        List<CorEquipe> tiposTime = new ArrayList();
        try {
           tiposTime = dadosTipoTime.getList();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Nenhum time encontrado!", "Cadastro de Time", JOptionPane.ERROR_MESSAGE);
        }
        
        for (int i = 0; i < tiposTime.size(); i++) {
            CorEquipe ttime = (CorEquipe) tiposTime.get(i);
            Object linha [] = {ttime};
            tbl.addRow(linha);
        }

        resetarTela();
    }
    
    public void resetarTela() {
        txtDescricao.setText("");
        txtDescricao.requestFocus();
        btnAlterar.setEnabled(true);
        btnAlterar.setSelected(false);
        btnAlterar.setText("Alterar");
        tblTimes.setEnabled(true);
    }
    
    public boolean validarCampos() {
        if(!(txtDescricao.getText().length() > 0)) {
            JOptionPane.showMessageDialog(null, "Informe a Descrição do time.");
            txtDescricao.requestFocus();
            return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTime;
    private javax.swing.JTable tblTimes;
    private javax.swing.JTextField txtDescricao;
    // End of variables declaration//GEN-END:variables
}
