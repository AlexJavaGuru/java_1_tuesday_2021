package student_oleg_kozlov.lesson_9.level_7.Task_28;

// Task_28
enum ConversionStrategy {
    CELSIUS_TO_CELSIUS {
        @Override
        double doConversion(double temperature) {
            CelsiusToCelsiusConverterImpl conversion = new CelsiusToCelsiusConverterImpl();
            return conversion.convert(temperature);
        }
    },
    CELSIUS_TO_FAHRENHEIT {
        @Override
        double doConversion(double temperature) {
            CelsiusToFahrenheitConverterImpl conversion = new CelsiusToFahrenheitConverterImpl();
            return conversion.convert(temperature);
        }
    },
    CELSIUS_TO_KELVIN {
        @Override
        double doConversion(double temperature) {
            CelsiusToKelvinConverterImpl conversion = new CelsiusToKelvinConverterImpl();
            return conversion.convert(temperature);
        }
    },
    KELVIN_TO_CELSIUS {
        @Override
        double doConversion(double temperature) {
            KelvinToCelsiusConverterImpl conversion = new KelvinToCelsiusConverterImpl();
            return conversion.convert(temperature);
        }
    },
    KELVIN_TO_FAHRENHEIT {
        @Override
        double doConversion(double temperature) {
            KelvinToFahrenheitConverterImpl conversion = new KelvinToFahrenheitConverterImpl();
            return conversion.convert(temperature);
        }
    },
    KELVIN_TO_KELVIN {
        @Override
        double doConversion(double temperature) {
            KelvinToKelvinConverterImpl conversion = new KelvinToKelvinConverterImpl();
            return conversion.convert(temperature);
        }
    },
    FAHRENHEIT_TO_CELSIUS {
        @Override
        double doConversion(double temperature) {
            FahrenheitToCelsiusConverterImpl conversion = new FahrenheitToCelsiusConverterImpl();
            return conversion.convert(temperature);
        }
    },
    FAHRENHEIT_TO_FAHRENHEIT {
        @Override
        double doConversion(double temperature) {
            FahrenheitToFahrenheitConverterImpl conversion = new FahrenheitToFahrenheitConverterImpl();
            return conversion.convert(temperature);
        }
    },
    FAHRENHEIT_TO_KELVIN {
        @Override
        double doConversion(double temperature) {
            FahrenheitToKelvinConverterImpl conversion = new FahrenheitToKelvinConverterImpl();
            return conversion.convert(temperature);
        }
    };

    abstract double doConversion(double temperature);
}
