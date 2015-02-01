/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package src.view;

import src.model.Map;
import src.model.MapRelationship;

/**
 * Players see the MapView while they are interacting with the map
 * @author JohnReedLOL
 */
final class MapView extends View
{

    // Converts the class name into a base 35 number
    private static final long serialVersionUID = Long.parseLong("MapView", 35);
	
    private static final Map map_reference_ = Map.getaReferenceToTheMap();
    
    //private static MapView the_map_view_;
    
    //public static MapView getaReferenceToTheMapView() {
    //    return MapView.the_map_view_;
    //}
    
    /*
     * Generates a new MapView from the map using coordinates x and y.
     */
    public MapView(int x, int y) {
    	
    }
}
