package HW;

public class Customer {

    private int ID;
    private String name;
    private char gender;


    public Customer(int ID, String name, char gender) throws Exception{
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        if(gender != 'f' && gender != 'F' && gender != 'm' && gender != 'M')
        throw new Exception("The gender should be f or F or M or m");
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "HW.Customer{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
