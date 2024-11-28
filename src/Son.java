public class Son extends Parent{
    private String colourOfEyes;
    private String ability;

    public Son(int age, String name,String ability, String colourOfEyes) {
        super(age,name);
        this.ability = ability;
        this.colourOfEyes = colourOfEyes;
    }

    @Override
    public String toString() {
        return "Son{" +
                "ability='" + ability + '\'' +
                ", colourOfEyes='" + colourOfEyes + '\'' +
                '}';
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public String getColourOfEyes() {
        return colourOfEyes;
    }

    public void setColourOfEyes(String colourOfEyes) {
        this.colourOfEyes = colourOfEyes;
    }
}
