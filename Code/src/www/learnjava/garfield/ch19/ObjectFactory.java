/**
 * @author：Garfield
 * @date ：Created in 2021/5/18 23:29
 */

package www.learnjava.garfield.ch19;

public class ObjectFactory<T> {
    private Class<T> type;      // 保存要创建的对象的类型信息
    public ObjectFactory(Class<T> type) {
        this.type = type;
    }
    public T create() {
        T o = null;
        try {
            o= type.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return o;
    }
}

