class Slytherin extends Hogwarts{
    private int khitrost;
    private int reshitelnost;
    private int ambitsioznost;
    private int nakhodchivost;
    private int vlastnost;

    public Slytherin(String name, String surname, int silaMagii, int rasstoianieTransgressii, int khitrost, int reshitelnost, int ambitsioznost, int nakhodchivost, int vlastnost) {
        super(name, surname, silaMagii, rasstoianieTransgressii);
        this.khitrost = khitrost;
        this.reshitelnost = reshitelnost;
        this.ambitsioznost = ambitsioznost;
        this.nakhodchivost = nakhodchivost;
        this.vlastnost = vlastnost;
    }

    public int getKhitrost() {
        return khitrost;
    }

    public int getReshitelnost() {
        return reshitelnost;
    }

    public int getAmbitsioznost() {
        return ambitsioznost;
    }

    public int getNakhodchivost() {
        return nakhodchivost;
    }

    public int getVlastnost() {
        return vlastnost;
    }

    public void setKhitrost(int khitrost) {
        this.khitrost = khitrost;
    }

    public void setReshitelnost(int reshitelnost) {
        this.reshitelnost = reshitelnost;
    }

    public void setAmbitsioznost(int ambitsioznost) {
        this.ambitsioznost = ambitsioznost;
    }

    public void setNakhodchivost(int nakhodchivost) {
        this.nakhodchivost = nakhodchivost;
    }

    public void setVlastnost(int vlastnost) {
        this.vlastnost = vlastnost;
    }

    private int summaSvoistv() {
        return khitrost + reshitelnost + ambitsioznost + nakhodchivost + vlastnost;
    }

    public void sravnenieSlytherin(Slytherin slytherin) {
        int summaSvoistv1 = this.summaSvoistv();
        int summaSvoistv2 = slytherin.summaSvoistv();
        if (summaSvoistv1 > summaSvoistv2) {
            System.out.println("Грифиндорец " + getName() + " лучше грифиндорца " + slytherin.getName() + ": " + summaSvoistv1 + " баллов VS " + summaSvoistv2);
        } else if (summaSvoistv1 < summaSvoistv2) {
            System.out.println("Грифиндорец " + slytherin.getName() + " лучше грифиндорца " + getName() + ": " + summaSvoistv2 + " баллов VS " + summaSvoistv1);
        } else {
            System.out.println("Грифиндорец " + getName() + " равен грифиндорца " + slytherin.getName() + ": " + summaSvoistv1 + " баллов VS " + summaSvoistv2);
        }
    }

    @Override
    public String toString() {
        return "Слизеринец " + super.toString() + ", хитрость: " + khitrost + ", решительность: " + reshitelnost + ", амбициозность: " + ambitsioznost + ", находчивость: " + nakhodchivost + ", жажда власти: " + vlastnost;
    }

    public void printSlytherin() {
        System.out.println(this);
    }
}

