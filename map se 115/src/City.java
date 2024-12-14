public class City {
        private String name;
        private int[] connectedCityIndices;
        private int[] routeTimes;
        private int connectionCount;

        public City(String name, int maxConnections) {
            this.name = name;
            this.connectedCityIndices = new int[maxConnections];
            this.routeTimes = new int[maxConnections];
            this.connectionCount = 0;
        }

        public void addConnection(int cityIndex, int time) {
            if (connectionCount < connectedCityIndices.length) {
                connectedCityIndices[connectionCount] = cityIndex;
                routeTimes[connectionCount] = time;
                connectionCount++;
            }
        }
        public String getName() { return name; }
        public int[] getConnectedCityIndices() { return connectedCityIndices; }
        public int[] getRouteTimes() { return routeTimes; }
        public int getConnectionCount() { return connectionCount; }
    }


}
