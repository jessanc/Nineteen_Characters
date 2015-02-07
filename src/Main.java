package src;

import src.controller.Avatar;
import src.model.MapMain_Association;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/** 
 * Initializes, opens the program.
 * @author JohnReedLOL.
 */
public class Main
{
    MapMain_Association m = new MapMain_Association();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        initializeEverything();
    }
    
    static void initializeEverything() {
            // currently there is only one avatar
    Avatar avatar = new Avatar("avatar", 'x', 0, 0);
    }
    
    static void saveGameToDisk() {
        
    }
    
    static void resumeGameFromDisk() {
        
    }
    
}
