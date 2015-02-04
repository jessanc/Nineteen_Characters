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
final class AvatarCreationView extends Viewport
{
    // Converts the class name into a base 35 number
    private static final long serialVersionUID = Long.parseLong("CharacterCreationView", 35);
	
<<<<<<< HEAD
    private final Avatar avatar_reference_;
=======
    private static final Avatar avatar_reference_;
>>>>>>> ad093437758541ab2bc62b622ae1d4828731d6b2
    
    /*
     * Generates a new ChaAvatarCreationViewses avatar_reference_ to modify the avatar.
     */
<<<<<<< HEAD
    public AvatarCreationView(Avatar my_avatar) {
=======
    public CharacterCreationView(Avatar my_avatar) {
>>>>>>> ad093437758541ab2bc62b622ae1d4828731d6b2
    	avatar_reference_ = my_avatar;
    }
}
