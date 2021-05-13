/**
 * @author：Garfield
 * @date ：Created in 2021/5/13 23:12
 */

package www.learnjava.garfield.ch4;

public class CheckPalindrome {

    // 判断一个字符串是否回文
    public static boolean isPalindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if (s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    // 运用StringBuffer的reverse判断是否回文
    public static boolean isPalindrome2(String s){
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        return sb.toString().equals(s);
    }

    public static void main(String[] args) {
        String s = "abcacba";
        String s2 = "abcdef";
        System.out.println(isPalindrome(s));
        System.out.println(isPalindrome2(s));
        System.out.println(isPalindrome(s2));
        System.out.println(isPalindrome2(s2));
    }

}
