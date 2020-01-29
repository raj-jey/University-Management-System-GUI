/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.university_management_sysytem;

/**
 *
 * @author User
 */
public class Student extends User{
    
void SignUp(String username){
    
    
     Signup2Window  f=new  Signup2Window(username);
     f.setVisible(true);
    
}

void SignIn(String username){
    
    DisplayWindow f=new  DisplayWindow(username);
    f.setVisible(true);
    
}
    
}
