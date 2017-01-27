package com.balabacka.app.classwork.lesson03;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pc on 25.01.2017.
 */
public class MathFuncTest {
    @Test
    public void multiply() {
        int a = 2;
        int b = 5;
        int c = 10;
        Assert.assertEquals(c, MathFunc.multiply(a, b));
    }
}