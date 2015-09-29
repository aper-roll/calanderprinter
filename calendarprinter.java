public class calendarprinter {
  public static void main (String[] args) {
    int x = 1;
    String y = " ";
    while (x<= 30)
    {
      if (x == 5 || x == 6 || x == 12 || x == 13 || x == 19 || x == 20 || x == 26 || x == 27)
      {
        y = "- WEEKEND";
      }
      if (x == 7)
      {
        y = "- NO SCHOOL (labor day)";
      }
      if (x == 25)
      {
        y = "- END OF THE MARKING PERIOD";
      }
      System.out.println( "September" + x + y);
      x++; 
      if (x != 5 && x != 6 && x != 7 && x != 12 && x != 13 && x != 19 && x != 20 && x != 25 && x!=26 && x!=27)
      {
        y= " ";
      }
    }
  }
}