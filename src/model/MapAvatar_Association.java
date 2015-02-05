/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.model;

import src.controller.Avatar;
import src.controller.Occupation;

/**
 *
 * @author JohnMichaelReed
 */
public class MapAvatar_Association extends MapEntity_Association {

    public MapAvatar_Association(Avatar avatar,
            int x_respawn_point, int y_respawn_point) {
        super(avatar, x_respawn_point, y_respawn_point);
    }

    public static Avatar getAvatarByName(String name) {
        return src.model.Map.getAvatar(name);
    }
}
