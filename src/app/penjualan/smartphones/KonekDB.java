package app.penjualan.smartphones;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class KonekDB {
        Connection koneksi;
    public static Connection koneksi(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost/app_hpjava?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
            return koneksi;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}