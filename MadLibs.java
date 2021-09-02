  /*
  This program generates a mad libbed story. 
  Author: Brian Williams
  Date: 8/31/2021
  */

package bwilliams512.madlibs;


public class MadLibs {
    public static void main(String[] args) {
      String name1 = "Stella";
      String adjective1 = "outstanding";
      String adjective2 = "wonderful";
      String adjective3 = "anxious";
      String verb1 = "gather";
      String noun1 = "student";
      String noun2 = "Nintendo Switch";
      String noun3 = "ocean";
      String noun4 = "employee";
      String noun5 = "snow";
      String noun6 = "animal";
      String name2 = "Paul";
      int number = 1900;
      String place1 = "Narnia";
      
      
      // The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". "
              + "And said 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. "
              + "They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". "
              + "Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "
              +name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";
        System.out.println(story);
             
    }
            
}
