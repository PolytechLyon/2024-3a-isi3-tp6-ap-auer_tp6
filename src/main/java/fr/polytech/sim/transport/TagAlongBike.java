package fr.polytech.sim.transport;

import fr.polytech.sim.cycling.Bike;

import java.util.Objects;

/**
 * A tag-along bike which is a vehicle that contains another bike as a component.
 */
public class TagAlongBike extends Vehicle {

  private final Bike parentBike; // Parent bike which is the main component of the tag-along bike.

  /**
   * Constructor for the tag-along bike.
   *
   * @param parentBike the parent bike which will tow the child's bike
   */
  public TagAlongBike(Bike parentBike) {
    Objects.requireNonNull(parentBike, "Parent bike must not be null.");
    this.parentBike = parentBike;
    this.components.add(parentBike); // Adding the parent bike as the main component.
  }

  /**
   * Add a child's bike to the tag-along bike setup.
   *
   * @param childBike the child's bike to be towed
   */
  public void addChildBike(Bike childBike) {
    Objects.requireNonNull(childBike, "Child bike must not be null.");
    this.components.add(childBike); // Adding the child bike as a component.
  }

  /**
   * Calculates the push force for the tag-along bike based on the parent bike's push force.
   * This could be the same as the parent bike's push force or adjusted based on the situation.
   *
   * @return push force
   */
  @Override
  public double getPush() {
    // Assuming the push force is simply the parent bike's push force for simplicity.
    // This can be adjusted if the physics of the situation are more complex.
    return this.parentBike.getPush();
  }
}