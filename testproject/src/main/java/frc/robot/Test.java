

package frc.robot;

//import edu.wpi.first.wpilibj.GenericHID;
//import edu.wpi.first.wpilibj.GenericHID.Hand;
//import edu.wpi.first.wpilibj.Joystick;
//import edu.wpi.first.wpilibj.TimedRobot;
import java.util.TimerTask;
import java.util.Timer;


public final class Test {
    //本当はこのクラスでジョイスティックの入力を認識できるかテストしたかったんだけど、
    //⇓⇓のジョイスティックに関する宣言があるとTestクラスを上手く読み込んでくれない…
    //やっぱりTimedRobotクラスじゃなきゃダメなものなん？
    //と思ったので、このクラスは一旦保留しております

    //private final Joystick m_stick = new Joystick(0);  
    
    //private final Timer m_timer = new Timer();

    
    public void Testmain(){

        System.out.println("Debug Start!");
        int counter = 0;
 
        //GenericHID hid = new GenericHID(Const.joystickport);
        //Joystick joystick = new Joystick(Const.joystickport);
        //int controlerport = hid.getPort();
        //joystick = new Joystick(Const.joystickport);
        while(true){
            TimerTask task = new TimerTask() {
                public void run() {
                     
                    //実際のテストを呼び出す
                    //System.out.println("LOG: counter=");
                    //if(m_stick.getX(Hand.kLeft) > 50){



                    //}
                    
                   // double dbl = m_stick.getX(Hand.kLeft); 
                    //System.out.printf("BMI:%.5f\n",dbl);
                }
            };
    
            Timer timer = new Timer();
            //100msに一回タスクを実行する（runの所をよぶ）
            timer.schedule(task, 1000);

            //10回繰り返したら終了（永遠に回らないようにとりあえず）
            counter++;
            if(counter == 30){
                break;
            }

        }

          int i = 1;
          while(i == 0){
          }

    }



}