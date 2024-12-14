public class CountryMap {
  public class CountryMap {
        private City[] cities;
        private int cityCount;

        public CountryMap(int maxCities) {
            cities = new City[maxCities];
            cityCount = 0;
        }

        public void addCity(City city) {
            if (cityCount < cities.length) {
                cities[cityCount++] = city;
            }
        }

        public City[] getCities() {
            return cities;
        }

        public int getCityCount() {
            return cityCount;
        }

        public int findCityIndex(String name) {
            for (int i = 0; i < cityCount; i++) {
                if (cities[i].getName().equals(name)) {
                    return i;
                }
            }

            return-1;

        }
    }





}
