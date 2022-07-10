public class HufflepuffStudent extends HogwartsStudent{
    private int hardwork;
    private int loyalty;
    private int honesty;

    public HufflepuffStudent(String name, int whitchery, int transgression, int hardwork, int loyalty, int honesty) {
        super(name, whitchery, transgression);
        this.hardwork = hardwork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardwork() {
        return hardwork;
    }

    public void setHardwork(int hardwork) {
        this.hardwork = hardwork;
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

    @Override
    public String toString() {
        return super.toString() + "трудолюбие: " + hardwork + "; верность: " + loyalty + "; честность: " + honesty;
    }

    private int ability() {
    return hardwork + loyalty + honesty;
    }

    public void compareHufflepuff(HufflepuffStudent hufflepuffStudent) {
        int ability1 = ability();
        int ability2 = hufflepuffStudent.ability();
        if (ability1 > ability2) {
            System.out.println("Студент Пуффендуя " + getName() + " лучше, чем студент " + hufflepuffStudent.getName() + ": " + ability1 + " VS " + ability2);
        } else if (ability1 < ability2) {
            System.out.println("Студент Пуффендуя " + hufflepuffStudent.getName() + " лучше, чем студент " + getName() + ": " + ability2 + " VS " + ability1);
        } else {
            System.out.println("Студент Пуффендуя " + hufflepuffStudent.getName() + " такой же, как студент " + getName() + ": " + ability2 + " VS " + ability1);
        }
    }
}

