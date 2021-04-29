package hu.nive.ujratervezes.kepesitovizsga.phonebook;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public class Phonebook {

    public void exportPhonebook(Map<String, String> contacts, String output) {

        if (contacts == null) {
            throw new IllegalArgumentException("Érvénytelen adat");
        }
        if (output == null) {
            throw new IllegalArgumentException("Érvénytelen adat");
        }

        Path file = Path.of(output);
        try (BufferedWriter writer = Files.newBufferedWriter(file)) {


            for (Map.Entry<String, String> elem : contacts.entrySet()) {
                writer.write(elem.getKey() + ": " + elem.getValue() + "\n");

                //System.out.println(elem.getKey() + "\t" + elem.getValue());
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }

    }

}
