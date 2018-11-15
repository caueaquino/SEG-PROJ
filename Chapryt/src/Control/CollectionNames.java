/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author caue
 */
public class CollectionNames {
    public final ArrayList<String> bdNames=new ArrayList();

    public boolean login(String name){
        if(name.equals("")){
            JOptionPane.showMessageDialog(null, "Fill the Nickname field to login!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }else{
            if(verifyName(name)){
            JOptionPane.showMessageDialog(null, "Nickname already exists!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
            
            }else{
                bdNames.add(name);
                return true;
            }
        }
    }
    
    public boolean verifyName(String name){
        for(int i=0; i<bdNames.size(); i++){
            if(name.equals(bdNames.get(i))){
                return true;
            }
        }
        return false;
    }
    
    public boolean delName(String name){
        for(int i=0; i<bdNames.size();i++){
            if(name.equals(bdNames.get(i))){
                    bdNames.remove(i);
                    return true;
            }
        }
        return false;
    }
}
