/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Rent;

import Controller.Rent.RentController;
import Model.Book;
import Model.User;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;

/**
 *
 * @author Samuel
 */
public class RentView extends javax.swing.JDialog {

    /**
     * Creates new form Rent
     */
    
    private final RentController controller;
    private Book chosenBook;
    private User chosenUser; 
    
    public RentView(java.awt.Frame parent, boolean modal, Book chosenBook, User chosedUser) {
        super(parent, modal);
        initComponents();
        
        this.controller = new RentController(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPaneUserSearch = new javax.swing.JScrollPane();
        jScrollPaneBookSearch = new javax.swing.JScrollPane();
        jPanelBookSearch = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonChooseRenter = new javax.swing.JButton();
        jButtonChooseBook = new javax.swing.JButton();
        jPanelBookChosenBook = new javax.swing.JPanel();
        jPanelChosenRenter = new javax.swing.JPanel();
        jButtonCancel = new javax.swing.JButton();
        jButtonRent = new javax.swing.JButton();
        jPanelRentDetails = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jFormattedTextFieldRentDate = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jFormattedTextFieldReturnDate = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldPenalty = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaObservation = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jScrollPaneUserSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 210, 330));

        javax.swing.GroupLayout jPanelBookSearchLayout = new javax.swing.GroupLayout(jPanelBookSearch);
        jPanelBookSearch.setLayout(jPanelBookSearchLayout);
        jPanelBookSearchLayout.setHorizontalGroup(
            jPanelBookSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 197, Short.MAX_VALUE)
        );
        jPanelBookSearchLayout.setVerticalGroup(
            jPanelBookSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );

        jScrollPaneBookSearch.setViewportView(jPanelBookSearch);

        getContentPane().add(jScrollPaneBookSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 200, 330));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel1.setText("Aluguel");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 23, -1, -1));

        jButtonChooseRenter.setText("Escolher Alugador");
        getContentPane().add(jButtonChooseRenter, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 58, -1, -1));

        jButtonChooseBook.setText("Escolher Livro");
        jButtonChooseBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChooseBookActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonChooseBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 58, -1, -1));

        jPanelBookChosenBook.setPreferredSize(new java.awt.Dimension(200, 275));

        javax.swing.GroupLayout jPanelBookChosenBookLayout = new javax.swing.GroupLayout(jPanelBookChosenBook);
        jPanelBookChosenBook.setLayout(jPanelBookChosenBookLayout);
        jPanelBookChosenBookLayout.setHorizontalGroup(
            jPanelBookChosenBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanelBookChosenBookLayout.setVerticalGroup(
            jPanelBookChosenBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelBookChosenBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 102, -1, 280));

        jPanelChosenRenter.setPreferredSize(new java.awt.Dimension(200, 275));

        javax.swing.GroupLayout jPanelChosenRenterLayout = new javax.swing.GroupLayout(jPanelChosenRenter);
        jPanelChosenRenter.setLayout(jPanelChosenRenterLayout);
        jPanelChosenRenterLayout.setHorizontalGroup(
            jPanelChosenRenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanelChosenRenterLayout.setVerticalGroup(
            jPanelChosenRenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelChosenRenter, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 102, -1, 280));

        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 524, 221, -1));

        jButtonRent.setText("Alugar");
        jButtonRent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRentActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRent, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 524, 193, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel2.setText("Detalhes");

        jLabel3.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel3.setText("Alugado: ");

        try {
            jFormattedTextFieldRentDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel5.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel5.setText("Devoluçao: ");

        try {
            jFormattedTextFieldReturnDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel6.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel6.setText("Penalidade: ");

        jLabel8.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel8.setText("R$");

        jTextFieldPenalty.setText("1.00");

        javax.swing.GroupLayout jPanelRentDetailsLayout = new javax.swing.GroupLayout(jPanelRentDetails);
        jPanelRentDetails.setLayout(jPanelRentDetailsLayout);
        jPanelRentDetailsLayout.setHorizontalGroup(
            jPanelRentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRentDetailsLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel2)
                .addContainerGap(105, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRentDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRentDetailsLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(1, 1, 1)
                        .addComponent(jFormattedTextFieldRentDate))
                    .addGroup(jPanelRentDetailsLayout.createSequentialGroup()
                        .addGroup(jPanelRentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelRentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextFieldReturnDate)
                            .addGroup(jPanelRentDetailsLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldPenalty)))))
                .addContainerGap())
        );
        jPanelRentDetailsLayout.setVerticalGroup(
            jPanelRentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRentDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addGroup(jPanelRentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jFormattedTextFieldRentDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelRentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jFormattedTextFieldReturnDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanelRentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldPenalty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelRentDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 102, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel7.setText("Observaçao");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 360, -1, -1));

        jTextAreaObservation.setColumns(20);
        jTextAreaObservation.setRows(5);
        jScrollPane1.setViewportView(jTextAreaObservation);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 394, 675, 112));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonRentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRentActionPerformed

    private void jButtonChooseBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChooseBookActionPerformed
        controller.chooseBook();
    }//GEN-LAST:event_jButtonChooseBookActionPerformed

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
            java.util.logging.Logger.getLogger(RentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RentView dialog = new RentView(new javax.swing.JFrame(), true, null, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonChooseBook;
    private javax.swing.JButton jButtonChooseRenter;
    private javax.swing.JButton jButtonRent;
    private javax.swing.JFormattedTextField jFormattedTextFieldRentDate;
    private javax.swing.JFormattedTextField jFormattedTextFieldReturnDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanelBookChosenBook;
    private javax.swing.JPanel jPanelBookSearch;
    private javax.swing.JPanel jPanelChosenRenter;
    private javax.swing.JPanel jPanelRentDetails;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneBookSearch;
    private javax.swing.JScrollPane jScrollPaneUserSearch;
    private javax.swing.JTextArea jTextAreaObservation;
    private javax.swing.JTextField jTextFieldPenalty;
    // End of variables declaration//GEN-END:variables

    public JButton getjButtonCancel() {
        return jButtonCancel;
    }

    public void setjButtonCancel(JButton jButtonCancel) {
        this.jButtonCancel = jButtonCancel;
    }

    public JButton getjButtonChooseBook() {
        return jButtonChooseBook;
    }

    public void setjButtonChooseBook(JButton jButtonChooseBook) {
        this.jButtonChooseBook = jButtonChooseBook;
    }

    public JButton getjButtonChooseRenter() {
        return jButtonChooseRenter;
    }

    public void setjButtonChooseRenter(JButton jButtonChooseRenter) {
        this.jButtonChooseRenter = jButtonChooseRenter;
    }

    public JButton getjButtonRent() {
        return jButtonRent;
    }

    public void setjButtonRent(JButton jButtonRent) {
        this.jButtonRent = jButtonRent;
    }

    public JFormattedTextField getjFormattedTextFieldRentDate() {
        return jFormattedTextFieldRentDate;
    }

    public void setjFormattedTextFieldRentDate(JFormattedTextField jFormattedTextFieldRentDate) {
        this.jFormattedTextFieldRentDate = jFormattedTextFieldRentDate;
    }

    public JFormattedTextField getjFormattedTextFieldReturnDate() {
        return jFormattedTextFieldReturnDate;
    }

    public void setjFormattedTextFieldReturnDate(JFormattedTextField jFormattedTextFieldReturnDate) {
        this.jFormattedTextFieldReturnDate = jFormattedTextFieldReturnDate;
    }

    public JPanel getjPanelBookChosenBook() {
        return jPanelBookChosenBook;
    }

    public void setjPanelBookChosenBook(JPanel jPanelBookChosenBook) {
        this.jPanelBookChosenBook = jPanelBookChosenBook;
    }

    public JPanel getjPanelChosenRenter() {
        return jPanelChosenRenter;
    }

    public void setjPanelChosenRenter(JPanel jPanelChosenRenter) {
        this.jPanelChosenRenter = jPanelChosenRenter;
    }

    public JPanel getjPanelRentDetails() {
        return jPanelRentDetails;
    }

    public void setjPanelRentDetails(JPanel jPanelRentDetails) {
        this.jPanelRentDetails = jPanelRentDetails;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTextField getjTextFieldPenalty() {
        return jTextFieldPenalty;
    }

    public void setjTextFieldPenalty(JTextField jTextFieldPenalty) {
        this.jTextFieldPenalty = jTextFieldPenalty;
    }

    public JTextArea getjTextAreaObservation() {
        return jTextAreaObservation;
    }

    public void setjTextAreaObservation(JTextArea jTextAreaObservation) {
        this.jTextAreaObservation = jTextAreaObservation;
    }

    public Book getChosenBook() {
        return chosenBook;
    }

    public void setChosenBook(Book chosenBook) {
        this.chosenBook = chosenBook;
    }

    public User getChosenUser() {
        return chosenUser;
    }

    public void setChosenUser(User chosenUser) {
        this.chosenUser = chosenUser;
    }

    public JScrollPane getjScrollPaneBookSearch() {
        return jScrollPaneBookSearch;
    }

    public void setjScrollPaneBookSearch(JScrollPane jScrollPaneBookSearch) {
        this.jScrollPaneBookSearch = jScrollPaneBookSearch;
    }

    public JScrollPane getjScrollPaneUserSearch() {
        return jScrollPaneUserSearch;
    }

    public void setjScrollPaneUserSearch(JScrollPane jScrollPaneUserSearch) {
        this.jScrollPaneUserSearch = jScrollPaneUserSearch;
    }

    public JPanel getjPanelBookSearch() {
        return jPanelBookSearch;
    }

    public void setjPanelBookSearch(JPanel jPanelBookSearch) {
        this.jPanelBookSearch = jPanelBookSearch;
    }
    
    
   
}