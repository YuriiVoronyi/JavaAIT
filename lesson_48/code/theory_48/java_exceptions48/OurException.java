package theory_48.java_exceptions48;

public class OurException extends Exception{
    String string;

    public OurException( String string){
        this.string = string;
    }

    public String toString(){
        return "OurException:" +string;
    }
}
