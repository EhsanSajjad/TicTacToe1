/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacTes;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Tahsina Keya
 */
public class TicTacToe_s extends javax.swing.JFrame {
    
    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    private int moveCount = 0;
    private int flag = 0;
   
    /**
     * Creates new form TicTacToe_s
     */
    public TicTacToe_s() {
        initComponents();
        this.setSize(820, 425);
        this.setLocationRelativeTo(null);
    }
    
    private void gameScore()
    {
        jLblPlayerX.setText(String.valueOf(xCount));
        jLblPlayerO.setText(String.valueOf(oCount));
    }
    
    private void choose_a_Player()
    {
        if( startGame.equalsIgnoreCase("X"))
        {
            startGame = "O";
        }
        else 
        {
            startGame = "X";
        }
    }
    
    private void winningGame()
    {
        String b1 = jButton1.getText();
        String b2 = jButton2.getText();
        String b3 = jButton3.getText();
        
        String b4 = jButton4.getText();
        String b5 = jButton5.getText();
        String b6 = jButton6.getText();
        
        String b7 = jButton7.getText();
        String b8 = jButton8.getText();
        String b9 = jButton9.getText();
        
        moveCount++;
        
        if(b1 == ("X") && b2 == ("X") && b3 == ("X"))
        {
            jButton1.setBackground(Color.yellow);
            jButton2.setBackground(Color.yellow);
            jButton3.setBackground(Color.yellow);
            
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic-Tac-Toe", JOptionPane.INFORMATION_MESSAGE);
            flag = 1;
            xCount++;
            gameScore();
            
        }
        
        else if(b4 == ("X") && b5 == ("X") && b6 == ("X"))
        {
            jButton4.setBackground(Color.cyan);
            jButton5.setBackground(Color.cyan);
            jButton6.setBackground(Color.cyan);
            
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic-Tac-Toe", JOptionPane.INFORMATION_MESSAGE);
            flag = 1;
            xCount++;
            gameScore();
            
        }
        
        else if(b7 == ("X") && b8 == ("X") && b9 == ("X"))
        {
            jButton7.setBackground(Color.MAGENTA);
            jButton8.setBackground(Color.MAGENTA);
            jButton9.setBackground(Color.MAGENTA);
            
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic-Tac-Toe", JOptionPane.INFORMATION_MESSAGE);
            flag = 1;
            xCount++;
            gameScore();
            
        }
        
        else if(b1 == ("X") && b4== ("X") && b7 == ("X"))
        {
            jButton1.setBackground(Color.yellow);
            jButton4.setBackground(Color.yellow);
            jButton7.setBackground(Color.yellow);
            
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic-Tac-Toe", JOptionPane.INFORMATION_MESSAGE);
            flag = 1;
            xCount++;
            gameScore();
            
        }
        
        else if(b2 == ("X") && b5 == ("X") && b8 == ("X"))
        {
            jButton2.setBackground(Color.cyan);
            jButton5.setBackground(Color.cyan);
            jButton8.setBackground(Color.cyan);
            
            
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic-Tac-Toe", JOptionPane.INFORMATION_MESSAGE);
            flag = 1;
            xCount++;
            gameScore();
            
        }
        
        else if(b3 == ("X") && b6 == ("X") && b9 == ("X"))
        {
            jButton3.setBackground(Color.MAGENTA);
            jButton6.setBackground(Color.MAGENTA);
            jButton9.setBackground(Color.MAGENTA);
            
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic-Tac-Toe", JOptionPane.INFORMATION_MESSAGE);
            flag = 1;
            xCount++;
            gameScore();
            
        }
        
        else if(b1 == ("X") && b5 == ("X") && b9 == ("X"))
        {
            jButton1.setBackground(Color.cyan);
            jButton5.setBackground(Color.cyan);
            jButton9.setBackground(Color.cyan);
            
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic-Tac-Toe", JOptionPane.INFORMATION_MESSAGE);
            flag = 1;
            xCount++;
            gameScore();
            
        }
        
        else if(b3 == ("X") && b5 == ("X") && b7 == ("X"))
        {
            jButton3.setBackground(Color.MAGENTA);
            jButton5.setBackground(Color.MAGENTA);
            jButton7.setBackground(Color.MAGENTA);
            
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic-Tac-Toe", JOptionPane.INFORMATION_MESSAGE);
            flag = 1;
            xCount++;
            gameScore();
            
        }
        
        
        
        
        else if(b1 == ("O") && b2 == ("O") && b3 == ("O"))
        {
            jButton1.setBackground(Color.yellow);
            jButton2.setBackground(Color.yellow);
            jButton3.setBackground(Color.yellow);
            
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic-Tac-Toe", JOptionPane.INFORMATION_MESSAGE);
            flag = 1;
            oCount++;
            gameScore();
            
        }
        
        else if(b4 == ("O") && b5 == ("O") && b6 == ("O"))
        {
            jButton4.setBackground(Color.cyan);
            jButton5.setBackground(Color.cyan);
            jButton6.setBackground(Color.cyan);
            
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic-Tac-Toe", JOptionPane.INFORMATION_MESSAGE);
            flag = 1;
            oCount++;
            gameScore();
            
        }
        
        else if(b7 == ("O") && b8 == ("O") && b9 == ("O"))
        {
            jButton7.setBackground(Color.MAGENTA);
            jButton8.setBackground(Color.MAGENTA);
            jButton9.setBackground(Color.MAGENTA);
            
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic-Tac-Toe", JOptionPane.INFORMATION_MESSAGE);
            flag = 1;
            oCount++;
            gameScore();
            
        }
        
        else if(b1 == ("O") && b4== ("O") && b7 == ("O"))
        {
            jButton1.setBackground(Color.yellow);
            jButton4.setBackground(Color.yellow);
            jButton7.setBackground(Color.yellow);
            
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic-Tac-Toe", JOptionPane.INFORMATION_MESSAGE);
            flag = 1;
            oCount++;
            gameScore();
            
        }
        
        else if(b2 == ("O") && b5 == ("O") && b8 == ("O"))
        {
            jButton2.setBackground(Color.cyan);
            jButton5.setBackground(Color.cyan);
            jButton8.setBackground(Color.cyan);
            
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic-Tac-Toe", JOptionPane.INFORMATION_MESSAGE);
            flag = 1;
            oCount++;
            gameScore();
            
        }
        
        else if(b3 == ("O") && b6 == ("O") && b9 == ("O"))
        {
            jButton3.setBackground(Color.MAGENTA);
            jButton6.setBackground(Color.MAGENTA);
            jButton9.setBackground(Color.MAGENTA);
            
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic-Tac-Toe", JOptionPane.INFORMATION_MESSAGE);
            flag = 1;
            oCount++;
            gameScore();
            
        }
        
        else if(b1 == ("O") && b5 == ("O") && b9 == ("O"))
        {
            jButton1.setBackground(Color.cyan);
            jButton5.setBackground(Color.cyan);
            jButton9.setBackground(Color.cyan);
            
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic-Tac-Toe", JOptionPane.INFORMATION_MESSAGE);
            flag = 1;
            oCount++;
            gameScore();
            
        }
        
        else if(b3 == ("O") && b5 == ("O") && b7 == ("O"))
        {
            jButton3.setBackground(Color.MAGENTA);
            jButton5.setBackground(Color.MAGENTA);
            jButton7.setBackground(Color.MAGENTA);
            
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic-Tac-Toe", JOptionPane.INFORMATION_MESSAGE);
            flag = 1;
            oCount++;
            gameScore();
            
        }       
        
        
        if(moveCount == 9 && flag == 0)
        {
            JOptionPane.showMessageDialog(this, " Its a DRAW !!!", "Tic-Tac-Toe", JOptionPane.INFORMATION_MESSAGE);
        }
        
        if (xCount == 3)
        {
            JOptionPane.showMessageDialog(this, "GAME OVER"+"\n"+"Well Done!"+" Player X wins."+"\n"+"Total Score : "+xCount, " Tic-Tac-Toe", 1);
            jLblPlayerX.setText(String.valueOf(0));
        }
        if (oCount ==3)
        {
            JOptionPane.showMessageDialog(this, "GAME OVER"+"\n"+"Well Done!"+" Player O wins."+"\n"+"Total Score : "+oCount, " Tic-Tac-Toe", 1);
            jLblPlayerX.setText(String.valueOf(0));
        }
          
        
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLblPlayerX = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLblPlayerO = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jBtnReset = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jBtnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic-Tac Toe Game");
        setBackground(new java.awt.Color(102, 102, 255));

        jPanel1.setBackground(new java.awt.Color(255, 102, 51));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 0), 4, true));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setBackground(new java.awt.Color(69, 0, 58));
        jLabel1.setFont(new java.awt.Font("Snap ITC", 3, 80)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tic-Tac-Toe");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 153), new java.awt.Color(0, 204, 0)));
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(76, 0, 66));
        jPanel2.setLayout(new java.awt.GridLayout(3, 5, 3, 3));

        jPanel4.setBackground(new java.awt.Color(255, 51, 51));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jButton1.setBackground(new java.awt.Color(240, 168, 123));
        jButton1.setFont(new java.awt.Font("Chiller", 1, 48)); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 102, 255), new java.awt.Color(102, 153, 0)));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(153, 255, 255));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jButton2.setBackground(new java.awt.Color(240, 168, 123));
        jButton2.setFont(new java.awt.Font("Chiller", 1, 48)); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 102, 255), new java.awt.Color(102, 153, 0)));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5);

        jPanel9.setBackground(new java.awt.Color(153, 255, 255));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jButton3.setBackground(new java.awt.Color(240, 168, 123));
        jButton3.setFont(new java.awt.Font("Chiller", 1, 48)); // NOI18N
        jButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 102, 255), new java.awt.Color(102, 153, 0)));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(153, 153, 255));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jLabel2.setBackground(new java.awt.Color(102, 102, 255));
        jLabel2.setFont(new java.awt.Font("Hobo Std", 1, 32)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 102, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Player X :");
        jPanel10.add(jLabel2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel10);

        jPanel8.setBackground(new java.awt.Color(153, 255, 255));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jLblPlayerX.setBackground(new java.awt.Color(102, 102, 255));
        jLblPlayerX.setFont(new java.awt.Font("Hobo Std", 1, 32)); // NOI18N
        jLblPlayerX.setForeground(new java.awt.Color(51, 102, 0));
        jLblPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblPlayerX.setText("0");
        jPanel8.add(jLblPlayerX, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel8);

        jPanel7.setBackground(new java.awt.Color(153, 153, 255));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jButton4.setBackground(new java.awt.Color(240, 168, 123));
        jButton4.setFont(new java.awt.Font("Chiller", 1, 48)); // NOI18N
        jButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 102, 255), new java.awt.Color(102, 153, 0)));
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton4, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel7);

        jPanel12.setBackground(new java.awt.Color(153, 153, 255));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jButton5.setBackground(new java.awt.Color(240, 168, 123));
        jButton5.setFont(new java.awt.Font("Chiller", 1, 48)); // NOI18N
        jButton5.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 102, 255), new java.awt.Color(102, 153, 0)));
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton5, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel12);

        jPanel11.setBackground(new java.awt.Color(153, 153, 255));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jButton6.setBackground(new java.awt.Color(240, 168, 123));
        jButton6.setFont(new java.awt.Font("Chiller", 1, 48)); // NOI18N
        jButton6.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 102, 255), new java.awt.Color(102, 153, 0)));
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel11);

        jPanel13.setBackground(new java.awt.Color(153, 153, 255));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jLabel4.setBackground(new java.awt.Color(153, 255, 255));
        jLabel4.setFont(new java.awt.Font("Hobo Std", 1, 32)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Player O :");
        jPanel13.add(jLabel4, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel13);

        jPanel14.setBackground(new java.awt.Color(153, 255, 255));
        jPanel14.setLayout(new java.awt.BorderLayout());

        jLblPlayerO.setBackground(new java.awt.Color(153, 255, 255));
        jLblPlayerO.setFont(new java.awt.Font("Hobo Std", 1, 32)); // NOI18N
        jLblPlayerO.setForeground(new java.awt.Color(0, 0, 102));
        jLblPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblPlayerO.setText("0");
        jPanel14.add(jLblPlayerO, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel14);

        jPanel18.setBackground(new java.awt.Color(153, 255, 255));
        jPanel18.setLayout(new java.awt.BorderLayout());

        jButton7.setBackground(new java.awt.Color(240, 168, 123));
        jButton7.setFont(new java.awt.Font("Chiller", 1, 48)); // NOI18N
        jButton7.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 102, 255), new java.awt.Color(102, 153, 0)));
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel18.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel18);

        jPanel15.setBackground(new java.awt.Color(153, 255, 255));
        jPanel15.setLayout(new java.awt.BorderLayout());

        jButton8.setBackground(new java.awt.Color(240, 168, 123));
        jButton8.setFont(new java.awt.Font("Chiller", 1, 48)); // NOI18N
        jButton8.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 102, 255), new java.awt.Color(102, 153, 0)));
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel15);

        jPanel16.setBackground(new java.awt.Color(153, 255, 255));
        jPanel16.setLayout(new java.awt.BorderLayout());

        jButton9.setBackground(new java.awt.Color(240, 168, 123));
        jButton9.setFont(new java.awt.Font("Chiller", 1, 48)); // NOI18N
        jButton9.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 102, 255), new java.awt.Color(102, 153, 0)));
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel16);

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setLayout(new java.awt.BorderLayout());

        jBtnReset.setBackground(new java.awt.Color(153, 153, 0));
        jBtnReset.setFont(new java.awt.Font("AR DELANEY", 1, 48)); // NOI18N
        jBtnReset.setText("Reset");
        jBtnReset.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 153, 51)));
        jBtnReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnResetActionPerformed(evt);
            }
        });
        jPanel19.add(jBtnReset, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel19);

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setLayout(new java.awt.BorderLayout());

        jBtnExit.setBackground(new java.awt.Color(153, 51, 0));
        jBtnExit.setFont(new java.awt.Font("AR DESTINE", 1, 48)); // NOI18N
        jBtnExit.setText("Exit");
        jBtnExit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 153, 51)));
        jBtnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnExit.setMaximumSize(new java.awt.Dimension(157, 61));
        jBtnExit.setMinimumSize(new java.awt.Dimension(157, 61));
        jBtnExit.setPreferredSize(new java.awt.Dimension(157, 61));
        jBtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExitActionPerformed(evt);
            }
        });
        jPanel20.add(jBtnExit, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel20);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private JFrame frame;

    private void jBtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExitActionPerformed
        
        frame = new JFrame("Exit");
        
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to Exit", "Tic-Tac-Toe",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
        
    }//GEN-LAST:event_jBtnExitActionPerformed

    private void jBtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnResetActionPerformed
        
               
        jButton1.setText(null);
        jButton2.setText(null);
        jButton3.setText(null);
        jButton4.setText(null);
        jButton5.setText(null);
        jButton6.setText(null);
        jButton7.setText(null);
        jButton8.setText(null);
        jButton9.setText(null);
        
        
        jButton1.setBackground(Color.PINK);
        jButton2.setBackground(Color.PINK);
        jButton3.setBackground(Color.PINK);
        jButton4.setBackground(Color.PINK);
        jButton5.setBackground(Color.PINK);
        jButton6.setBackground(Color.PINK);
        jButton7.setBackground(Color.PINK);
        jButton8.setBackground(Color.PINK);
        jButton9.setBackground(Color.PINK);
        
        moveCount = 0;
        
    }//GEN-LAST:event_jBtnResetActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        jButton1.setText(startGame);
        if( startGame.equalsIgnoreCase("X"))
        {
            jButton1.setForeground(Color.green);
        }
        else 
        {
            jButton1.setForeground(Color.blue);
        }
        choose_a_Player();
        winningGame();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        jButton2.setText(startGame);
        if( startGame.equalsIgnoreCase("X"))
        {
            jButton2.setForeground(Color.green);
        }
        else 
        {
            jButton2.setForeground(Color.blue);
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        jButton3.setText(startGame);
        if( startGame.equalsIgnoreCase("X"))
        {
            jButton3.setForeground(Color.green);
        }
        else 
        {
            jButton3.setForeground(Color.blue);
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        jButton4.setText(startGame);
        if( startGame.equalsIgnoreCase("X"))
        {
            jButton4.setForeground(Color.green);
        }
        else 
        {
            jButton4.setForeground(Color.blue);
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        jButton5.setText(startGame);
        if( startGame.equalsIgnoreCase("X"))
        {
            jButton5.setForeground(Color.green);
        }
        else 
        {
            jButton5.setForeground(Color.blue);
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        jButton6.setText(startGame);
        if( startGame.equalsIgnoreCase("X"))
        {
            jButton6.setForeground(Color.green);
        }
        else 
        {
            jButton6.setForeground(Color.blue);
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
        jButton7.setText(startGame);
        if( startGame.equalsIgnoreCase("X"))
        {
            jButton7.setForeground(Color.green);
        }
        else 
        {
            jButton7.setForeground(Color.blue);
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        
        jButton8.setText(startGame);
        if( startGame.equalsIgnoreCase("X"))
        {
            jButton8.setForeground(Color.green);
        }
        else 
        {
            jButton8.setForeground(Color.blue);
        }
        choose_a_Player();
         
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        
        jButton9.setText(startGame);
        if( startGame.equalsIgnoreCase("X"))
        {
            jButton9.setForeground(Color.green);
        }
        else 
        {
            jButton9.setForeground(Color.blue);
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(TicTacToe_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe_s().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnExit;
    private javax.swing.JButton jBtnReset;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLblPlayerO;
    private javax.swing.JLabel jLblPlayerX;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
