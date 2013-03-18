/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package unoesc.edu.br;

import java.awt.AWTKeyStroke;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.util.HashSet;
import javax.swing.JFrame;

/**
 *
 * @author D3nys
 */
public class TrocaTabEntrer {
    
       public static void trocaTabEnter( JFrame vClass ){          
        HashSet conj = new HashSet( vClass .getFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS) );  
        conj.add(AWTKeyStroke.getAWTKeyStroke(KeyEvent.VK_ENTER, 0));  
        vClass.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, conj);       
    }  
  
}




