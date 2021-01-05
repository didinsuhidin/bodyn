import Database.KoneksiDatabase;
import Database.ResultSetTable;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.PrintJob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 *
 * @author User
 */
public class Form_Pengembalian extends javax.swing.JInternalFrame {

    ResultSet rs;
    KoneksiDatabase con;
    String status1;
    /**
     * Creates new form Form_Pengembalian
     */
    public Form_Pengembalian() {
        initComponents();
        con = new KoneksiDatabase(new Database.Parameter().HOST_DB, new Database.Parameter().USERNAME_DB, new Database.Parameter().PASSWORD_DB);
        
        initComponents();
        loadTabel();
        loadMobil();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_transaksi1 = new javax.swing.JTable();
        panelGlass2 = new usu.widget.glass.PanelGlass();
        btn_kembalikan_mobil = new usu.widget.ButtonGlass();
        jLabel36 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        lbl_harga = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lbl_Lama = new javax.swing.JLabel();
        boxnopol = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lbl_nama = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        lbl_tgl_peminjaman = new javax.swing.JLabel();
        lbl_tgl_kembali = new javax.swing.JLabel();
        lbl_hari = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_transaksi = new javax.swing.JTable();
        btn_refresh = new usu.widget.ButtonGlass();
        btn_print = new usu.widget.ButtonGlass();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_total = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Form Pengembalian Mobil");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        table_transaksi1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nama  Peminjam", "No Polisi", "Harga", "Tgl Pinjam", "Tgl Kembali", "Lama Pinjam", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table_transaksi1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_transaksi1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table_transaksi1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 970, 170));

        panelGlass2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_kembalikan_mobil.setForeground(new java.awt.Color(255, 255, 255));
        btn_kembalikan_mobil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/kembali_mobil.png"))); // NOI18N
        btn_kembalikan_mobil.setText("Kembalikan Mobil");
        btn_kembalikan_mobil.setRoundRect(true);
        btn_kembalikan_mobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kembalikan_mobilActionPerformed(evt);
            }
        });
        panelGlass2.add(btn_kembalikan_mobil, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 220, 110));

        jLabel36.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Lama Pinjaman");
        panelGlass2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 110, -1));

        jLabel33.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Harga (/hari)");
        panelGlass2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel38.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText(":");
        panelGlass2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 190, 17, -1));

        jLabel34.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText(":");
        panelGlass2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 16, -1));

        lbl_harga.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_harga.setForeground(new java.awt.Color(255, 255, 255));
        lbl_harga.setText("lbl_harga");
        panelGlass2.add(lbl_harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 79, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText(":");
        panelGlass2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 14, -1));

        lbl_Lama.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_Lama.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Lama.setText("lama");
        panelGlass2.add(lbl_Lama, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 180, -1, -1));

        boxnopol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxnopolActionPerformed(evt);
            }
        });
        panelGlass2.add(boxnopol, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 112, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("No. Polisi");
        panelGlass2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 75, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        panelGlass2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 110, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nama Peminjam");
        panelGlass2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 93, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText(":");
        panelGlass2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 90, 14, -1));

        lbl_nama.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbl_nama.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nama.setText("lbl_nama");
        panelGlass2.add(lbl_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 86, -1, -1));

        jLabel32.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Tanggal Peminjaman");
        panelGlass2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, -1, -1));

        jLabel35.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Tanggal Pengembalian");
        panelGlass2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, -1, -1));

        jLabel37.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText(":");
        panelGlass2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 140, 16, -1));

        jLabel39.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText(":");
        panelGlass2.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, 12, -1));

        lbl_tgl_peminjaman.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_tgl_peminjaman.setForeground(new java.awt.Color(255, 255, 255));
        lbl_tgl_peminjaman.setText("lbl_pinjam");
        panelGlass2.add(lbl_tgl_peminjaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 90, 79, -1));

        lbl_tgl_kembali.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_tgl_kembali.setForeground(new java.awt.Color(255, 255, 255));
        lbl_tgl_kembali.setText("lbl_kembali");
        panelGlass2.add(lbl_tgl_kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 140, 79, -1));

        lbl_hari.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_hari.setForeground(new java.awt.Color(255, 255, 255));
        lbl_hari.setText("hari");
        panelGlass2.add(lbl_hari, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 180, -1, -1));

        table_transaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nama  Peminjam", "No Polisi", "Harga", "Tgl Pinjam", "Tgl Kembali", "Lama Pinjam", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_transaksi);

        panelGlass2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 940, 210));

        btn_refresh.setForeground(new java.awt.Color(255, 255, 255));
        btn_refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/small ktp.png"))); // NOI18N
        btn_refresh.setText("View Data Peminjam");
        btn_refresh.setRoundRect(true);
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });
        panelGlass2.add(btn_refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, 210, 110));

        btn_print.setForeground(new java.awt.Color(255, 255, 255));
        btn_print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/resi.png"))); // NOI18N
        btn_print.setText("Cetak Resi Pembayaran ");
        btn_print.setRoundRect(true);
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });
        panelGlass2.add(btn_print, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 210, 110));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("DATA TRANSAKSI SEWA MOBIL");
        panelGlass2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TOTAL.");
        panelGlass2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Rp.");
        panelGlass2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 140, -1, -1));

        lbl_total.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_total.setForeground(new java.awt.Color(204, 0, 0));
        lbl_total.setText("Tagihan");
        panelGlass2.add(lbl_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 140, 80, -1));

        getContentPane().add(panelGlass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 970, 390));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bgb.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boxnopolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxnopolActionPerformed
        // TODO add your handling code here:
        String st = (String) boxnopol.getSelectedItem();
        ResultSet rst = con.querySelectAll("tb_transaksi", "nopol='" + st + "'");
        try {
            while (rst.next()) {
                this.lbl_nama.setText(rst.getString("peminjam"));
                this.lbl_tgl_kembali.setText(rst.getString("tgl_kembali"));
                this.lbl_tgl_peminjaman.setText(rst.getString("tgl_pinjaman"));
                this.lbl_Lama.setText(rst.getString("lama"));
                this.lbl_harga.setText(rst.getString("harga"));
                this.lbl_total.setText(rst.getString("total"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(Form_Pengembalian.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_boxnopolActionPerformed

    private void btn_kembalikan_mobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kembalikan_mobilActionPerformed

        try {
            hapus_transaksi();
            cekstatus();
            loadTabel();

        } catch (SQLException ex) {
            Logger.getLogger(Form_Pengembalian.class.getName()).log(Level.SEVERE, null, ex);
        }
   }//GEN-LAST:event_btn_kembalikan_mobilActionPerformed

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        Home.jDesktopPane1.removeAll();
        Home.jDesktopPane1.repaint();
        Data_Peminjam dp = new Data_Peminjam();
        dp.setVisible(true);
        Home.jDesktopPane1.add(dp);
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
        resi();
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_printActionPerformed

    private void table_transaksi1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_transaksi1MouseClicked
         //.setText(String.valueOf(tabel_peminjam.getValueAt(tabel_peminjam.getSelectedRow(),0)));
        lbl_nama.setText(String.valueOf(table_transaksi1.getValueAt(table_transaksi1.getSelectedRow(),1)));
        boxnopol.setSelectedItem(String.valueOf( table_transaksi1.getValueAt(table_transaksi1.getSelectedRow(),2)));
        lbl_tgl_peminjaman.setText(String.valueOf(table_transaksi1.getValueAt(table_transaksi1.getSelectedRow(),3)));
        lbl_tgl_kembali.setText(String.valueOf(table_transaksi1.getValueAt(table_transaksi1.getSelectedRow(),4)));
        lbl_harga.setText(String.valueOf(table_transaksi1.getValueAt(table_transaksi1.getSelectedRow(),5)));
        lbl_Lama.setText(String.valueOf(table_transaksi1.getValueAt(table_transaksi1.getSelectedRow(),6)));
        lbl_total.setText(String.valueOf(table_transaksi1.getValueAt(table_transaksi1.getSelectedRow(),7)));
        // TODO add your handling code here:
    }//GEN-LAST:event_table_transaksi1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox boxnopol;
    private usu.widget.ButtonGlass btn_kembalikan_mobil;
    private usu.widget.ButtonGlass btn_print;
    private usu.widget.ButtonGlass btn_refresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_Lama;
    private javax.swing.JLabel lbl_harga;
    private javax.swing.JLabel lbl_hari;
    private javax.swing.JLabel lbl_nama;
    private javax.swing.JLabel lbl_tgl_kembali;
    private javax.swing.JLabel lbl_tgl_peminjaman;
    private javax.swing.JLabel lbl_total;
    private usu.widget.glass.PanelGlass panelGlass2;
    private javax.swing.JTable table_transaksi;
    private javax.swing.JTable table_transaksi1;
    // End of variables declaration//GEN-END:variables

    private void loadMobil() {  // mengambil database
        rs = con.querySelectAll("tb_transaksi");
        try {
            while (rs.next()) {
                boxnopol.addItem(rs.getString("nopol"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(Form_Pengembalian.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void cekstatus() throws SQLException {
        rs = con.querySelectAll("tb_mobil", "nopol ='" + boxnopol.getSelectedItem().toString() + "'");
        
        while (rs.next()) {
            status1 = rs.getString("status");
        }
        
        String update_status = "Tersedia";
        String kolom[] = {"status"};
        String isi[] = {update_status};
        con.queryUpdate("tb_mobil", kolom, isi, "nopol='" + boxnopol.getSelectedItem().toString() + "'");
    }

    public void hapus_transaksi() {
        if (JOptionPane.showConfirmDialog(this, "Yakin Mengembalikan Mobil ?", "Peringatan", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            con.queryDelete("tb_transaksi", "nopol='" + boxnopol.getSelectedItem().toString() + "'");
        }

    }

    private void loadTabel() {
        String namaKolom[] = {"id_transaksi", "peminjam", "nopol", "tgl_pinjaman", "tgl_kembali", "harga", "lama", "total"}; //,
        rs = con.querySelect(namaKolom, "tb_transaksi");
        table_transaksi1.setModel(new ResultSetTable(rs)); 
        //,"tgl_pinjam","tgl_kembali" ,jDateChooser1.getDateFormatString(),jDateChooser2.getDateFormatString()
    }
    
    public void resi(){
                
        Login su = new Login();

        PrintJob p = getToolkit().getPrintJob(su,"Report",null);
        Graphics g = p.getGraphics();

        try{
            String n = boxnopol.getSelectedItem().toString();
            rs=con.querySelectAll("tb_transaksi","nopol='"+n+"'");
            //String id = String.valueOf(table_transaksi1.getValueAt(table_transaksi1.getSelectedRow(),0));
        if(rs.next()){
            String id = rs.getString("id_transaksi");
            String nama = rs.getString("peminjam");
            String nom = rs.getString("total");

            g.drawLine(10, 75, 580, 75);
            g.drawLine(10, 75, 10, 285);
            
            g.drawLine(580, 75, 580, 285);
            g.drawLine(10, 285, 580, 285);

            g.setFont(new Font("Serif",Font.BOLD,16));
            g.drawString("No.",100, 102);
            g.drawString(id, 140, 101 );
            g.drawString("_ _ _ _ _ _ _ _",135, 100);

            g.setFont(new Font("Serif",Font.PLAIN,13));
            g.drawString("Terima Dari", 100, 125);
            g.setFont(new Font("Serif",Font.BOLD,14));
            g.drawString(nama, 195, 124 );
            g.setFont(new Font("Serif",Font.PLAIN,13));
            g.drawString("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _", 188, 124);

            g.drawString("Uang Sebanyak", 100, 146);
            g.setColor(java.awt.Color.GRAY);
            for(int i=0; i<=6; i++)
                {g.drawString("______________________________________________________", 200-(i*2), 135+(i*2));}
            for(int i=0; i<=6; i++)
                {g.drawString("______________________________________________________", 200-(i*2), 151+(i*2));}

            g.setColor(java.awt.Color.BLACK);
            for(int i=0; i<=3; i++) 
                {g.drawString("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _", 100, 180+(i*14));}

            g.drawLine(100, 250, 350, 250);
            g.setFont(new Font("Serif",Font.BOLD,12));
            g.drawString("Terbilang Rp. ", 100, 264);
            g.setFont(new Font("Serif",Font.BOLD,14));
            g.drawString(nom, 205, 264 );
            for(int i=0; i<=6; i++)
                {g.setColor(java.awt.Color.GRAY);
                g.drawString("_____________________", 200-(i*2), 251+(i*2));}
            g.setColor(java.awt.Color.BLACK);
            
            g.drawLine(100, 270, 350, 270);
            g.drawLine(440, 270, 550, 270);

            p.end();
        }
        else{
            JOptionPane.showMessageDialog(this, "Gagal Cetak!!");
        }
        
        }catch(SQLException|HeadlessException e){
            JOptionPane.showMessageDialog(this, "Error!!");
        }
        
        dispose();
        Form_Pengembalian fm = new Form_Pengembalian();
        fm.setVisible(true);
    }
    
}