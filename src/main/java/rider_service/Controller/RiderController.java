package rider_service.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import rider_service.Dto.RiderDto;
import rider_service.Dto.VehicleDto;
import rider_service.Entity.Rider;
import rider_service.Service.RiderService;

@RestController
@RequestMapping("/rider")
public class RiderController {

    @Autowired
    private RiderService riderSer;

    // Create Rider Account
    @PostMapping("/createAccount")
    public Rider createAccount(@RequestBody RiderDto riderdto) {
        return riderSer.createAccount(riderdto);
    }

    // Find Rider
    @GetMapping("/getRider/{id}")
    public Rider getRider(@PathVariable int id) {
        return riderSer.getRider(id);
    }

    // Delete Rider
    @DeleteMapping("/deleteRider/{id}")
    public String deleteRider(@PathVariable int id) {
        return riderSer.deleteRider(id);
    }

    // Update Vehicle
    @PatchMapping("/updatevehicle")
    public String updatevehicle(
            @RequestParam int riderId,
            @RequestBody VehicleDto vehicleDto) {

        return riderSer.updateVehicle(riderId, vehicleDto);
    }

    // Update Rider Status
    @PatchMapping("/updateStatus")
    public ResponseEntity<Rider> updateStatus(
            @RequestParam Long id,
            @RequestParam String status) {

        Rider rider = riderSer.updateStatus(id, status);

        return ResponseEntity.ok(rider);
    }
}