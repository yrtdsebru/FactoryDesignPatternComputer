public class Hp implements IBilgisayar {
    private String Marka, Model, CPU;
    private int Ram, Memory;

    public Hp(String Marka, String Model, String CPU, int Ram, int Memory) {
        this.Marka = Marka;
        this.Model = Model;
        this.CPU = CPU;
        this.Ram = Ram;
        this.Memory = Memory;
    }

    @Override
    public String Marka() {
        return Marka;
    }

    @Override
    public String Model() {
        return Model;
    }

    @Override
    public String CPU() {
        return CPU;
    }

    @Override
    public int Ram() {
        return Ram;
    }

    @Override
    public int Memory() {
        return Memory;
    }

    @Override
    public void Ozellikler() {
        System.out.println("-----------\nMarka=" + Marka + "\nModel='" + Model + "\nIslemci=" + CPU + "\nRam=" + Ram + "\nBellek=" + Memory + "\n-----------");
    }
}