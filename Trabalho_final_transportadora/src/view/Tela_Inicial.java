/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Mateus
 */
public class Tela_Inicial extends javax.swing.JFrame {

    /**
     * Creates new form Tela_Inicial
     */
    public Tela_Inicial() {
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

        jdpPainel = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        MenuItemCFuncionario = new javax.swing.JMenuItem();
        MenuItemCCaminhao = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        MenuItemLFuncionario = new javax.swing.JMenuItem();
        MenuItemLCaminhao = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jdpPainelLayout = new javax.swing.GroupLayout(jdpPainel);
        jdpPainel.setLayout(jdpPainelLayout);
        jdpPainelLayout.setHorizontalGroup(
            jdpPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 629, Short.MAX_VALUE)
        );
        jdpPainelLayout.setVerticalGroup(
            jdpPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
        );

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenu1.setText("Menu ");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cadastrar");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        MenuItemCFuncionario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MenuItemCFuncionario.setText("Cadastrar funcionário");
        MenuItemCFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemCFuncionarioActionPerformed(evt);
            }
        });
        jMenu2.add(MenuItemCFuncionario);

        MenuItemCCaminhao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MenuItemCCaminhao.setText("Cadastrar caminhão ");
        MenuItemCCaminhao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemCCaminhaoActionPerformed(evt);
            }
        });
        jMenu2.add(MenuItemCCaminhao);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Informações");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        MenuItemLFuncionario.setText("Listar funcionário ");
        jMenu3.add(MenuItemLFuncionario);

        MenuItemLCaminhao.setText("Listar caminhão ");
        jMenu3.add(MenuItemLCaminhao);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPainel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPainel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItemCCaminhaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemCCaminhaoActionPerformed
        
        CadastroCaminhao tela = new CadastroCaminhao();
        jdpPainel.add( tela );
        tela.setVisible( true );
        
    }//GEN-LAST:event_MenuItemCCaminhaoActionPerformed

    private void MenuItemCFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemCFuncionarioActionPerformed
     
        CadastraFuncionario tela = new CadastraFuncionario();
        jdpPainel.add( tela );
        tela.setVisible( true );
        
    }//GEN-LAST:event_MenuItemCFuncionarioActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuItemCCaminhao;
    private javax.swing.JMenuItem MenuItemCFuncionario;
    private javax.swing.JMenuItem MenuItemLCaminhao;
    private javax.swing.JMenuItem MenuItemLFuncionario;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDesktopPane jdpPainel;
    // End of variables declaration//GEN-END:variables
}
