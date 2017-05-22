package com.vint;

/**
 * Created by wen on 17-5-22.
 */
import java.io.*;
import java.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class Main1 {
    private static Logger logger = LoggerFactory.getLogger(Main1.class);
    public static void main(String args[]) throws Exception {
        Scanner cin=new Scanner(System.in);
        int a=cin.nextInt(),b=cin.nextInt();
        System.out.println(a+b);
        logger.info("This is info:{}","info");
    }
}
