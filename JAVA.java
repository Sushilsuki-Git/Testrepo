public class JAVA {

    public static void main(String[] args) {
      coustomer c1 = new coustomer();
      c1.show();
      coustomer c2 = new coustomer();
      c1.cid = 99;
      c1.cname = "sri";
      c1.cphone = 23709580;
      c1.show();
      
    }
  }
  
  class coustomer {
    int cid;
    String cname;
    long cphone;
    void show()
    {
      System.out.println("ID = " + cid);
      System.out.println("Coustomer NAME = " + cname);
      System.out.println("coustomer NUMBER = " + cphone);
    }
  }
  
  /*OUT PUT
  ID = 0
  Coustomer NAME = null
  coustomer NUMBER = 0
  ID = 99
  Coustomer NAME = sri
  coustomer NUMBER = 23709580
  */
  
  
