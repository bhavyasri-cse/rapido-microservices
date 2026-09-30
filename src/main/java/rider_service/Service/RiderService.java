package rider_service.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rider_service.Dto.RiderDto;
import rider_service.Dto.VehicleDto;
import rider_service.Entity.Rider;
import rider_service.Entity.Vehicle;
import rider_service.Repository.RiderRepo;
import rider_service.Repository.VehicleRepo;

@Service
public class RiderService {

    @Autowired
    private RiderRepo riderRepo;
  
    @Autowired
    private VehicleRepo vehicleRepository;

    // Create Rider Account
    public Rider createAccount(RiderDto riderdto) {

        Rider rider = new Rider();

        rider.setName(riderdto.getName());
        rider.setMobile(riderdto.getMobile());
        rider.setMail(riderdto.getMail());
        rider.setGender(riderdto.getGender());
        rider.setNoOfRides(riderdto.getNoOfRides());
        rider.setDrivingLicense(riderdto.getDrivingLicense());
        rider.setVehicle(riderdto.getVehicle());

        return riderRepo.save(rider);
    }

    // Find Rider
    public Rider getRider(int id) {

        Optional<Rider> rider = riderRepo.findById((long) id);

        if (rider.isEmpty()) {
            throw new RuntimeException(
                    "Rider Not Found With ID: " + id);
        }

        return rider.get();
    }

    // Delete Rider
    public String deleteRider(int id) {

        Rider rider = riderRepo.findById((long) id)
                .orElseThrow(() ->
                        new RuntimeException(
                                "Rider not found with id: " + id));

        riderRepo.delete(rider);

        return "Rider deleted successfully with id: " + id;
    }

    // Update Vehicle
    public String updateVehicle(int riderId, VehicleDto vehicleDto) {

        
        Rider rider = riderRepo.findById((long) riderId)
                .orElseThrow(() ->
                        new RuntimeException(
                                "Rider not found with ID: " + riderId));

        
        String vehicleIdString = rider.getVehicle();

        if (vehicleIdString == null || vehicleIdString.isEmpty()) {
            throw new RuntimeException(
                    "No vehicle assigned to rider ID: " + riderId);
        }

       
        int vehicleId;

        try {
            vehicleId = Integer.parseInt(vehicleIdString);
        } catch (NumberFormatException e) {
            throw new RuntimeException(
                    "Invalid vehicle ID: " + vehicleIdString);
        }

        // Find Vehicle
        Vehicle vehicle = vehicleRepository.findById((long) vehicleId)
                .orElseThrow(() ->
                        new RuntimeException(
                                "Vehicle not found with ID: " + vehicleId));

        // Update Vehicle Details
        vehicle.setType(vehicleDto.getType());
        vehicle.setVehNo(vehicleDto.getVehNo());
        vehicle.setName(vehicleDto.getName());
        vehicle.setModel(vehicleDto.getModel());

        // Save Vehicle
        vehicleRepository.save(vehicle);

        return "Vehicle updated successfully";
    }

    // Update Rider Status
    public Rider updateStatus(Long id, String status) {

        Rider rider = riderRepo.findById((long) id)
                .orElseThrow(() ->
                        new RuntimeException(
                                "Rider not found with ID: " + id));

        if (status.equalsIgnoreCase("ONLINE")) {

            rider.setStatus("ONLINE");

        } else if (status.equalsIgnoreCase("OFFLINE")) {

            rider.setStatus("OFFLINE");

        } else {

            throw new RuntimeException(
                    "Invalid status. Use ONLINE or OFFLINE");
        }

        return riderRepo.save(rider);
    }
}