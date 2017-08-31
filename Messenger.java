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
public class Messenger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Texting text = new Texting("John", 
                                    "Meet me tomorrow in town at 6 pm", 
                                    new Date(1503957808000L) 
                                    );
        System.out.printf("The messege is %s%n", text);
    }
}
