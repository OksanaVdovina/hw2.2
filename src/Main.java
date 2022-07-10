import java.util.Random;

public class Main {
    public static void main(String[] args) {
    GriffindorStudent harryPotter = generateGriffindorStudent("Harry Potter");
    GriffindorStudent hermioneGranger = generateGriffindorStudent("Hermione Granger");
    GriffindorStudent ronWeasley = generateGriffindorStudent("Ron Weasley");
    SlytherinStudent dracoMalfoy = generateSlytherinStudent("Draco Malfoy");
    SlytherinStudent grahamMontagu = generateSlytherinStudent("Graham Montagu");
    SlytherinStudent gregoryGoyle = generateSlytherinStudent("Gregory Goyle");
    HufflepuffStudent zachariasSmith = generateHufflepuffStudent("Zacharias Smith");
    HufflepuffStudent cedricDiggory = generateHufflepuffStudent("Cedric Diggory");
    HufflepuffStudent justinFinchFletchley = generateHufflepuffStudent("Justin Finch-Fletchley");
    RevenclawStudent zhouChang = generateRevenclawStudent("Zhou Chang");
    RevenclawStudent padmaPatil = generateRevenclawStudent("Padma Patil");
    RevenclawStudent marcusBelby = generateRevenclawStudent("Marcus Belby");

    harryPotter.print();
    zhouChang.print();
    grahamMontagu.print();
    cedricDiggory.print();
    System.out.println();
    harryPotter.compareHogwarts(dracoMalfoy);
    harryPotter.compareGriffindor(ronWeasley);
    }

    private static final Random RANDOM = new Random();

    private static GriffindorStudent generateGriffindorStudent(String name) {
        return new GriffindorStudent(name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100));
    }
    private static HufflepuffStudent generateHufflepuffStudent(String name) {
        return new HufflepuffStudent(name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100));
    }

    private static RevenclawStudent generateRevenclawStudent(String name) {
        return new RevenclawStudent(name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100));
    }

    private static SlytherinStudent generateSlytherinStudent(String name) {
        return new SlytherinStudent(name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100));
    }

}