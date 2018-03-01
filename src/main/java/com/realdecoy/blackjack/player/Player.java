/**
* <h1>Generic Player Class</h1>
* Contains the core attributes that will be used by Black Jack Players
* <p>
* 
* @author  Denis Bell
* @version 1.0
*/
public abstract class Player{

    String name;
    Integer score;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}