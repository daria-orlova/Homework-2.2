public class Main {
    public static void main(String[] str) {
        Gryffindor garriPotter = new Gryffindor("Гарри", "Поттер", 90, 90, 90, 90, 90);
        Gryffindor germionaGreindzher = new Gryffindor("Гермиона", "Грейнджер", 70, 80, 90, 100, 50);
        Gryffindor ronUizli = new Gryffindor("Рон", "Уизли", 10, 20, 30, 40, 50);

        Slytherin drakoMalfoi = new Slytherin("Драко", "Малфой", 40, 50, 60, 70, 80, 90, 100);
        Slytherin grekhemMontegiu = new Slytherin("Грэхэм", "Монтегю", 100, 90, 80, 70, 60, 50, 40);
        Slytherin gregoriGoil = new Slytherin("Грегори", "Гойл", 50, 60, 40, 30, 70, 80, 90);

        Puffendui zakhariiaSmit = new Puffendui("Захария", "Смит", 70, 20, 40, 80, 10);
        Puffendui sedrikDiggori = new Puffendui("Седрик", "Диггори", 40, 60, 20, 60, 70);
        Puffendui dzhastinFinchFletchli = new Puffendui("Джастин", "Финч-Флетчли", 40, 20, 80, 70, 40);

        Kogtevran chzhouChang = new Kogtevran("Чжоу", "Чанг", 50, 50, 60, 80, 80, 90);
        Kogtevran padmaPatil = new Kogtevran("Падма", "Патил", 30, 20, 60, 40, 70, 60);
        Kogtevran markusBelbi = new Kogtevran("Маркус", "Белби", 10, 30, 50, 90, 60, 20);

        garriPotter.sravnenieHogwarts(drakoMalfoi);
        germionaGreindzher.sravnenieGryffindor(ronUizli);
        grekhemMontegiu.sravnenieSlytherin(gregoriGoil);
        sedrikDiggori.sravneniePuffendui(dzhastinFinchFletchli);
        padmaPatil.sravnenieKogtevran(markusBelbi);

        zakhariiaSmit.printPuffendui();
        chzhouChang.printKogtevran();
    }
}
