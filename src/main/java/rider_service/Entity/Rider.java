package rider_service.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import rider_service.Dto.VehicleDto;

@Entity
public class Rider {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String mobile;
    private String mail;
    private String gender;
    private Double wallet;
    private int noOfRides;
    private String drivingLicense;
    @OneToOne(cascade=CascadeType.ALL)
    private Vehicle vehicle;
    private String status;

    public Rider() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public int getNoOfRides() {
        return noOfRides;
    }

    public void setNoOfRides(int noOfRides) {
        this.noOfRides = noOfRides;
    }

    public String getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(String drivingLicense) {
        this.drivingLicense = drivingLicense;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicleDto) {
        this.vehicle = vehicleDto;
    }

    // Status Getter
    public String getStatus() {
        return status;
    }

    // Status Setter
    public void setStatus(String status) {
        this.status = status;
    }
}