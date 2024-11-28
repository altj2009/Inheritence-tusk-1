public class Dauther extends Parent{
    private int typeOfBlood;
    private String Talent;

    public Dauther(int age, String name, String talent, int typeOfBlood) {
        super(age, name);
        Talent = talent;
        this.typeOfBlood = typeOfBlood;
    }

    @Override
    public String toString() {
        return "Dauther{" +
                "Talent='" + Talent + '\'' +
                ", typeOfBlood=" + typeOfBlood +
                '}';
    }

    public String getTalent() {
        return Talent;
    }

    public void setTalent(String talent) {
        Talent = talent;
    }

    public int getTypeOfBlood() {
        return typeOfBlood;
    }

    public void setTypeOfBlood(int typeOfBlood) {
        this.typeOfBlood = typeOfBlood;
    }
}
