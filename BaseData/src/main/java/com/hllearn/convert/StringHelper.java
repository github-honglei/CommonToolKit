package com.hllearn.convert;

import com.sun.xml.internal.fastinfoset.algorithm.BooleanEncodingAlgorithm;
import jdk.nashorn.internal.runtime.regexp.joni.Regex;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.List;


public class StringHelper {

    /**
     * String to List
     * @param str
     * @param symbol
     * @return
     */
    public static List<String> getList(String str, String symbol) {
        List<String> list = new ArrayList<String>();
        String[] array = str.split(symbol);
        for (String item : array) {
            list.add(item);
        }
        return list;
    }

    /**
     * string to array
     * @param str
     * @param symbol
     * @return
     */
    public static String[] getArray(String str, String symbol) {
        return str.split(symbol);
    }

    /**
     *
     * @param isNumber
     * @param length
     * @return
     */
    public static String createRandom(boolean isNumber, int length) {
        return RandomStringUtils.randomAlphanumeric(length);
    }
}
