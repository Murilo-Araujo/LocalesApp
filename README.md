# Java IBGE API Data Retrieval

This is a Java program that makes requests to the IBGE API to retrieve information about cities and states. It uses JSON data provided by the API to extract specific information and perform data processing.

## Features

- Fetches data about states and cities from the IBGE API.
- Extracts relevant information from the JSON response.
- Provides methods to access and manipulate the retrieved data.
- Supports retrieval of city and state information based on specific criteria.

## Requirements

- Java Development Kit (JDK) 8 or higher.
- Internet connection to access the IBGE API.

## Usage

1. Clone the repository or download the source code.
2. Import the project into your Java IDE.
3. Build and run the program.
4. The program will retrieve data from the IBGE API and perform the desired operations.

## Example

Here's an example code snippet demonstrating the usage of the program:

```java
public class Main {
    public static void main(String[] args) {
        // Fetch states data
        String statesJson = State.getStates();
        
        // Convert JSON to State objects
        List<State> states = StateConverter.convert(statesJson);
        
        // Retrieve information about a specific state
        State targetState = states.get(0);
        System.out.println("State: " + targetState.getName());
        System.out.println("Acronym: " + targetState.getAcronym());
        System.out.println("Region: " + targetState.getRegion().getName());
        
        // Fetch cities data for a specific state
        String citiesJson = City.getCitiesByState(targetState.getId());
        
        // Convert JSON to City objects
        List<City> cities = CityConverter.convert(citiesJson);
        
        // Retrieve information about cities in the state
        System.out.println("Cities in " + targetState.getName() + ":");
        for (City city : cities) {
            System.out.println("City: " + city.getName());
            System.out.println("Population: " + city.getPopulation());
            System.out.println("---------------------");
        }
    }
}
```

## Documentation

For more detailed information about the classes, methods, and usage, refer to the inline comments in the source code.


## Disclaimer

This program is provided as-is and is not affiliated with or endorsed by the IBGE. Use it responsibly and ensure compliance with the IBGE API terms of use.
