public class Person {

   String name;
   int age;
   int gender;
      
   Person(String pName, int pAge, int pGender) {
      
      name = pName;
      age = pAge;
      gender = pGender;
   
   }
   
   public String getName() {
      
      return name;
      
   }
   
   public int getAge() {
   
      return age;
   
   }
   
   public String getGender() {
   
      String male = "Male";
      String female = "Female";
   
      if (gender == 0) {
      
         return male;
      
      } else {
      
         return female;
      
      }
   }
   
   public int birthday() {
   
      age = age + 1;
      return age; 
   
   }

}