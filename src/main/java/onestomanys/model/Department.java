package onestomanys.model;

public class Department {

    private int id;
    private String name;
    private String building;
    private double budget;
    private int universityId;

    public Department() {
    }

    public Department(int id, String name, String building, double budget, int universityId) {
        this.id = id;
        this.name = name;
        this.building = building;
        this.budget = budget;
        this.universityId = universityId;
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

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public int getUniversityId() {
        return universityId;
    }

    public void setUniversityId(int universityId) {
        this.universityId = universityId;
    }
}