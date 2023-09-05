/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package currnecyconverter;

/**
 *
 * @author Denis
 */
public class MyCurrencyConverter extends javax.swing.JFrame {

    double euro = 1.17;
    double dollar = 1.26;
    double won = 1663.62;
    double franc = 1.12;
    double yen = 184.84;

    /**
     * Creates new form MyCurrencyConverter
     */
    public MyCurrencyConverter() {
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

        cmbFirstCurrency = new javax.swing.JComboBox<>();
        cmbSecondCurrency = new javax.swing.JComboBox<>();
        txtSecondAmount = new javax.swing.JTextField();
        txtFirstAmount = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        btnConvert = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Currency Converter");
        setResizable(false);

        cmbFirstCurrency.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose option...", "Euro", "US Dollar", "South Korean won", "Swiss Franc", "Japanese Yen" }));
        cmbFirstCurrency.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbFirstCurrencyItemStateChanged(evt);
            }
        });

        cmbSecondCurrency.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose option...", "Euro", "US Dollar", "South Korean won", "Swiss Franc", "Japanese Yen" }));
        cmbSecondCurrency.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbSecondCurrencyItemStateChanged(evt);
            }
        });

        txtSecondAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSecondAmountActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Currency Converter");

        btnConvert.setText("Convert");
        btnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConvert)
                        .addGap(177, 177, 177)
                        .addComponent(btnReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                        .addComponent(btnExit))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFirstAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbFirstCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(224, 224, 224)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSecondAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbSecondCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(83, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbFirstCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSecondCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSecondAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFirstAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConvert)
                    .addComponent(btnReset)
                    .addComponent(btnExit))
                .addGap(72, 72, 72))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSecondAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSecondAmountActionPerformed

    }//GEN-LAST:event_txtSecondAmountActionPerformed

    private void cmbFirstCurrencyItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbFirstCurrencyItemStateChanged

    }//GEN-LAST:event_cmbFirstCurrencyItemStateChanged

    private void cmbSecondCurrencyItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbSecondCurrencyItemStateChanged
    }//GEN-LAST:event_cmbSecondCurrencyItemStateChanged

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertActionPerformed

        double amountToChange = Double.parseDouble(txtFirstAmount.getText());

        double amountInPounds = 0;

        switch (cmbFirstCurrency.getSelectedItem().toString()) {

            case "Euro":
                amountInPounds = amountToChange / euro;
                break;

            case "US Dollar":
                amountInPounds = amountToChange / dollar;
                break;

            case "South Korean won":
                amountInPounds = amountToChange / won;
                break;

            case "Japanese Yen":
                amountInPounds = amountToChange / yen;
                break;

            case "Swiss Franc":
                amountInPounds = amountToChange / franc;
                break;

            default:
                amountInPounds = 0;
        }

        double amountChanged = 0;
        switch (cmbSecondCurrency.getSelectedItem().toString()) {
            case "Euro":
                amountChanged = amountInPounds * euro;
                break;
            case "US Dollar":
                amountChanged = amountInPounds * dollar;
                break;
            case "South Korean won":
                amountChanged = amountInPounds * won;
                break;
            case "Japanese Yen":
                amountChanged = amountInPounds * yen;
                break;
            case "Swiss Franc":
                amountChanged = amountInPounds * franc;
                break;
            default:
                amountChanged = 0;
        }
        
        String value = String.format("%.3f", amountChanged);
        txtSecondAmount.setText(value);


    }//GEN-LAST:event_btnConvertActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        
        cmbFirstCurrency.setSelectedIndex(0);
        cmbSecondCurrency.setSelectedIndex(0);
        txtFirstAmount.setText(null);
        txtSecondAmount.setText(null);
    }//GEN-LAST:event_btnResetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvert;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox<String> cmbFirstCurrency;
    private javax.swing.JComboBox<String> cmbSecondCurrency;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtFirstAmount;
    private javax.swing.JTextField txtSecondAmount;
    // End of variables declaration//GEN-END:variables
}