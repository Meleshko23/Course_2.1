package HW_2_2;

import java.util.Random;

public class HW_2_2 {

    private static final Random Random = new Random();

    public static void main(String[] args) {
        GryffindorStudent harry = generateGryffindorStudent("Гарри Поттер");
        GryffindorStudent germiona = generateGryffindorStudent("Гермиона Грейнджер");
        GryffindorStudent ron = generateGryffindorStudent("Рон Уизли");
        RavenclawStudent chang = generateRavenclawStudent("Чжоу Чанг");
        RavenclawStudent padma = generateRavenclawStudent("Падма Патил");
        RavenclawStudent marcus = generateRavenclawStudent("Маркус Белби");
        HufflepuffStudent zahariy = generateHufflepuffStudent("Захария Смит");
        HufflepuffStudent cedric = generateHufflepuffStudent("Седрик Диггори");
        HufflepuffStudent djastin = generateHufflepuffStudent("Джастин Финч-Флетчли");
        SlytherinStudent draco = generateSlytherinStudent("Драко Малфой");
        SlytherinStudent grehem = generateSlytherinStudent("Грэхэм Монтегю");
        SlytherinStudent gregory = generateSlytherinStudent("Грегори Гойл");

//Гарри Поттер, Гермиона Грейнджер и Рон Уизли
//Драко Малфой, Грэхэм Монтегю, Грегори Гойл учатся на Слизерине.
//На факультет Пуффендуй учатся Захария Смит, Седрик Диггори, Джастин Финч-Флетчли.
//На факультете Когтевран учится Чжоу Чанг, Падма Патил и Маркус Белби.

        harry.print();
        ron.print();
        germiona.print();
        chang.print();
        padma.print();
        marcus.print();
        zahariy.print();
        cedric.print();
        djastin.print();
        draco.print();
        grehem.print();
        gregory.print();

        harry.compsreGryffindorStudent(ron);
        harry.compsreHogwartsStudent(draco);

        chang.compsreHogwartsStudent(gregory);


    }

    private static GryffindorStudent generateGryffindorStudent(String name) {
        return new GryffindorStudent(
                name,
                Random.nextInt(100),
                Random.nextInt(100),
                Random.nextInt(100),
                Random.nextInt(100),
                Random.nextInt(100)
        );
    }

    private static RavenclawStudent generateRavenclawStudent(String name) {
        return new RavenclawStudent(
                name,
                Random.nextInt(100),
                Random.nextInt(100),
                Random.nextInt(100),
                Random.nextInt(100),
                Random.nextInt(100),
                Random.nextInt(100)
        );
    }

    private static HufflepuffStudent generateHufflepuffStudent(String name) {
        return new HufflepuffStudent(
                name,
                Random.nextInt(100),
                Random.nextInt(100),
                Random.nextInt(100),
                Random.nextInt(100),
                Random.nextInt(100)
        );
    }

    private static SlytherinStudent generateSlytherinStudent(String name) {
        return new SlytherinStudent(
                name,
                Random.nextInt(100),
                Random.nextInt(100),
                Random.nextInt(100),
                Random.nextInt(100),
                Random.nextInt(100),
                Random.nextInt(100),
                Random.nextInt(100)
        );
    }

}
