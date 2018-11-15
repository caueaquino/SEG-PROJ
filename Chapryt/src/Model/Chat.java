/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author caue
 */
public class Chat {
    private String nickName1;
    private String nickName2;
    private StringBuilder chat;
    
    public Chat(String nickName1, String nickName2){
        this.nickName1=nickName1;
        this.nickName2=nickName2;
    }

    public String getNickName1() {
        return nickName1;
    }

    public String getNickName2() {
        return nickName2;
    }

    public StringBuilder getChat() {
        return chat;
    }
    
    
}
