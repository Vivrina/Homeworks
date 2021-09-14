package com.company;

import com.sun.deploy.util.StringUtils;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionTest {

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void exception_2Plus5Plus9_ArrayIndexOutOfBoundsExceptionReturned() {
        String[] args = {"2", "+", "5", "+", "9"};
        Exception.exception(args);
    }
    @Test(expected = NumberFormatException.class)
    public void exception_NumPlus5_NumberFormatExceptionReturned() {
        String[] args = {"Num", "+", "5"};
        Exception.exception(args);
    }
    @Test(expected = NumberFormatException.class)
    public void exception_995_NumberFormatExceptionReturned() {
        String[] args = {"9", "9", "5"};
        Exception.exception(args);
    }
    @Test(expected = NumberFormatException.class)
    public void exception_2PlusNum_NumberFormatExceptionReturned() {
        String[] args = {"2", "+", "Num"};
        Exception.exception(args);
    }

}