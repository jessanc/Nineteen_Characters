/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package src.view;

import src.controller.Avatar;
import src.controller.Entity;
/**
 * Players see the AvatarCreationView when they chose their occupation.
 * @author JohnReedLOL
 */
final class AvatarCreationView extends View
{
    // Converts the class name into a base 35 number
    private static final long serialVersionUID = Long.parseLong("CharacterCreationView", 35);
	
    private static final Entity avatar_reference_ = Avatar.getaReferenceToTheAvatar();
    
    /*
     * Generates a new ChaAvatarCreationViewses avatar_reference_ to modify the avatar.
     */
    public CharacterCreationView() {
    	
    }
}
