/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package src.view;

/**
 *
 * @author JohnReedLOL
 */
public class Display
{
    private static Viewable current_view_;
    
    // Display.display_ is static because there is only one display_  
    private static Display display_;
    
    public static Display getaReferenceToTheDisplay() {
        return Display.display_;
    }
}
