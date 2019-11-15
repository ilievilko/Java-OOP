package defineaninterfaceperson;

public class Pet implements Birthable {

    private String name;
    private String birthDate;


    public Pet(String name, String birthDate) {
        this.birthDate = birthDate;
        this.name = name;
    }

    @Override
    public String getBirthDate() {
        return this.birthDate;
    }

    public String getName() {
        return this.name;
    }

}
