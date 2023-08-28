package CiklicnaMatrica;

public class Ciklicna extends javax.swing.JFrame {
    private int red;
    private int stupac;
    private int[][] matrica;
   
    public Ciklicna() {
        initComponents(); 
        setVisible(true);        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtRedovi = new javax.swing.JTextField();
        txtStupci = new javax.swing.JTextField();
        lblRedovi = new javax.swing.JLabel();
        lblStupci = new javax.swing.JLabel();
        btnKreiranjeTablice = new javax.swing.JButton();
        txtRjesenje = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ciklična Matrica");
        setResizable(false);

        lblRedovi.setText("Unesi broj redova");

        lblStupci.setText("Unesi broj stupaca");

        btnKreiranjeTablice.setText("Kreiraj Tablicu");
        btnKreiranjeTablice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKreiranjeTabliceActionPerformed(evt);
            }
        });

        txtRjesenje.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblRedovi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtRedovi)
                    .addComponent(txtStupci)
                    .addComponent(lblStupci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnKreiranjeTablice, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addComponent(txtRjesenje, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lblRedovi)
                        .addGap(12, 12, 12)
                        .addComponent(txtRedovi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(lblStupci)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtStupci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btnKreiranjeTablice))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(txtRjesenje, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKreiranjeTabliceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKreiranjeTabliceActionPerformed
        
		red = Integer.parseInt(txtRedovi.getText());
                stupac = Integer.parseInt(txtStupci.getText()); 
                matrica = new int[red][stupac];

		int b = 1;

		int redmin = 1;
		int stupacmin = 1;

		int redmax = red;
		int stupacmax = stupac;

		while (b <= red * stupac) {

			for (int i = stupacmin; i <= stupacmax; i++) {
				if (b > red * stupac) {
					break;
				} else {
					matrica[red - redmin][stupac - i] = b++;
				}

			}

			redmin++;

			for (int i = red - redmin; i >= red - redmax; i--) {

				if (b > red * stupac) {
					break;
				} else {
					matrica[i][stupac - stupacmax] = b++;
				}
			}

			stupacmax--;

			for (int i = stupacmin; i <= stupac - stupacmin; i++) {

				if (b > red * stupac) {
					break;
				} else {
					matrica[red - redmax][i] = b++;
				}
			}

			redmax--;

			for (int i = red - redmax; i <= red - redmin; i++) {

				if (b > red * stupac) {
					break;
				} else {
					matrica[i][stupac - stupacmin] = b++;
				}
			}

			stupacmin++;

		}
                
                txtRjesenje.setText("???");
        
    }//GEN-LAST:event_btnKreiranjeTabliceActionPerformed

    void Rjesenje() {
        
        for (int i = 0; i < red; i++) {
            for (int j = 0; j < stupac; j++) {
		System.out.println(matrica[i][j] + "\t");
	}
		System.out.println();
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKreiranjeTablice;
    private javax.swing.JLabel lblRedovi;
    private javax.swing.JLabel lblStupci;
    private javax.swing.JTextField txtRedovi;
    private javax.swing.JTextField txtRjesenje;
    private javax.swing.JTextField txtStupci;
    // End of variables declaration//GEN-END:variables
}
