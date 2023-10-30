public abstract class Hogwarts {

    private String name;
    private String surname;
    private int silaMagii;
    private int rasstoianieTransgressii;

    public Hogwarts (String name, String surname, int silaMagii, int rasstoianieTransgressii) {
        this.name = name;
        this.surname = surname;
        this.silaMagii = silaMagii;
        this.rasstoianieTransgressii = rasstoianieTransgressii;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSilaMagii(int silaMagii) {
        this.silaMagii = silaMagii;
    }

    public void setRasstoianieTransgressii(int rasstoianieTransgressii) {
        this.rasstoianieTransgressii = rasstoianieTransgressii;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getSilaMagii() {
        return silaMagii;
    }

    public int getRasstoianieTransgressii() {
        return rasstoianieTransgressii;
    }

    private int summaSvoistv() {
        return silaMagii + rasstoianieTransgressii;
    }

    public void sravnenieHogwarts(Hogwarts hogwarts) {
        int summaSvoistv1 = this.summaSvoistv();
        int summaSvoistv2 = hogwarts.summaSvoistv();
        if (summaSvoistv1 > summaSvoistv2) {
            System.out.println("Студент " + name + " лучше студента " + hogwarts.name + ": " + summaSvoistv1 + " баллов VS " + summaSvoistv2);
        } else if (summaSvoistv1 < summaSvoistv2) {
            System.out.println("Студент " + hogwarts.name + " лучше студента " + name + ": " + summaSvoistv2 + " баллов VS " + summaSvoistv1);
        } else {
            System.out.println("Студент " + name + " равен студенту " + hogwarts.name + ": " + summaSvoistv1 + " баллов VS " + summaSvoistv2);
        }
    }

    public void print() {
        System.out.println(this);
    }
    @Override
    public String toString() {
        return name + " " + surname + ", сила магии: " + silaMagii + ", расстояние трансгрессии: " + rasstoianieTransgressii;
    }
}
