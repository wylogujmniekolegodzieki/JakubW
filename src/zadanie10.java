import java.util.Scanner;

public class zadanie10 {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);
        double  podatekStan = 0.04;
        double podatekLok = 0.02;
        System.out.println(" podaj cene netto produktu ");
        double cenaNetto = klawiatura.nextDouble();
        double stawkaPodatkuStan = cenaNetto * podatekStan;
        double stawkaPodatkuLok = cenaNetto * podatekLok;
        System.out.println(" stawka podatku stanowego wynosi: " + stawkaPodatkuStan);
        System.out.println(" stawka podatku lokalnego wynosi: " + stawkaPodatkuLok);

        double cenaBruttoStan = cenaNetto + stawkaPodatkuStan;
        double cenaBruttoLok = cenaNetto + stawkaPodatkuLok;
        System.out.println(" cena brutto stanowego wynosi: " + cenaBruttoStan);
        System.out.println(" cena brutto lokalnego wynosi: " + cenaBruttoLok);
        double cenaBrutto = cenaNetto + stawkaPodatkuLok + stawkaPodatkuStan;
        System.out.println(" cena brutto z oboma podatkami wynosi: " + cenaBrutto) ;

    }
}
