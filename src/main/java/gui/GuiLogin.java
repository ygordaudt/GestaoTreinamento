package gui;


import dao.DadosLoginParametro;
import dao.DadosUsuario;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import model.LoginParametro;
import model.Usuario;
import model.UsuarioAtual;

/**
 *
 * @author Ygor
 */
public class GuiLogin extends javax.swing.JFrame {

    /**
     * Creates new form GuiPrincipalLogin
     */
    private List<Usuario> usuarios = new ArrayList();
    private LoginParametro parametro;
    private final DadosLoginParametro dadosLoginParametro = new DadosLoginParametro();
    private final DadosUsuario dadosUsuario = new DadosUsuario();
    private static final String cboInicial = "Selecione um Usuário:";
    
    
    public GuiLogin() {
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

        jFileChooser1 = new javax.swing.JFileChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnGroupRadio = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        LblUsuario = new javax.swing.JLabel();
        cboUsuario = new javax.swing.JComboBox();
        BtnCadastrarUsuarios = new javax.swing.JButton();
        LblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        BtnEntrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        TblDiretorioXml = new javax.swing.JTable();
        BtnAlterarDiretorioXml = new javax.swing.JButton();
        BtnEntrarSemSenha = new javax.swing.JButton();
        BtnSair = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login - Controle de Treinamento");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                FormWindowActivate(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                FormWindowOpened(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(0, 0, 64));

        jLabel1.setBackground(new java.awt.Color(51, 51, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo_Medium.png"))); // NOI18N

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        LblUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LblUsuario.setText("Usuário:");

        cboUsuario.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboUsuarioItemStateChanged(evt);
            }
        });
        cboUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboUsuarioActionPerformed(evt);
            }
        });

        BtnCadastrarUsuarios.setText("...");
        BtnCadastrarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCadastrarUsuariosActionPerformed(evt);
            }
        });

        LblSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LblSenha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LblSenha.setText("Senha:");

        BtnEntrar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        BtnEntrar.setText("Entrar");
        BtnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblSenha)
                    .addComponent(LblUsuario))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboUsuario, 0, 326, Short.MAX_VALUE)
                    .addComponent(txtSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(BtnCadastrarUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblUsuario)
                    .addComponent(BtnCadastrarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSenha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LblSenha)
                        .addComponent(BtnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Acesso", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        TblDiretorioXml.setBackground(new java.awt.Color(214, 214, 214));
        TblDiretorioXml.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        TblDiretorioXml.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Diretório dos Arquivos XML"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TblDiretorioXml.setSelectionBackground(new java.awt.Color(204, 204, 204));
        TblDiretorioXml.setSelectionForeground(new java.awt.Color(0, 0, 0));
        TblDiretorioXml.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(TblDiretorioXml);
        if (TblDiretorioXml.getColumnModel().getColumnCount() > 0) {
            TblDiretorioXml.getColumnModel().getColumn(0).setResizable(false);
            TblDiretorioXml.getColumnModel().getColumn(0).setHeaderValue("Diretório dos Arquivos XML");
        }

        jScrollPane3.setViewportView(jScrollPane2);

        BtnAlterarDiretorioXml.setText("Alterar Diretório");
        BtnAlterarDiretorioXml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAlterarDiretorioXmlActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(BtnAlterarDiretorioXml)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnAlterarDiretorioXml))
        );

        jTabbedPane1.addTab("Configurações", jPanel2);

        BtnEntrarSemSenha.setBackground(new java.awt.Color(187, 199, 240));
        BtnEntrarSemSenha.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        BtnEntrarSemSenha.setText("Entrar Sem Senha");
        BtnEntrarSemSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEntrarSemSenhaActionPerformed(evt);
            }
        });

        BtnSair.setBackground(new java.awt.Color(187, 199, 240));
        BtnSair.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        BtnSair.setText("Sair");
        BtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(BtnEntrarSemSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTabbedPane1))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnEntrarSemSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/JCA_Small.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FormWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_FormWindowOpened
        // TODO add your handling code here:
        preencherTabela();
        txtSenha.requestFocus();
        this.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_FormWindowOpened

    private void FormWindowActivate(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_FormWindowActivate
        // TODO add your handling code here:
        cboUsuario.removeAllItems();
        cboUsuario.addItem(cboInicial);
        try {
            usuarios = new DadosUsuario().getList();
        } catch (Exception ex) {
            Logger.getLogger(GuiLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (Usuario usuario : usuarios) {
           cboUsuario.addItem(usuario);
        }
        
        
        preencherTabela();     
        
    }//GEN-LAST:event_FormWindowActivate

    private void BtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_BtnSairActionPerformed

    private void BtnEntrarSemSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEntrarSemSenhaActionPerformed
        // TODO add your handling code here:
        this.dispose();

        GuiPrincipal gp = new GuiPrincipal();
        gp.setVisible(true);
    }//GEN-LAST:event_BtnEntrarSemSenhaActionPerformed

    private void BtnAlterarDiretorioXmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAlterarDiretorioXmlActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            this.parametro = (LoginParametro) TblDiretorioXml.getValueAt(TblDiretorioXml.getSelectedRow(), 0);

            try {
                dadosLoginParametro.remover(this.parametro);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

            parametro = new LoginParametro();

            parametro.setDiretorioXml(chooser.getSelectedFile().getAbsolutePath());

            try {
                dadosLoginParametro.incluir(parametro);
                JOptionPane.showMessageDialog(rootPane, "Diretório Aplicado.");
            } catch (Exception ex) {
                Logger.getLogger(GuiLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        preencherTabela();

    }//GEN-LAST:event_BtnAlterarDiretorioXmlActionPerformed

    private void BtnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEntrarActionPerformed
        // TODO add your handling code here:
        if (validaCampos()) {

            Usuario usuario = (Usuario) cboUsuario.getSelectedItem();
            String senha = txtSenha.getText();

            if (senha.equals(usuario.getSenha())) {
                UsuarioAtual usuarioAtual = new UsuarioAtual(usuario);
                JOptionPane.showMessageDialog(rootPane, "Bem Vindo, " + usuarioAtual.getNome() + "!");

                this.dispose();

                GuiPrincipal gp = new GuiPrincipal();
                gp.setVisible(true);
                gp.getLblUsuarioAtual().setText(usuarioAtual.toString());
                gp.getLblNivel().setText(usuarioAtual.getNome().getNivelAcesso());
            } else {
                JOptionPane.showMessageDialog(rootPane, "Senha inválida.");
                txtSenha.setText("");
                txtSenha.requestFocus();
            }
        }
    }//GEN-LAST:event_BtnEntrarActionPerformed

    private void BtnCadastrarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadastrarUsuariosActionPerformed
        // TODO add your handling code here:

        GuiCadUsuario gus = new GuiCadUsuario();
        gus.setVisible(true);
    }//GEN-LAST:event_BtnCadastrarUsuariosActionPerformed

    private void cboUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboUsuarioActionPerformed

    private void cboUsuarioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboUsuarioItemStateChanged
        // TODO add your handling code here:

        txtSenha.requestFocus();
    }//GEN-LAST:event_cboUsuarioItemStateChanged

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
            //javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
            
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
            
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            
            
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuiLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiLogin().setVisible(true);
            }
        });
    }
    
    private void preencherTabela() {
        DefaultTableModel tbl = (DefaultTableModel) TblDiretorioXml.getModel();
        int qtdLinhas = tbl.getRowCount();

        for (int i = qtdLinhas - 1; i >= 0; i--) {
            tbl.removeRow(0);
        }

        List<LoginParametro> parametros = new ArrayList();
        
        try {
            parametros = dadosLoginParametro.getList();
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null, ex.getMessage());
            //return;
        }

        
        for (int i = 0; i < parametros.size(); i++) {
            LoginParametro parametro = (LoginParametro) parametros.get(i);
            Object linha[] = {parametro};
            tbl.addRow(linha);
        }
        
        TblDiretorioXml.setRowSelectionInterval(0,0); // Seleciona a primeira linha da tabela automaticamente 
    }
    
     public boolean validaCampos() {
        if (!(txtSenha.getText().length() > 0)){
            JOptionPane.showMessageDialog(null, "Informe a Senha do Usuário.");
            txtSenha.requestFocus();
            return false;
        }
        if (!(cboUsuario.getSelectedItem()!=cboInicial)) {
            JOptionPane.showMessageDialog(null, "Selecione um Usuário.");
            cboUsuario.showPopup();
            return false;
        }
        return true;
    }
    

        
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAlterarDiretorioXml;
    private javax.swing.JButton BtnCadastrarUsuarios;
    private javax.swing.JButton BtnEntrar;
    private javax.swing.JButton BtnEntrarSemSenha;
    private javax.swing.JButton BtnSair;
    private javax.swing.JLabel LblSenha;
    private javax.swing.JLabel LblUsuario;
    private javax.swing.JTable TblDiretorioXml;
    private javax.swing.ButtonGroup btnGroupRadio;
    private javax.swing.JComboBox cboUsuario;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables

}
