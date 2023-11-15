import java.util.ArrayList;
import java.util.List;

public class LocationManager {

    private List<Location> locationsList = new ArrayList<>();

    // Add a location to list
    public void addLocation(Location location) {
        if (!locationsList.contains(location)){
            locationsList.add(location);
            System.out.println("Location " + location.getLocationAddress() + " was added");
        }
    }
    // Remove a location from list
    public void removeLocation(Location location) {
        if (locationsList.contains(location)){
            locationsList.remove(location);
            System.out.println("Location " + location.getLocationAddress() + " was removed");
        }
    }
    // Show all locations
    public void printLocations(){
        for (Location location : locationsList){
            System.out.println(location.getLocationAddress());
        }
    }
}

