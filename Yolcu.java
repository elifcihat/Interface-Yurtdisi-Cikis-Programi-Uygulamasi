
import java.util.Scanner;


public class Yolcu implements YurtDisiCikisKurallari{

    
    private int harc;
    private boolean vizedurumu;
    private boolean siyasiyasak;
    
    public Yolcu()
    {
        
        Scanner scanner=new Scanner(System.in);
        System.out.print("Yatırdığınız harç bedelini girin: ");
        this.harc=scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Siyasi yasağınız bulunuyor mu(evet veya hayır)?");
        String cevap =scanner.nextLine();
        if(cevap.equals("evet"))
        {
            this.siyasiyasak=false;
            System.out.println("Siyasi yasağınızdan dolayı yurt dışına çıkamazsınız...");
            
        }
        else
        {
            this.siyasiyasak=true;
        }
        
        System.out.println("Vizeniz bulunuyor mu?(evet veya hayır)");
        String cevap2=scanner.nextLine();
        if(cevap2.equals("evet"))
        {
            this.vizedurumu=true;
        }
        else
        {
            this.vizedurumu=false;
        }
        
        
        
    }
    
    @Override
    public boolean yurtdisiharci() {
        
        if(this.harc<15)
        {
            System.out.println("Harç bedeli minimum 15 TL olmak zorundadır..");
            return false;
        }
        else
        {
            System.out.println("Yurtdışı harcınız tam...");
            return true;
        }
        
    }

    @Override
    public boolean vizedurumu() {
        
        if(this.vizedurumu=true)
        {
            System.out.println("Vizeniz bulunuyor...");
            return true;
        }
        else
        {
            System.out.println("Vizeniz bulunmmamakta...");
            return false;
        }
    }

    @Override
    public boolean siyasiyasak() {
        
        if(this.siyasiyasak=false)
        {
            System.out.println("Siyasi yazağınız bulunmamaktadır");
            return true;
        }
        else
        {
            System.out.println("Yurtdışına çıkabilmeniz için siyasi yasağınızın bulunmaması gerekiyor..");
            return false;
        }
        
    }
    
    
    



    
}
