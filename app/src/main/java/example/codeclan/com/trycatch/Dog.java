package example.codeclan.com.trycatch;

/**
 * Created by user on 26/06/2017.
 */

public class Dog implements Pet{
    private String name;

    public Dog(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

}


