public class zadanie5i6 {
    public static void main(String[] args) {
         double metryNaOsobe;
         int iloscOsob = 4;
         int wszystkiePomieszczenia;
         int wymiar1pom1 =3;
         int wymiar2pom1 =4;
         int wymiar1pom2 =3;
         int wymiar2pom2 =4;
         int wymiar1pom3 =2;
         int wymiar2pom3 =3;
         int wymiar1pom4 =2;
         int wymiar2pom4 =2;
         int pom4 = wymiar1pom4 * wymiar2pom4;
         int pom3 = wymiar1pom3 * wymiar2pom3;
         int pom2 = wymiar1pom2 * wymiar2pom2;
         int pom1 = wymiar1pom1 * wymiar2pom1;
        System.out.println("wymiar pomieszczenia 1: " + pom1);
        System.out.println("wymiar pomieszczenia 2: " + pom2);
        System.out.println("wymiar pomieszczenia 3: " + pom3);
        System.out.println("wymiar pomieszczenia 4: " + pom4);
        wszystkiePomieszczenia = pom1+pom2+pom3+pom4;
        metryNaOsobe = (double) wszystkiePomieszczenia / iloscOsob;
        System.out.println("wymiar całego mieszkania: " + wszystkiePomieszczenia);
        System.out.println("ilsoc metrow na osobe: " + metryNaOsobe);


    }
}
