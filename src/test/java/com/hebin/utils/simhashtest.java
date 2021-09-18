package com.hebin.utils;

import org.junit.Test;

public class simhashtest {

    @Test
    public void getHashTest(){
        String[] strings = {"你", "知不知道" +
                "", "你", "是", "真的", "可爱"};
        for (String string : strings) {
            String stringHash = simhash.getHash(string);
            System.out.println(stringHash.length());
            System.out.println(stringHash);
        }
    }

    @Test
    public void getSimHashTest(){
        String str0 = writeread.readTxt("D:/test/orig.txt");
        String str1 = writeread.readTxt("D:/test/orig_0.8_add.txt");
        System.out.println(simhash.getSimHash(str0));
        System.out.println(simhash.getSimHash(str1));
    }

}
