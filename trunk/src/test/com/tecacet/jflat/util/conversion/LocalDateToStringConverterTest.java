package com.tecacet.jflat.util.conversion;

import static org.junit.Assert.*;

import org.joda.time.LocalDate;
import org.junit.Test;

public class LocalDateToStringConverterTest {

    @Test
    public void testConvertToString() {
        LocalDateToStringConverter converter = new LocalDateToStringConverter("MM/dd/yyyy");
        LocalDate localDate = new LocalDate(1999, 2, 13);
        String result = converter.convertToString(localDate);
        assertEquals("02/13/1999", result);
    }

}