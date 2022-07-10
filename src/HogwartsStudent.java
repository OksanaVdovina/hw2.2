public abstract class HogwartsStudent {
    private String name;
    private int whitchery;
    private int transgression;

    public HogwartsStudent(String name, int whitchery, int transgression) {
        this.name = name;
        this.whitchery = whitchery;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public int getWhitchery() {
        return whitchery;
    }

    public void setWhitchery(int whitchery) {
        this.whitchery = whitchery;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    @Override
    public String toString() {
        return "Имя ученика: " + name + "; магия: " + whitchery + "; трансгрессия: " + transgression + "; ";
    }

    public void print() {
        System.out.println(this.toString());
    }

    private int ability() {
        return whitchery + transgression;
    }

    public void compareHogwarts(HogwartsStudent hogwartsStudent) {
        int ability1 = ability();
        int ability2 = hogwartsStudent.ability();
        if (ability1 > ability2) {
            System.out.println("Студент Хогвартса " + getName() + " лучше, чем студент " + hogwartsStudent.getName() + ": " + ability1 + " VS " + ability2);
        } else if (ability1 < ability2) {
            System.out.println("Студент Хогвартса " + hogwartsStudent.getName() + " лучше, чем студент " + getName() + ": " + ability2 + " VS " + ability1);
        } else {
            System.out.println("Студент Хогвартса " + hogwartsStudent.getName() + " такой же, как студент " + getName() + ": " + ability2 + " VS " + ability1);
        }
    }


}
