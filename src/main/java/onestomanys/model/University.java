package onestomanys.model;

public class University {

    private int universityId;
    private String universityCode;
    private String universityName;
    private String country;
    private String stateProvince;
    private String city;
    private String address;
    private String email;
    private String phone;
    private String website;
    private int establishedYear;
    private String universityType;

    public University() {
    }

    public University(int universityId, String universityCode, String universityName, String country,
            String stateProvince, String city, String address, String email, String phone,
            String website, int establishedYear, String universityType) {
        this.universityId = universityId;
        this.universityCode = universityCode;
        this.universityName = universityName;
        this.country = country;
        this.stateProvince = stateProvince;
        this.city = city;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.website = website;
        this.establishedYear = establishedYear;
        this.universityType = universityType;
    }

    public int getUniversityId() {
        return universityId;
    }

    public void setUniversityId(int universityId) {
        this.universityId = universityId;
    }

    public String getUniversityCode() {
        return universityCode;
    }

    public void setUniversityCode(String universityCode) {
        this.universityCode = universityCode;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public int getEstablishedYear() {
        return establishedYear;
    }

    public void setEstablishedYear(int establishedYear) {
        this.establishedYear = establishedYear;
    }

    public String getUniversityType() {
        return universityType;
    }

    public void setUniversityType(String universityType) {
        this.universityType = universityType;
    }
}