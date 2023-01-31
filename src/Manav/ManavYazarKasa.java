package Manav;

import java.util.Scanner;

public class ManavYazarKasa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double  elma = 2.14, armut = 3.67, patl = 5, dts = 1.11, muz = 0.95, slt = 1.43, avk = 9.88, biber = 0.55, sft = 6, havuc = 3.14, tutar,
                elmakg, armutkg, patlkg, dtskg, muzkg, sltkg, avkkg, biberkg, sftkg, havuckg, kdv, tutark, tutart;

        System.out.println("Lütfen aldığınız ürünlri giriniz");
        System.out.println("Elma kg : " + elma);
        System.out.println("Armut kg : " + armut);
        System.out.println("Patlıcan kg : " + patl);
        System.out.println("Havuc kg : " + dts);
        System.out.println("Domates kg : " + muz);
        System.out.println("Muz kg : " + slt);
        System.out.println("Salatalık kg : " + avk);
        System.out.println("Avakado kg : " + biber);
        System.out.println("Biber kg : " + sft);
        System.out.println("Şeftali kg : " + havuc);


        System.out.print("Kaç kilo elma : ");
        elmakg = sc.nextDouble();
        System.out.print("Kaç kilo armut : ");
        armutkg = sc.nextDouble();
        System.out.print("Kaç kilo patlıcan : ");
        patlkg = sc.nextDouble();
        System.out.print("Kaç kilo domates : ");
        dtskg = sc.nextDouble();
        System.out.print("Kaç kilo muz : ");
        muzkg = sc.nextDouble();
        System.out.print("Kaç kilo salatalık : ");
        sltkg = sc.nextDouble();
        System.out.print("Kaç kilo avakado : ");
        avkkg = sc.nextDouble();
        System.out.print("Kaç kilo biber : ");
        biberkg = sc.nextDouble();
        System.out.print("Kaç kilo şeftali : ");
        sftkg = sc.nextDouble();
        System.out.print("Kaç kilo havuç : ");
        havuckg = sc.nextDouble();

        tutar =  (elma * elmakg) + (armut * armutkg) + (patl * patlkg) + (dts *dtskg) + (muz * muzkg) +
                 (slt * sltkg) + (avk * avkkg) + (biber * biberkg) + (sft * sftkg) + (havuc * havuckg) ;

        kdv = 0.18;
        tutark = tutar * kdv;
        tutart = tutark + tutar;

        System.out.println("KDV : " + kdv);
        System.out.println("KDVsiz tutar : " + tutar);
        System.out.println("KDV tutarı : " + tutark);
        System.out.println("KDVli tutar : " + tutart);

        System.out.println("İYİ GÜNLER DİLERİZ AFİYET OLSUN");
    }
}
