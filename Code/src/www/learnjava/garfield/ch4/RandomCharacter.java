/**
 * @author：Garfield
 * @date ：Created in 2021/5/13 22:30
 */

package www.learnjava.garfield.ch4;

public class RandomCharacter {
    // 随机生成字符串
    public static char getRandomCharacter(char ch1, char ch2){
        return (char)(ch1 + (int)(Math.random()*(ch2-ch1+1)));
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(getRandomCharacter('a','z'));
        }
    }
}
