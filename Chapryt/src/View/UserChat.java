/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author can
 */
public class UserChat extends javax.swing.JFrame {

    /**
     * Creates new form UserChat
     */
    public UserChat() {
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

        jPanel1 = new javax.swing.JPanel();
        labelUserChat = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        fieldMessage = new javax.swing.JTextField();
        btSend = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chapryt - Chat");
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        labelUserChat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelUserChat.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(labelUserChat);
        labelUserChat.setBounds(20, 30, 320, 40);

        jScrollPane1.setViewportView(jTextPane1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 80, 320, 320);

        fieldMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldMessageActionPerformed(evt);
            }
        });
        jPanel1.add(fieldMessage);
        fieldMessage.setBounds(19, 420, 220, 30);

        btSend.setBackground(new java.awt.Color(0, 0, 0));
        btSend.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btSend.setForeground(new java.awt.Color(255, 255, 255));
        btSend.setText("Send");
        jPanel1.add(btSend);
        btSend.setBounds(260, 420, 80, 34);

        getContentPane().add(jPanel1);

        setSize(new java.awt.Dimension(377, 512));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fieldMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldMessageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldMessageActionPerformed

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
            java.util.logging.Logger.getLogger(UserChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserChat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSend;
    private javax.swing.JTextField fieldMessage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel labelUserChat;
    // End of variables declaration//GEN-END:variables
}
