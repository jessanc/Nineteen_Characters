/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.model;

import src.controller.Terrain;

/**
 *
 * @author JohnMichaelReed
 */
public class MapTerrain_Association extends MapDrawableThing_Association {

    private final Terrain terrain_;

    public MapTerrain_Association(Terrain terrain) {
        super(terrain);
        terrain_ = terrain;
    }
}
