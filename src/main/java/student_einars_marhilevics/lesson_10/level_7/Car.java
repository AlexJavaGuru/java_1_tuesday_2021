package student_einars_marhilevics.lesson_10.level_7;

class Car {

    private final String model; // required
    private final String country; // required
    private final int year; // optional
    private final String colour; // optional
    private final int weight; // optional

    private Car(CarBuilder builder) {
        this.model = builder.model;
        this.country = builder.country;
        this.year = builder.year;
        this.colour = builder.colour;
        this.weight = builder.weight;
    }


    public String getModel() {
        return model;
    }

    public String getCountry() {
        return country;
    }

    public int getYear() {
        return year;
    }

    public String getColour() {
        return colour;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", country='" + country + '\'' +
                ", year=" + year +
                ", colour='" + colour + '\'' +
                ", weight=" + weight +
                '}';
    }


        public static class CarBuilder {
            private final String model;
            private final String country;
            private int year;
            private String colour;
            private int weight;

            public CarBuilder(String model, String country) {
                this.model = model;
                this.country = country;
            }

            public CarBuilder year(int year) {
                this.year = year;
                return this;
            }

            public CarBuilder colour(String colour) {
                this.colour = colour;
                return this;
            }

            public CarBuilder weight(int weight) {
                this.weight = weight;
                return this;
            }


            public Car build() {
                Car car = null;
                if(validCar()) {
                    car = new Car(this);
                }
                return car;
            }

            private boolean validCar() {
                return !model.isEmpty();
            }
        }
    }



