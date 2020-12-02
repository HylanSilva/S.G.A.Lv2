/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Registers;

import Controller.Registers.BookRegistrationController;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

/**
 *
 * @author hylan
 */
public class BookRegistrationView extends javax.swing.JInternalFrame {

    private final BookRegistrationController controller;

    public BookRegistrationView() {

        initComponents();

        controller = new BookRegistrationController(this);
        controller.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtBookName = new javax.swing.JTextField();
        txtBookAuthor = new javax.swing.JTextField();
        txtBookPublisher = new javax.swing.JTextField();
        txtBookGenre = new javax.swing.JTextField();
        btnRegisterBook = new javax.swing.JButton();
        btnSearchBook = new javax.swing.JButton();
        btnUpdateBook = new javax.swing.JButton();
        btnDeleteBook = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jsBookStok = new javax.swing.JSpinner();
        jLabelImageBook = new javax.swing.JLabel();
        jLabelAcquisition = new javax.swing.JLabel();
        jFormattedTextFieldAcquisition = new javax.swing.JFormattedTextField();

        jToggleButton1.setText("jToggleButton1");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Oasis - Cadástro de Lívros");
        setToolTipText("");

        jLabel1.setText("Nome do Livro:");

        jLabel2.setText("Autor Livro:");

        jLabel3.setText("Editora do Livro:");

        jLabel4.setText("Genero do  Livro:");

        txtBookAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBookAuthorActionPerformed(evt);
            }
        });

        btnRegisterBook.setText("Cadastrar");
        btnRegisterBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterBookActionPerformed(evt);
            }
        });

        btnSearchBook.setText("Procurar");
        btnSearchBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchBookActionPerformed(evt);
            }
        });

        btnUpdateBook.setText("Alterar");
        btnUpdateBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateBookActionPerformed(evt);
            }
        });

        btnDeleteBook.setText("Deletar");
        btnDeleteBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteBookActionPerformed(evt);
            }
        });

        jLabel5.setText("Quantidade de livros:");

        jLabelImageBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/icons8-no-image-64px.png"))); // NOI18N
        jLabelImageBook.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelImageBookMouseMoved(evt);
            }
        });
        jLabelImageBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelImageBookMouseReleased(evt);
            }
        });

        jLabelAcquisition.setText("Data de aquisição:");

        jFormattedTextFieldAcquisition.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        jFormattedTextFieldAcquisition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldAcquisitionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBookName, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabelAcquisition)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtBookGenre, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                            .addComponent(txtBookPublisher, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                            .addComponent(jsBookStok, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jFormattedTextFieldAcquisition)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtBookAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelImageBook, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(btnRegisterBook)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearchBook)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdateBook)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteBook)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBookName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBookAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBookPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBookGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jsBookStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelAcquisition)
                            .addComponent(jFormattedTextFieldAcquisition, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabelImageBook, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegisterBook)
                    .addComponent(btnSearchBook)
                    .addComponent(btnUpdateBook)
                    .addComponent(btnDeleteBook))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterBookActionPerformed
        controller.newBook();
    }//GEN-LAST:event_btnRegisterBookActionPerformed

    private void btnSearchBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchBookActionPerformed

    }//GEN-LAST:event_btnSearchBookActionPerformed

    private void btnUpdateBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateBookActionPerformed

    }//GEN-LAST:event_btnUpdateBookActionPerformed

    private void btnDeleteBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteBookActionPerformed

    }//GEN-LAST:event_btnDeleteBookActionPerformed

    private void txtBookAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBookAuthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBookAuthorActionPerformed

    private void jLabelImageBookMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImageBookMouseReleased
        controller.chooseImage();
    }//GEN-LAST:event_jLabelImageBookMouseReleased

    private void jLabelImageBookMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImageBookMouseMoved
        controller.resize(jLabelImageBook);
    }//GEN-LAST:event_jLabelImageBookMouseMoved

    private void jFormattedTextFieldAcquisitionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldAcquisitionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldAcquisitionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteBook;
    private javax.swing.JButton btnRegisterBook;
    private javax.swing.JButton btnSearchBook;
    private javax.swing.JButton btnUpdateBook;
    private javax.swing.JFormattedTextField jFormattedTextFieldAcquisition;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelAcquisition;
    private javax.swing.JLabel jLabelImageBook;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JSpinner jsBookStok;
    private javax.swing.JTextField txtBookAuthor;
    private javax.swing.JTextField txtBookGenre;
    private javax.swing.JTextField txtBookName;
    private javax.swing.JTextField txtBookPublisher;
    // End of variables declaration//GEN-END:variables

    public JTextField gettxtBookAuthor() {
        return txtBookAuthor;
    }

    public void settxtBookAuthor(JTextField txtBookAuthor) {
        this.txtBookAuthor = txtBookAuthor;
    }

    public JTextField gettxtBookGenre() {
        return txtBookGenre;
    }

    public void settxtBookGenre(JTextField txtBookGenre) {
        this.txtBookGenre = txtBookGenre;
    }

    public JTextField gettxtBookName() {
        return txtBookName;
    }

    public void settextBookName(JTextField txtBookName) {
        this.txtBookName = txtBookName;
    }

    public JTextField gettxtBookPublisher() {
        return txtBookPublisher;
    }

    public void settextBookPublisher(JTextField txtBookPublisher) {
        this.txtBookPublisher = txtBookPublisher;
    }

    public JButton getbtnRegisterBook() {
        return btnRegisterBook;
    }

    public void setbtnRegisterBook(JButton btnRegisterBook) {
        this.btnRegisterBook = btnRegisterBook;
    }

    public JButton getbtnSearchBook() {
        return btnSearchBook;
    }

    public void setbtnSearchBook(JButton btnSearchBook) {
        this.btnSearchBook = btnSearchBook;
    }

    public JButton getbtnUpdateBook() {
        return btnUpdateBook;
    }

    public void setbtnUpdateBook(JButton btnUpdateBook) {
        this.btnUpdateBook = btnUpdateBook;
    }

    public JButton getbtnDeleteBook() {
        return btnDeleteBook;
    }

    public void setbtnDeleteBook(JButton btnDeleteBoook) {
        this.btnDeleteBook = btnDeleteBoook;
    }

    public JSpinner getJsBookStok() {
        return jsBookStok;
    }

    public void setJsBookStok(JSpinner jsBookStok) {
        this.jsBookStok = jsBookStok;

    }

    public JButton getBtnDeleteBook() {
        return btnDeleteBook;
    }

    public void setBtnDeleteBook(JButton btnDeleteBook) {
        this.btnDeleteBook = btnDeleteBook;
    }

    public JButton getBtnRegisterBook() {
        return btnRegisterBook;
    }

    public void setBtnRegisterBook(JButton btnRegisterBook) {
        this.btnRegisterBook = btnRegisterBook;
    }

    public JButton getBtnSearchBook() {
        return btnSearchBook;
    }

    public void setBtnSearchBook(JButton btnSearchBook) {
        this.btnSearchBook = btnSearchBook;
    }

    public JButton getBtnUpdateBook() {
        return btnUpdateBook;
    }

    public void setBtnUpdateBook(JButton btnUpdateBook) {
        this.btnUpdateBook = btnUpdateBook;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JLabel getjLabelImageBook() {
        return jLabelImageBook;
    }

    public void setjLabelImageBook(JLabel jLabelImageBook) {
        this.jLabelImageBook = jLabelImageBook;
    }

    public JToggleButton getjToggleButton1() {
        return jToggleButton1;
    }

    public void setjToggleButton1(JToggleButton jToggleButton1) {
        this.jToggleButton1 = jToggleButton1;
    }

    public JTextField getTxtBookAuthor() {
        return txtBookAuthor;
    }

    public void setTxtBookAuthor(JTextField txtBookAuthor) {
        this.txtBookAuthor = txtBookAuthor;
    }

    public JTextField getTxtBookGenre() {
        return txtBookGenre;
    }

    public void setTxtBookGenre(JTextField txtBookGenre) {
        this.txtBookGenre = txtBookGenre;
    }

    public JTextField getTxtBookName() {
        return txtBookName;
    }

    public void setTxtBookName(JTextField txtBookName) {
        this.txtBookName = txtBookName;
    }

    public JTextField getTxtBookPublisher() {
        return txtBookPublisher;
    }

    public void setTxtBookPublisher(JTextField txtBookPublisher) {
        this.txtBookPublisher = txtBookPublisher;
    }

    public JFormattedTextField getjFormattedTextFieldAcquisition() {
        return jFormattedTextFieldAcquisition;
    }

    public void setjFormattedTextFieldAcquisition(JFormattedTextField jFormattedTextFieldAcquisition) {
        this.jFormattedTextFieldAcquisition = jFormattedTextFieldAcquisition;
    }

    public JLabel getjLabelAcquisition() {
        return jLabelAcquisition;
    }

    public void setjLabelAcquisition(JLabel jLabelAcquisition) {
        this.jLabelAcquisition = jLabelAcquisition;
    }
}
