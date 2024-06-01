/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.brightskyossdo.guardlock_vpn;

import javax.swing.UIManager;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.*;


/**
 *
 * @author brightsky-ossdo
 */
public class MainPage extends javax.swing.JFrame {

    
    /**
     * Creates new form MainPage
     */
    public MainPage() {
        
        initComponents();
        jComboBox2.setModel(new DefaultComboBoxModel(new String[]{
                "Amery Ice Shelf",
                "Ronne Ice Shelf",
                "Ross Ice Shelf",
                "South Pole",
                "Wilkes Land"
            }));
        disconnection();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GuardLock VPN");
        setName("MainPage"); // NOI18N
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Location"));

        jLabel1.setLabelFor(jComboBox1);
        jLabel1.setText("Country:");
        jLabel1.setName("CountryLabel"); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Antarctica", "Australia", "Brazil", "Canada", "China", "Egypt", "England", "France", "Germany", "India", "Japan", "North Korea", "Russia", "South Korea", "United States" }));
        jComboBox1.setToolTipText("Select the desired country for your VPN connection");
        jComboBox1.setName("CountryComboBox"); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setText("City:");
        jLabel2.setName("CityLabel"); // NOI18N

        jComboBox2.setToolTipText("Choose a city within the selected country for your VPN connection");
        jComboBox2.setName("CityComboBoxx"); // NOI18N

        jLabel3.setText("IPv4 Address:");
        jLabel3.setName("IPLabel"); // NOI18N

        jTextField1.setText("0");
        jTextField1.setToolTipText("Enter an IPv4 address for your VPN connection");
        jTextField1.setName("IPInput1"); // NOI18N
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jTextField2.setText("0");
        jTextField2.setToolTipText("Enter an IPv4 address for your VPN connection");
        jTextField2.setName("IPInput2"); // NOI18N
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jTextField3.setText("0");
        jTextField3.setToolTipText("Enter an IPv4 address for your VPN connection");
        jTextField3.setName("IPInput3"); // NOI18N
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField3FocusLost(evt);
            }
        });
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });

        jTextField4.setText("0");
        jTextField4.setToolTipText("Enter an IPv4 address for your VPN connection");
        jTextField4.setName("IPInput4"); // NOI18N
        jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField4FocusLost(evt);
            }
        });
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Mode"));

        buttonGroup2.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Browsing Mode");
        jRadioButton1.setToolTipText("Browsing Mode: Recommended for general internet browsing");

        buttonGroup2.add(jRadioButton2);
        jRadioButton2.setText("Streaming Mode");
        jRadioButton2.setToolTipText("Streaming Mode: Optimal for high-quality video streaming");

        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setText("Torrenting Mode");
        jRadioButton3.setToolTipText("Torrenting Mode: Designed for torrenting and downloading large files");

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setText("Gaming Mode");
        jRadioButton4.setToolTipText("Gaming Mode: Optimized for online gaming experiences");

        jLabel4.setText("VPN Protocol:");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IKEv2", "L2TP/IPsec", "OpenVPN", "PPTP", "SSTP", "WireGuard" }));
        jComboBox3.setToolTipText("Choose the VPN protocol to use for your connection");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                        .addGap(24, 24, 24)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Options"));

        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Kill Switch");
        jCheckBox1.setToolTipText("Enable the kill switch to automatically disconnect from the internet if the VPN connection drops (recommended)");

        jCheckBox2.setText("Enable Latency (milliseconds)");
        jCheckBox2.setToolTipText("Enable latency to measure and optimize network response times");
        jCheckBox2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox2StateChanged(evt);
            }
        });

        jCheckBox3.setText("Limit Bandwidth (megabytes)");
        jCheckBox3.setToolTipText("Enable bandwidth limiting to conserve your computer's power");
        jCheckBox3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox3StateChanged(evt);
            }
        });

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 1000000, 1));
        jSpinner1.setToolTipText("Set the maximum acceptable network response time in milliseconds");
        jSpinner1.setEnabled(false);

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 1048576, 1));
        jSpinner2.setToolTipText("Set the maximum amount of data allowed for your VPN connection in megabytes");
        jSpinner2.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox1)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox2)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox3)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jButton1.setText("CONNECT");
        jButton1.setToolTipText("Establish the VPN connection with the selected settings");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jButton2.setText("DISCONNECT");
        jButton2.setToolTipText("Terminate the active VPN connection");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void connectToVPN() {
        int count = 0;
        boolean HasNumberGreaterThan0 = false;
        boolean HasNumberLowerThan255 = false;
        
        if (Integer.parseInt(jTextField1.getText()) > 0) {
            count++;
            HasNumberGreaterThan0 = true;
        }
        if (Integer.parseInt(jTextField2.getText()) > 0) {
            count++;
            HasNumberGreaterThan0 = true;
        }
        if (Integer.parseInt(jTextField3.getText()) > 0) {
            count++;
            HasNumberGreaterThan0 = true;
        }
        if (Integer.parseInt(jTextField4.getText()) > 0) {
            count++;
            HasNumberGreaterThan0 = true;
        }
        if (Integer.parseInt(jTextField1.getText()) < 255) {
            HasNumberLowerThan255 = true;
        }
        if (Integer.parseInt(jTextField2.getText()) < 255) {
            HasNumberLowerThan255 = true;
        }
        if (Integer.parseInt(jTextField3.getText()) < 255) {
            HasNumberLowerThan255 = true;
        }
        if (Integer.parseInt(jTextField4.getText()) < 255) {
            HasNumberLowerThan255 = true;
        }
        
        if (count == 0) {
            javax.swing.JOptionPane.showMessageDialog(null, "Invalid IPv4 address. At least one field must contain a number higher than 0.", "Error", javax.swing.JOptionPane.WARNING_MESSAGE);
        } else if (!HasNumberLowerThan255) {
            javax.swing.JOptionPane.showMessageDialog(null, "Invalid IPv4 address. At least one field must contain a number lower than 255.", "Error", javax.swing.JOptionPane.WARNING_MESSAGE);
        } else {
            String locationInfo = "Successfully connected to the VPN server in " + jComboBox2.getSelectedItem() + ", " + jComboBox1.getSelectedItem() + " with IPv4 address " + jTextField1.getText() + "." + jTextField2.getText() + "." + jTextField3.getText() + "." + jTextField4.getText() + ".";
            javax.swing.JOptionPane.showMessageDialog(null, locationInfo, "Success", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            connection();
        }
    }
    
    private void connection() {
        jButton1.setEnabled(false);
        jButton2.setEnabled(true);
        
        jLabel1.setEnabled(false);
        jLabel2.setEnabled(false);
        jLabel3.setEnabled(false);
        jComboBox1.setEnabled(false);
        jComboBox2.setEnabled(false);
        
        jTextField1.setEnabled(false);
        jTextField2.setEnabled(false);
        jTextField3.setEnabled(false);
        jTextField4.setEnabled(false);
        
        jLabel4.setEnabled(false);
        jRadioButton1.setEnabled(false);
        jRadioButton2.setEnabled(false);
        jRadioButton3.setEnabled(false);
        jRadioButton4.setEnabled(false);
        jComboBox3.setEnabled(false);
        
        jCheckBox1.setEnabled(false);
        jCheckBox2.setEnabled(false);
        jCheckBox3.setEnabled(false);
        jSpinner1.setEnabled(false);
        jSpinner2.setEnabled(false);
        
        setTitle("GuardLock VPN (Connected)");
    }
    
    private void disconnection() {
        jButton1.setEnabled(true);
        jButton2.setEnabled(false);
        
        jLabel1.setEnabled(true);
        jLabel2.setEnabled(true);
        jLabel3.setEnabled(true);
        jComboBox1.setEnabled(true);
        jComboBox2.setEnabled(true);
        
        jTextField1.setEnabled(true);
        jTextField2.setEnabled(true);
        jTextField3.setEnabled(true);
        jTextField4.setEnabled(true);
        
        jLabel4.setEnabled(true);
        jRadioButton1.setEnabled(true);
        jRadioButton2.setEnabled(true);
        jRadioButton3.setEnabled(true);
        jRadioButton4.setEnabled(true);
        jComboBox3.setEnabled(true);
        
        jCheckBox1.setEnabled(true);
        jCheckBox2.setEnabled(true);
        if (jCheckBox2.isSelected()) {
            jSpinner1.setEnabled(true);
        } else {
            jSpinner1.setEnabled(false);
        }
        if (jCheckBox3.isSelected()) {
            jSpinner2.setEnabled(true);
        } else {
            jSpinner2.setEnabled(false);
        }
        jCheckBox3.setEnabled(true);
        
        setTitle("GuardLock VPN (Disconnected)");
    }
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        Object selectedCountry = jComboBox1.getSelectedItem();
        
        if (selectedCountry.equals("Antarctica")) {
            jComboBox2.setModel(new DefaultComboBoxModel(new String[]{
                "Amery Ice Shelf",
                "Ronne Ice Shelf",
                "Ross Ice Shelf",
                "South Pole",
                "Wilkes Land"
            }));
        } else if (selectedCountry.equals("Australia")) {
            jComboBox2.setModel(new DefaultComboBoxModel(new String[] {
                "Brisbane",
                "Canberra",
                "Melbourne",
                "Perth",
                "Sydney"
            }));
        } else if (selectedCountry.equals("Brazil")) {
            jComboBox2.setModel(new DefaultComboBoxModel(new String[] {
                "Brasilia",
                "Manaus",
                "Rio de Janeiro",
                "Salvado",
                "Sao Paulo"
            }));
        } else if (selectedCountry.equals("Canada")) {
            jComboBox2.setModel(new DefaultComboBoxModel(new String[] {
                "Iqaluit",
                "Ottawa",
                "Quebec City",
                "Toronto",
                "Victoria"
            }));
        } else if (selectedCountry.equals("China")) {
            jComboBox2.setModel(new DefaultComboBoxModel(new String[] {
                "Beijing",
                "Changsha",
                "Chongqing",
                "Wuhan",
                "Xi'An"
            }));
        } else if (selectedCountry.equals("Egypt")) {
            jComboBox2.setModel(new DefaultComboBoxModel(new String[] {
                "Alexandria",
                "Aswan",
                "Cairo",
                "Giza",
                "Luxor"
            }));
        } else if (selectedCountry.equals("England")) {
            jComboBox2.setModel(new DefaultComboBoxModel(new String[] {
                "Birmingam",
                "Bristol",
                "London",
                "Nottingham",
                "Southampton"
            }));
                    
        } else if (selectedCountry.equals("France")) {
            jComboBox2.setModel(new DefaultComboBoxModel(new String[] {
                "Lyon",
                "Montpellier",
                "Nice",
                "Paris",
                "Toulouse"
            }));
        } else if (selectedCountry.equals("Germany")) {
            jComboBox2.setModel(new DefaultComboBoxModel(new String[] {
                "Berlin",
                "Cologne",
                "Dresden",
                "Frankfurt",
                "Hamburg"
            }));
        } else if (selectedCountry.equals("India")) {
            jComboBox2.setModel(new DefaultComboBoxModel(new String[] {
                "Agra",
                "Chennai",
                "Delhi",
                "Lucknow",
                "Mumbai"
            }));
        } else if (selectedCountry.equals("Japan")) {
            jComboBox2.setModel(new DefaultComboBoxModel(new String[] {
                "Hiroshima",
                "Nagasaki",
                "Osaka",
                "Tokyo",
                "Yokohama"
            }));
        } else if (selectedCountry.equals("North Korea")) {
            jComboBox2.setModel(new DefaultComboBoxModel(new String[] {
                "Chongjin",
                "Hamhung",
                "Pyongyang",
                "Sariwon",
                "Wonsan"
            }));
        } else if (selectedCountry.equals("Russia")) {
            jComboBox2.setModel(new DefaultComboBoxModel(new String[] {
                "Kazan",
                "Moscow",
                "Saint Petersburg",
                "Samara",
                "Ufa"
            }));
        } else if (selectedCountry.equals("South Korea")) {
            jComboBox2.setModel(new DefaultComboBoxModel(new String[] {
                "Daegu",
                "Daejeon",
                "Gwangju",
                "Seoul",
                "Ulsan"
            }));
        } else if (selectedCountry.equals("United States")) {
            jComboBox2.setModel(new DefaultComboBoxModel(new String[] {
                "Chicago",
                "Las Vegas",
                "Los Angeles",
                "Memphis",
                "Washington DC"
            }));
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        char c = evt.getKeyChar();
    if (!Character.isDigit(c)) {
        evt.consume();
    } else {
        String currentText = jTextField1.getText();
        if (currentText.equals("0")) {
            evt.consume();
        } else if (currentText.startsWith("0")) {
            jTextField1.setText(String.valueOf(c));
            evt.consume();
        } else {
            currentText += c;
            try {
                int value = Integer.parseInt(currentText);
                if (value < 0 || value > 255) {
                    evt.consume();
                }
            } catch (NumberFormatException ex) {
                evt.consume();
            }
        }
    }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        char c = evt.getKeyChar();
    if (!Character.isDigit(c)) {
        evt.consume();
    } else {
        String currentText = jTextField2.getText();
        if (currentText.equals("0")) {
            evt.consume();
        } else if (currentText.startsWith("0")) {
            jTextField2.setText(String.valueOf(c));
            evt.consume();
        } else {
            currentText += c;
            try {
                int value = Integer.parseInt(currentText);
                if (value < 0 || value > 255) {
                    evt.consume();
                }
            } catch (NumberFormatException ex) {
                evt.consume();
            }
        }
    }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        char c = evt.getKeyChar();
    if (!Character.isDigit(c)) {
        evt.consume();
    } else {
        String currentText = jTextField3.getText();
        if (currentText.equals("0")) {
            evt.consume();
        } else if (currentText.startsWith("0")) {
            jTextField3.setText(String.valueOf(c));
            evt.consume();
        } else {
            currentText += c;
            try {
                int value = Integer.parseInt(currentText);
                if (value < 0 || value > 255) {
                    evt.consume();
                }
            } catch (NumberFormatException ex) {
                evt.consume();
            }
        }
    }
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        char c = evt.getKeyChar();
    if (!Character.isDigit(c)) {
        evt.consume();
    } else {
        String currentText = jTextField4.getText();
        if (currentText.equals("0")) {
            evt.consume();
        } else if (currentText.startsWith("0")) {
            jTextField4.setText(String.valueOf(c));
            evt.consume();
        } else {
            currentText += c;
            try {
                int value = Integer.parseInt(currentText);
                if (value < 0 || value > 255) {
                    evt.consume();
                }
            } catch (NumberFormatException ex) {
                evt.consume();
            }
        }
    }
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jCheckBox2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox2StateChanged
       javax.swing.JCheckBox jCheckBox2 = (javax.swing.JCheckBox)evt.getSource();
       jSpinner1.setEnabled(jCheckBox2.isSelected());
    }//GEN-LAST:event_jCheckBox2StateChanged

    private void jCheckBox3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox3StateChanged
        javax.swing.JCheckBox jCheckBox3 = (javax.swing.JCheckBox)evt.getSource();
        jSpinner2.setEnabled(jCheckBox3.isSelected());
    }//GEN-LAST:event_jCheckBox3StateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        connectToVPN();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        if (jTextField1.getText().isEmpty()) {
            jTextField1.setText("0");
        }
    }//GEN-LAST:event_jTextField1FocusLost

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
        if (jTextField2.getText().isEmpty()) {
            jTextField2.setText("0");
        }
    }//GEN-LAST:event_jTextField2FocusLost

    private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost
        if (jTextField3.getText().isEmpty()) {
            jTextField3.setText("0");
        }
    }//GEN-LAST:event_jTextField3FocusLost

    private void jTextField4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusLost
        if (jTextField4.getText().isEmpty()) {
            jTextField4.setText("0");
        }
    }//GEN-LAST:event_jTextField4FocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        javax.swing.JOptionPane.showMessageDialog(null, "You have disconnected from the VPN.", "Disconnected", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        disconnection();
    }//GEN-LAST:event_jButton2ActionPerformed
    
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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
