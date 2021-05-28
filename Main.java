import java.util.*;
import java.util.Scanner;
/**
 * class Main.
 *
 * @author Ami
 * @version 0.1
 */
public class Main 
{
    public static void main(String args[])
    {
      // ArrayList<String> als = new ArrayList<String>();
       
       ArrayList<Mahasiswa> arraylistMhs= new ArrayList<Mahasiswa>();
       int jumlah=0, nim =0;
       String nama =null,alamat=null,jeniskelamin=null;
        // create an object of Scanner
        Scanner input = new Scanner(System.in);
       
        System.out.println("input jumlah data :");
        jumlah = input.nextInt();
        
        for(int a=0;a<jumlah;a++)
        {
           int in = a+1;
        System.out.println("Masukkan Data Mahasiswa ke-"+ in +":");
        nim = input.nextInt();
        nama = input.next();
        alamat = input.next();
        jeniskelamin = input.next();      
        arraylistMhs.add(new Mahasiswa(nim,nama, alamat,jeniskelamin));
        
    }
    
    System.out.println("Tampilkan Data Mahasiswa");
        for(Mahasiswa mhs:arraylistMhs)
        {
            
            System.out.println(mhs.getnimMhs() +" "+ mhs.getnamaMhs()+" "+ mhs.getalamatMhs()+" "+ mhs.getjeniskelaminMhs());
            
        }
  
        System.out.println("Update");
        System.out.println("cari Nim yang ingin di update:");
        int carinim;
        carinim = input.nextInt();
        
        for(Mahasiswa mhs:arraylistMhs)
        {
             
            if (mhs.getnimMhs() == carinim)
            {
                System.out.println("masukkan nama yang akan di update:");
                nama = input.next();
                mhs.setnamaMhs(nama);
            }
            
            System.out.println(mhs.getnimMhs() +" "+ mhs.getnamaMhs()+" "+ mhs.getalamatMhs()+" "+ mhs.getjeniskelaminMhs());
               
        }
      
        System.out.println("Tampilkan jumlah Data Mahasiswa" ); 
        System.out.println(arraylistMhs.size());
        
        System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
        nim = input.nextInt();
  
        for(Mahasiswa mhs:arraylistMhs)
        {
            int nim1 = mhs.getnimMhs();
            if (nim1 == nim)
            {
                arraylistMhs.indexOf(mhs);
                arraylistMhs.remove(arraylistMhs.indexOf(mhs));
                break;
            }
        }
        
        System.out.println("Daftar mahasiswa setelah dihapus");
        for(Mahasiswa mhs:arraylistMhs)
        {
            System.out.println(mhs.getnimMhs() +" "+ mhs.getnamaMhs()+" "+ mhs.getalamatMhs()+" "+ mhs.getjeniskelaminMhs());
        }
        
        System.out.println("Search Data Mahasiswa");
        System.out.println("Masukkan data Mahasiswa yang ingin dicari");
        carinim = input.nextInt();
         for(Mahasiswa mhs:arraylistMhs)
        {
            if (mhs.getnimMhs()== carinim)
            {
                System.out.println("Nim              :"+mhs.getnimMhs());
                System.out.println("Nama             :"+mhs.getnamaMhs());
                System.out.println("Alamat           :"+mhs.getalamatMhs());
                System.out.println("Jenis Kelamin    :"+mhs.getjeniskelaminMhs());
            }
        }
         /*
        System.out.println("searching:");
        System.out.println("cari Nim mahasiswa:");
        carinim = input.nextInt();
        for(Mahasiswa mhs:arraylistMhs)
        {
            
            System.out.println(mhs.getnimMhs() +" "+ mhs.getnamaMhs()+" "+ mhs.getalamatMhs()+" "+ mhs.getjeniskelaminMhs());
               
        }
       */
    }
    
    
    
    
}
