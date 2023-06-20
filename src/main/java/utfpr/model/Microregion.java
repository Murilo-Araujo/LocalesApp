/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utfpr.model;

/**
 *
 * @author murilomarcaldearaujo
 */
public class Microregion {
    private int id;
    private String name;
    private Mesorregion mesorregion;

    public Microregion(int id, String name, Mesorregion mesorregion) {
        this.id = id;
        this.name = name;
        this.mesorregion = mesorregion;
    }

    // getters and setters

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
     * @return the mesorregion
     */
    public Mesorregion getMesorregion() {
        return mesorregion;
    }
}
