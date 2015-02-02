/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package src.view;
import java.io.Serializable;
/**
 * Represents a single player's display
 * @author JohnReedLOL
 */
public class Display implements Serializable
{
    // Converts the class name into a base 35 number
    private static final long serialVersionUID = Long.parseLong("Display", 35);
    
    private final Avatar referance_to_the_player_whose_screen_I_am_displaying_;

    private View current_view_;
    
    Display(Avatar avatar) {
        referance_to_the_player_whose_screen_I_am_displaying_ = avatar;
    }
    
    public static Display getaReferenceToTheDisplay() {
        return Display.display_;
    }
    
    public void generateCharacterCreationView() {
    	this.current_view_ = new AvatarCreationView();
    }
    
    public void generateMapView(int x, int y) {
    	this.current_view_ = new MapView(x, y);
    }
    
    public void generateStatsView() {
    	this.current_view_ = new StatsView();
    }
    
    public void printView() {
    	char[][] toPrint = current_view_.getContents();
        // Use this to print a 2D array
        System.out.println(Arrays.deepToString(toPrint));
    }
}
