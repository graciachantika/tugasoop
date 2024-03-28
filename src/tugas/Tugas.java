
package tugas;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author ACER
 */
public class Tugas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       BufferedReader dtain = new BufferedReader (new InputStreamReader(System.in) );
       //Deklarasi Variabel
       Double luas;
       int a = 0;
       int t = 0;
       String alas ="";
       String tinggi ="";
   
       
       System.out.println("Hitung Luas Segitiga");
       
       
       try{
           System.out.print("Input Nilai Alas: ");
           alas = dtain.readLine();
           System.out.print("Input Nilai Tinggi: ");
           tinggi = dtain.readLine();
       }catch(IOException e){
           System.out.println("EROR!");
       }
       a = Integer.parseInt(alas);
       t = Integer.parseInt(tinggi);
       //proses
       luas = 0.5 * a* t;
       
       //output
       System.out.println("Luas Segitiga:"+luas);
    }
}
