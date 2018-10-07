package backend;

//Placeholder backlog class

import java.util.ArrayList;

/* The String objects are placeholders.  We will access the DB service from here and
get the required information.  Eventually, this information will be passed to the team class
and converted into Text objects and other nodes */
public class Backlog {

    ArrayList<String> checkBox = new ArrayList<String>();
    //CheckBoxDBService service = new CheckBoxDBService()

    //Constructor
    public Backlog(){};

    public void backlogReturn(){
        System.out.println("Hello from a backlog class");
    }

    public ArrayList<String> getCheckBoxOutput() {
        return checkBox;
    }

    public void setCheckBoxOutput(ArrayList<String> checkBoxOutput) {
        this.checkBox = checkBoxOutput;
    }


}
