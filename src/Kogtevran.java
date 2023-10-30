public class Kogtevran extends Hogwarts{
    private int um;
    private int mudrost;
    private int ostroumie;
    private int tvorchestvo;

    public Kogtevran(String name, String surname, int silaMagii, int rasstoianieTransgressii, int um, int mudrost, int ostroumie, int tvorchestvo) {
        super(name, surname, silaMagii, rasstoianieTransgressii);
        this.um = um;
        this.mudrost = mudrost;
        this.ostroumie = ostroumie;
        this.tvorchestvo = tvorchestvo;
    }

    public int getUm() {
        return um;
    }

    public int getMudrost() {
        return mudrost;
    }

    public int getOstroumie() {
        return ostroumie;
    }

    public int getTvorchestvo() {
        return tvorchestvo;
    }

    public void setUm(int um) {
        this.um = um;
    }

    public void setMudrost(int mudrost) {
        this.mudrost = mudrost;
    }

    public void setOstroumie(int ostroumie) {
        this.ostroumie = ostroumie;
    }

    public void setTvorchestvo(int tvorchestvo) {
        this.tvorchestvo = tvorchestvo;
    }

    private int summaSvoistv() {
        return um + mudrost + ostroumie + tvorchestvo;
    }

    public void sravnenieKogtevran(Kogtevran kogtevran) {
        int summaSvoistv1 = this.summaSvoistv();
        int summaSvoistv2 = kogtevran.summaSvoistv();
        if (summaSvoistv1 > summaSvoistv2) {
            System.out.println("Грифиндорец " + getName() + " лучше грифиндорца " + kogtevran.getName() + ": " + summaSvoistv1 + " баллов VS " + summaSvoistv2);
        } else if (summaSvoistv1 < summaSvoistv2) {
            System.out.println("Грифиндорец " + kogtevran.getName() + " лучше грифиндорца " + getName() + ": " + summaSvoistv2 + " баллов VS " + summaSvoistv1);
        } else {
            System.out.println("Грифиндорец " + getName() + " равен грифиндорца " + kogtevran.getName() + ": " + summaSvoistv1 + " баллов VS " + summaSvoistv2);
        }
    }

    @Override
    public String toString() {
        return "Когтевранец " + super.toString() + ", ум: " + um + ", мудрость: " + mudrost + ", остроумие: " + ostroumie + ", творчество: " + tvorchestvo;
    }

    public void printKogtevran() {
        System.out.println(this);
    }
}

