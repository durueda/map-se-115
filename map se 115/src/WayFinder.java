public class WayFinder {
  public class WayFinder {
        public static String findFastestWay(CountryMap map, City start, City end) {
            int[] distances = new int[map.getCityCount()];
            int[] previousCity = new int[map.getCityCount()];
            boolean[] visited = new boolean[map.getCityCount()];

            for (int i = 0; i < distances.length; i++) {
                distances[i] = Integer.MAX_VALUE;
            }
            int startIndex = map.findCityIndex(start.getName());
            if (startIndex == -1) return "No route found";
            distances[startIndex] = 0;

            for (int count = 0; count < map.getCityCount(); count++) {
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
                    previousCity[v] = u;
                }
            }
            return "Fastest Way: Path reconstruction";
        }
    }



}
