package com.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Test {
    public static void
    main(String[] args) {
        //1.
        InputStream in = null;
        OutputStream out = null;
//创建流---这里使用System创建好的流对象
        in = System.in;
        out = System.out;
        //使用流：
        int len = -1;
        byte[] buf = new byte[1024];

        while (true) {
            try {
                if ((len = in.read(buf)) != -1) {
                    len = in.read(buf);
                    out.write(buf, 0, len);
                    out.flush();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (in != null) {
                    try {
                        in.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }


    }
}
