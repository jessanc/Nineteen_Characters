/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.controller;

import src.model.Map;
import src.model.MapAvatarInterface;
import src.view.Display;

/**
 * Each avatar represents a player
 *
 * @author JohnReedLOL
 */
public final class Avatar extends Entity {

    // Converts the class name into a base 35 number
    private static final long serialVersionUID = Long.parseLong("Avatar", 35);

    public Avatar(String name, char representation, boolean is_passable,
            int x, int y) {
        super(name, representation, is_passable, x, y);
    }

    private final Display display_ = new Display(this);

    
        public Display get_my_display() {
    return this.display_;
    }

    // map_relationship_ is used in place of a map_referance_
    private static MapAvatarInterface map_relationship_;

    /**
     * This function is necessary because the constructor cannot safely build
     * the map_relationship. Make sure that this function uses a subclass this.
     */
    private void initializeMapRelationship() {
        map_relationship_ = Map.getMyInterfaceWithTheMap(this);
    }
}
