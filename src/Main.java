
import java.util.Scanner;

public class Main {
    
    public static void main(String[]args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Mükemmel Sayı Bulma Programına Hoşgeldiniz...");
        
        
        System.out.print("Lütfen Bir Sayı Giriniz : ");
        int sayi = scanner.nextInt();    
        int toplam = 0;
        
        for(int i = 1;i<=sayi;i++){
            if(sayi%i==0){
                toplam+=i;
            }   
        }
        
        if(sayi == toplam) {
            System.out.println(sayi + " Mükemmel bir sayidir");
        }
        else {
            System.out.println(sayi + " Mükemmel bir sayi degildir.");
        }
    }
    
}
