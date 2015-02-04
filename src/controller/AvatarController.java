/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package src.controller;
import src.view.Display;
import src.model.Map;
/**
 * Uses keyboard input to control the avatar
 * @author JohnReedLOL
 */
public final class AvatarController
{
    // my avatar
    private final Avatar avatar_reference_ = src.model.Map.getAvatar("avatar");
    
    // This display corresponds to that avatar.
    private Display display_ = new Display(avatar_reference_);
}
