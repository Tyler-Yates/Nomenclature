package com.tyleryates.nomenclature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static com.tyleryates.nomenclature.NamePart.MIDDLE;
import static com.tyleryates.nomenclature.NamePart.PREFIX;
import static com.tyleryates.nomenclature.NamePart.SUFFIX;

public class NameGenerator {
    private static final List<List<NamePart>> nameTypes;
    private static final Random random = new Random();

    static {
        nameTypes = new ArrayList<>();
        nameTypes.add(Arrays.asList(PREFIX, MIDDLE, SUFFIX));
        nameTypes.add(Arrays.asList(PREFIX, MIDDLE, SUFFIX));
        nameTypes.add(Arrays.asList(PREFIX, MIDDLE, MIDDLE, SUFFIX));
        nameTypes.add(Arrays.asList(PREFIX, MIDDLE, MIDDLE, SUFFIX));
        nameTypes.add(Arrays.asList(PREFIX, SUFFIX));
    }

    public static String generateName() {
        final List<NamePart> nameType = nameTypes.get(random.nextInt(nameTypes.size()));
        final StringBuilder name = new StringBuilder();
        for (final NamePart namePart : nameType) {
            name.append(NamePart.getString(namePart));
        }
        return name.toString();
    }

    public static void main(String[] args) {
        if (args.length == 1) {
            final int numNames = Integer.parseInt(args[0]);
            for (int i = 0; i < numNames; i++) {
                System.out.println(generateName());
            }
        } else {
            System.out.println(generateName());
        }
    }
}
