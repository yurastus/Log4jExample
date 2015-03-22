
import org.apache.log4j.Logger;

public class Application extends Parent{

    void runSetting(){
        System.out.println(s);
    }

    public static void main (String[] a){
        new Application().runSetting();
    }
}