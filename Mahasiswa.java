 
/**
 * class Mahasiswa.
 *
 * @author Ami
 * @version 0.1
 */
public class Mahasiswa extends Main
{
    // instance variables - replace the example below with your own
    private int nim;
    private String nama;
    private String jeniskelamin;
    private String alamat;
    
    
    public Mahasiswa(int nim, String nama,String jeniskelamin,String alamat)
    {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jeniskelamin = jeniskelamin;
    }
   
    public String getnamaMhs()
    {
         return nama;
    }
    
   public int getnimMhs()
    {
         return nim;
    }
    
     public String getjeniskelaminMhs()
    {
         return jeniskelamin;
         
    }
    
     public String getalamatMhs()
    {
         return alamat;
    }
   
    public void setnamaMhs(String nama)
    {
        this.nama = nama;
    }
    
    
   


    
}
