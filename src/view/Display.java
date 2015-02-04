/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package src.view;
import java.io.Serializable;
import java.util.Arrays;
import src.controller.Avatar;
import src.model.Map;
import src.model.MapDisplayInterface;
/**
 * Represents a single player's display
 * @author JohnReedLOL
 */
public class Display implements Serializable
{
    // Converts the class name into a base 35 number
    private static final long serialVersionUID = Long.parseLong("Display", 35);
    
<<<<<<< HEAD
    // map_relationship_ is used in place of a map_referance_
    private MapDisplayInterface map_relationship_;

    /**
     * This function is necessary because the constructor cannot safely build
     * the map_relationship. Make sure that this function uses a subclass this.
     */
    private void initializeMapRelationship() {
        map_relationship_ = Map.getMyInterfaceWithTheMap(this);
    }
    
    private final Avatar referance_to_the_player_whose_screen_I_am_displaying_;

    private Viewport current_view_;
=======
    private final Avatar referance_to_the_player_whose_screen_I_am_displaying_;

    private View current_view_;
    
    Display(Avatar avatar) {
        referance_to_the_player_whose_screen_I_am_displaying_ = avatar;
    }
>>>>>>> ad093437758541ab2bc62b622ae1d4828731d6b2
    
    public Display(Avatar avatar) {
        referance_to_the_player_whose_screen_I_am_displaying_ = avatar;
    }
    
    public void generateCharacterCreationView() {
<<<<<<< HEAD
    	this.current_view_ = new AvatarCreationView(referance_to_the_player_whose_screen_I_am_displaying_);
    }
    
    public void generateMapView(int x, int y) {
    	this.current_view_ = new MapView(map_relationship_, x, y);
    }
    
    public void generateStatsView() {
    	this.current_view_ = new StatsView(referance_to_the_player_whose_screen_I_am_displaying_);
    }
    
    public void printView() {
    	// char[][] toPrint = current_view_.getContents();
        // Use this to print a 2D array
        // System.out.println(Arrays.deepToString(toPrint));
=======
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
>>>>>>> ad093437758541ab2bc62b622ae1d4828731d6b2
    }
}
