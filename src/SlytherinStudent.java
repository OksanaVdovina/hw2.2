public class SlytherinStudent extends HogwartsStudent {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;


    public SlytherinStudent(String name, int whitchery, int transgression, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, whitchery, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public String toString() {
        return super.toString() + "хитрость: " + cunning + "; решительность: " + determination + "; амбициозность: " + ambition + "; находчивость: " + resourcefulness + "; жажда власти: " + lustForPower;
    }

    private int ability() {
        return cunning + determination + ambition + resourcefulness + lustForPower;
    }

    public void compareSlytherin(SlytherinStudent slytherinStudent) {
        int ability1 = ability();
        int ability2 = slytherinStudent.ability();
        if (ability1 > ability2) {
            System.out.println("Студент Слизерина " + getName() + " лучше, чем студент " + slytherinStudent.getName() + ": " + ability1 + " VS " + ability2);
        } else if (ability1 < ability2) {
            System.out.println("Студент Слизерина " + slytherinStudent.getName() + " лучше, чем студент " + getName() + ": " + ability2 + " VS " + ability1);
        } else {
            System.out.println("Студент Слизерина " + slytherinStudent.getName() + " такой же, как студент " + getName() + ": " + ability2 + " VS " + ability1);
        }

    }
}
