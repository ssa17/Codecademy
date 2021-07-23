public class MadLibs {
  /*
  Your description here
  This programm fills in the gaps for the Mad Libs game
  Author: Syed
  Date: 30/05/2021
  */
  	public static void main(String[] args){
      String name1 = "Syed";
      String adjective1 = "sleepy";
      String adjective2 = "happy";
      String adjective3 = "tired";
      String verb1 = "dance";
      String noun1 = "Japan";
      String noun2 = "Home";
      String noun3 = "England";
      String noun4 = "America";
      String noun5 = "London";
      String noun6 = "Tokyo";
      String name2 = "Umarah";
      int number = 2217;
      String place1 = "Osaka";
      
      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";
      System.out.println(story);
    }     
}
