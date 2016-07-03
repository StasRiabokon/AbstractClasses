public class Student extends Person {

    private String major;

    /**
     * @param name  Student's name
     * @param major Student specialization
     */


    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    @Override
    public String getDescription() {
        return "a student majoring in " + major;
    }
}
