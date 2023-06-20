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
public class County {
    private int id;
    private String name;
    private Microregion microregion;

    public County(int id, String name, Microregion microregion) {
        this.id = id;
        this.name = name;
        this.microregion = microregion;
    }

    public static String getCountyByState(int stateId){
            
        return ClienteHttp.get("https://servicodados.ibge.gov.br/api/v1/localidades/estados/"+ stateId + "/municipios"); 
    
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
     * @return the microregion
     */
    public Microregion getMicroregion() {
        return microregion;
    }

}







