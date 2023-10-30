import java.sql.SQLOutput;

public class Gryffindor extends Hogwarts{
    private int blagorodstvo;
    private int chest;
    private int khrabrost;

    public Gryffindor(String name, String surname, int silaMagii, int rasstoianieTransgressii, int blagorodstvo, int chest, int khrabrost) {
        super(name, surname, silaMagii, rasstoianieTransgressii);
        this.blagorodstvo = blagorodstvo;
        this.chest = chest;
        this.khrabrost = khrabrost;
    }

    public int getBlagorodstvo() {
        return blagorodstvo;
    }

    public int getChest() {
        return chest;
    }

    public int getKhrabrost() {
        return khrabrost;
    }

    public void setBlagorodstvo(int blagorodstvo) {
        this.blagorodstvo = blagorodstvo;
    }

    public void setChest(int chest) {
        this.chest = chest;
    }

    public void setKhrabrost(int khrabrost) {
        this.khrabrost = khrabrost;
    }

    private int summaSvoistv() {
        return blagorodstvo + chest + khrabrost;
    }

    public void sravnenieGryffindor(Gryffindor gryffindor) {
        int summaSvoistv1 = this.summaSvoistv();
        int summaSvoistv2 = gryffindor.summaSvoistv();
        if (summaSvoistv1 > summaSvoistv2) {
            System.out.println("Грифиндорец " + getName() + " лучше грифиндорца " + gryffindor.getName() + ": " + summaSvoistv1 + " баллов VS " + summaSvoistv2);
        } else if (summaSvoistv1 < summaSvoistv2) {
            System.out.println("Грифиндорец " + gryffindor.getName() + " лучше грифиндорца " + getName() + ": " + summaSvoistv2 + " баллов VS " + summaSvoistv1);
        } else {
            System.out.println("Грифиндорец " + getName() + " равен грифиндорца " + gryffindor.getName() + ": " + summaSvoistv1 + " баллов VS " + summaSvoistv2);
        }
    }

    @Override
    public String toString() {
        return "Гриффиндорец " + super.toString() + ", благородство: " + blagorodstvo + ", честь: " + chest + ", храбрость: " + khrabrost;
    }

    public void printGryffindor() {
        System.out.println(this);
    }
}

