package typeracer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Typeracer {

    public static double zodziuKiekis;
    public static double x;

    
    public static void main(String[] args) {
        
        Laikas naujas = new Laikas();
        naujas.start();

     
        String sakinys = "Lauke dabar sninga";
        System.out.println("Sakinys: "+sakinys);
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(sakinys.split(" ")));
        
        System.out.println("Iveskite sakini:");
        Scanner keyboard = new Scanner(System.in);
        String ivedimas = keyboard.nextLine();
        ArrayList<String> list2 = new  ArrayList<String>(Arrays.asList(ivedimas.split(" ")));
        
        ArrayList<String> list3 = new ArrayList<String>();
          for (String temp : list)
              list3.add(list2.contains(temp) ? "Yes" : "No");
          System.out.println(list3);
          for(String str : list3){
              if(str.contains("Yes")){
                  x++;
              }
          }
           
          zodziuKiekis = list.size();
          System.out.println("Teisingai ivestu zodziu kiekis: "+x+" is "+zodziuKiekis);
          naujas.stop();
    }
    
}
