package com.projet;


import org.mozilla.universalchardet.UniversalDetector;

import java.io.*;

public  class UTF8DetectConvertFile {


    public boolean isUTF8(File file) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(file);


        byte[] buf = new byte[4096];
        UniversalDetector detector = new UniversalDetector(null);

        int nread;
        while ((nread = fileInputStream.read(buf)) > 0 && !detector.isDone()) {
            detector.handleData(buf, 0, nread);
        }

        detector.dataEnd();
        // (4)
        String encoding = detector.getDetectedCharset();
        // (5)

        detector.reset();

        if(encoding == "UTF-8"){
            return true;
        }
        else
        {
            return false;
        }


    }
}
