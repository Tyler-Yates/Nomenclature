package com.tyleryates.nomenclature;

import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.Random;

final class Names {
    private static final List<String> prefixes;
    private static final List<String> middles;
    private static final List<String> suffixes;
    private static Random random = new Random();

    static {
        final ImmutableList.Builder<String> prefixBuilder = ImmutableList.builder();
        prefixBuilder.add("Gal");
        prefixBuilder.add("Am");
        prefixBuilder.add("Brit");
        prefixBuilder.add("Bri");
        prefixBuilder.add("Rus");
        prefixBuilder.add("Pol");
        prefixBuilder.add("Ven");
        prefixBuilder.add("Cr");
        prefixBuilder.add("Ur");
        prefixBuilder.add("Bav");
        prefixBuilder.add("Kra");
        prefixBuilder.add("Er");
        prefixBuilder.add("Aus");
        prefixBuilder.add("Sa");
        prefixBuilder.add("Sax");
        prefixBuilder.add("Rom");
        prefixBuilder.add("Jap");
        prefixBuilder.add("Ord");
        prefixBuilder.add("Cath");
        prefixBuilder.add("Zul");
        prefixes = prefixBuilder.build();

        final ImmutableList.Builder<String> middleBuilder = ImmutableList.builder();
        middleBuilder.add("ir");
        middleBuilder.add("at");
        middleBuilder.add("en");
        middleBuilder.add("bev");
        middleBuilder.add("it");
        middleBuilder.add("o");
        middleBuilder.add("u");
        middleBuilder.add("wu");
        middleBuilder.add("vi");
        middleBuilder.add("ni");
        middleBuilder.add("et");
        middleBuilder.add("tu");
        middles = middleBuilder.build();

        final ImmutableList.Builder<String> suffixBuilder = ImmutableList.builder();
        suffixBuilder.add("ia");
        suffixBuilder.add("and");
        suffixBuilder.add("or");
        suffixBuilder.add("us");
        suffixBuilder.add("tus");
        suffixBuilder.add("an");
        suffixBuilder.add("ene");
        suffixBuilder.add("yo");
        suffixBuilder.add("ox");
        suffixes = suffixBuilder.build();
    }

    public static String getPrefix() {
        return prefixes.get(random.nextInt(prefixes.size()));
    }

    public static String getMiddle() {
        return middles.get(random.nextInt(middles.size()));
    }

    public static String getSuffix() {
        return suffixes.get(random.nextInt(suffixes.size()));
    }
}
