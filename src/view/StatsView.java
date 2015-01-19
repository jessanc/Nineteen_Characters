/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package src.view;

import src.controller.Avatar;
import src.controller.Entity;
/**
 *
 * @author JohnReedLOL
 */
public class StatsView extends View
{

    // Converts the class name into a base 35 number
    private static final long serialVersionUID = Long.parseLong("StatsView", 35);
	
    private static final Entity avatar_reference_ = Avatar.getaReferenceToTheAvatar();
    /**
     * Generates a new StatsView using the avatar_reference.
     */
    public StatsView() {
    	
    }
}
