import java.text.DecimalFormat;

public class Walk {

   private String startTime;
   private String endTime;
   private String date;
   private String name;
   
   public Walk(String startTimeIn, 
      String endTimeIn, String dateIn, String nameIn) {
      setStartTime(startTimeIn);
      setEndTime(endTimeIn);
      setDate(dateIn);
      setName(nameIn);    
   }
   
   public boolean setStartTime(String startTimeIn) {
      boolean isSet = false;
      
      if (startTimeIn != null) {
         startTime = startTimeIn;
         isSet = true;
      }
      
      return isSet;    
   }
   
   public boolean setEndTime(String endTimeIn) {
      boolean isSet = false;
      
      if (endTimeIn != null) {
         endTime = endTimeIn;
         isSet = true;
      }
      
      return isSet;
   }
   
   public boolean setDate(String dateIn) {
      boolean isSet = false;
      
      if (dateIn != null) {
         date = dateIn;
         isSet = true;
      }
      
      return isSet;
   }
   
   public boolean setName(String nameIn) {
      boolean isSet = false;
      
      if (nameIn != null) {
         name = nameIn;
         isSet = true;
      }
      
      return isSet;
   }
   
   public String getStartTime() {
      return startTime;
   }
   
   public String getEndTime() {
      return endTime;
   }
   
   public String getDate() {
      return date;
   }
   
   public String getName() {
      return name;
   }
   
   public int lengthOfWalk(String startTimeIn, String endTimeIn) {
      String startIn = startTimeIn.replace(":", "");
      String endIn = endTimeIn.replace(":", "");
      
      int start = Integer.parseInt(startIn);
      int end = Integer.parseInt(endIn);
      
      int duration = end - start;
    
      return duration;
   }
   
   public String durationToString(int durationIn) {
      DecimalFormat df = new DecimalFormat("0000");
      String time = String.valueOf(df.format(durationIn));
      String output = time.substring(0, 2) + ":" + time.substring(2, 4);
      return output;
   }
   
  
   public String toString() {
      String duration = durationToString(lengthOfWalk(startTime, endTime));
      String output = "Walk Start Time: " + getStartTime()
         + "\nWalk End Time: " + getEndTime()
         + "\nDate: " + getDate()
         + "\nWalker: " + getName()
         + "\nDuration: " + duration;          
      return output;
   }
}

// Walk w1 = new Walk("05:00", "06:30", "09/16", "Kyle");