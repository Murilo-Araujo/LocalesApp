/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utfpr.model;

/**
 *
 * @author murilomarcaldearaujo
 */
public class Mesorregion {
    private int id;
    private String name;
    private State state;

    public Mesorregion(int id, String name, State state) {
        this.id = id;
        this.name = name;
        this.state = state;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the state
     */
    public State getState() {
        return state;
    }

    
}
