public class Location {
   // Location atributes
   private int locationId;
   private String locationAddress;
   private String postalCode;
   private String city;
   private String state;
   private String country;
   private String region;
   
   // Constructor
   public Location (int locationId, String locationAddress, String postalCode, String city, String state, String country, String region) {
        this.locationId = locationId;
        this.locationAddress = locationAddress;
        this.postalCode = postalCode;
        this.city = city;
        this.state = state;
        this.country = country;
        this.region = region;
   }

   // Getters and setters
   public int getlocationId() {
        return locationId;
   }
   public void setLocationId(int locationId) {
        this.locationId = locationId;
   }

   public String getLocationAddress() {
        return locationAddress;
   }
   public void setLocationAddress(String locationAddress) {
        this.locationAddress = locationAddress;
   }

   public String getPostalCode() {
        return postalCode;
   }
   public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
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

   public String getCountry() {
        return country;
   }
   public void setCountry(String country) {
        this.country = country;
   }

   public String getRegion() {
        return region;
   }
   public void setRegion(String region) {
        this.region = region;
   }

   // Override toString() method
   @Override
   public String toString() {
       return "Address: " + locationAddress + " postal code: " + postalCode + " city: " + city + " state: " + state + " country: " + country + " region: " + region;
   }
}
