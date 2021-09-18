package com.hebin.utils;

import org.junit.Test;

public class hammingutilstest {

    @Test
    public void getHammingDistanceTest() {
        String str0 = writeread.readTxt("D:/test/orig.txt");
        String str1 = writeread.readTxt("D:/test/orig_0.8_add.txt");
        int distance = hammingutils.getHammingDistance(simhash.getSimHash(str0), simhash.getSimHash(str1));
        System.out.println("海明距离：" + distance);
        System.out.println("相似度: " + (100 - distance * 100 / 128) + "%");
    }

    @Test
    public void getHammingDistanceFailTest() {
        // 测试str0.length()!=str1.length()的情况
        String str0 = "10101010";
        String str1 = "1010101";
        System.out.println(hammingutils.getHammingDistance(str0, str1));
    }

    @Test
    public void getSimilarityTest() {
        String str0 = writeread.readTxt("D:/test/orig.txt");
        String str1 = writeread.readTxt("D:/test/orig_0.8_add.txt");
        int distance = hammingutils.getHammingDistance(simhash.getSimHash(str0), simhash.getSimHash(str1));
        double similarity = hammingutils.getSimilarity(simhash.getSimHash(str0), simhash.getSimHash(str1));
        System.out.println("原文件和测试文件的汉明距离: " + distance);
        System.out.println("原文件和测试文件的相似度:" + similarity);
    }

}
