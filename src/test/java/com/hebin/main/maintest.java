package com.hebin.main;

import com.hebin.utils.hammingutilstest;
import com.hebin.utils.simhashtest;
import com.hebin.utils.writereadtest;
import org.junit.Test;

public class maintest {

    @Test
    public void origAndAllTest(){
        String[] str = new String[6];
        str[0] = writereadtest.readTxt("D:/test/orig.txt");
        str[1] = writereadtest.readTxt("D:/test/orig_0.8_add.txt");
        str[2] = writereadtest.readTxt("D:/test/orig_0.8_del.txt");
        str[3] = writereadtest.readTxt("D:/test/orig_0.8_dis_1.txt");
        str[4] = writereadtest.readTxt("D:/test/orig_0.8_dis_10.txt");
        str[5] = writereadtest.readTxt("D:/test/orig_0.8_dis_15.txt");
        String ansFileName = "D:/test/ansAll.txt";
        for(int i = 0; i <= 5; i++){
            double ans = hammingutilstest.getSimilarity(simhashtest.getSimHash(str[0]), simhashtest.getSimHash(str[i]));
            writereadtest.writeTxt(ans, ansFileName);
        }
    }

    @Test
    public void origAndOrigTest(){
        String str0 = writereadtest.readTxt("D:/test/orig.txt");
        String str1 = writereadtest.readTxt("D:/test/orig.txt");
        String ansFileName = "D:/test/ansOrigAndOrigTest.txt";
        double ans = hammingutilstest.getSimilarity(simhashtest.getSimHash(str0), simhashtest.getSimHash(str1));
        writereadtest.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndAddTest(){
        String str0 = writereadtest.readTxt("D:/test/orig.txt");
        String str1 = writereadtest.readTxt("D:/test/orig_0.8_add.txt");
        String ansFileName = "D:/test/ansOrigAndAddTest.txt";
        double ans = hammingutilstest.getSimilarity(simhashtest.getSimHash(str0), simhashtest.getSimHash(str1));
        writereadtest.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndDelTest(){
        String str0 = writereadtest.readTxt("D:/test/orig.txt");
        String str1 = writereadtest.readTxt("D:/test/orig_0.8_del.txt");
        String ansFileName = "D:/test/ansOrigAndDelTest.txt";
        double ans = hammingutilstest.getSimilarity(simhashtest.getSimHash(str0), simhashtest.getSimHash(str1));
        writereadtest.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndDis1Test(){
        String str0 = writereadtest.readTxt("D:/test/orig.txt");
        String str1 = writereadtest.readTxt("D:/test/orig_0.8_dis_1.txt");
        String ansFileName = "D:/test/ansOrigAndDis1Test.txt";
        double ans = hammingutilstest.getSimilarity(simhashtest.getSimHash(str0), simhashtest.getSimHash(str1));
        writereadtest.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndDis10Test(){
        String str0 = writereadtest.readTxt("D:/test/orig.txt");
        String str1 = writereadtest.readTxt("D:/test/orig_0.8_dis_10.txt");
        String ansFileName = "D:/test/ansOrigAndDis10Test.txt";
        double ans = hammingutilstest.getSimilarity(simhashtest.getSimHash(str0), simhashtest.getSimHash(str1));
        writereadtest.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndDis15Test(){
        String str0 = writereadtest.readTxt("D:/test/orig.txt");
        String str1 = writereadtest.readTxt("D:/test/orig_0.8_dis_15.txt");
        String ansFileName = "D:/test/ansOrigAndDis15Test.txt";
        double ans = hammingutilstest.getSimilarity(simhashtest.getSimHash(str0), simhashtest.getSimHash(str1));
        writereadtest.writeTxt(ans,ansFileName);
    }

}
