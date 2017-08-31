/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package messenger;
import java.util.Date;
/**
 *
 * @author Yo
 */
public class Texting {
    private String mWriter;
    private String mMessege;
    private Date mDate;
    
    //constructor
    public Texting(String writer, String messege, Date date){
    mWriter = writer;
    mMessege = messege;
    mDate = date;
    }
    public String toString(){
        return "From \"" + mWriter + "\" " + mMessege +"\" Sent:"+ mDate;
    }
    public String getWritter(){
        return mWriter;
    }
    public String getMessege(){
        return mMessege;
    }
    
    public Date getDate(){
        return mDate;
    }
}
