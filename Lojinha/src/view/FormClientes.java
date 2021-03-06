/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Cliente;
import model.PessoaFisica;
import model.PessoaJuridica;

/**
 *
 * @author Mateus
 */
public class FormClientes extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormClientes
     */
    public FormClientes() {
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

        buttonGroupTipoCliente = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        rbPF = new javax.swing.JRadioButton();
        rbPJ = new javax.swing.JRadioButton();
        lblCPF = new javax.swing.JLabel();
        txtCPF = new javax.swing.JFormattedTextField();
        lblCNPJ = new javax.swing.JLabel();
        txtCNPJ = new javax.swing.JFormattedTextField();
        btnSalvar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Formulario do cliente ");
        setPreferredSize(new java.awt.Dimension(600, 500));

        jLabel1.setText("Nome:");

        jLabel2.setText("Telefone");

        buttonGroupTipoCliente.add(rbPF);
        rbPF.setText("Pessoa Fisica ");
        rbPF.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbPFItemStateChanged(evt);
            }
        });

        buttonGroupTipoCliente.add(rbPJ);
        rbPJ.setText("Pessoa Juridica ");
        rbPJ.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbPJItemStateChanged(evt);
            }
        });

        lblCPF.setText("CPF:");
        lblCPF.setEnabled(false);

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.setEnabled(false);

        lblCNPJ.setText("CNPJ");
        lblCNPJ.setEnabled(false);

        try {
            txtCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCNPJ.setEnabled(false);

        btnSalvar.setText("Salvar ");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCNPJ)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rbPJ)
                    .addComponent(rbPF)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(txtNome))))
                .addContainerGap(89, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvar)
                .addGap(153, 153, 153))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(rbPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbPJ)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCPF)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCNPJ)
                    .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSalvar)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbPFItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbPFItemStateChanged

        verificarTipoPessoa(); 
    }//GEN-LAST:event_rbPFItemStateChanged

    private void rbPJItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbPJItemStateChanged
        verificarTipoPessoa(); 
    }//GEN-LAST:event_rbPJItemStateChanged

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        String nome = txtNome.getText();
        String fone = txtTelefone.getText();
        
        if( rbPF.isSelected() ){ //Pegando Oque o usuaria escrevel (isSelected)
            PessoaFisica ClientePF = new PessoaFisica();
            ClientePF.nome = nome;
            ClientePF.telefone = fone;
            ClientePF.CPF = txtCPF.getText();
        }else if( rbPJ.isSelected() ){
            PessoaJuridica ClientePJ = new PessoaJuridica();
            ClientePJ.nome = nome;
            ClientePJ.telefone = fone;
            ClientePJ.CNPJ = txtCPF.getText();
        }else{
            Cliente cliente = new Cliente();
            cliente.nome = nome;
            cliente.telefone = fone;
        }
    }//GEN-LAST:event_btnSalvarActionPerformed
        
    //capo de maracar e endentificara o que o usuario escrevel
    private void verificarTipoPessoa(){
        if( rbPF.isSelected() ){ //Pegando Oque o usuaria escrevel (isSelected)
            
            lblCPF.setEnabled( true );
            txtCPF.setEnabled( true );
            lblCPF.setVisible( true );
            txtCPF.setVisible( true );
            
            lblCNPJ.setEnabled( false );
            txtCNPJ.setEnabled( false );
            lblCNPJ.setVisible( false );
            txtCNPJ.setVisible( false );
            
        }else if(rbPJ.isSelected()){
            
            lblCPF.setEnabled( false );
            txtCPF.setEnabled( false );
            lblCPF.setVisible( false );
            txtCPF.setVisible( false );
            
            lblCNPJ.setEnabled( true );
            txtCNPJ.setEnabled( true );
            lblCNPJ.setVisible( true );
            txtCNPJ.setVisible( true );
            
        }else{
            
            lblCPF.setEnabled( false );
            txtCPF.setEnabled( false );
            lblCPF.setVisible( false );
            txtCPF.setVisible( false );
            
            lblCNPJ.setEnabled( false );
            txtCNPJ.setEnabled( false );
            lblCNPJ.setVisible( false );
            txtCNPJ.setVisible( false );
            
        }
    } 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.ButtonGroup buttonGroupTipoCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblCNPJ;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JRadioButton rbPF;
    private javax.swing.JRadioButton rbPJ;
    private javax.swing.JFormattedTextField txtCNPJ;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
