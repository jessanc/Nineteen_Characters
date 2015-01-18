/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.controller;

/**
 *
 * @author JohnReedLOL
 */
public class Avatar
{
    
    // Avatar.avatar_ is static because there is only one avatar_  
    private static Entity avatar_;
    
    public static Entity getaReferenceToTheAvatar() {
        return Avatar.avatar_;
    }
}
