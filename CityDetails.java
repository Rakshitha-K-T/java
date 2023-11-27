public class CityDetails {
        public static void main(String[] args) {
            // City Information
            String cityName = "Shimoga";
            int population = 410445;
            double areaInSquareKm = 89.6;
            String state = "Karnataka";
            int postalCode = 577223;
            boolean isCapital = false;
    
            // Geographical Features
            boolean hasRiver = true;
            boolean hasHills = true;
            boolean hasPark = true;
    
            // Infrastructure
            int numberofSchools = 100;
            int numberOfHospitals = 20;
            int numberOfParks = 5;
            int numberOfBanks = 30;
            int numberOfHotels = 50;
    
            // Economy
            double averageIncome = 50000.75;
            double GDP = 3.5e9; // 3.5 billion
    
            // Transportation
            int numberOfBusStands = 8;
            int numberOfRailwayStations = 2;
    
            // Cultural and Entertainment
            int numberOfTemples = 15;
            int numberOfShoppingMalls = 5;
            int numberOfRestaurants = 40;
    
            // Sports and Recreation
            boolean hasStadium = true;
            int numberOfGyms = 15;
            int numberOfCinemas = 10;
    
            // Displaying city details
            System.out.println("City Details:");
            System.out.println("City Name: " + cityName);
            System.out.println("Population: " + population);
            System.out.println("Area (sq km): " + areaInSquareKm);
            System.out.println("State: " + state);
            System.out.println("Postal Code: " + postalCode);
            System.out.println("Is Capital: " + isCapital);
    
            System.out.println("\nGeographical Features:");
            System.out.println("Has River: " + hasRiver);
            System.out.println("Has Hills: " + hasHills);
            System.out.println("Has Park: " + hasPark);
    
            System.out.println("\nInfrastructure:");
            System.out.println("Number of Schools: " + numberofSchools);
            System.out.println("Number of Hospitals: " + numberOfHospitals);
            System.out.println("Number of Parks: " + numberOfParks);
            System.out.println("Number of Banks: " + numberOfBanks);
            System.out.println("Number of Hotels: " + numberOfHotels);
    
            System.out.println("\nEconomy:");
            System.out.println("Average Income: " + averageIncome);
            System.out.println("GDP: " + GDP);
    
            System.out.println("\nTransportation:");
            System.out.println("Number of Bus Stands: " + numberOfBusStands);
            System.out.println("Number of Railway Stations: " + numberOfRailwayStations);
    
            System.out.println("\nCultural and Entertainment:");
            System.out.println("Number of Temples: " + numberOfTemples);
            System.out.println("Number of Shopping Malls: " + numberOfShoppingMalls);
            System.out.println("Number of Restaurants: " + numberOfRestaurants);
    
            System.out.println("\nSports and Recreation:");
            System.out.println("Has Stadium: " + hasStadium);
            System.out.println("Number of Gyms: " + numberOfGyms);
            System.out.println("Number of Cinemas: " + numberOfCinemas);
        }
    
}
