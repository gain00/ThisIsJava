package practice13;

public class Container1<type1,type2> {
    private type1 name;
    private type2 value;
    public void set(type1 name, type2 value){
       this.name = name;
       this.value = value;
    }
    public type1 getKey(){
        return name;
    }
    public type2 getValue(){
        return value;
    }
}
