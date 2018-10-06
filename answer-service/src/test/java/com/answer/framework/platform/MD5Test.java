package com.answer.framework.platform;

import com.answer.framework.util.MD5Utils;
import org.junit.Test;

public class MD5Test {

    @Test
    public void password(){
        String strings[]  = {"18131371953"};
        for(String str: strings){
            String pass = MD5Utils.encodingMd5("123456", str);
            System.out.printf(str + "  :  " + pass);
        }
    }
}
