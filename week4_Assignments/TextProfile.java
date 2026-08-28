class Profile {
    private String name;
    private int age;
    private double heightMetres;
    public Profile(String name, int age, double heightMetres) {
        this.name = name;
        this.age = age;
        this.heightMetres = heightMetres;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getHeightMetres() {
        return heightMetres;
    }
    @Override
    public String toString() {
        return "Profile{name=" + name + ", age=" + age + ", heightMetres=" + heightMetres + "}";
    }
}
public class TextProfile {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Please provide name, age and height.");
            return;
        }
        String name = args[0];
        String ageText = args[1];
        String heightText = args[2];
        int age = Integer.parseInt(ageText);
        double height = Double.parseDouble(heightText);
        String ageString = Integer.toString(age);
        String heightString = Double.toString(height);

        System.out.println(ageString);
        System.out.println(heightString);
        Profile profile = new Profile(name, age, height);
        System.out.println(profile);
    }
}
