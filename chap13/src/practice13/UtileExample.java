package practice13;

public class UtileExample {
    public static void main(String[] args){
        Pair<String, Integer> pair = new Pair<>("홍길동",36);
        Integer age = Util.getValue(pair, "홍길동");
        System.out.println(age);

        ChildPair<String, Integer> childPair = new ChildPair<>("홍삼원", 20);
        Integer childAge = Util.getValue(childPair, "홍삼순");
        System.out.println(childAge);

        /*OtherPair<String, Integer> otherPair = new OtherPair<>("홍삼원", 20);
        OtherPair는 Pair를 상속하지 않으므로 예외가 발생해야한다.
        int otherAge = Util.getValue(otherPair,"홍삼원");
        System.out.println(otherAge);

    */}
}
