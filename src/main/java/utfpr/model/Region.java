/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utfpr.model;

/**
 *
 * @author murilomarcaldearaujo
 */
public class Region {

    private int id;
    private String acronym;
    private String name;
    
    public Region(int id, String acronym, String name){
        this.id = id;
        this.acronym = acronym;
        this.name = name;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the acronym
     */
    public String getAcronym() {
        return acronym;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    
    
    
}
