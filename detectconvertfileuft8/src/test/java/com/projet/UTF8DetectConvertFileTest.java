package com.projet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;


public class UTF8DetectConvertFileTest {

    private UTF8DetectConvertFile utf8DetectConvertFile;

    private String fileNameNonUtf8 = "document.txt";

    private String fileNameUtf8 = "test-utf8.txt";


    @BeforeEach
    public void avantChaqueTest(){
         utf8DetectConvertFile = new UTF8DetectConvertFile();
    }

    @Test
    public void should_returnTrue() throws IOException {

        String filename = getClass().getResource(fileNameUtf8).getFile();

        Assertions.assertTrue(utf8DetectConvertFile.isUTF8(new File(filename)));
    }


}
