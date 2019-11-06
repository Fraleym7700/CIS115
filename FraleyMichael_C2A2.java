import javax.swing.JOptionPane;
package fraleymichael_c2a2

public class FraleyMichael_C2A2 {
    
     public static int getNumberOfRooms(){
         String userInputString;
         int userNumberofRooms;
         userInputString = JOptionPane.showInputDialog("Please enter the number of rooms that are going to be painted: ");
         userNumberofRooms = Integer.parseInt(userInputString);
         return userNumberofRooms;
     } 
     public static double getPaintPricePerGallon(){
         String userInputString;
         double priceOfPaint;
         userInputString = JOptionPane.showInputDialog("Please enter the price of the paint: ");
         priceOfPaint = Double.parseDouble(userInputString);
         return priceOfPaint;
     }
     public static double getTotalWallSpace(int numberOfRooms ){
     double wallSpace; //wallspace
     double totalWallSpace = 0;
     for( int currentRoom = 1; currentRoom <= numberOfRooms; currentRoom++){
        wallSpace = JOptionPane.showInputDialog( "Please enter square feet of wall space in room: " + currentRoom );
         totalWallSpace += wallSpace;
        }
     return totalWallSpace;    
    }
     public static double calculateGallonsOfPaintsRequired(double totalWallSpace){
         /* if 115 square feet = 1 gallon
         thenn totalWallSpace = ?    
         */
         double gallonsOfPaintRequired;
         gallonsOfPaintRequired = (totalWallSpace /115) * 1;
         return gallonsOfPaintRequired;
     }
     public static double calculateHoursOfLaborRequired  (double totalWallSpace){
         /* if 115 square feet = 8 hours
         thenn   = ?    
         */
         double hoursOfLaborRequired;
         hoursOfLaborRequired = ( totalWallSpace / 115) * 8;
         return hoursOfLaborRequired;
         
     }
     
     public static double calculateCostOfPaint(double priceOfPaint, double gallonsOfPaintRequired ){
       double costOfPaint;
       costOfPaint = gallonsOfPaintRequired * priceOfPaint;
       return costOfPaint;
     }
     public static double calculateLaborCharges(double hoursOfLaborRequired, double chargePerHour){
         double laborCharges;
         laborCharges = hoursOfLaborRequired * chargePerHour;
         return laborCharges;
         
     }
     public static double calculateTotalCost(double laborCharges, double costOfPaint ){
         double totalCost;
         totalCost = laborCharges + costOfPaint;
         return totalCost;
     }
    public static void displayDataOnScreen(){
        
    }
    public static void main(String[] args) {
     final double CHARGE_PER_HOUR = 20.00;
     int userNumberOfRooms = getNumberOfRooms();
     double totalWallSpace = getTotalWallSpace(userNumberOfRooms );
     double priceOfPaintPerGallon = getPaintPricePerGallon();
     double gallonsOfPaintRequired = calculateGallonsOfPaintsRequired(totalWallSpace);
     double hoursOfLaborRequired = calculateHoursOfLaborRequired (totalWallSpace);
     double costOfPaint = calculateCostOfPaint(priceOfPaintPerGallon, gallonsOfPaintRequired);
     double laborCharges = calculateLaborCharges(hoursOfLaborRequired, CHARGE_PER_HOUR );
     double totalCost = calculateTotalCost(laborCharges,costOfPaint);
     
    }
    
}
