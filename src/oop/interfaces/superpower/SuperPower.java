package oop.interfaces.superpower;


/*
 * Interface defines a contract that implementing classes must follow
 * - Can only contain abstract methods and constants
 * - All methods are implicitly public and abstract
 * - All fields are implicitly public, static and final
 * - A class can implement multiple interfaces
 */
public interface SuperPower {
    // Interface variables are implicitly public, static and final (constants)
    int MAX_POWER = 100;

    // Interface methods are implicitly public and abstract
    // This method must be implemented by any class that implements this interface
    void mySuperPower();

    // Another abstract method that must be implemented
    // Returns the power level of the superhero
    int getPower();
}
