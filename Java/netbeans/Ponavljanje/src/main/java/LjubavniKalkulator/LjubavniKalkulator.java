/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package LjubavniKalkulator;

/**
 *
 * @author Denis
 */
public class LjubavniKalkulator extends javax.swing.JFrame {

    /**
     * Creates new form LjubavniKalkulator
     */
    public LjubavniKalkulator() {
        initComponents();
    }
    
    static int[] stvaranjeMatrice(String ime1, String ime2) {

		String manji = ime1.length() < ime2.length() ? ime1.toLowerCase() : ime2.toLowerCase();
		String veci = ime1.length() < ime2.length() ? ime2.toLowerCase() : ime1.toLowerCase();

		String ime = manji + veci;

		int[] imena = new int[ime.length()];

		for (int i = 0; i < ime.length(); i++) {
			for (int j = 0; j < ime.length(); j++) {
				if (ime.charAt(i) == ime.charAt(j)) {
					imena[i] += 1;
				}
			}
		}
		
		imena = razdvajanjeDvoznamenkastih(imena);

		int[] matrica = new int[veci.length()];

		for (int i = 0; i < matrica.length; i++) {
			if (manji.toCharArray().length > i) {
				matrica[i] += imena[i];
			}

			if (veci.toCharArray().length > i) {
				matrica[i] += imena[imena.length - 1 - i];
			}
		}
		return razdvajanjeDvoznamenkastih(matrica);
	}

	static int[] analiza(int[] niz) {

		if (niz.length <= 2) {
			return niz;
		} else {
			if (niz.length % 2 == 0) {
				int[] zbroj = new int[niz.length / 2];

				for (int i = 0; i < niz.length; i++) {

					if (i < niz.length - 1 - i) {
						zbroj[i] = niz[i] + niz[niz.length - 1 - i];
					}

				}

				return analiza(razdvajanjeDvoznamenkastih(zbroj));

			} else {
				int[] zbroj = new int[(niz.length / 2) + 1];

				for (int i = 0; i < niz.length; i++) {

					if (i < niz.length - 1 - i) {

						zbroj[i] = niz[i] + niz[niz.length - 1 - i];
					}

					if (niz[i] == niz[niz.length - 1 - i]) {
						zbroj[i] = niz[i];
						break;
					}

				}

				return analiza(razdvajanjeDvoznamenkastih(zbroj));

			}

		}

	}

	static int[] razdvajanjeDvoznamenkastih(int[] niz) {

		int brojac = 0;
		for (int i : niz) {
			if (i >= 10) {
				brojac++;
			}
		}

		int[] pomocnaMatrica = new int[niz.length + brojac];

		for (int i = 0, j = 0; i < niz.length; i++) {
			if (niz[i] < 10) {
				pomocnaMatrica[j++] = niz[i];
			} else {
				pomocnaMatrica[j++] = niz[i] / 10;
				pomocnaMatrica[j++] = niz[i] % 10;
			}
		}

		return pomocnaMatrica;
	}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPrvoIme = new javax.swing.JTextField();
        lblDrugoIme = new javax.swing.JTextField();
        btnRacun = new javax.swing.JButton();
        lblRezultat = new javax.swing.JLabel();
        lblDrugiTekst = new javax.swing.JLabel();
        lblPrviTekst = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ljubavni Kalkulator");
        setPreferredSize(new java.awt.Dimension(500, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        btnRacun.setText("Izračunaj");
        btnRacun.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnRacun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRacunActionPerformed(evt);
            }
        });

        lblRezultat.setForeground(new java.awt.Color(204, 0, 51));
        lblRezultat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblDrugiTekst.setText("Upiši ime simpatije");

        lblPrviTekst.setText("Upiši svoje ime");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRezultat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPrvoIme, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 225, Short.MAX_VALUE)
                        .addComponent(lblDrugoIme, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPrviTekst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(147, 147, 147)
                        .addComponent(lblDrugiTekst, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))))
            .addGroup(layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(btnRacun)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDrugiTekst, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrviTekst, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrvoIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDrugoIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(btnRacun)
                .addGap(50, 50, 50)
                .addComponent(lblRezultat, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRacunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRacunActionPerformed
        // TODO add your handling code here:
                String ime1 = lblPrvoIme.getText();
		String ime2 = lblDrugoIme.getText();
		String konacno = "";

		for (int i : analiza(stvaranjeMatrice(ime1, ime2))) {
			konacno += i;
		}
                
                if(ime1.isEmpty() || ime2.isEmpty()){
                    lblRezultat.setText("Potrebno je upisati imena u predviđena polja!");
                } else {
                    lblRezultat.setText(ime1 + " i " + ime2 + " vole se " + konacno + "% !");
                }                    
                
                    
                
                    
		
		
        
    }//GEN-LAST:event_btnRacunActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRacun;
    private javax.swing.JLabel lblDrugiTekst;
    private javax.swing.JTextField lblDrugoIme;
    private javax.swing.JLabel lblPrviTekst;
    private javax.swing.JTextField lblPrvoIme;
    private javax.swing.JLabel lblRezultat;
    // End of variables declaration//GEN-END:variables
}
