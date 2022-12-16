public class Main {
    public static void main(String[] args) {

        BilgisayarFabrikasi Bilgisayar = new BilgisayarFabrikasi();
        
        IBilgisayar lenovo = Bilgisayar.Uret("Lenovo", "Ideapad Gaming 3","AMD Ryzen 5600H", 8, 500);
        IBilgisayar hp = Bilgisayar.Uret("Hp", "250 G3","Intel Core i5 4600U", 16, 1000);
        IBilgisayar msi = Bilgisayar.Uret("MSI", "Katana","Intel Core i7 11000H", 16, 250);

        lenovo.Ozellikler();
        hp.Ozellikler();
        msi.Ozellikler();

    }
}