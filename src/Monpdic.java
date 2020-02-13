


      /*  User rolls  2  &  6
        Move 8 Spaces and stop
        User rolls  3  &  3
        DOUBLES!
        Move 6 Spaces and roll again getting...
        User rolls 1 & 2
        Move 3 Spaces and stop
        User rolls  2  &  2
        DOUBLES!
        Move 4 Spaces and roll again getting...
        User rolls 1 & 1
        DOUBLES
        Move 2 Spaces and roll again getting...
        User rolls 6 & 6
        DOUBLES
        you go to jail*/


      public class Monpdic {
      public static void main(String[]args) {

      //int h = 0;
     // String xet = "";

   //int[][] dice = {{1, 2, 3, 4, 5, 6 },{20, 30, 40, 40, 50 ,60}};

   //System.out.print( "" + dice[0][4] );

   int die1 = (int)(8 * Math.random()+1 );
   int die2 = (int)(7 * Math.random()+1);

   int sumOfDice  =  die1 + die2;
   int mulOfDice =  die1 * die2;

   System.out.print( "Die1: " + die1);
   System.out.print( "  Die2: " + die2);
   if(die1 == die2) {
    System.out.print( ": Double:" );
 }

   if(die1 == die2 * 2 ){
   System.out.println(" You go to jail ");
}
   System.out.print (" Die sum: " + sumOfDice) ;
   System.out.print( " Die mul: " + mulOfDice);






}
}
