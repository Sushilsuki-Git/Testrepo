public class basejava {
    public static void main(String[] args) {
      System.out.println("Hello World");
      System.out.println("Hello World");
      //print does not add new line
      System.out.print("Hello World");
      System.out.print("Hello World\n");
      /*  unlike text, we don't put numbers inside double quotes
      You can also perform mathematical calculations inside 
      the println() method */
      System.out.println(2+2);
      //To combine both text and a variable, use the + character:
      String Name = "john"; 
      System.out.println("hello " + Name);
      //You can also use the + character to add a variable to another variable:
      String firstName = "John ";  
      String lastName = "Doe";
      String fullName = firstName + lastName;

      System.out.println( fullName );
      System.out.println(firstName + lastName);
      //To find the length of the string
      System.out.println(fullName.length());
   }
  }
  
    
    

    

 
  