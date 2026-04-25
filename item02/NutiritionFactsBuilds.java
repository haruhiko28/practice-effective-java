    package item02;

    // Builder Pattern
    public class NutiritionFactsBuilds {
        private final int servingSize; // immutable
        private final int servings;
        private final int calories;
        private final int fat;
        private final int sodium;
        private final int carbohydrate;

        public static class Builder { // to build instances
            // Required parameters
            private final int servingSize;
            private final int servings;

            // Optional parameters - initalized to default values
            private int calories = 0;
            private int fat = 0;
            private int sodium = 0;
            private int carbohydrate = 0;

            public Builder(int servingSize, int servings) {
                this.servingSize = servingSize;
                this.servings = servings;
            }

            public Builder calories(int val)
                {calories = val; return this; }
            public Builder fat(int val)
                {fat = val; return this;}
            public Builder sodium(int val)
                {sodium = val; return this;}
            public Builder carbohydrate(int val)
                {carbohydrate = val; return this;}
            
            public NutiritionFactsBuilds build() {
                return new NutiritionFactsBuilds(this);
            }
        }
        private NutiritionFactsBuilds(Builder builder) {
            servingSize = builder.servingSize;
            servings = builder.servings;
            calories = builder.calories;
            fat = builder.fat;
            sodium = builder.sodium;
            carbohydrate = builder.carbohydrate;
        }
        
    }

// fuluent API
// NutiritionFactsBuilds cocaCola = new NutiritionFactsBuilds.Builder(240, 8).calories(100).sodium(35).carbohydrate(27).build();

