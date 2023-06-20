/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utfpr.converter;

import org.json.JSONObject;
import utfpr.model.County;
import utfpr.model.Microregion;
import utfpr.model.Mesorregion;
import utfpr.model.Region;
import utfpr.model.State;

/**
 *
 * @author murilomarcaldearaujo
 */
public class CountyConverter {

    public static County convert(String json) {
        JSONObject jsonObject = new JSONObject(json);

        int id = jsonObject.getInt("id");
        String name = jsonObject.getString("nome");

        JSONObject microregionJson = jsonObject.getJSONObject("microrregiao");
        int microregionId = microregionJson.getInt("id");
        String microregionName = microregionJson.getString("nome");

        JSONObject mesorregionJson = microregionJson.getJSONObject("mesorregiao");
        int mesorregionId = mesorregionJson.getInt("id");
        String mesorregionName = mesorregionJson.getString("nome");

        JSONObject ufJson = mesorregionJson.getJSONObject("UF");
        int stateId = ufJson.getInt("id");
        String stateAcronym = ufJson.getString("sigla");
        String stateName = ufJson.getString("nome");

        JSONObject regionJson = ufJson.getJSONObject("regiao");
        int regionId = regionJson.getInt("id");
        String regionAcronym = regionJson.getString("sigla");
        String regionName = regionJson.getString("nome");

        Region region = new Region(regionId, regionAcronym, regionName);
        State state = new State(stateId, stateAcronym, stateName, region);
        Mesorregion mesorregion = new Mesorregion(mesorregionId, mesorregionName, state);
        Microregion microregion = new Microregion(microregionId, microregionName, mesorregion);

        return new County(id, name, microregion);
    }
}
