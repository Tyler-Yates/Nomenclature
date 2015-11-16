package com.tyleryates.nomenclature;

enum NamePart {
    PREFIX, MIDDLE, SUFFIX;

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
