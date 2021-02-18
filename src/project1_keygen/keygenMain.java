
package project1_keygen;

import java.awt.Toolkit;
import java.util.Random;

public class keygenMain extends javax.swing.JFrame {
    
    String finalActivation,twoFin,charString,numString ;
    char[] randAlphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 
                        'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 
                        'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    int[] randPi = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 9, 7, 9}; 
    Random rand = new Random();
    static int random,numFin,x;
    public keygenMain() {
        initComponents();
        setIcon();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        activationkey = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WEBSITE ATLAS KEYGEN");
        setResizable(false);
        getContentPane().setLayout(new java.awt.FlowLayout());

        jPanel2.setPreferredSize(new java.awt.Dimension(100, 10));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);

        jPanel1.setMinimumSize(new java.awt.Dimension(300, 110));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WEBSITE ATLAS");
        jLabel1.setPreferredSize(new java.awt.Dimension(300, 32));
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1_images/icoApplication.png"))); // NOI18N
        jPanel1.add(jLabel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1);

        jPanel3.setMinimumSize(new java.awt.Dimension(300, 10));
        jPanel3.setPreferredSize(new java.awt.Dimension(300, 50));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3);

        jPanel4.setMinimumSize(new java.awt.Dimension(300, 10));
        jPanel4.setPreferredSize(new java.awt.Dimension(300, 80));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel3.setText("  ACTIVATION KEY:");
        jPanel4.add(jLabel3, java.awt.BorderLayout.PAGE_START);

        activationkey.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        activationkey.setText(" 12AB-7CD3-8ABC-63");
        activationkey.setPreferredSize(new java.awt.Dimension(168, 20));
        jPanel4.add(activationkey, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel4);

        jPanel5.setPreferredSize(new java.awt.Dimension(300, 60));

        jPanel7.setPreferredSize(new java.awt.Dimension(300, 20));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel7);

        jButton1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jButton1.setText("Generate");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1);

        getContentPane().add(jPanel5);

        jPanel6.setPreferredSize(new java.awt.Dimension(300, 85));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Copyright © 2021, Website Atlas.");
        jPanel6.add(jLabel4, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(jPanel6);

        setSize(new java.awt.Dimension(316, 439));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void keyAlgo () {
        //final 2 numbers
        do {
            numFin = rand.nextInt(100);    
        } while (numFin  <= 9);
        twoFin = Integer.toString(numFin);
        //first letter
        random = rand.nextInt(26);
        charString = Character.toString(randAlphabet[random]);
        finalActivation = charString; 
        
        x=0;
        for (int i=2; i<=15; i++){
            if (i % 5 == 0)
                finalActivation = finalActivation + "-";
            
            else {
            //odd position    
                if (i % 2 != 0){
                    if (i % 3 == 0) {
                        random = rand.nextInt(randPi[x]); 
                        charString = Character.toString(randAlphabet[random]);  
                        finalActivation += charString; 

                    }
                    else {
                        random = rand.nextInt(randPi[x]);
                        numString = Integer.toString(random);
                        finalActivation += numString;    

                    }
                }
            //even position
                else if (i % 2 == 0){
                    random = rand.nextInt(randPi[x]); 
                    numString = Integer.toString(random);
                    finalActivation += numString;

                } 
            }
            x++;    
        }
        finalActivation += twoFin;
        activationkey.setText(" " + finalActivation.toUpperCase());
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        keyAlgo();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icoApplication.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel activationkey;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}
