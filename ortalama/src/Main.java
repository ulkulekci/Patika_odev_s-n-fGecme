
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Matematik notunu girin:");
         int mat=sc.nextInt();

        int say1=(mat>100 || mat<0) ?0:mat;
        System.out.print("Fizik notunu girin: ");
        int fizik = sc.nextInt();
        int say2=(fizik>100 || fizik<0) ? 0:fizik;

        System.out.print("Kimya notunuz: ");
        int kimya = sc.nextInt();
        int say3=(kimya>100 || kimya<0) ? 0:kimya;

        System.out.print("Turkce notunuz: ");
        int turkce = sc.nextInt();
        int say4=(turkce>100 || turkce<0 ) ? 0:turkce;

        System.out.print("Muzik notunuz: ");
        int muzik = sc.nextInt();
        int say5=(muzik>100 || muzik<0) ? 0:muzik;


        double ortalama=(say1+say2+say3+say4+say5)/5;

        if (ortalama>=55)
            System.out.println("not ortalamanız:" + ortalama+ "sinifi gectiniz tebrikler");
        if (ortalama<=55)
            System.out.println("not ortalamanız:" + ortalama+ "  malesef sinifta kaldiniz");

    }
}
