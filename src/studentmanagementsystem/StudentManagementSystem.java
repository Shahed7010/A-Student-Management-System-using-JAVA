/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementsystem;

import java.util.ArrayList;

/**
 *
 * @author Mahadi Hasan Jisa
 */
public class StudentManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Student> Students = new ArrayList<Student>();
        Welcome welcomeui = new Welcome();
        welcomeui.show();
    }
    
}
