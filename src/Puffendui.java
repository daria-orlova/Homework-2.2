public class Puffendui extends Hogwarts{
    private int trudoliubie;
    private int vernost;
    private int chestnost;

    public Puffendui(String name, String surname, int silaMagii, int rasstoianieTransgressii, int trudoliubie, int vernost, int chestnost) {
        super(name, surname, silaMagii, rasstoianieTransgressii);
        this.trudoliubie = trudoliubie;
        this.vernost = vernost;
        this.chestnost = chestnost;
    }

    public int getTrudoliubie() {
        return trudoliubie;
    }

    public int getVernost() {
        return vernost;
    }

    public int getChestnost() {
        return chestnost;
    }

    public void setTrudoliubie(int trudoliubie) {
        this.trudoliubie = trudoliubie;
    }

    public void setVernost(int vernost) {
        this.vernost = vernost;
    }

    public void setChestnost(int chestnost) {
        this.chestnost = chestnost;
    }

    private int summaSvoistv() {
        return trudoliubie + vernost + chestnost;
    }

    public void sravneniePuffendui(Puffendui puffendui) {
        int summaSvoistv1 = this.summaSvoistv();
        int summaSvoistv2 = puffendui.summaSvoistv();
        if (summaSvoistv1 > summaSvoistv2) {
            System.out.println("Грифиндорец " + getName() + " лучше грифиндорца " + puffendui.getName() + ": " + summaSvoistv1 + " баллов VS " + summaSvoistv2);
        } else if (summaSvoistv1 < summaSvoistv2) {
            System.out.println("Грифиндорец " + puffendui.getName() + " лучше грифиндорца " + getName() + ": " + summaSvoistv2 + " баллов VS " + summaSvoistv1);
        } else {
            System.out.println("Грифиндорец " + getName() + " равен грифиндорца " + puffendui.getName() + ": " + summaSvoistv1 + " баллов VS " + summaSvoistv2);
        }
    }

    @Override
    public String toString() {
        return "Пуффендуец " + super.toString() + ", трудолюбие: " + trudoliubie + ", верность: " + vernost + ", честность: " + chestnost;
    }

    public void printPuffendui() {
        System.out.println(this);
    }
}
