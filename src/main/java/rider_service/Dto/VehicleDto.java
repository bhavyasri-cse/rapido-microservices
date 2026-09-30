package rider_service.Dto;

public class VehicleDto {
	private String type;
    private String vehNo;
    private String name;
    private String model;

    public VehicleDto() {
    }

    public VehicleDto(String type, String vehNo, String name, String model) {
        this.type = type;
        this.vehNo = vehNo;
        this.name = name;
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVehNo() {
        return vehNo;
    }

    public void setVehNo(String vehNo) {
        this.vehNo = vehNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

}
