package fr.polytech.sim.transport;

import fr.polytech.sim.cycling.Bike;

import java.util.Objects;

/**
 * A tag-along bike which is a vehicle that contains another bike as a component.
 */
public class TagAlongBike extends Bike {

  /**
   * Constructor for the tag-along bike.
   *
   * @param parentBike the parent bike which will tow the child's bike
   */
  public TagAlongBike(Bike parentBike) {
    Objects.requireNonNull(parentBike, "Parent bike must not be null.");
    this.components.add(parentBike);
    components.add(new Wheel(this));
    components.add(new Wheel(this));
  }
}