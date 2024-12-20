public class WayFinder {
  public class WayFinder {
        public static String findFastestWay(CountryMap map, City start, City end) {
            int cityCount = map.getCityCount();
            int[] distances = new int[map.getCityCount()];
            int[] previousCity = new int[map.getCityCount()];
            boolean[] visited = new boolean[map.getCityCount()];

            for (int i = 0; i < distances.length; i++) {
                distances[i] = Integer.MAX_VALUE;
               previousCity[i] = -1;
            }
            int startIndex = map.findCityIndex(start.getName());
            int endIndex = map.findCityIndex(end.getName());
           
            if (startIndex == -1 || endIndex == -1) {
            return "Error: Start or end city not found in the map.";
            }
              distances[startIndex] = 0;

            for (int count = 0; count < cityCount(); count++) {
                int u = -1;
                int minDistance = Integer.MAX_VALUE;
                for (int v = 0; v < map.getCityCount(); v++) {
                    if (!visited[v] && distances[v] < minDistance) {
                        u = v;
                        minDistance = distances[v];
                    }
                }
                if (u == -1) break;
                visited[u] = true;

                City currentCity = map.getCities()[u];
                for (int i = 0; i < currentCity.getConnectionCount(); i++) {
                    int v = currentCity.getConnectedCityIndices()[i];
                    int time = currentCity.getRouteTimes()[i];
                  if (!visited[v] && distances[u] + time < distances[v]) {
                    distances[v] = distances[u] + time;
                    previousCity[v] = u;
                }
            }
            }
            return "Fastest Way: Path reconstruction";
        }
     public static int getTotalTime() {
        return 0;
    }



}
