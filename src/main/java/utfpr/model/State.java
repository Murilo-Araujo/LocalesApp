/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utfpr.model;

import utfpr.http.ClienteHttp;

/**
 *
 * @author murilomarcaldearaujo
 */
public class State {
    private int id;
    private String acronym;
    private String name;
    private Region region;
    
    public State(int id, String acronym, String name, Region region){
        this.id = id;
        this.acronym = acronym;
        this.name = name;
        this.region = region;
    }
    
    
    public static String getStates(){
        
        return ClienteHttp.get("https://servicodados.ibge.gov.br/api/v1/localidades/estados"); 
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

    /**
     * @return the region
     */
    public Region getRegion() {
        return region;
    }

    @Override
    public String toString() {
        return name+" - "+acronym ;
    }
    
    
    
    
    
}
