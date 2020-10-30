/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119061.latihan29.warnakepribadian;
import java.util.Scanner;
/**
 *
 * @author Rheiza
 * NAMA  : Rheiza Akaml R
 * KELAS : IF2   
 * NIM   : 10119061
 */
public class PBOIF210119061Latihan29WarnaKepribadian {

    /**
     * @param args the command line arguments
     */
    public static final String RED = "\u001b[31m";
    public static final String GREEN = "\u001b[32m";
    public static final String YELLOW = "\u001b[33m";
    public static final String BLUE = "\u001b[34m";
    public static final String PURPLE = "\u001b[35m";
    public static final String CYAN = "\u001b[36m";
    public static final String BLACK = "\u001b[30m";
    
    public static void kepribadian(String warna, String nama){
        System.out.println("");
        System.out.println("===HASIL TEST KEPRIBADIAN "+nama+"===");
        if(null !=warna)switch (warna){
            case "MERAH":
                System.out.println(BLACK+"Warna Favoritmu adalah "+ RED + warna);
                System.out.println("1. Periang,");
                System.out.println("2. Pemberani,");
                System.out.println("3. Berani mengambil resiko dalam setiap langkah,");
                System.out.println("4. Menyukai tantangan,");
                System.out.println("5. Kurang sabar,");
                System.out.println("6. Dapat menahan marah namun jika sudah tahap puncak toleransi, kemarahannya akan sulit dikontrol ");
                System.out.println("7. Memiliki energi kehangatan dan cinta.");
                break;
            case "HIJAU":
                System.out.println(BLACK+"Warna Favoritmu adalah "+ GREEN + warna);
                System.out.println("1. Romantis,");
                System.out.println("2. Menyukai hal yang berbau alami dan keindahan,");
                System.out.println("3. Teguuh pada prinsip,");
                System.out.println("4. Menginginkan kesempurnaan,");
                System.out.println("5. Mudah cemburu,");
                System.out.println("6. Mudah merasa iri,");
                System.out.println("7. Menjunjung tinggi suatu nilai toleransi dan kepercayaan.");
                break;
            case "KUNING":
                System.out.println(BLACK+"Warna Favoritmu adalah "+ YELLOW + warna);
                System.out.println("1. Optimis,");
                System.out.println("2. Suka bergaul,");
                System.out.println("3. Periang,");
                System.out.println("4. Senang menolong,");
                System.out.println("5. Lincah dan aktif,");
                System.out.println("6. Tidak suka meremehkan kekurangan orang lain,");
                System.out.println("7. Menjunjung tinggi suatu nilai toleransi dan kepercayaan.");
                System.out.println("8. Hangat,");
                System.out.println("9. Meskipun karakter optimis dan idealis, seringkali goyah dan tidak stabil.");
                System.out.println("10. Cenderung penakut.");  
               break; 
            case "BIRU":
                System.out.println(BLACK+"Warna Favoritmu adalah "+ BLUE + warna);
                System.out.println("1. Menyenangkan,");
                System.out.println("2. Bijaksana,");
                System.out.println("3. Pembawaan diri tenang saat menghadapi masalah,");
                System.out.println("4. Dinamis,");
                System.out.println("5. Senang dinamis,");
                System.out.println("6. Bersahabat,");
                System.out.println("7. Tidak terlalu saku menjadi sorotan banyak orang,");
                System.out.println("8. Menyembunyikan perasaan karena karakternya yang cenderung mencaari jalan damai.");
                break;
            case "UNGU":
                System.out.println(BLACK+"Warna Favoritmu adalah "+ PURPLE + warna);
                System.out.println("1. Optimis,");
                System.out.println("2. Tidak pernah ragu,");
                System.out.println("3. Menurutnya pasangan yang ideal adalah yang memiliki mental kuat,");
                System.out.println("4. Memiliki ambisi yang besar,");
                System.out.println("5. Memiliki empati yang besar,");
                System.out.println("6. Memiliki sisi misterius sebab seringkali menutupi perasaannya,");
                System.out.println("7. Terkadang bersikap keras kepala dan angkuh.");
                break;
            default:
                break;
        }
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        String warna,nama;
        
        System.out.println(RED+"YUK "+GREEN+" CEK"+YELLOW+" KEPRIBADIANMU"+CYAN+" DARI"+PURPLE+" NAMA"+BLUE+" FAVORITMU");
        System.out.println(RED+"MERAH");
        System.out.println(GREEN+"HIJAU");
        System.out.println(YELLOW+"KUNING");
        System.out.println(BLUE+"BIRU");
        System.out.println(PURPLE+"UNGU");
        System.out.println(BLACK+"");
        System.out.println("*gunakan huruf kapital");
        System.out.print("PILIH WARNA FAVORITMU : ");
        warna = input.next();
        System.out.println(RED+"NAMA KAMU: ");
        nama=input.next();
        kepribadian(warna, nama);
        System.out.println("Developed by Rheiza Akmal R" );

        
    }
    
}
