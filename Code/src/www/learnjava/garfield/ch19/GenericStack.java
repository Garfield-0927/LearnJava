/**
 * @author：Garfield
 * @date ：Created in 2021/5/18 22:39
 */

package www.learnjava.garfield.ch19;

import java.util.ArrayList;

public class GenericStack<T> {
    private ArrayList<T> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public T peek() {
        return list.get(list.size() - 1);
    }

    public T pop() {
        return list.remove(list.size() - 1);
    }

    public void push(T t) {
        list.add(t);
    }
}
