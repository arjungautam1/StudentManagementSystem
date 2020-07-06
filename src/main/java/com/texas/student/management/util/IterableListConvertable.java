package com.texas.student.management.util;

import java.util.ArrayList;
import java.util.List;

public class IterableListConvertable {

    public static <T> List<T> getListFromIterable(Iterable<T> iterator) {
        List<T> list = new ArrayList<>();
        iterator.iterator().forEachRemaining(list::add);
        return list;
    }
}
