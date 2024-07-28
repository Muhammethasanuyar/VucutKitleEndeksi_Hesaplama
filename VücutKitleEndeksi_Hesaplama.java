import java.util.Scanner;

public class VücutKitleEndeksi_Hesaplama {
    public static void main(String[] args) {
      System.out.print("Lütfen boyunuzu giriniz (örn:1,78) : ");
      Scanner scanner=new Scanner(System.in);
      double boy = scanner.nextDouble();
      System.out.print("Lütfen kilonuzu giriniz (örn:75) : ");
      int kilo=scanner.nextInt();
      double vki = kilo/(Math.pow(boy, 2));
      System.out.println("vücut kitle endeksiniz : "+vki);
      if(vki<18.5){
        System.out.println("ideal kilonun altındasınız ");
      }
      else if (18.5<vki && 24.9>vki){
        System.out.println("normal kilodasınız ");
      }
      else if (24.9<vki && 29.9>vki){
        System.out.println("ideal kilonun üstündesiniz ");
      }
      else if (29.9<vki && 39.9>vki){
        System.out.println("ideal kilonun çok üstünde (obez)");
      }
      else {
        System.out.println("ideal kilonun çok çok üstünde (morbid obez)");
      }
    }

    
}