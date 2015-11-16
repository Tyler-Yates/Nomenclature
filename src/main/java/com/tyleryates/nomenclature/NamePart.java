package com.tyleryates.nomenclature;

/**
 * Defines the different parts of a name.
 */
enum NamePart {
    PREFIX, MIDDLE, SUFFIX;

    /**
     * Generates a string for the given part of a name.
     *
     * @param namePart the given part of a name
     *
     * @return a string for that name part
     */
    static String getString(NamePart namePart) {
        switch (namePart) {
            case PREFIX:
                return Names.getPrefix();
            case MIDDLE:
                return Names.getMiddle();
            case SUFFIX:
                return Names.getSuffix();
            default:
                return Names.getMiddle();
        }
    }
}
