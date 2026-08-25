package senla.robert.modal;

import net.datafaker.Faker;

import java.time.LocalDate;
import java.util.Locale;

public record AdminRegistrationData(String lastName,
                                    String firstName,
                                    String middleName,
                                    String phoneNumber,
                                    String passportNumber,
                                    LocalDate birthday) {

    public static AdminRegistrationData randomAdminRegistrationData() {
        Faker faker = new Faker(Locale.of("ru_RU"));
        return new AdminRegistrationData(faker.name().lastName(),
                faker.name().firstName(),
                faker.name().firstName(),
                faker.phoneNumber().phoneNumber(),
                faker.passport().valid(),
                faker.timeAndDate().birthday());
    }
}
