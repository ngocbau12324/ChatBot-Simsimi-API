
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author NGOC BAU
 */
public class TextItemRight extends javax.swing.JLayeredPane {

    /**
     * Creates new form textItemLeft
     */
    public TextItemRight(String text) {
        initComponents();

        mess.setText(text);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbicon = new javax.swing.JLabel();
        mess = new ChatTextPanel();

        setBackground(new java.awt.Color(0, 0, 0));

        lbicon.setBackground(new java.awt.Color(0, 0, 0));
        lbicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/User.png"))); // NOI18N

        mess.setEditable(false);
        mess.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        mess.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mess.setForeground(new java.awt.Color(255, 255, 255));
        mess.setBgColor(new java.awt.Color(0, 132, 255));
        mess.setBorderColor(new java.awt.Color(0, 132, 255));

        setLayer(lbicon, javax.swing.JLayeredPane.DEFAULT_LAYER);
        setLayer(mess, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(mess, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbicon, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbicon, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(mess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbicon;
    private ChatTextPanel mess;
    // End of variables declaration//GEN-END:variables
}