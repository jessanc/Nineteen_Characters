package src.controller;

import java.io.Serializable;

/**
 * StatsPacks contain stats. StatsPacks can be combined to form new StatsPacks.
 *
 */
public final class StatsPack implements Serializable {

    // Primary stats
    private final int lives_left_;
    private final int strength_level_;
    private final int agility_level_;
    private final int intellect_level_;
    private final int hardiness_level_;
    private int quantity_of_experience;
    private final int movement_level_;
    
    // Constant Secondary Stats
    private final int cached_current_level_;
    private final int max_life_at_current_level_;
    private final int max_mana_at_current_level_;
    private final int max_offensive_rating_at_current_level_;
    private final int max_defensive_rating_at_current_level_;
    private final int max_armor_rating_at_current_level_;
    
    // Modifiable Secondary Stats
    // These secondary stats can be modified without leveling up
    private int current_life_;
    private int current_mana_;
    private int current_offensive_rating_;
    private int current_defensive_rating_;
    private int current_armor_rating_;

    /**
     * ONLY CALL THIS FUNCTION TO LEVEL UP PRIMARY STATS
     *
     * @param modifier - gets added to the currect statspack
     * @return incremented StatsPack
     * @author John-Michael Reed
     */
    public StatsPack add(final ConstantStats modifier) {
        ConstantStats newConstantStats = new ConstantStats(constant_stats_.add(modifier));
        StatsPack return_value = new StatsPack(newConstantStats, modifiable_stats_);
        return return_value;
    }

    /**
     * ONLY CALL THIS FUNCTION TO LEVEL DOWN PRIMARY STATS
     *
     * @param modifier - gets subtracted from the current statspack
     * @return decremented StatsPack
     * @author John-Michael Reed
     */
    public StatsPack subtract(final ConstantStats modifier) {
        ConstantStats newConstantStats = new ConstantStats(constant_stats_.subtract(modifier));
        StatsPack return_value = new StatsPack(newConstantStats, modifiable_stats_);
        return return_value;
    }

    /**
     * This function is for when one DrawableThing modifies [increases] the stats of another DrawableThing.
     *
     * @param modifier - gets added to the currect statspack
     * @return modified StatsPack
     * @author John-Michael Reed
     */
    public StatsPack add(final ModifiableStats modifier) {
        ConstantStats newConstantStats = new ConstantStats(constant_stats_.add(modifier));
        StatsPack return_value = new StatsPack(newConstantStats, modifiable_stats_);
        return return_value;
    }

    /**
     * This function is for when one DrawableThing modifies [decreases] the stats of another DrawableThing. 
     *
     * @param modifier - gets subtracted from the current statspack
     * @return modified StatsPack
     * @author John-Michael Reed
     */
    public StatsPack subtract(final ModifiableStats modifier) {
        ConstantStats newConstantStats = new ConstantStats(constant_stats_.subtract(modifier));
        StatsPack return_value = new StatsPack(newConstantStats, modifiable_stats_);
        return return_value;
    }
}
