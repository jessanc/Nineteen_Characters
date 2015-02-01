/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.controller;

/**
 *
 * @author JohnReedLOL
 */
public class ConstantStats {
    
    // Primary Stats

    // Primary stats cannot be modified without leveling up
    private final int lives_left_;
    private final int strength_level_;
    private final int agility_level_;
    private final int intellect_level_;
    private final int hardiness_level_;
    private final int experience_level_;
    private final int movement_level_;
    
    // Constant Secondary Stats
    
    // These secondary stats can't be modified without leveling up
    private final int current_level_;
    private final int max_life_at_current_level_;
    private final int max_mana_at_current_level_;
    private final int max_offensive_rating_at_current_level_;
    private final int max_defensive_rating_at_current_level_;
    private final int max_armor_rating_at_current_level_;
    
}
