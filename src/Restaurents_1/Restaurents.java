package Restaurents_1;

import com.sun.glass.events.KeyEvent;
import javax.swing.JOptionPane;

public class Restaurents extends javax.swing.JFrame {

    double cost_of_meal = 0;
    double tax = 0;
    double home_delivery_cost = 0;
    double drinktax = 0;

    double firstNumber;
    double SecoundNUmber;
    double Result;
    String operation;

    public Restaurents() {
        initComponents();
        //this.setLocationRelativeTo(this);
        display.setEditable(false);
        recepttextfield.setEditable(false);
        mealcostshowfield.setEditable(false);
        drinkshowfield.setEditable(false);
        deliverycostshowfield.setEditable(false);
        subtotalshowfield.setEditable(false);
        taxshowfield.setEditable(false);
        totalshowfield.setEditable(false);
        convertdisplay.setEditable(false);
        convertfrom.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Receptpanel = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        display = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        plusminus = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        multiply = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        dot = new javax.swing.JButton();
        Equal = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        recepttextfield = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        Chickenburgercheakbox = new javax.swing.JCheckBox();
        Chichenburgermealcheakbox = new javax.swing.JCheckBox();
        Baconcheakbox = new javax.swing.JCheckBox();
        burgerfield = new javax.swing.JTextField();
        burgermealfield = new javax.swing.JTextField();
        bacomfield = new javax.swing.JTextField();
        drink = new javax.swing.JLabel();
        Combodrink = new javax.swing.JComboBox<>();
        Taxcheakbox = new javax.swing.JCheckBox();
        Homedeliverycheakbox = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        drinkshowfield = new javax.swing.JTextField();
        mealcostshowfield = new javax.swing.JTextField();
        deliverycostshowfield = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        subtotalshowfield = new javax.swing.JTextField();
        taxshowfield = new javax.swing.JTextField();
        totalshowfield = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jcmbcurrency = new javax.swing.JComboBox<>();
        convertfrom = new javax.swing.JTextField();
        convertdisplay = new javax.swing.JTextField();
        Convert = new javax.swing.JButton();
        Close = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        TotalButton = new javax.swing.JButton();
        ReciptButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        ResetButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setEnabled(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        Receptpanel.setBorder(new javax.swing.border.MatteBorder(null));
        Receptpanel.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ReceptpanelStateChanged(evt);
            }
        });

        display.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        display.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("<-");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("c");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        plusminus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plusminus.setText("+/-");
        plusminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusminusActionPerformed(evt);
            }
        });

        plus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        plus.setText("+");
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setText("7");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton7.setText("8");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton8.setText("9");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        minus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        minus.setText("-");
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton10.setText("4");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton11.setText("5");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton12.setText("6");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        multiply.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        multiply.setText("*");
        multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyActionPerformed(evt);
            }
        });

        jButton14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton14.setText("1");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton15.setText("2");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton16.setText("3");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        divide.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        divide.setText("/");
        divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformed(evt);
            }
        });

        jButton18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton18.setText("0");

        dot.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dot.setText(".");
        dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotActionPerformed(evt);
            }
        });

        Equal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Equal.setText("=");
        Equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EqualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(display)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(plusminus, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dot, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Equal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 20, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plusminus, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dot, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Equal, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        Receptpanel.addTab("Calculator", jPanel9);

        recepttextfield.setColumns(20);
        recepttextfield.setRows(5);
        jScrollPane1.setViewportView(recepttextfield);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                .addContainerGap())
        );

        Receptpanel.addTab("Recept", jPanel10);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Receptpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Receptpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        Chickenburgercheakbox.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Chickenburgercheakbox.setText("Chicken Burger");
        Chickenburgercheakbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChickenburgercheakboxActionPerformed(evt);
            }
        });

        Chichenburgermealcheakbox.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Chichenburgermealcheakbox.setText("Chicken Burger Meal");
        Chichenburgermealcheakbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChichenburgermealcheakboxActionPerformed(evt);
            }
        });

        Baconcheakbox.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Baconcheakbox.setText("Bacon and Cheese Burger");
        Baconcheakbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaconcheakboxActionPerformed(evt);
            }
        });

        burgerfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        burgermealfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bacomfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        drink.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        drink.setText("Drinks");

        Combodrink.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Combodrink.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a Drink", "Apple Juice", "Tea", "Cola", "Ice cola", "Cofee", "Ice cofee", "Orange" }));
        Combodrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CombodrinkActionPerformed(evt);
            }
        });

        Taxcheakbox.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Taxcheakbox.setText("Tax");
        Taxcheakbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TaxcheakboxActionPerformed(evt);
            }
        });

        Homedeliverycheakbox.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Homedeliverycheakbox.setText("Home Delivery");
        Homedeliverycheakbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomedeliverycheakboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Chickenburgercheakbox, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Chichenburgermealcheakbox, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drink, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Taxcheakbox)
                    .addComponent(Baconcheakbox))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(burgerfield)
                    .addComponent(burgermealfield)
                    .addComponent(bacomfield)
                    .addComponent(Combodrink, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Homedeliverycheakbox, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Chickenburgercheakbox)
                            .addComponent(burgerfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Chichenburgermealcheakbox))
                    .addComponent(burgermealfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Baconcheakbox)
                    .addComponent(bacomfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(drink, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Combodrink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Taxcheakbox)
                    .addComponent(Homedeliverycheakbox))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel3.setText("Cost of Drinks");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel4.setText("Cost of Meal");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel5.setText("Cost of Delivery");

        drinkshowfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        mealcostshowfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        deliverycostshowfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(drinkshowfield)
                    .addComponent(mealcostshowfield)
                    .addComponent(deliverycostshowfield, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(drinkshowfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addComponent(mealcostshowfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deliverycostshowfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel6.setText("Sub Total");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel7.setText("Tax");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel8.setText("Total");

        subtotalshowfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        taxshowfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        totalshowfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(subtotalshowfield)
                    .addComponent(taxshowfield)
                    .addComponent(totalshowfield, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                .addGap(53, 53, 53))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subtotalshowfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(taxshowfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(37, 37, 37)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(totalshowfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jcmbcurrency.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jcmbcurrency.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose One", "USA", "Nigeria", "Keyania", "Canada", "Brazil", "Indeonisia", "Philipine" }));

        convertfrom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        convertfrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertfromActionPerformed(evt);
            }
        });
        convertfrom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                convertfromKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                convertfromKeyTyped(evt);
            }
        });

        convertdisplay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        convertdisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertdisplayActionPerformed(evt);
            }
        });

        Convert.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Convert.setText("Convert");
        Convert.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Convert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConvertActionPerformed(evt);
            }
        });
        Convert.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ConvertKeyPressed(evt);
            }
        });

        Close.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Close.setText("Close");
        Close.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcmbcurrency, 0, 161, Short.MAX_VALUE)
                    .addComponent(convertfrom)
                    .addComponent(convertdisplay))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Convert, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jcmbcurrency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(convertfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(convertdisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Convert)
                    .addComponent(Close))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        TotalButton.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        TotalButton.setText("Total");
        TotalButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        TotalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalButtonActionPerformed(evt);
            }
        });

        ReciptButton.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        ReciptButton.setText("Recipt");
        ReciptButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        ReciptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReciptButtonActionPerformed(evt);
            }
        });

        ExitButton.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        ExitButton.setText("Exit");
        ExitButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        ResetButton.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        ResetButton.setText("RESET");
        ResetButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(TotalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(ReciptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(ResetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TotalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReciptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("                      Restaurent Management");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(449, 449, 449))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ChickenburgercheakboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChickenburgercheakboxActionPerformed

        if (Chickenburgercheakbox.isSelected() && burgerfield.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Write the Amount Of  Chicken Burger .");
            burgerfield.setEditable(false);

        } else if (Chickenburgercheakbox.isSelected() && !burgerfield.getText().equals("")) {
            cost_of_meal = cost_of_meal + (10 * Double.parseDouble(burgerfield.getText()));
            mealcostshowfield.setText("" + cost_of_meal);
            burgerfield.setEditable(false);

        } else {
            burgerfield.setEditable(true);
            cost_of_meal = cost_of_meal - (10 * Double.parseDouble(burgerfield.getText()));
            mealcostshowfield.setText("" + cost_of_meal);

        }
    }//GEN-LAST:event_ChickenburgercheakboxActionPerformed

    private void ChichenburgermealcheakboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChichenburgermealcheakboxActionPerformed
        if (Chichenburgermealcheakbox.isSelected() && burgermealfield.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Write the Amount Of  Chicken Burger Meal.");
            burgermealfield.setEditable(false);
        } else if (Chichenburgermealcheakbox.isSelected() && !burgermealfield.getText().equals("")) {
            cost_of_meal = cost_of_meal + (20 * Double.parseDouble(burgermealfield.getText()));
            mealcostshowfield.setText("" + cost_of_meal);
            burgermealfield.setEditable(false);
        } else {
            burgermealfield.setEditable(true);
            cost_of_meal = cost_of_meal - (20 * Double.parseDouble(burgermealfield.getText()));
            mealcostshowfield.setText("" + cost_of_meal);
        }
    }//GEN-LAST:event_ChichenburgermealcheakboxActionPerformed

    private void BaconcheakboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BaconcheakboxActionPerformed
        if (Baconcheakbox.isSelected() && bacomfield.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Write the Amount Of  Chicken Burger Meal.");
            bacomfield.setEditable(false);
        } else if (Baconcheakbox.isSelected() && !bacomfield.getText().equals("")) {
            cost_of_meal = cost_of_meal + (25 * Double.parseDouble(bacomfield.getText()));
            mealcostshowfield.setText("" + cost_of_meal);
            bacomfield.setEditable(false);
        } else {
            bacomfield.setEditable(true);
            cost_of_meal = cost_of_meal - (25 * Double.parseDouble(bacomfield.getText()));
            mealcostshowfield.setText("" + cost_of_meal);
        }
    }//GEN-LAST:event_BaconcheakboxActionPerformed

    private void CombodrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CombodrinkActionPerformed
        //double cost_of_drink = 0;
        if (Combodrink.getSelectedItem().equals("Select a Drink")) {
            drinktax = 0;
            home_delivery_cost = 0;
            drinkshowfield.setText("");
        } else if (Combodrink.getSelectedItem().equals("Apple Juice")) {
            drinktax = 0.3;
            home_delivery_cost = 1;
            drinkshowfield.setText("15");
        } else if (Combodrink.getSelectedItem().equals("Tea")) {
            drinktax = 0.1;
            home_delivery_cost = 1;
            drinkshowfield.setText("5");
        } else if (Combodrink.getSelectedItem().equals("Cola")) {
            drinktax = 0.2;
            home_delivery_cost = 1;
            drinkshowfield.setText("12");
        } else if (Combodrink.getSelectedItem().equals("Ice cola")) {
            drinktax = 0.5;
            home_delivery_cost = 2;
            drinkshowfield.setText("20");
        } else if (Combodrink.getSelectedItem().equals("Cofee")) {
            drinktax = 0.4;
            home_delivery_cost = 2;
            drinkshowfield.setText("18");
        } else if (Combodrink.getSelectedItem().equals("Ice cofee")) {
            drinktax = 0.6;
            home_delivery_cost = 3;
            drinkshowfield.setText("25");
        } else if (Combodrink.getSelectedItem().equals("Orange")) {
            drinktax = 0.3;
            home_delivery_cost = 1;
            drinkshowfield.setText("15");
        }
    }//GEN-LAST:event_CombodrinkActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String backspace = null;
        if (display.getText().length() > 0) 
        {
            StringBuilder strB = new StringBuilder(display.getText());
            strB.deleteCharAt(display.getText().length() - 3);
            backspace = strB.toString();
            display.setText(backspace);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void plusminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusminusActionPerformed
        double ops = Double.parseDouble(String.valueOf(display.getText()));
        ops = ops * (-1);
        display.setText(String.valueOf(ops));
    }//GEN-LAST:event_plusminusActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String EnterNumber = display.getText() + jButton6.getText();
        display.setText(EnterNumber);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        String EnterNumber = display.getText() + jButton7.getText();
        display.setText(EnterNumber);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String EnterNumber = display.getText() + jButton8.getText();
        display.setText(EnterNumber);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        String EnterNumber = display.getText() + jButton10.getText();
        display.setText(EnterNumber);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        String EnterNumber = display.getText() + jButton11.getText();
        display.setText(EnterNumber);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        String EnterNumber = display.getText() + jButton12.getText();
        display.setText(EnterNumber);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        String EnterNumber = display.getText() + jButton14.getText();
        display.setText(EnterNumber);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        String EnterNumber = display.getText() + jButton15.getText();
        display.setText(EnterNumber);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here
        String EnterNumber = display.getText() + jButton16.getText();
        display.setText(EnterNumber);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        display.setText(null);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
        // TODO add your handling code here:
        firstNumber = Double.parseDouble(display.getText());
        display.setText("");
        operation = "+";

    }//GEN-LAST:event_plusActionPerformed

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
        // TODO add your handling code here:
        firstNumber = Double.parseDouble(display.getText());
        display.setText("");
        operation = "-";
    }//GEN-LAST:event_minusActionPerformed

    private void multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyActionPerformed
        // TODO add your handling code here:
        firstNumber = Double.parseDouble(display.getText());
        display.setText("");
        operation = "*";
    }//GEN-LAST:event_multiplyActionPerformed

    private void divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideActionPerformed
        // TODO add your handling code here:
        firstNumber = Double.parseDouble(display.getText());
        display.setText("");
        operation = "/";
    }//GEN-LAST:event_divideActionPerformed

    private void dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotActionPerformed
        // TODO add your handling code here:
        display.setText(display.getText() + dot.getText());
    }//GEN-LAST:event_dotActionPerformed

    private void EqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EqualActionPerformed
        String answer;
        SecoundNUmber = Double.parseDouble(display.getText());
        if (operation == "+") {
            Result = firstNumber + SecoundNUmber;
            answer = String.format("%.2f", Result);
            display.setText(answer);
        } else if (operation == "-") {
            Result = firstNumber - SecoundNUmber;
            answer = String.format("%.2f", Result);
            display.setText(answer);
        } else if (operation == "*") {
            Result = firstNumber * SecoundNUmber;
            answer = String.format("%.2f", Result);
            display.setText(answer);
        } else if (operation == "/") {
            Result = firstNumber / SecoundNUmber;
            answer = String.format("%.2f", Result);
            display.setText(answer);
        } else if (operation == "%") {
            int Result1 = (int) (firstNumber % SecoundNUmber);
            answer = String.format("%d", Result1);
            display.setText(answer);
        }


    }//GEN-LAST:event_EqualActionPerformed

    private void convertdisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertdisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_convertdisplayActionPerformed

    private void ConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConvertActionPerformed
       
            double taka = Double.parseDouble(convertfrom.getText());
            double takashow;
            if (jcmbcurrency.getSelectedItem().equals("Choose One")) {
                convertdisplay.setText("0.0");
            } else if (jcmbcurrency.getSelectedItem().equals("USA")) {
                takashow = taka * 78.8794;
                convertdisplay.setText("" + takashow);
            } else if (jcmbcurrency.getSelectedItem().equals("Nigeria")) {
                takashow = taka * 0.40;
                convertdisplay.setText("" + takashow);
            } else if (jcmbcurrency.getSelectedItem().equals("Keyania")) {
                takashow = taka * 0.78;
                convertdisplay.setText("" + takashow);
            } else if (jcmbcurrency.getSelectedItem().equals("Canada")) {
                takashow = taka * 61.73;
                convertdisplay.setText("" + takashow);
            } else if (jcmbcurrency.getSelectedItem().equals("Brazil")) {
                takashow = taka * 23.06;
                convertdisplay.setText("" + takashow);
            } else if (jcmbcurrency.getSelectedItem().equals("Indeonisia")) {
                takashow = taka * 0.0059;
                convertdisplay.setText("" + takashow);
            } else if (jcmbcurrency.getSelectedItem().equals("Philipine")) {
                takashow = taka * 1.71;
                convertdisplay.setText("" + takashow);
            }
        
    }//GEN-LAST:event_ConvertActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void TaxcheakboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TaxcheakboxActionPerformed
        double tax = 0;
        if (Taxcheakbox.isSelected()) {

            if (Chickenburgercheakbox.isSelected() && !burgerfield.getText().equals("") && Chichenburgermealcheakbox.isSelected() && !burgermealfield.getText().equals("") && Baconcheakbox.isSelected() && !bacomfield.getText().equals("")) {
                tax = drinktax + (0.5 * Double.parseDouble(burgerfield.getText()) + 0.7 * Double.parseDouble(burgermealfield.getText())
                        + 0.12 * Double.parseDouble(bacomfield.getText()));
                taxshowfield.setText("" + tax);
            } else if (Chickenburgercheakbox.isSelected() && !burgerfield.getText().equals("") && Chichenburgermealcheakbox.isSelected() && !burgermealfield.getText().equals("")) {
                tax = drinktax + (0.5 * Double.parseDouble(burgerfield.getText()) + 0.7 * Double.parseDouble(burgermealfield.getText()));
                taxshowfield.setText("" + tax);

            } else if (Chickenburgercheakbox.isSelected() && !burgerfield.getText().equals("") && Baconcheakbox.isSelected() && !bacomfield.getText().equals("")) {
                tax = drinktax + (0.5 * Double.parseDouble(burgerfield.getText()) + 0.12 * Double.parseDouble(bacomfield.getText()));
                taxshowfield.setText("" + tax);
            } else if (Chichenburgermealcheakbox.isSelected() && !burgermealfield.getText().equals("") && Baconcheakbox.isSelected() && !bacomfield.getText().equals("")) {
                tax = drinktax + (0.7 * Double.parseDouble(burgermealfield.getText()) + 0.12 * Double.parseDouble(bacomfield.getText()));
                taxshowfield.setText("" + tax);
            } else if (Chickenburgercheakbox.isSelected() && !burgerfield.getText().equals("")) {
                tax = drinktax + (0.5 * Double.parseDouble(burgerfield.getText()));
                taxshowfield.setText("" + tax);
            } else if (Chichenburgermealcheakbox.isSelected() && !burgermealfield.getText().equals("")) {
                tax = drinktax + (0.7 * Double.parseDouble(burgermealfield.getText()));
                taxshowfield.setText("" + tax);
            } else if (Baconcheakbox.isSelected() && !bacomfield.getText().equals("")) {
                tax = drinktax + (0.12 * Double.parseDouble(bacomfield.getText()));
                taxshowfield.setText("" + tax);
            } else {
                taxshowfield.setText("0.0");
            }

        } else {
            taxshowfield.setText("0.0");
        }
    }//GEN-LAST:event_TaxcheakboxActionPerformed

    private void TotalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalButtonActionPerformed
        double total1;
        if (!deliverycostshowfield.getText().equals("")) {
            total1 = Double.parseDouble(drinkshowfield.getText()) + Double.parseDouble(mealcostshowfield.getText())
                    + Double.parseDouble(deliverycostshowfield.getText());
        } else if (drinkshowfield.getText().equals("")) {
            total1 = Double.parseDouble(mealcostshowfield.getText())
                    + Double.parseDouble(deliverycostshowfield.getText());
        } else {
            total1 = Double.parseDouble(drinkshowfield.getText()) + Double.parseDouble(mealcostshowfield.getText());
        }

        double total2 = total1 + Double.parseDouble(taxshowfield.getText());
        subtotalshowfield.setText("" + total1);
        totalshowfield.setText("" + total2);
        convertfrom.setText(""+total2);
    }//GEN-LAST:event_TotalButtonActionPerformed

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
        mealcostshowfield.setText("");
        drinkshowfield.setText("");
        deliverycostshowfield.setText("");
        subtotalshowfield.setText("");
        taxshowfield.setText("");
        totalshowfield.setText("");
        convertdisplay.setText("");
        convertfrom.setText("");
        burgerfield.setText("");
        burgermealfield.setText("");
        bacomfield.setText("");

        recepttextfield.setText(null);
    }//GEN-LAST:event_ResetButtonActionPerformed

    private void ReceptpanelStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ReceptpanelStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ReceptpanelStateChanged

    private void ReciptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReciptButtonActionPerformed
        double s1 = Double.parseDouble(burgerfield.getText());
        double s2 = Double.parseDouble(burgermealfield.getText());
        double s3 = Double.parseDouble(bacomfield.getText());
        recepttextfield.append("\n\tRestaurant Manegment System \n" + "\nChicken Burger\t" + s1 + "\nChicken Burger Meal\t"
                + s2 + "\nBacon and Cheese Burger\t" + s3 + "\n\tThanks for using job Estimator .");

    }//GEN-LAST:event_ReciptButtonActionPerformed

    private void HomedeliverycheakboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomedeliverycheakboxActionPerformed
        double homecost = 0;
        if (Homedeliverycheakbox.isSelected()) {

            if (Chickenburgercheakbox.isSelected() && !burgerfield.getText().equals("") && Chichenburgermealcheakbox.isSelected() && !burgermealfield.getText().equals("") && Baconcheakbox.isSelected() && !bacomfield.getText().equals("")) {
                homecost = home_delivery_cost + (1 * Double.parseDouble(burgerfield.getText()) + 1.5 * Double.parseDouble(burgermealfield.getText())
                        + 2 * Double.parseDouble(bacomfield.getText()));
                deliverycostshowfield.setText("" + homecost);
            } else if (Chickenburgercheakbox.isSelected() && !burgerfield.getText().equals("") && Chichenburgermealcheakbox.isSelected() && !burgermealfield.getText().equals("")) {
                homecost = home_delivery_cost + (1 * Double.parseDouble(burgerfield.getText()) + 1.5 * Double.parseDouble(burgermealfield.getText()));
                deliverycostshowfield.setText("" + homecost);

            } else if (Chickenburgercheakbox.isSelected() && !burgerfield.getText().equals("") && Baconcheakbox.isSelected() && !bacomfield.getText().equals("")) {
                homecost = home_delivery_cost + (1 * Double.parseDouble(burgerfield.getText()) + 2 * Double.parseDouble(bacomfield.getText()));
                deliverycostshowfield.setText("" + homecost);
            } else if (Chichenburgermealcheakbox.isSelected() && !burgermealfield.getText().equals("") && Baconcheakbox.isSelected() && !bacomfield.getText().equals("")) {
                homecost = home_delivery_cost + (1.5 * Double.parseDouble(burgermealfield.getText()) + 2 * Double.parseDouble(bacomfield.getText()));
                deliverycostshowfield.setText("" + homecost);
            } else if (Chickenburgercheakbox.isSelected() && !burgerfield.getText().equals("")) {
                homecost = home_delivery_cost + (1 * Double.parseDouble(burgerfield.getText()));
                deliverycostshowfield.setText("" + homecost);
            } else if (Chichenburgermealcheakbox.isSelected() && !burgermealfield.getText().equals("")) {
                homecost = home_delivery_cost + (1.5 * Double.parseDouble(burgermealfield.getText()));
                deliverycostshowfield.setText("" + homecost);
            } else if (Baconcheakbox.isSelected() && !bacomfield.getText().equals("")) {
                homecost = home_delivery_cost + (2 * Double.parseDouble(bacomfield.getText()));
                deliverycostshowfield.setText("" + homecost);
            } else {
                deliverycostshowfield.setText("0.0");
            }

        } else {
            deliverycostshowfield.setText("0.0");
        }
    }//GEN-LAST:event_HomedeliverycheakboxActionPerformed

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        convertfrom.setText(null);
        convertdisplay.setText(null);
    }//GEN-LAST:event_CloseActionPerformed

    private void ConvertKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ConvertKeyPressed
       
    }//GEN-LAST:event_ConvertKeyPressed

    private void convertfromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertfromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_convertfromActionPerformed

    private void convertfromKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_convertfromKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_convertfromKeyTyped

    private void convertfromKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_convertfromKeyPressed
        if (evt.getKeyCode()== KeyEvent.VK_ENTER) {
            double taka = Double.parseDouble(totalshowfield.getText());
            
            double takashow;
            if (jcmbcurrency.getSelectedItem().equals("Choose One")) {
                convertdisplay.setText("0.0");
            } else if (jcmbcurrency.getSelectedItem().equals("USA")) {
                takashow = taka * 78.8794;
                convertdisplay.setText("" + takashow);
            } else if (jcmbcurrency.getSelectedItem().equals("Nigeria")) {
                takashow = taka * 0.40;
                convertdisplay.setText("" + takashow);
            } else if (jcmbcurrency.getSelectedItem().equals("Keyania")) {
                takashow = taka * 0.78;
                convertdisplay.setText("" + takashow);
            } else if (jcmbcurrency.getSelectedItem().equals("Canada")) {
                takashow = taka * 61.73;
                convertdisplay.setText("" + takashow);
            } else if (jcmbcurrency.getSelectedItem().equals("Brazil")) {
                takashow = taka * 23.06;
                convertdisplay.setText("" + takashow);
            } else if (jcmbcurrency.getSelectedItem().equals("Indeonisia")) {
                takashow = taka * 0.0059;
                convertdisplay.setText("" + takashow);
            } else if (jcmbcurrency.getSelectedItem().equals("Philipine")) {
                takashow = taka * 1.71;
                convertdisplay.setText("" + takashow);
            }
        }
    }//GEN-LAST:event_convertfromKeyPressed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Restaurents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Baconcheakbox;
    private javax.swing.JCheckBox Chichenburgermealcheakbox;
    private javax.swing.JCheckBox Chickenburgercheakbox;
    private javax.swing.JButton Close;
    private javax.swing.JComboBox<String> Combodrink;
    private javax.swing.JButton Convert;
    private javax.swing.JButton Equal;
    private javax.swing.JButton ExitButton;
    private javax.swing.JCheckBox Homedeliverycheakbox;
    private javax.swing.JTabbedPane Receptpanel;
    private javax.swing.JButton ReciptButton;
    private javax.swing.JButton ResetButton;
    private javax.swing.JCheckBox Taxcheakbox;
    private javax.swing.JButton TotalButton;
    private javax.swing.JTextField bacomfield;
    private javax.swing.JTextField burgerfield;
    private javax.swing.JTextField burgermealfield;
    private javax.swing.JTextField convertdisplay;
    private javax.swing.JTextField convertfrom;
    private javax.swing.JTextField deliverycostshowfield;
    private javax.swing.JTextField display;
    private javax.swing.JButton divide;
    private javax.swing.JButton dot;
    private javax.swing.JLabel drink;
    private javax.swing.JTextField drinkshowfield;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcmbcurrency;
    private javax.swing.JTextField mealcostshowfield;
    private javax.swing.JButton minus;
    private javax.swing.JButton multiply;
    private javax.swing.JButton plus;
    private javax.swing.JButton plusminus;
    private javax.swing.JTextArea recepttextfield;
    private javax.swing.JTextField subtotalshowfield;
    private javax.swing.JTextField taxshowfield;
    private javax.swing.JTextField totalshowfield;
    // End of variables declaration//GEN-END:variables
}
