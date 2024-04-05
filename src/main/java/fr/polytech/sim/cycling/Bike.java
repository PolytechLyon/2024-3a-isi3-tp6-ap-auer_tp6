package fr.polytech.sim.cycling;

import fr.polytech.sim.transport.Pushable;
import fr.polytech.sim.transport.Vehicle;

/**
 * Abstract bike.
 */
public abstract class Bike extends Vehicle implements Pushable {

    @Override
    public double getPush() {
        return 25.0;
    }
}
