import java.time.Month;
/**
 * Created by Ashkan Amiri
 * Date:  2020-09-29
 * Time:  14:17
 * Project: Romeska Siffrorna
 */
public class Main {
    public static void main(String[] args){
        run();
    }

    static void run(){
        for (RomanNumbers r : RomanNumbers.values()){
            System.out.println(r + " is "
                    + r.getNr() );
        }
        //RomanNumbers r2 = RomanNumbers.D;
        //System.out.println("r2 = " + r2);
    }
}
