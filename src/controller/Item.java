/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package src.controller;
import src.DrawableThing;
import java.io.Serializable;
/**
 *
 * @author JohnReedLOL
 */
public class Item extends DrawableThing implements Serializable
{
    boolean isEquipable;
    boolean isOneShot;
    
    public void activate() {
        
    }
    public void activate(Entity entity) {
        
    }
    public void activate(Item item) {
        
    }
    
}
