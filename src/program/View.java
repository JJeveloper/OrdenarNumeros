package program;

import java.util.Arrays;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author JJAB
 */
public class View extends javax.swing.JFrame {

    private int numerosdesordenados[];

    public View() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        jTextArea1.setLineWrap(true);
        jTextArea2.setLineWrap(true);
        btnBurbuja.setEnabled(false);
        btnSeleccion.setEnabled(false);
        btnInsercion.setEnabled(false);
        btnQuickSort.setEnabled(false);
        btnBorrar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCantidaddeNumeros = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtIniciodeRango = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFindeRango = new javax.swing.JTextField();
        btnGenerar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        btnBurbuja = new javax.swing.JButton();
        btnInsercion = new javax.swing.JButton();
        btnQuickSort = new javax.swing.JButton();
        btnSeleccion = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Ingrese La cantidad de Numeros");

        txtCantidaddeNumeros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidaddeNumerosKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtCantidaddeNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCantidaddeNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Ingrese Rango de Numeros de");

        txtIniciodeRango.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIniciodeRangoKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Hasta");

        txtFindeRango.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFindeRangoKeyTyped(evt);
            }
        });

        btnGenerar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addComponent(txtIniciodeRango, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtFindeRango, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGenerar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIniciodeRango, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(txtFindeRango, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnGenerar))
                    .addComponent(jLabel2))
                .addGap(4, 4, 4))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(5, 5, 5))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));

        btnBurbuja.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnBurbuja.setText("Burbuja");
        btnBurbuja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBurbujaActionPerformed(evt);
            }
        });

        btnInsercion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnInsercion.setText("Insercion");
        btnInsercion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsercionActionPerformed(evt);
            }
        });

        btnQuickSort.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnQuickSort.setText("QuickSort");
        btnQuickSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuickSortActionPerformed(evt);
            }
        });

        btnSeleccion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSeleccion.setText("Seleccion");
        btnSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionActionPerformed(evt);
            }
        });

        btnBorrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBurbuja)
                .addGap(12, 12, 12)
                .addComponent(btnSeleccion)
                .addGap(12, 12, 12)
                .addComponent(btnInsercion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnQuickSort)
                .addGap(12, 12, 12)
                .addComponent(btnBorrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBurbuja)
                    .addComponent(btnInsercion)
                    .addComponent(btnQuickSort)
                    .addComponent(btnSeleccion)
                    .addComponent(btnBorrar))
                .addGap(5, 5, 5))
        );

        jScrollPane2.setViewportBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 975, Short.MAX_VALUE)
                        .addGap(5, 5, 5))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(3, 3, 3))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCantidaddeNumerosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidaddeNumerosKeyTyped
        int n = evt.getKeyChar();
        boolean numeros = n >= 48 && n <= 57;
        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidaddeNumerosKeyTyped

    private void txtIniciodeRangoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIniciodeRangoKeyTyped
        int n = evt.getKeyChar();
        boolean numeros = n >= 48 && n <= 57;
        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_txtIniciodeRangoKeyTyped

    private void txtFindeRangoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFindeRangoKeyTyped
        int n = evt.getKeyChar();
        boolean numeros = n >= 48 && n <= 57;
        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_txtFindeRangoKeyTyped

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed

        if (!txtCantidaddeNumeros.getText().isEmpty() && !txtIniciodeRango.getText().isEmpty() && !txtFindeRango.getText().isEmpty()) {

            int cantidad = Integer.parseInt(txtCantidaddeNumeros.getText());
            int inicio = Integer.parseInt(txtIniciodeRango.getText());
            int fin = Integer.parseInt(txtFindeRango.getText());

            //hacer un intercambio de valores en caso que inicio sea mayor que fin        
            int aux;
            if (inicio > fin) {
                aux = inicio;
                inicio = fin;
                fin = aux;
            }

            if (cantidad > 1 && cantidad <= 1000) {

                if (inicio >= 1 && fin <= 1000) {

                    numerosdesordenados = new int[cantidad];

                    Random r = new Random();
                    for (int i = 0; i < cantidad; i++) {
                        numerosdesordenados[i] = r.nextInt(inicio, fin + 1);
                    }

                    jTextArea1.setText(Arrays.toString(numerosdesordenados));

                    btnBurbuja.setEnabled(true);
                    btnSeleccion.setEnabled(true);
                    btnInsercion.setEnabled(true);
                    btnQuickSort.setEnabled(true);  
                    jTextArea2.setText("");

                } else {
                    JOptionPane.showMessageDialog(this, "Rango de Numeros de 1 a 1000 !!!", "Campos vacios", JOptionPane.INFORMATION_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(this, "Cantidad de numeros de 2 a 1000 !!!", "Intente Nuevamente", JOptionPane.INFORMATION_MESSAGE);
            }

        } else {

            JOptionPane.showMessageDialog(this, "LLene Todos Los Campos !!!", "Campos vacios", JOptionPane.INFORMATION_MESSAGE);

        }


    }//GEN-LAST:event_btnGenerarActionPerformed

    public void numerosOrdenados(int ordenar[]) {
        jTextArea2.setText(Arrays.toString(ordenar));
    }

    private void btnBurbujaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBurbujaActionPerformed

        int aux;
        //clonar el array principal al array burbuja para no alterar el principal
        int burbuja[] = numerosdesordenados.clone();

        for (int i = 0; i < burbuja.length - 1; i++) {

            for (int j = 0; j < burbuja.length - 1; j++) {

                if (burbuja[j] > burbuja[j + 1]) {
                    aux = burbuja[j + 1];
                    burbuja[j + 1] = burbuja[j];
                    burbuja[j] = aux;
                }

            }
        }

        numerosOrdenados(burbuja);

        apagarBoton(btnSeleccion, btnInsercion, btnQuickSort);
        btnBorrar.setEnabled(true);
    }//GEN-LAST:event_btnBurbujaActionPerformed

    private void btnSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionActionPerformed

        int aux, menor;
        int seleccion[] = numerosdesordenados.clone();

        for (int i = 0; i < seleccion.length; i++) {
            menor = i;
            for (int j = i + 1; j < seleccion.length; j++) {
                if (seleccion[j] < seleccion[menor]) {
                    menor = j;
                }
            }
            aux = seleccion[i];
            seleccion[i] = seleccion[menor];
            seleccion[menor] = aux;
        }
        
        numerosOrdenados(seleccion);
        
        apagarBoton(btnBurbuja, btnInsercion, btnQuickSort);
        btnBorrar.setEnabled(true);
    }//GEN-LAST:event_btnSeleccionActionPerformed

    private void btnInsercionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsercionActionPerformed

        int aux, posicion;
        int insercion[] = numerosdesordenados.clone();

        for (int i = 0; i < insercion.length; i++) {
            posicion = i;
            aux = insercion[i];

            while ((posicion > 0) && (insercion[posicion - 1] > aux)) {
                insercion[posicion] = insercion[posicion - 1];
                posicion--;
            }
            insercion[posicion] = aux;
        }

        numerosOrdenados(insercion);
        
        apagarBoton(btnBurbuja, btnSeleccion, btnQuickSort);
        btnBorrar.setEnabled(true);
    }//GEN-LAST:event_btnInsercionActionPerformed

    private void btnQuickSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuickSortActionPerformed
        int quicksort[] = numerosdesordenados.clone();

        algoritmoQuickSort(quicksort, 0, quicksort.length - 1);

        numerosOrdenados(quicksort);
        
        apagarBoton(btnBurbuja, btnSeleccion, btnInsercion);
        btnBorrar.setEnabled(true);
    }//GEN-LAST:event_btnQuickSortActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        jTextArea2.setText("");
        btnBurbuja.setEnabled(true);
        btnSeleccion.setEnabled(true);
        btnInsercion.setEnabled(true); 
        btnQuickSort.setEnabled(true);
    }//GEN-LAST:event_btnBorrarActionPerformed

    public void apagarBoton(JButton a, JButton b, JButton c){
        a.setEnabled(false);
        b.setEnabled(false);
        c.setEnabled(false);        
    }
    
    
    public void algoritmoQuickSort(int quickSort[], int inicio, int fin) {
        int pivote = quickSort[inicio];


        int i = inicio;
        int j = fin;
        int aux;

        while (i < j) {

            while (quickSort[i] <= pivote && i < j) {
                i++;
            }

            while (quickSort[j] > pivote) {
                j--;
            }

            if (i < j) {
                aux = quickSort[i];
                quickSort[i] = quickSort[j];
                quickSort[j] = aux;
            }

        }
        quickSort[inicio] = quickSort[j];
        quickSort[j] = pivote;
        
        if (inicio < j - 1) {
            algoritmoQuickSort(quickSort, inicio, j - 1);
        }
        if (j + 1 < fin) {
            algoritmoQuickSort(quickSort, j + 1, fin);
        }

    }

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBurbuja;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnInsercion;
    private javax.swing.JButton btnQuickSort;
    private javax.swing.JButton btnSeleccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField txtCantidaddeNumeros;
    private javax.swing.JTextField txtFindeRango;
    private javax.swing.JTextField txtIniciodeRango;
    // End of variables declaration//GEN-END:variables
}
