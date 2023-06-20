/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utfpr.converter;

import org.json.JSONObject;
import utfpr.model.State;
import utfpr.model.Region;


/**
 *
 * @author murilomarcaldearaujo
 */
public class StateConverter {
    public static State convert(String json) {
        JSONObject jsonObject = new JSONObject(json);
        
        int id = jsonObject.getInt("id");
        String sigla = jsonObject.getString("sigla");
        String nome = jsonObject.getString("nome");
        
        JSONObject regiaoJson = jsonObject.getJSONObject("regiao");
        int regiaoId = regiaoJson.getInt("id");
        String regiaoSigla = regiaoJson.getString("sigla");
        String regiaoNome = regiaoJson.getString("nome");
        
        Region regiao = new Region(regiaoId, regiaoSigla, regiaoNome);
        
        return new State(id, sigla, nome, regiao);
    }
}
