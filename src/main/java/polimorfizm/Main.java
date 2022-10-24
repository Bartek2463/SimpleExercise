package polimorfizm;

public class Main {
    public static void main(String[] args) {
       Baza baza = new Baza();
       Baza baza1 = new JestemPierwszy();
       Baza baza2 = new JestemDrugi();

       JestemPierwszy jestemPierwszy = new JestemDrugi();
       JestemPierwszy jestemPierwszy1 = new JestemPierwszy();
       JestemDrugi jestemDrugi = new JestemDrugi();
    }
}