/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import method.dataobat.DataObat;
import method.dataobat.ObatControl;

/**
 *
 * @author ASUS
 */
public class dataobat extends javax.swing.JFrame {
    int x = 0;
    private DefaultTableModel model;
    ObatControl ob = new ObatControl();
    DataObat DO = new DataObat();
    List<DataObat> ListObat = new ArrayList<DataObat>();
    
    /**
     * Creates new form dataobat
     */
    public dataobat() throws SQLException{
        initComponents();
        buatTable();
        showTable();
        bersih();
        siapIsi(false);
        tombolNormal();
        this.setLocationRelativeTo(null);
        tampilx();
    }

    public void buatTable(){
        model = new DefaultTableModel();
        model.addColumn("Kode Obat");
        model.addColumn("Nama Obat");
        model.addColumn("Satuan");
        model.addColumn("Stok");
        model.addColumn("Harga Kontrak");
        model.addColumn("Harga Beli");
        jTable1.setModel(model);
    }
    
    private void showTable(){
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        ListObat.clear();
        ListObat = ob.tampil();
            for(x=0; x<ListObat.size() ; x++){
                Object[] data = new Object[6];
                data[0] = ListObat.get(x).getKdobat();
                data[1] = ListObat.get(x).getNmobat();
                data[2] = ListObat.get(x).getSatuan();
                data[3] = ListObat.get(x).getJmlstok();
                data[4] = ListObat.get(x).getHrgkontrak();
                data[5] = ListObat.get(x).getHrgbeli();
                model.addRow(data);
            }   
    }
    
    private void buatKdBarang(){
        ListObat = ob.tampil();
        int a = ListObat.size()-1;
        int no = Integer.parseInt(ListObat.get(a).getKdobat().replace("A-", ""))+1;
        kdobat.setText("A-"+no);
        kdobat.setEnabled(false);
    }
    
    private void siapIsi(boolean a){
        kdobat.setEnabled(a);
        nmobat.setEnabled(a);
        cmbsatuan.setEnabled(a);
        tstok.setEnabled(a);
        hrgkontrak.setEnabled(a);
        hrgbeli.setEnabled(a);
    }
    
    private void bersih(){
        kdobat.setText("");
        nmobat.setText("");
        cmbsatuan.setSelectedItem("Pilih");
        tstok.setText("");
        hrgkontrak.setText("");
        hrgbeli.setText("");
    }
    
    private void tombolNormal(){
        btnsimpan.setEnabled(false);
        btnedit.setEnabled(false);
        btnhapus.setEnabled(false);
    }
    
    private void tombolKembali(){
        btnsimpan.setEnabled(true);
        btnhapus.setEnabled(true);
        
    }
    
    public void tampilx() throws SQLException{
        int jmlobat = ob.getJumlahObat();
        txtjml.setText(String.valueOf(jmlobat));
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nmobat = new javax.swing.JTextField();
        kdobat = new javax.swing.JTextField();
        tstok = new javax.swing.JTextField();
        hrgkontrak = new javax.swing.JTextField();
        hrgbeli = new javax.swing.JTextField();
        cmbsatuan = new javax.swing.JComboBox<>();
        btnsimpan = new javax.swing.JButton();
        btntambah = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tcari = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtjml = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(170, 0, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setText("Data Obat");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(345, 345, 345)
                .addComponent(jLabel1)
                .addContainerGap(390, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 100));

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 19)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Kode Obat");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nama Obat");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Satuan");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Jumlah Stok Obat");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Harga Kontrak");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Harga Beli");

        nmobat.setBackground(new java.awt.Color(44, 62, 80));
        nmobat.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        nmobat.setForeground(new java.awt.Color(255, 255, 255));
        nmobat.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        kdobat.setBackground(new java.awt.Color(44, 62, 80));
        kdobat.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        kdobat.setForeground(new java.awt.Color(255, 255, 255));
        kdobat.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tstok.setBackground(new java.awt.Color(44, 62, 80));
        tstok.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        tstok.setForeground(new java.awt.Color(255, 255, 255));
        tstok.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        hrgkontrak.setBackground(new java.awt.Color(44, 62, 80));
        hrgkontrak.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        hrgkontrak.setForeground(new java.awt.Color(255, 255, 255));
        hrgkontrak.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        hrgbeli.setBackground(new java.awt.Color(44, 62, 80));
        hrgbeli.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        hrgbeli.setForeground(new java.awt.Color(255, 255, 255));
        hrgbeli.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cmbsatuan.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        cmbsatuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "Sirup", "Salep", "Botol", "Kapsul" }));
        cmbsatuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbsatuanActionPerformed(evt);
            }
        });

        btnsimpan.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconcrud/icons8_Save_as_25px.png"))); // NOI18N
        btnsimpan.setText("Simpan");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        btntambah.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btntambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconcrud/icons8_Plus_25px.png"))); // NOI18N
        btntambah.setText("Tambah");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });

        btnedit.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconcrud/icons8_Available_Updates_25px.png"))); // NOI18N
        btnedit.setText("Edit");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btnhapus.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconcrud/icons8_Trash_Can_25px.png"))); // NOI18N
        btnhapus.setText("Hapus");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nama Obat & Satuan");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Jenis Obat");

        tcari.setBackground(new java.awt.Color(44, 62, 80));
        tcari.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        tcari.setForeground(new java.awt.Color(255, 255, 255));
        tcari.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcariActionPerformed(evt);
            }
        });
        tcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tcariKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Cari Berdasarkan");

        txtjml.setFont(new java.awt.Font("Times New Roman", 1, 47)); // NOI18N
        txtjml.setForeground(new java.awt.Color(255, 255, 255));
        txtjml.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtjml.setText("100");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Jumlah Obat");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addGap(121, 121, 121)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nmobat, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kdobat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtjml, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(tcari, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tstok, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hrgkontrak, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hrgbeli, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbsatuan, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btntambah)
                        .addGap(29, 29, 29)
                        .addComponent(btnedit)
                        .addGap(40, 40, 40)
                        .addComponent(btnhapus)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 939, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(kdobat, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(nmobat, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cmbsatuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(tstok, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnsimpan)
                                    .addComponent(btntambah)
                                    .addComponent(btnedit)
                                    .addComponent(btnhapus)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(hrgkontrak, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10)
                                    .addComponent(hrgbeli, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(tcari, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(182, 182, 182)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtjml)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel4)))))
                .addGap(575, 575, 575))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 950, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        if (btntambah.getText().equalsIgnoreCase("Tambah")){
            btntambah.setText("Batal");
            bersih();
            siapIsi(true);
            buatKdBarang();
            nmobat.requestFocus();
            tombolKembali();
        }else{
            btntambah.setText("Tambah");
            bersih();
            siapIsi(false);
            tombolNormal();
        }
    }//GEN-LAST:event_btntambahActionPerformed

    private void cmbsatuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbsatuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbsatuanActionPerformed

    private void tcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tcariActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        if (nmobat.getText().isEmpty() || cmbsatuan.getSelectedItem().equals("") || tstok.getText().isEmpty() || hrgkontrak.getText().isEmpty()
                ||hrgbeli.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Data Harus Lengkap", "Aplikasi Apotek", JOptionPane.INFORMATION_MESSAGE);
            
        }else{
            DO.setKdobat(kdobat.getText());
            DO.setNmobat(nmobat.getText());
            DO.setSatuan(cmbsatuan.getSelectedItem().toString());
            DO.setJmlstok(Integer.parseInt(tstok.getText()));
            DO.setHrgkontrak(Integer.parseInt(hrgkontrak.getText()));
            DO.setHrgbeli(Integer.parseInt(hrgbeli.getText()));
            if (btntambah.getText().equalsIgnoreCase("Batal")){
                if (ob.tambahobat(DO)==1){
                    JOptionPane.showMessageDialog(null, "Data Telah disimpan", "Aplikasi Apotek", JOptionPane.INFORMATION_MESSAGE);
                    buatTable();
                    showTable();
                    try {
                        tampilx();
                    } catch (SQLException ex) {
                        Logger.getLogger(dataobat.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Data Gagal disimpan", "Aplikasi Apotek", JOptionPane.INFORMATION_MESSAGE);
                }
            }
           if(btnedit.getText().equalsIgnoreCase("Batal")){
               if(ob.editObat(DO)==1){
                   JOptionPane.showMessageDialog(null, "Data Telah diubah", "Aplikasi Apotek", JOptionPane.INFORMATION_MESSAGE);
                   buatTable();
                   showTable();
               }else{
                   JOptionPane.showMessageDialog(null, "Data Gagal diubah", "Aplikasi Apotek", JOptionPane.INFORMATION_MESSAGE);
               }
           }
           bersih();
           siapIsi(false);
           btntambah.setText("tambah");
           btnedit.setText("Edit");
           tombolNormal();
        }
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int baris = jTable1.getSelectedRow();
        kdobat.setText(jTable1.getModel().getValueAt(baris, 0).toString());
        nmobat.setText(jTable1.getModel().getValueAt(baris, 1).toString());
        cmbsatuan.setSelectedItem(jTable1.getModel().getValueAt(baris, 2).toString());
        tstok.setText(jTable1.getModel().getValueAt(baris, 3).toString());
        hrgkontrak.setText(jTable1.getModel().getValueAt(baris, 4).toString());
        hrgbeli.setText(jTable1.getModel().getValueAt(baris, 5).toString());
        siapIsi(false);
        btnhapus.setEnabled(true);
        btnedit.setEnabled(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        if (btnedit.getText().equalsIgnoreCase("Edit")){
            btnedit.setText("Batal");
            siapIsi(true);
            kdobat.setEnabled(false);
            btntambah.setEnabled(false);
            btnsimpan.setEnabled(true);
            btnhapus.setEnabled(false);
            btnedit.setEnabled(true);
            
        }else{
            btnedit.setText("Edit");
            bersih();
            siapIsi(false);
            tombolNormal();
        }
    }//GEN-LAST:event_btneditActionPerformed

    private void tcariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tcariKeyReleased
        String cari = null;
        cari = tcari.getText();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        ListObat.clear();
        ListObat=ob.cariObat(cari);
        for (int x=0 ; x<ListObat.size() ; x++){
            Object[] data = new Object[6];
            data[0] = ListObat.get(x).getKdobat();
            data[1] = ListObat.get(x).getNmobat();
            data[2] = ListObat.get(x).getSatuan();
            data[3] = ListObat.get(x).getJmlstok();
            data[4] = ListObat.get(x).getHrgkontrak();
            data[5] = ListObat.get(x).getHrgbeli();
            model.addRow(data);
        }
    }//GEN-LAST:event_tcariKeyReleased

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        DO.setKdobat(kdobat.getText());
        int pesan = JOptionPane.showConfirmDialog(null, "Data akan disimpan ?", "Konfirmasi", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (ob.deleteObat(DO)==1){
            JOptionPane.showMessageDialog(null, "Data telah dihapus");
            bersih();
            siapIsi(false);
            tombolNormal();
            buatTable();
            showTable();
            try {
                tampilx();
            } catch (SQLException ex) {
                Logger.getLogger(dataobat.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Data gagal dihapus");
        }
    }//GEN-LAST:event_btnhapusActionPerformed

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
            java.util.logging.Logger.getLogger(dataobat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dataobat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dataobat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dataobat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new dataobat().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(dataobat.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JButton btntambah;
    private javax.swing.JComboBox<String> cmbsatuan;
    private javax.swing.JTextField hrgbeli;
    private javax.swing.JTextField hrgkontrak;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField kdobat;
    private javax.swing.JTextField nmobat;
    private javax.swing.JTextField tcari;
    private javax.swing.JTextField tstok;
    private javax.swing.JLabel txtjml;
    // End of variables declaration//GEN-END:variables
}
