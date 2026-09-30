package rider_service.Dto;

import rider_service.Entity.Vehicle;

public class RiderDto {
	
	private String name;
    private String mobile;
    private String mail;
    private String gender;
    private Double wallet;
    private Integer noOfRides;
    private String drivingLicense;
    private Vehicle vehicle;
    
    public RiderDto() {
    }

    public RiderDto(String name, String mobile, String mail, String gender,
                    Double wallet, Integer noOfRides,
                    String drivingLicense,Vehicle vehicle) {

        this.name = name;
        this.mobile = mobile;
        this.mail = mail;
        this.gender = gender;
        this.wallet = wallet;
        
        this.noOfRides = noOfRides;
        this.drivingLicense = drivingLicense;
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Double getWallet() {
        return wallet;
    }

    public void setWallet(Double wallet) {
        this.wallet = wallet;
    }

    

    public Integer getNoOfRides() {
        return noOfRides;
    }

    public void setNoOfRides(Integer noOfRides) {
        this.noOfRides = noOfRides;
    }

    public String getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(String drivingLicense) {
        this.drivingLicense = drivingLicense;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

}
