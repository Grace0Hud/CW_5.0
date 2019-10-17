//
//represents a single integer as an object
//
public class Num
{
    private int value;

    //stores initial value of new Num object
    public Num(int update)
    {
        value = update;
    }//end of num
    //returns current value of integer
    public int getValue()
    {
        return value;
    }//end of value getter
    //sets value of integer
    public void setValue(int update)
    {
        value = update;
    }//emd of value setter
    //returns integer value as a string
    public String toString()
    {
        return value + "";
    }//end of toString
}//end of Num class
