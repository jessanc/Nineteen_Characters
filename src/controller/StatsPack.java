package src.controller;
import java.io.Serializable

public final class StatsPack implements Serializable{
	
    // primary stats
    private int lives_left_;
    private int strength_;
    private int agility_;
    private int intellect_;
    private int hardiness_;
    private int experience_;
    private int movement_;

    // max secondary stats 
    private int max_life_; // full hp
    private int max_mana_; // full mana

    // current secondary stats
    private int current_level_;
    private int current_life_;
    private int current_mana_;
    private int current_offensive_rating_;
    private int current_defensive_rating_;
    private int current_armor_rating_;
    
    public StatsPack add(final StatsPack modifier) {
    	StatsPack return_value = new StatsPack();
    	return_value.lives_left_ = modifier.lives_left_ + this.lives_left_;
    	return_value.strength_ = modifier.strength_ + this.strength_;
    	return_value.agility_ = modifier.agility_ + this.agility_;
    	return_value.intellect_ = modifier.intellect_ + this.intellect_;
    	return_value.hardiness_ = modifier.hardiness_ + this.hardiness_;
    	return_value.experience_ = modifier.experience_ + this.experience_ ;
    	return_value.movement_ = modifier.movement_ + this.movement_;
    	return_value.max_life_ = modifier.max_life_ + this.max_life_;
    	return_value.max_mana_ = modifier.max_mana_ + this.max_mana_;
    	return_value.current_level_ = modifier.current_level_ + this.current_level_;
    	return_value.current_life_ = modifier.current_life_ + this.current_life_;
    	return_value.current_mana_ = modifier.current_mana_ + this.current_mana_;
    	return_value.current_offensive_rating_ = modifier.current_offensive_rating_ + this.current_offensive_rating_;
    	return_value.current_defensive_rating_ = modifier.current_defensive_rating_ + this.current_defensive_rating_;
    	return_value.current_armor_rating_ = modifier.current_armor_rating_ + this.current_armor_rating_;
    	return return_value;
    }
    public void equals(final StatsPack modifier) {
    	this.lives_left_ = modifier.lives_left_ ;
    	this.strength_ = modifier.strength_ ;
    	this.agility_ = modifier.agility_ ;
    	this.intellect_ = modifier.intellect_ ;
    	this.hardiness_ = modifier.hardiness_ ;
    	this.experience_ = modifier.experience_ ;
    	this.movement_ = modifier.movement_ ;
    	this.max_life_ = modifier.max_life_ ;
    	this.max_mana_ = modifier.max_mana_ ;
    	this.current_level_ = modifier.current_level_ ;
    	this.current_life_ = modifier.current_life_ ;
    	this.current_mana_ = modifier.current_mana_ ;
    	this.current_offensive_rating_ = modifier.current_offensive_rating_ ;
    	this.current_defensive_rating_ = modifier.current_defensive_rating_ ;
    	this.current_armor_rating_ = modifier.current_armor_rating_ ;
    }
}
