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
public class Terrain extends DrawableThing implements Serializable
{
    public enum Color {
    GREEN, BLUE, GRAY //grass, water, mountain
    }
    
    Color color_;
    private char decal_;
    private boolean contains_water_;
    private boolean contains_mountain_;
    void applyTerrainEffect(Entity entity) {
        
    }
    boolean determineIfCanPass(Entity entity) {
        if(contains_water_ || contains_mountain_) {
            return false;
        }
        else {
            return true;
        }
    }
}
