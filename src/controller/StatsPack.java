package src.controller;

import java.io.Serializable;

/**
 * StatsPacks contain stats. StatsPacks can be combined to form new StatsPacks.
 *
 */
public final class StatsPack implements Serializable {

    private ConstantStats constant_stats_;

    private ModifiableStats modifiable_stats_;

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
