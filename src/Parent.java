public class Parent {
    private String Name;
    private int Age;

    public Parent(int age, String name) {
        Age = age;
        Name = name;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "Age=" + Age +
                ", Name='" + Name + '\'' +
                '}';
    }

}
