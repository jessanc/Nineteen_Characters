/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package src.model;
import java.util.LinkedList;
import java.io.Serializable;
import src.controller.Entity;
import src.controller.Item;
import src.controller.Terrain;
/**
 *
 * @author JohnReedLOL
 */
public final class MapTile implements Serializable
{
    // Converts the class name into a base 35 number
    private static final long serialVersionUID = Long.parseLong("MapTile", 35);

    Terrain terrain_;
    Entity entity_;
    LinkedList<Item> items_;
            
}
