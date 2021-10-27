/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author BingChen Sun
 */
public class TestUserProfile {
    
    UserProfile profile[] = new UserProfile[100];
    
    public static void main(String[] arguments){
        
        
        System.out.println("Enter your name: ");
        Scanner ng = new Scanner(System.in);
        String userName = ng.nextLine();
        System.out.println("Your username is " + userName);
       
        System.out.println("Enter your favorite Genres: ");
        String userGenres = ng.nextLine();
        System.out.println("Your favorite Genres is " + userGenres);
        
        if(userName.equals(userName) && userGenres.equals(userGenres)){
            System.out.println(" User Profile was created.");
        }
        
        else if(userGenres != userGenres){  
            System.out.println("User Profile wasn't created");
        }
        
    }
    
}
