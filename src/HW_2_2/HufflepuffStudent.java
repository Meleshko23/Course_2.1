package HW_2_2;

public class HufflepuffStudent extends HogwartsStudent {
    //    Студенты Пуффендуя трудолюбивы, верны, честны.
    private int diligense;
    private int loyalty;
    private int honesty;

    public HufflepuffStudent(String name, int magic, int transgression, int diligense, int loyalty, int honesty) {
        super(name, magic, transgression);
        this.diligense = diligense;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligense() {
        return diligense;
    }

    public void setDiligense(int diligense) {
        this.diligense = diligense;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    private int ability() {
        return diligense + loyalty + honesty;
    }

    public void compsreHufflepuffStudentt(HufflepuffStudent hufflepuffStudent) {
        int ability1 = ability();
        int ability2 = hufflepuffStudent.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент Пуффендуя %s лучше студента Пуффендуя %s (%d VS %d)%n", getName(), hufflepuffStudent.getName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Студент Пуффендуя %s лучше студента Пуффендуя %s (%d VS %d)%n", hufflepuffStudent.getName(), getName(), ability2, ability1);
        } else {
            System.out.printf("Студент Пуффендуя %s  точно такой же, как студент Пуффендуя %s (%d VS %d)%n", hufflepuffStudent.getName(), getName(), ability2, ability1);
        }
    }

    @Override
    public String toString() {
        return String.format("%s, трудолюбие - %d, верность - %d, честность - %d", super.toString(), diligense, loyalty, honesty);
    }

}
