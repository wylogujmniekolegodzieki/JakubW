
import java.util.Scanner;

public  class zadanie9{
        public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        String firstname;
        String middlaname;
        String lastname ;
        System.out.println("podaj swoje imie");
        firstname = klawiatura.nextLine();
        System.out.println("podaj swoje drugie imie");
        middlaname = klawiatura.nextLine();
        System.out.println("podaj swoje nazwisko");
        lastname = klawiatura.nextLine();
        System.out.println("twoje imie to " + firstname + " twoje drugie imie to " + middlaname + " a twoje nazwisko to " + lastname);

        char inicjalImenia = firstname.charAt(0);
        char inicjalDrugiegoImienia = middlaname.charAt(0);
        char inicjalNazwiska = lastname.charAt(0);

        System.out.println(" Inicjal twojego imienia to: " + inicjalImenia + " Inicjal twojego drugiego imienia to: " + inicjalDrugiegoImienia + " Inicjal twojego nazwiska to; " + inicjalNazwiska);

    }
}
