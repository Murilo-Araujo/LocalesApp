package utfpr;

import utfpr.model.State;
import utfpr.model.Region;
import utfpr.model.County;
import utfpr.model.Mesorregion;
import utfpr.model.Microregion;

import org.json.JSONArray;
import org.json.JSONObject;
import utfpr.converter.StateConverter;
import utfpr.converter.CountyConverter;

public class Main {

    public static void main(String[] args) {
        // Obter o JSON dos estados
        String statesJson = State.getStates();

        // Converter o JSON em um array de objetos JSON
        JSONArray jsonArray = new JSONArray(statesJson);

        // Loop para converter cada objeto JSON em um objeto State
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            State state = StateConverter.convert(jsonObject.toString());

            // Exibir os detalhes do estado
            System.out.println("ID: " + state.getId());
            System.out.println("Sigla: " + state.getAcronym());
            System.out.println("Nome: " + state.getName());

            Region region = state.getRegion();
            System.out.println("Região:");
            System.out.println("  ID: " + region.getId());
            System.out.println("  Sigla: " + region.getAcronym());
            System.out.println("  Nome: " + region.getName());

            System.out.println("-----------------------");
        }

        // Obter o JSON dos municípios do estado com ID 41
        String countyJson = County.getCountyByState(41);

        // Converter o JSON em um array de objetos JSON
        JSONArray countyArray = new JSONArray(countyJson);

        // Loop para converter cada objeto JSON em um objeto County
        for (int i = 0; i < countyArray.length(); i++) {
            JSONObject countyObject = countyArray.getJSONObject(i);
            County county = CountyConverter.convert(countyObject.toString());

            // Exibir os detalhes do município
            System.out.println("County:");
            System.out.println("ID: " + county.getId());
            System.out.println("Name: " + county.getName());

            Microregion microregion = county.getMicroregion();
            System.out.println("Microregion ID: " + microregion.getId());
            System.out.println("Microregion Name: " + microregion.getName());

            Mesorregion mesorregion = microregion.getMesorregion();
            System.out.println("Mesorregion ID: " + mesorregion.getId());
            System.out.println("Mesorregion Name: " + mesorregion.getName());

            State state = mesorregion.getState();
            System.out.println("State ID: " + state.getId());
            System.out.println("State Acronym: " + state.getAcronym());
            System.out.println("State Name: " + state.getName());

            Region region = state.getRegion();
            System.out.println("Region ID: " + region.getId());
            System.out.println("Region Acronym: " + region.getAcronym());
            System.out.println("Region Name: " + region.getName());

            System.out.println("-----------------------");
        }
    }

}
