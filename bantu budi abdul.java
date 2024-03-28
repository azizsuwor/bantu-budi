package bantubudi;
import javax.swing.JOptionPane;
public class abdul {
    
    public static double luasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }
    public static double luasSegitiga (double alas, double tinggi) {
        return 0.5 * alas * tinggi;
}
    public static double luasLingkaran(double jariJari) {
        return Math.PI * Math.pow(jariJari, 2);  
    }
    public static void main(String[] args) {
        
        double panjangPersegiPanjang = Double.parseDouble(JOptionPane.showInputDialog("masukan panjang persegi : "));
        double lebarPersegiPanjang = Double.parseDouble(JOptionPane.showInputDialog("masukan lebar persegi panjang: "));
        double luasPersegiPanjang = luasPersegiPanjang(panjangPersegiPanjang,lebarPersegiPanjang) ;
        JOptionPane.showMessageDialog(null, "luas persegi panjang: " + luasPersegiPanjang);
        System.out.println("luas persegi panjang: " + luasPersegiPanjang);
        
        double alasSegitiga = Double.parseDouble(JOptionPane.showInputDialog("masukan alas segitiga: "));
        double tinggiSegitiga  = Double.parseDouble(JOptionPane.showInputDialog("masukan tinggi segitiga: "));
        double luasSegitiga = luasSegitiga(alasSegitiga,tinggiSegitiga) ;
        JOptionPane.showMessageDialog(null, "luas segitiga: " + luasSegitiga);
        System.out.println(luasSegitiga + "luas segitiga: ");
        
        double jariJariLingkaran = Double.parseDouble(JOptionPane.showInputDialog("masukan jari jari lingkaran: "));
        double luasLingkaran = luasLingkaran(jariJariLingkaran);
        JOptionPane.showMessageDialog(null, "luas lingkaran : " + luasLingkaran);
        System.out.println("luas lingkaran: " + luasLingkaran);
           
    }
    
}   
        
    
    
    
