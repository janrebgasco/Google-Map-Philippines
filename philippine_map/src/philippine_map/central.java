/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package philippine_map;
import java.awt.*;



/**
 *
 * @author user
 */
public class central extends javax.swing.JFrame {

    /**
     * Creates new form map
     */
    public central() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelshow = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.getVerticalScrollBar().setUnitIncrement(16);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1100, 1000));

        jPanel1.setBackground(new java.awt.Color(162, 223, 253));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setText("Central Luzon");
        jLabel1.setAlignmentY(0.0F);
        jLabel1.setAutoscrolls(true);
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 16, -1, -1));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/philippine_map/lines.png"))); // NOI18N
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 30, 30));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, 50));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 40)); // NOI18N
        jLabel21.setText("History");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 130, 60));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/philippine_map/back1.png"))); // NOI18N
        jLabel27.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel27MouseMoved(evt);
            }
        });
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 80, -1));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/philippine_map/centralhome.png"))); // NOI18N
        jLabel19.setOpaque(true);
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 260));

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Philippines");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel26.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Pilipinas");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 400, 90));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("<html><p style=\"text-align:justify;\">&emsp;&emsp;&emsp;&emsp;The current name of the region is in reference to its position on Luzon island. The term was coined by American colonialists after the defeat of the First Philippine Republic. There have been proposals to rename the current Central Luzon region into the Luzones region. The proposed name is in reference to the old name of Luzon island, Luções, which was later used to refer to the central area of the island. The term Luções literally translates into Luzones.\n<br>\n&emsp;&emsp;&emsp;&emsp;Central Luzon Region is located north of Manila, the nation's capital. Bordering it are the regions of Ilocos and Cagayan Valley to the north; National Capital Region, CALABARZON and the waters of Manila Bay to the south; South China Sea to the west; and the Philippine Sea to the east. Pangasinan is historico-culturally and geographically a part of this region, but was politically made part of the Ilocos Region by President Ferdinand Marcos on June 22 of 1973.\n<br>\n&emsp;&emsp;&emsp;&emsp;There are fourteen cities in the region: Balanga in Bataan; Malolos, Meycauayan and San Jose del Monte in Bulacan; Cabanatuan, Gapan, Muñoz, Palayan and San Jose in Nueva Ecija; Angeles, Mabalacat and San Fernando in Pampanga; Tarlac in Tarlac; and Olongapo in Zambales. Central Luzon produces the most rice in the whole country. Excess rice is delivered and imported to other provinces of the Philippines.\n<br>\n&emsp;&emsp;&emsp;&emsp;The City of San Fernando, provincial capital of Pampanga, is designated as the regional center. Aurora was transferred from Region IV through Executive Order No. 103 on May 2002.");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 350, 440));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 1900));

        jLabelshow.setBackground(new java.awt.Color(255, 255, 255));
        jLabelshow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/philippine_map/lines.png"))); // NOI18N
        jLabelshow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelshowMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelshow, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 30, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel3.setText("Tourist Spots");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("<html><p style=\"text-align:justify;\">The shrine, located on a 54-hecatre property in Brgy. O’ Donnell, Capas, Tarlac was the first prison camp for the men who survived the “Death March” at the hands of the Japanese during the last world war in 1942. The Camp O’ Donnell Memorial Monument was built by the organization known as “The Battling Bastards of Bataan” to honor the Americans and Filipinos who died at Camp O’ Donnell, while prisoners of the Japanese. The Cement Cross is a replica of the original cement cross built by the POWs. The monument is adjacent to the memorial for the Philippine Army dead. The “Cross” was built as a memorial to the thousands who died in that camp. It is as much a part of Bataan as the participants in that battle. The inscription on the base of the “Cross” reads “Omnia Pro Patria”: All For Country. On the wall behind the “Cross” are inscribed the names of the men who died at Camp O’ Donnell.");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 760, 130));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/philippine_map/capas.png"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 540, 250));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setText("Capas National Shrine, Capas, Tarlac");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel10.setText("Tarlac Ecotourism Park, Brgy. Lubigan, San Jose, Tarlac");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 540, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/philippine_map/shrine.png"))); // NOI18N
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 580, 540, 250));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setText("<html><p style=\"text-align:justify;\">Located at an altitude of 308 meters above sea level, 30 kilometers from Tarlac City, the said place boasts of perfect climatic condition with natural ecosystem of plants, disterocarp trees, convenient habitat for native and migratory birds and wild animals. The place is a perfect place for camping holidays.On April 12, 2004, President Gloria Macapagal Arroyo issued Proclamation No. 602 officially declaring the Tarlac Ecotourism Park as “ecotourism park and campsite.” Vic Yap, in-charge of Special Projects Office, facilitated the construction of concrete roads, electricity, water system, eco-park buildings and other amenities for the campsite.");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 840, 760, -1));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel16.setText("Timangguyob Waterfalls, San Clemente, Tarlac");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 950, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/philippine_map/falls.png"))); // NOI18N
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 1000, 540, 250));

        jLabel18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel18.setText("<html><p style=\"text-align:justify;\">A magnificent fall tucked in the middle of nowhere. This natural wonder is quite unique that the water flows down on an extraordinarily vast boulder carved and shaped by nature – like a basin – through many years of exposure to the continuous flow of water pouring from atop at 50 feet in height. The basin-like solid foundation, where the water is generously maintained at maximum of 5 feet is in essence indigenous but beautifully crafted swimming pool. The journey offers an invigorating experience, giving a luxurious, healthful escapade to the people brave enough to find their way to the majestic Timangguyob.");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 1250, 760, 110));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/philippine_map/pinatubo.png"))); // NOI18N
        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 1450, 540, 250));

        jLabel22.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel22.setText("Mt. Pinatubo");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 1400, -1, -1));

        jLabel23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel23.setText("<html><p style=\"text-align:justify;\">Trek to the crater of the world-famous Mt. Pinatubo. Spectacular views, towering lahar canyons, cool mountain springs and cascading waterfalls make that trip up the volcano an experience to remember. Drive on board an all-weather vehicle for one hour, disembark and trek for maximum of two hours to the crater, view the tranquil yet majestic 2.5-km crater-lake. Or bathe in any of the six sulfur-filled thermal pools at Sitio Tarukan. Cap your day with a generous fishing expedition at Tambo Lake before proceeding to the wellness spa.");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 1700, 760, 110));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1360, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1900, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        // TODO add your handling code here:
        jPanel3.hide();
        
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabelshowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelshowMouseClicked
        // TODO add your handling code here:
        
        jPanel3.show();
        
   
    }//GEN-LAST:event_jLabelshowMouseClicked

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        // TODO add your handling code here:
        mapgreen m= new mapgreen();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel27MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseMoved
        // TODO add your handling code here:
        Cursor cur1=new Cursor(Cursor.HAND_CURSOR);
        jLabel27.setCursor(cur1);
    }//GEN-LAST:event_jLabel27MouseMoved

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
            java.util.logging.Logger.getLogger(central.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(central.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(central.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(central.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new central().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelshow;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
