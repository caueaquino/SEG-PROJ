/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Chat;
import java.util.ArrayList;

/**
 *
 * @author caue
 */
public class CollectionChat {
    private final ArrayList<Chat> bdChat=new ArrayList();
    
    public Chat openChat(String nick1, String nick2){
        Chat chat=checkChat(nick1, nick2);
        if(chat!=null){
            return chat;
        }
        return null;
    }
    
    public void delChat(String nick1, String nick2){
    }
    
    public boolean delChats(String nick){
        boolean x=false;
        for(int i=0; i<bdChat.size(); i++){
            if(nick.equals(bdChat.get(i).getNickName1()) || nick.equals(bdChat.get(i).getNickName2())){
               bdChat.remove(i);
               x=true;
            }
        }
        return x;
    }
    
    public Chat checkChat(String nick1, String nick2){
        for(int i=0; i<bdChat.size(); i++){
            if(nick1.equals(bdChat.get(i).getNickName1()) || nick1.equals(bdChat.get(i).getNickName2())){
                if(nick2.equals(bdChat.get(i).getNickName1()) || nick2.equals(bdChat.get(i).getNickName2())){
                    return bdChat.get(i);
                }
            }
        }
        return null;
    }
}
