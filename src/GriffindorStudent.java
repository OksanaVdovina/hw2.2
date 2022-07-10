public class GriffindorStudent extends HogwartsStudent{
    private int nobility;
    private int honor;
    private int courage;

    public GriffindorStudent(String name, int whitchery, int transgression, int nobility, int honor, int courage) {
        super(name, whitchery, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    @Override
    public String toString() {
        return super.toString() + "благородство: " + nobility + "; честь: " + honor + "; храбрость: " + courage;
    }

    private int ability() {
        return nobility + honor + courage;
    }

    public void compareGriffindor(GriffindorStudent griffindorStudent) {
        int ability1 = ability();
        int ability2 = griffindorStudent.ability();
        if (ability1 > ability2) {
            System.out.println("Студент Гриффиндора " + getName() + " лучше, чем студент " + griffindorStudent.getName() + ": " + ability1 + " VS " + ability2);
        } else if (ability1 < ability2) {
            System.out.println("Студент Гриффиндора " + griffindorStudent.getName() + " лучше, чем студент " + getName() + ": " + ability2 + " VS " + ability1);
        } else {
            System.out.println("Студент Гриффиндора " + griffindorStudent.getName() + " такой же, как студент " + getName() + ": " + ability2 + " VS " + ability1);
        }
    }

}


