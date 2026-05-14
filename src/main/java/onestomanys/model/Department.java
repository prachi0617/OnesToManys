package onestomanys.model;

public class Department {

    private Integer departmentId;
    private String departmentName;
    private String departmentCode;
    private Integer universityId;
    private String headOfDepartment;
    private String departmentEmail;
    private String departmentPhone;
    private String buildingName;
    private Integer totalFaculty;
    private Integer totalStudents;

    public Department() {
    }

    public Department(
            Integer departmentId,
            String departmentName,
            String departmentCode,
            Integer universityId,
            String headOfDepartment,
            String departmentEmail,
            String departmentPhone,
            String buildingName,
            Integer totalFaculty,
            Integer totalStudents) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
        this.universityId = universityId;
        this.headOfDepartment = headOfDepartment;
        this.departmentEmail = departmentEmail;
        this.departmentPhone = departmentPhone;
        this.buildingName = buildingName;
        this.totalFaculty = totalFaculty;
        this.totalStudents = totalStudents;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public Integer getUniversityId() {
        return universityId;
    }

    public void setUniversityId(Integer universityId) {
        this.universityId = universityId;
    }

    public String getHeadOfDepartment() {
        return headOfDepartment;
    }

    public void setHeadOfDepartment(String headOfDepartment) {
        this.headOfDepartment = headOfDepartment;
    }

    public String getDepartmentEmail() {
        return departmentEmail;
    }

    public void setDepartmentEmail(String departmentEmail) {
        this.departmentEmail = departmentEmail;
    }

    public String getDepartmentPhone() {
        return departmentPhone;
    }

    public void setDepartmentPhone(String departmentPhone) {
        this.departmentPhone = departmentPhone;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public Integer getTotalFaculty() {
        return totalFaculty;
    }

    public void setTotalFaculty(Integer totalFaculty) {
        this.totalFaculty = totalFaculty;
    }

    public Integer getTotalStudents() {
        return totalStudents;
    }

    public void setTotalStudents(Integer totalStudents) {
        this.totalStudents = totalStudents;
    }
}