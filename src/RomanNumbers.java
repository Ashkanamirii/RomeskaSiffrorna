/**
 * Created by Ashkan Amiri
 * Date:  2020-09-29
 * Time:  14:16
 * Project: Romeska Siffrorna
 */
public enum RomanNumbers {
    I(1), V(5), X(10), L(50),
    C(100), D(500), M(1000);

    private final int  nr;


    RomanNumbers (int nr)  {
        this.nr = nr;

    }
    public int getNr(){
        return nr;
    }
}
