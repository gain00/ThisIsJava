package practice13;

public class Util {
    public static<K,V> V getValue (Pair<K,V> pair,K key){
        if (pair.getKey().equals(key)) {
            return pair.getValue(); // 키가 일치하면 값 반환
        }
        return null; // 키가 일치하지 않으면 null 반

    }
}
