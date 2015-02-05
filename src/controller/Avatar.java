/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.controller;

import src.view.Display;

/**
 * Each avatar represents a player
 *
 *
 * @author JohnReedLOL
 */
public final class Avatar extends Entity {

    // Converts the class name into a base 35 number
    private static final long serialVersionUID = Long.parseLong("Avatar", 35);

    public Avatar(String name, char representation, int x, int y) {
        super(name, representation, x, y);
    }

    private final Display display_ = new Display(this);

    public Display get_my_display() {
        return this.display_;
    }
}
