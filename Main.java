
public class Main {
    
    public static void main(String[] args) throws InterruptedException
    {
        
        
        System.out.println("Sabiha gökçen Havalimanına Hoşgeldiniz...");
        System.out.println("******************************************");
        String sartlar="YURTDIŞI ÇIKIŞ KURALLARI\n\n"
                +"1-Yurtdışı yasağınızın bulunmaması gerekiyor...\n"
                +"2-Vizenizin bulunması gerekiyor...\n"
                +"3-Yurtdışı harcınızı tamamlamış olmanız gerekiyor(15 TL)";
        String message ="Yurtdışı çıkış kurallarından hepsini sağlamanız gerekiyor..";
        
        while(true)
        {
            System.out.println("**********************************************");
            System.out.println(sartlar);
            System.out.println("**********************************************");
            
            Yolcu yolcu=new Yolcu();
            
            System.out.println("Yurtdışı Çıkışı İçin Harç Bilgisi Kontrol Ediliyor..");
            Thread.sleep(3000);//bu java projesini 3 saniye(3000 milisaniye) beklemetmeyi sağlar. gerçekten kontrol ediliyor gibi yani
            if(yolcu.yurtdisiharci()==false)
            {
                System.out.println(message);
                continue;
            }
            
            System.out.println("Siyasi Yasak Kontrol Ediliyor...");
            Thread.sleep(3000);
            if(yolcu.siyasiyasak()==false)
            {
                System.out.println(message);
                continue;
            }
            
            System.out.println("Vize Bilgisi Kontrol Ediliyor...");
            Thread.sleep(3000);
            if(yolcu.vizedurumu()==false)
            {
                System.out.println(message);
                continue;
            }
            
            System.out.println("İşlemler tamam. Yurtdışına Çıkabilirsiniz...");
                break;
                
                
                
            
        }
        
    }



    
}
