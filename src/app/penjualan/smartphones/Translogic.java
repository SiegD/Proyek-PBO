package app.penjualan.smartphones;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Translogic {
    private double jumlah,harga_satuan,bayar,kembalian,total;
    private Statement s;
    private ResultSet rs;
    Connection con=KonekDB.koneksi();
            
            
    public Translogic(){
        jumlah =0 ;
        harga_satuan = 0;
    }
    
    public void setJumlah(double a){
        jumlah = a;
    }
    
    public void setHargaSatuan(double b){
        harga_satuan = b;
    }
    
    public void setbayar(double c){
        bayar=c;
    }
    
    public double getJumlah(){
        return(jumlah);
    }
    
    public double getHargaSatuan(){
        return(harga_satuan);
    }
    
    public double getbayar(){
        return(bayar);
    }
    
    public double getsubTotal(){
        return(getJumlah()*getHargaSatuan());
    }
    
    public double getTotal() throws SQLException{
        String sql="Select Sum(sub_total) as total from tb_keranjang_jual";
        try{
            s=con.createStatement();
            rs=s.executeQuery(sql);
            if(rs.next()){
            total = rs.getDouble("total");
        }
        } catch (Exception e) {
        }
        return(total);
    }
    
    public double getkembalian(){
        return(bayar-total);
    }
}
