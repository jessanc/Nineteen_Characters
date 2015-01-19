/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package src.model;
import java.util.LinkedHashMap;
import java.io.Serializable;
import src.view.Display;
import src.controller.Entity;
/**
 *
 * @author JohnReedLOL
 */
public class MapModel implements Serializable
{
    private static final Display display_reference_ = Display.getaReferenceToTheDisplay();
    
    //2d array of tiles.
    private static MapTile map_grid_[][];
    
    // String is the entity's name. The entity name must be unqiue or else bugs will occur.
    private static LinkedHashMap<String, EntityHandle> entities_list_;
    
    // MapModel.map_model_ is static because there is only one map_model_  
    private static MapModel map_model_;
    
    public static MapModel getaReferenceToTheMapModel() {
        return MapModel.map_model_;
    }
}
