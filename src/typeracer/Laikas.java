package typeracer;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import static typeracer.Typeracer.x;

public class Laikas {
    public int sec = 0;
    public static int myInt=0;
    public static double dx;
    

    Timer timer = new Timer();
    TimerTask task = new TimerTask()  {
        public void run() {
            sec++;
            if(myInt!=0){
                System.out.println("Jusu laikas: "+sec+" sec");
                WPM(sec);
                System.out.println(dx+" WPM");
                System.exit(1);
            }
        }
    };

    public void stop(){
        myInt=1;
    }
    
    public void WPM(int min){
        dx=x/min*60;
    }

    public void start() {
        timer.scheduleAtFixedRate(task, 0, 1000);
    }

}