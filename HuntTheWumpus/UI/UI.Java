// Mateen and Eyouel 
// February 12, 2024
// Period 5
// Hunt the Wumpus - User Interface Class

package UI;
/*import HuntTheWumpus.Cave.*;
import HuntTheWumpus.gameControl.*;
import HuntTheWumpus.gameLocations.*;
import HuntTheWumpus.Player.*;
import HuntTheWumpus.Sound.*;
import HuntTheWumpus.Trivia.*;
import HuntTheWumpus.UI.*;
import HuntTheWumpus.Wumpus.*;
*/
import javax.swing.*;    

public class UI{
    ///////////////////////
    // Properties & Fields
    //////////////////////

    ///////////////////////
    // Constructor(s)
    //////////////////////
    public UI(){
        
            //just testing how this ui stuff works  
        
        
    }

    ///////////////////////
    // Methods
    //////////////////////
    public static void main(String[] args) {  
        JFrame f=new JFrame("Button Test");  
        JButton b=new JButton("Click Here");  
        b.setBounds(50,100,95,30);  
        f.add(b);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);   
    }     
}

