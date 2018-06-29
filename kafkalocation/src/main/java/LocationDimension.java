public class LocationDimension {

     private Integer locationNumber;

     private String locationName;
     private String locationClass;

     public LocationDimension(Integer locationNumber, String locationName, String locationClass) {
          this.locationNumber = locationNumber;
          this.locationName = locationName;
          this.locationClass = locationClass;
     }

     public Integer getLocationNumber() {

          return locationNumber;
     }

     public void setLocationNumber(Integer locationNumber) {
          this.locationNumber = locationNumber;
     }

     public String getLocationName() {
          return locationName;
     }

     public void setLocationName(String locationName) {
          this.locationName = locationName;
     }

     public String getLocationClass() {
          return locationClass;
     }

     public void setLocationClass(String locationClass) {
          this.locationClass = locationClass;
     }
}
