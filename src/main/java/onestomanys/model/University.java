package onestomanys.model;

public class University {

    private int id;
    private String name;
    private String city;
    private String state;
    private int foundedYear;

    public University() {
    }

    public University(int id, String name, String city, String state, int foundedYear) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.state = state;
        this.foundedYear = foundedYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getFoundedYear() {
        return foundedYear;
    }

    public void setFoundedYear(int foundedYear) {
        this.foundedYear = foundedYear;
    }
}