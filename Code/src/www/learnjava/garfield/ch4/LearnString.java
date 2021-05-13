/**
 * @author：Garfield
 * @date ：Created in 2021/5/13 22:48
 */

package www.learnjava.garfield.ch4;

public class LearnString {
    public static void main(String[] args) {

        String s1 = "garfield";
        s1 = "Garfield";
        System.out.println(s1);


        String m1 = "Welcome";
        String m2 = "Welcome";
        String m3 = "Wel" + "come";
        String m4 = "Wel" + new String("come");
        System.out.println(m1==m2);
        System.out.println(m1==m3);
        System.out.println(m1==m4);
    }
}
