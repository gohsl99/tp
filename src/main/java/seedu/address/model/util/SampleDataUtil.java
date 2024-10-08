package seedu.address.model.util;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import seedu.address.model.AddressBook;
import seedu.address.model.ReadOnlyAddressBook;
import seedu.address.model.client.Client;
import seedu.address.model.client.Email;
import seedu.address.model.client.Name;
import seedu.address.model.client.Phone;
import seedu.address.model.tag.Tag;

/**
 * Contains utility methods for populating {@code AddressBook} with sample data.
 */
public class SampleDataUtil {
    public static Client[] getSamplePersons() {
        return new Client[] {
            new Client(new Name("Alex Yeoh"), new Phone("87438807"), new Email("alexyeoh@example.com"),
                    getTagSet("friends")),
            new Client(new Name("Bernice Yu"), new Phone("99272758"), new Email("berniceyu@example.com"),
                    getTagSet("colleagues", "friends")),
            new Client(new Name("Charlotte Oliveiro"), new Phone("93210283"), new Email("charlotte@example.com"),
                    getTagSet("neighbours")),
            new Client(new Name("David Li"), new Phone("91031282"), new Email("lidavid@example.com"),
                    getTagSet("family")),
            new Client(new Name("Irfan Ibrahim"), new Phone("92492021"), new Email("irfan@example.com"),
                    getTagSet("classmates")),
            new Client(new Name("Roy Balakrishnan"), new Phone("92624417"), new Email("royb@example.com"),
                    getTagSet("colleagues"))
        };
    }

    public static ReadOnlyAddressBook getSampleAddressBook() {
        AddressBook sampleAb = new AddressBook();
        for (Client sampleClient : getSamplePersons()) {
            sampleAb.addPerson(sampleClient);
        }

        return sampleAb;
    }

    /**
     * Returns a tag set containing the list of strings given.
     */
    public static Set<Tag> getTagSet(String... strings) {
        return Arrays.stream(strings)
                .map(Tag::new)
                .collect(Collectors.toSet());
    }

}
