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
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Samuel
 */
public class RentWindow extends javax.swing.JInternalFrame {

    /**
     * Creates new form RentWindow
     */
    
    private final RentController controller;
    private Book chosenBook;
    private User chosenUser; 
    
    public RentWindow(Book chosenBook, User chosenUser) {
        initComponents();
        
        this.chosenBook = chosenBook;
        this.chosenUser = chosenUser;
        
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

        jButtonChooseBook = new javax.swing.JButton();
        jPanelBookChosenBook = new javax.swing.JPanel();
        jPanelChosenRenter = new javax.swing.JPanel();
        jButtonCancel = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButtonRent = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaObservation = new javax.swing.JTextArea();
        jPanelRentDetails = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jFormattedTextFieldRentDate = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jFormattedTextFieldReturnDate = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldPenalty = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonChooseRenter = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jButtonChooseBook.setText("Escolher Livro");
        jButtonChooseBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChooseBookActionPerformed(evt);
            }
        });

        jPanelBookChosenBook.setPreferredSize(new java.awt.Dimension(200, 275));

        jPanelChosenRenter.setPreferredSize(new java.awt.Dimension(200, 275));

        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel7.setText("Observaçao");

        jButtonRent.setText("Alugar");
        jButtonRent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRentActionPerformed(evt);
            }
        });

        jTextAreaObservation.setColumns(20);
        jTextAreaObservation.setRows(5);
        jScrollPane1.setViewportView(jTextAreaObservation);

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                                .addComponent(jTextFieldPenalty, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)))))
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

        jLabel1.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel1.setText("Aluguel");

        jButtonChooseRenter.setText("Escolher Alugador");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButtonChooseBook)
                        .addGap(430, 430, 430)
                        .addComponent(jButtonChooseRenter))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanelBookChosenBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelRentDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(jLabel7)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanelChosenRenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(261, 261, 261)
                        .addComponent(jButtonRent, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonChooseBook)
                    .addComponent(jButtonChooseRenter))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelBookChosenBook, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelRentDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel7))
                    .addComponent(jPanelChosenRenter, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCancel)
                    .addComponent(jButtonRent))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonChooseBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChooseBookActionPerformed
        controller.chooseBook();
    }//GEN-LAST:event_jButtonChooseBookActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonRentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRentActionPerformed


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
    private javax.swing.JPanel jPanelChosenRenter;
    private javax.swing.JPanel jPanelRentDetails;
    private javax.swing.JScrollPane jScrollPane1;
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
}
