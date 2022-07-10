public class RevenclawStudent extends HogwartsStudent {
    private int intelligence;
    private int wizdom;
    private int wit;
    private int creativity;


    public RevenclawStudent(String name, int whitchery, int transgression, int intelligence, int wizdom, int wit, int creativity) {
        super(name, whitchery, transgression);
        this.intelligence = intelligence;
        this.wizdom = wizdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWizdom() {
        return wizdom;
    }

    public void setWizdom(int wizdom) {
        this.wizdom = wizdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return super.toString() + "ум: " + intelligence + "; мудрость: " + wizdom + "; остроумие: " + wit + "; творчество: " + creativity;
    }

    private int ability() {
        return intelligence + wit + wizdom + creativity;
    }

    public void compareRavenclaw(RevenclawStudent revenclawStudent) {
        int ability1 = ability();
        int ability2 = revenclawStudent.ability();
        if (ability1 > ability2) {
            System.out.println("Студент Когтеврана " + getName() + " лучше, чем студент " + revenclawStudent.getName() + ": " + ability1 + " VS " + ability2);
        } else if (ability1 < ability2) {
            System.out.println("Студент Когтеврана " + revenclawStudent.getName() + " лучше, чем студент " + getName() + ": " + ability2 + " VS " + ability1);
        } else {
            System.out.println("Студент Когтеврана " + revenclawStudent.getName() + " такой же, как студент " + getName() + ": " + ability2 + " VS " + ability1);
        }
    }
}
