/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pkg15.pkg1.pkg4.pkgfinal;

import javax.swing.JOptionPane;

/**
 *
 * @author fedora
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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

        jButton_Random = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton_Task = new javax.swing.JButton();
        jButton_Clear = new javax.swing.JButton();
        jButton_Exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jButton_Random.setText("Random");
        jButton_Random.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RandomActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Random);
        jButton_Random.setBounds(10, 170, 100, 20);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "K(i)", "Title 2"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 270, 150);

        jButton_Task.setText("Task");
        jButton_Task.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_TaskActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Task);
        jButton_Task.setBounds(10, 200, 100, 20);

        jButton_Clear.setText("Clear");
        jButton_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ClearActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Clear);
        jButton_Clear.setBounds(170, 170, 100, 20);

        jButton_Exit.setText("Exit");
        jButton_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ExitActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Exit);
        jButton_Exit.setBounds(170, 200, 100, 20);

        setSize(new java.awt.Dimension(295, 265));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_RandomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RandomActionPerformed
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            jTable1.setValueAt((int) (Math.random() * 11), i, 0);            
        }
    }//GEN-LAST:event_jButton_RandomActionPerformed

    private void jButton_TaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_TaskActionPerformed
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            if (jTable1.getValueAt(i, 0) == null) {
                JOptionPane.showMessageDialog(rootPane, "Проверьте правильность заполнения столбца K(i)", "Ошибка ввода", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        int rowCount = jTable1.getRowCount();
        int[] inArray = new int[rowCount];
        for (int i = 0; i < rowCount; i++) {
            inArray[i] = (int) jTable1.getModel().getValueAt(i, 0);
        }
        TSN01_Calc ma = new TSN01_Calc();
        ma.SetMass(inArray);
        double[] outArray = ma.GetMass();
        for (int i = 0; i < rowCount; i++) {
            jTable1.getModel().setValueAt(String.format("%.3f", outArray[i]), i, 1);
        }
    }//GEN-LAST:event_jButton_TaskActionPerformed

    private void jButton_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ClearActionPerformed
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            for (int j = 0; j < jTable1.getColumnCount(); j++) {
                jTable1.setValueAt(null, i, j);
            }
        }
    }//GEN-LAST:event_jButton_ClearActionPerformed

    private void jButton_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton_ExitActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Clear;
    private javax.swing.JButton jButton_Exit;
    private javax.swing.JButton jButton_Random;
    private javax.swing.JButton jButton_Task;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
