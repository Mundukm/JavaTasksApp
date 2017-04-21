package taskPack;

import java.util.List;

/**
 * Created by Kolja on 21.04.2017.
 */

//General base class for tasks
public abstract class GeneralTask {

    private static String name;
    private static String result;
    private static String input;

    public abstract void countResult();


    //Getters Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public static String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
