package app.penjualan.smartphones;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Transaksi extends javax.swing.JFrame {

    public Statement s;
    public ResultSet rs;
    public DefaultTableModel tm;
    boolean edit;
    private String S_namas,S_merks,skode,sk;
    private double st,tot;
    private Date tgl;
    Connection cn = KonekDB.koneksi();
    
    public Transaksi() {
        initComponents();
        setVisible(true);
        Judul();
        Tampil("");
        Refresh();
        bersihkeranjang();
        btntambah.requestFocus();
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
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btntambah = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnbatal = new javax.swing.JButton();
        txtharga = new javax.swing.JTextField();
        txtjumlah = new javax.swing.JTextField();
        cmbmerk = new javax.swing.JComboBox<>();
        cmbnama = new javax.swing.JComboBox<>();
        btnsimpan = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnbeli = new javax.swing.JButton();
        btnrefresh = new javax.swing.JButton();
        btnkeluar = new javax.swing.JButton();
        btnhitung = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        txtbayar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtnotrans = new javax.swing.JTextField();
        txtrc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setText("Merk Smartphone");

        jLabel6.setText("Nama Smartphone");

        jLabel7.setText("Harga");

        jLabel8.setText("Jumlah");

        btntambah.setText("Tambah");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });

        btnedit.setText("Edit");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btnhapus.setText("Hapus");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        btnbatal.setText("batal");
        btnbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbatalActionPerformed(evt);
            }
        });

        txtharga.setText("jTextField3");

        txtjumlah.setText("jTextField4");
        txtjumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtjumlahKeyPressed(evt);
            }
        });

        cmbmerk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbmerk.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbmerkItemStateChanged(evt);
            }
        });
        cmbmerk.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbmerkFocusLost(evt);
            }
        });
        cmbmerk.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                cmbmerkInputMethodTextChanged(evt);
            }
        });
        cmbmerk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbmerkActionPerformed(evt);
            }
        });

        cmbnama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbnama.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbnamaItemStateChanged(evt);
            }
        });
        cmbnama.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbnamaFocusLost(evt);
            }
        });
        cmbnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbnamaActionPerformed(evt);
            }
        });

        btnsimpan.setText("Simpan");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtjumlah)
                            .addComponent(txtharga)
                            .addComponent(cmbnama, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cmbmerk, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 22, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btntambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnsimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnedit, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnbatal, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbmerk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtjumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btntambah)
                    .addComponent(btnsimpan)
                    .addComponent(btnedit))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnhapus)
                    .addComponent(btnbatal))
                .addGap(19, 19, 19))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnbeli.setText("Beli");
        btnbeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbeliActionPerformed(evt);
            }
        });

        btnrefresh.setText("Refresh");
        btnrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefreshActionPerformed(evt);
            }
        });

        btnkeluar.setText("Keluar");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });

        btnhitung.setText("Hitung");
        btnhitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhitungActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnbeli, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnrefresh))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnkeluar, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(btnhitung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbeli)
                    .addComponent(btnhitung))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnrefresh)
                    .addComponent(btnkeluar))
                .addGap(31, 31, 31))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Transaksi Smartphone");

        jLabel2.setText("Total");

        jLabel3.setText("Bayar");

        txttotal.setText("aaaa");

        txtbayar.setText("jTextField6");

        jLabel9.setText("No. Transaksi");

        txtnotrans.setText("jTextField1");

        txtrc.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(241, 241, 241))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txtnotrans, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(102, 102, 102)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txttotal)
                                    .addComponent(txtbayar, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)))
                            .addComponent(txtrc))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(32, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtnotrans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtrc)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtbayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(937, 593));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefreshActionPerformed
        Refresh();
    }//GEN-LAST:event_btnrefreshActionPerformed

    private void cmbmerkItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbmerkItemStateChanged
        cmbnama.requestFocus();
    }//GEN-LAST:event_cmbmerkItemStateChanged

    private void btnbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbatalActionPerformed
        Refresh();
    }//GEN-LAST:event_btnbatalActionPerformed

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
        bersihkeranjang();
        this.dispose();
    }//GEN-LAST:event_btnkeluarActionPerformed

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        clear();
        cmbmerk.removeAllItems();
        cmbnama.removeAllItems();
        isiDatamerk();
        cmbmerk.setSelectedIndex(0);
        cmbmerk.requestFocus();
    }//GEN-LAST:event_btntambahActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        edit=true;
        clear();
        cmbmerk.setEnabled(false);
        cmbnama.setEnabled(false);
        btnsimpan.setText("Update");
    }//GEN-LAST:event_btneditActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        try{
            int a;
            
            if((a=JOptionPane.showConfirmDialog(null,"Hapus Data?","Confirmation",JOptionPane.YES_NO_OPTION))==0){
                s = cn.createStatement();
                s.executeUpdate("Delete From tb_keranjang_jual Where nama='"+tm.getValueAt(jTable1.getSelectedRow(),0)+"'");
                Tampil("");
                Refresh();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnhapusActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        S_namas=(jTable1.getValueAt(jTable1.getSelectedRow(),0).toString());
        S_merks=(jTable1.getValueAt(jTable1.getSelectedRow(),1).toString());
        cmbnama.setSelectedItem(S_namas);
        cmbmerk.setSelectedItem(S_merks);
        txtharga.setText(jTable1.getValueAt(jTable1.getSelectedRow(),3).toString());
        txtjumlah.setText(jTable1.getValueAt(jTable1.getSelectedRow(),2).toString());
        
        btntambah.setEnabled(false);
        btnsimpan.setEnabled(false);
        btnedit.setEnabled(true);
        btnhapus.setEnabled(true);
        btnbatal.setEnabled(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        try{
            s = cn.createStatement();
            if (cmbnama.getSelectedItem().equals("")||cmbmerk.getSelectedItem().equals("")||txtharga.getText().equals("")||txtjumlah.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Masih ada Data Kosong!");
            }else{
                  Translogic tl = new Translogic();
                  tl.setHargaSatuan(Double.parseDouble(txtharga.getText()));
                  tl.setJumlah(Double.parseDouble(txtjumlah.getText()));
                  st=tl.getsubTotal();
            if(edit){
                s.executeUpdate("UPDATE tb_keranjang_jual set "+"qty='"+txtjumlah.getText()+"',"+"sub_total='"+st+"'WHERE nama='"+S_namas+"'");
                JOptionPane.showMessageDialog(null,"Berhasil Ter-Update");
                 Tampil("");
                 Refresh();
            }else{
                if(cariData("Where nama like '%"+cmbnama.getSelectedItem()+"%'")){                    
                    JOptionPane.showMessageDialog(null,"Data Sudah ada!");
                    Tampil("");
                }else{
                    if(cekstock("Where nama like '%"+cmbnama.getSelectedItem()+"%'")<(Integer.parseInt(txtjumlah.getText()))){
                        JOptionPane.showMessageDialog(null,"Stock habis");
                    }else{
                s.executeUpdate("INSERT INTO tb_keranjang_jual(merk,nama,qty,harga,sub_total) VALUES('"+cmbmerk.getSelectedItem()+"','"+cmbnama.getSelectedItem()+"','"
                                +txtjumlah.getText()+"','"+txtharga.getText()+"','"+st+"')");
                JOptionPane.showMessageDialog(null,"Berhasil Disimpan");
                Tampil("");
                Refresh();
                }   
            }
            }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void cmbnamaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbnamaItemStateChanged
        txtjumlah.requestFocus();
    }//GEN-LAST:event_cmbnamaItemStateChanged

    private void txtjumlahKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtjumlahKeyPressed

    }//GEN-LAST:event_txtjumlahKeyPressed

    private void btnhitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhitungActionPerformed
        String total;
        Translogic tl = new Translogic();
                try{
                    tot=tl.getTotal();
                    total=String.format("%.0f", tot);
                    txttotal.setText(total);
                    txtbayar.setEnabled(true);
                    txtbayar.requestFocus();
                    btnbeli.setEnabled(true);
                }catch(Exception e){}
    }//GEN-LAST:event_btnhitungActionPerformed

    private void btnbeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbeliActionPerformed
        double bayar,total;
        String sql1,sql2,sql3;
        Integer rw = jTable1.getRowCount();
        
        bayar=Double.parseDouble(txtbayar.getText());
        total=Double.parseDouble(txttotal.getText());
        int jawab;
        if((jawab = JOptionPane.showConfirmDialog(null, "Lanjutkan Pembelian?", "Konfirmasi", JOptionPane.YES_NO_OPTION)) == 0){
       try{ 
        if(txtbayar.getText().equals(" ")){
            JOptionPane.showMessageDialog(null,"Isi Pembayaran!");
            txtbayar.requestFocus();
        }else if(bayar<total){
            JOptionPane.showMessageDialog(null,"Pembayaran Tidak mencukupi!");
            txtbayar.requestFocus();
        }else{
            s=cn.createStatement();
            for(int i = 0;i<rw;i++) {
             String nama = jTable1.getValueAt(i,0).toString();
             String merk = jTable1.getValueAt(i,1).toString();
             Double harga = Double.parseDouble(jTable1.getValueAt(i,2).toString());
             Integer qty = Integer.parseInt(jTable1.getValueAt(i,3).toString());
             Double sub = Double.parseDouble(jTable1.getValueAt(i,4).toString());
             String notrans = txtnotrans.getText();
             
             sql1="INSERT INTO tb_jual_detail (nama,merk,harga,qty,sub_total,no_transaksi) VALUES('"+nama+"','"+merk+"','"+harga+"','"+qty+"','"+sub+"','"+notrans+"')";
             sql2="UPDATE tb_smartphone set "+"stock=stock-'"+qty+"'WHERE nama='"+nama+"'";
             s.executeUpdate(sql1);
             s.executeUpdate(sql2);
            }
            
            sql3="INSERT INTO tb_jual (no_transaksi,tgl_jual,total) VALUES('"+
                    txtnotrans.getText()+"','"+LocalDate.now()+"','"+total+"')";
            s.executeUpdate(sql3);
            JOptionPane.showMessageDialog(null,"Pembayaran Tersimpan");
            bersihkeranjang();
            Refresh();
            Tampil("");
        }
       }catch(Exception e){
           e.printStackTrace();
       }
        }
    }//GEN-LAST:event_btnbeliActionPerformed

    private void cmbmerkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbmerkActionPerformed
      
    }//GEN-LAST:event_cmbmerkActionPerformed

    private void cmbnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbnamaActionPerformed
     
    }//GEN-LAST:event_cmbnamaActionPerformed

    private void cmbmerkFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbmerkFocusLost
        String merk= String.valueOf(cmbmerk.getSelectedItem());
        cmbnama.removeAllItems();
        isiDatanama(merk); 
    }//GEN-LAST:event_cmbmerkFocusLost

    private void cmbmerkInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_cmbmerkInputMethodTextChanged
     
    }//GEN-LAST:event_cmbmerkInputMethodTextChanged

    private void cmbnamaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbnamaFocusLost
        String harga= String.valueOf(cmbnama.getSelectedItem());
        txtharga.setText("");
        isiharga(harga);
    }//GEN-LAST:event_cmbnamaFocusLost

     public void Judul(){
        Object[]judul={"NAMA SMARTPHONE","MEREK","HARGA","QTY","SUB TOTAL HARGA"};
        tm = new DefaultTableModel(null,judul);
        jTable1.setModel(tm);
    }
    
    public void Tampil(String where){
        try{
            s=cn.createStatement();
            tm.getDataVector().removeAllElements();
            tm.fireTableDataChanged();
            rs = s.executeQuery("SELECT * FROM tb_keranjang_jual"+where);
            
            while(rs.next()){
                Object[]data={
                    rs.getString("nama"),
                    rs.getString("merk"),
                    rs.getString("harga"),
                    rs.getString("qty"),
                    rs.getString("sub_total"),
                };
                tm.addRow(data);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    public void Refresh(){
        Integer rc;
        
        cmbmerk.removeAllItems();
        cmbnama.removeAllItems();
        txtharga.setText("");
        txtjumlah.setText("");
        txttotal.setText("");
        txtbayar.setText("");
        
        cmbmerk.setEnabled(false);
        cmbnama.setEnabled(false);
        txtharga.setEnabled(false);
        txtjumlah.setEnabled(false);
        txttotal.setEnabled(false);
        txtbayar.setEnabled(false);

        btntambah.setEnabled(true);
        btnsimpan.setEnabled(false);
        btnedit.setEnabled(false);
        btnhapus.setEnabled(false);
        btnbatal.setEnabled(false);
        btnbeli.setEnabled(false);
        btnsimpan.setText("Simpan");
        autokode();
        
        txtrc.setText("Total barang di keranjang: "+String.valueOf(jTable1.getRowCount()));
        
        rc=jTable1.getRowCount();
        if (rc >= 1){
            btnhitung.setEnabled(true);
            btnhitung.requestFocus();
        }else{

            btnhitung.setEnabled(false);
        } 
        edit = false;
    }
    
    public void clear(){
    cmbmerk.setEnabled(true);
    cmbnama.setEnabled(true);
    txtharga.setEnabled(false);
    txtjumlah.setEnabled(true);
    
    btntambah.setEnabled(false);
    btnedit.setEnabled(false);
    btnhapus.setEnabled(false);
    btnsimpan.setEnabled(true);
    btnbatal.setEnabled(true);
}
    
    public Boolean cariData(String where){
        try {
        s = cn.createStatement();
        tm.getDataVector().removeAllElements();
        tm.fireTableDataChanged();
        rs = s.executeQuery("SELECT * FROM tb_keranjang_jual " + where);

        while (rs.next()) {
          Object[] data = {
              rs.getString("nama"),
          };
          tm.addRow(data);
          return (true);
        }
        return (false);
      }catch(Exception e) {
        e.printStackTrace();
      }return(false);
    }
    
    public Integer cekstock(String where){
        Integer stk;
        try {
        s = cn.createStatement();
        tm.getDataVector().removeAllElements();
        tm.fireTableDataChanged();
        rs = s.executeQuery("SELECT * FROM tb_smartphone " + where);

        while (rs.next()) {
          Object[] data = {
              stk=Integer.parseInt(rs.getString("stock")),
          };
          tm.addRow(data);
          return(stk);
        }
        return (0);
      }catch(Exception e) {
        e.printStackTrace();
      }return(0);
    }
    
    public void isiDatamerk() {
      try {
        s = cn.createStatement();
        rs = s.executeQuery("SELECT nama_merk FROM tb_merk");

        while (rs.next()) {
          cmbmerk.addItem(rs.getString(1));
        }
      }catch(Exception e) {
        e.printStackTrace();
      }
    }
    
    public void isiDatanama(String a) {
      try {
        s = cn.createStatement();
        rs = s.executeQuery("SELECT nama FROM tb_smartphone WHERE merk='"+ a+"'");

        while (rs.next()) {
          cmbnama.addItem(rs.getString(1));
        }
      }catch(Exception e) {
        e.printStackTrace();
      }
    }
    
    public void isiharga(String a) {
      try {
        s = cn.createStatement();
        rs = s.executeQuery("SELECT harga FROM tb_smartphone WHERE nama='"+ a+"'");

        while (rs.next()) {
          txtharga.setText(rs.getString(1));
        }
      }catch(Exception e) {
        e.printStackTrace();
      }
    }
    
    public void bersihkeranjang(){
        try {
            String sql = "DELETE FROM `tb_keranjang_jual`";
            s=cn.createStatement();
            s.executeUpdate(sql);
            
        } catch (Exception e) {
        }
    }
   
    public void autokode(){
        try {
            s=cn.createStatement();
            rs=s.executeQuery("Select max(id) from tb_jual");
            if(rs.next()){
                int a=rs.getInt(1);
                        txtnotrans.setText("T-"+Integer.toString(a+1));
            }
        } catch (Exception e) {
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbatal;
    private javax.swing.JButton btnbeli;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnhitung;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btnrefresh;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JButton btntambah;
    private javax.swing.JComboBox<String> cmbmerk;
    private javax.swing.JComboBox<String> cmbnama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtbayar;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtjumlah;
    private javax.swing.JTextField txtnotrans;
    private javax.swing.JLabel txtrc;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
