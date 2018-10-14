package com.projet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class UTF8DetectConvertFileTest {

    @Test
    public void should_returnTrue(){


        UTF8DetectConvertFile utf8DetectConvertFile = new UTF8DetectConvertFile();

        Assertions.assertTrue(utf8DetectConvertFile.isUTF8());
    }


}
