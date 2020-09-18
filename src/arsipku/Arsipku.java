package arsipku;
public class Arsipku implements Biodata, Nilai{
    public static void main(String[] args) {
        Arsipku ar = new Arsipku();
        ar.nama();
        ar.tempatLahir();
        ar.hobi();
        ar.agama();
        ar.bahasaIndonesia();
        ar.matematika();
    }

   public void nama(){
       System.out.println("Namaku = Mita Alifaa");
   }
   
   public void tempatLahir(){
       System.out.println("Tempat Lahir = Jember");
   }
   
   public void hobi(){
       System.out.println("Hobi = Menonton Film");
   }
   
   public void agama(){
       System.out.println("Agama = 100");
   }
   
   public void bahasaIndonesia(){
       System.out.println("Bahasa Indonesia = 100");
   }
   
   public void matematika(){
       System.out.println("Matematika = 90");
   }
    
}
