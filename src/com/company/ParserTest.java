package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParserTest {

    @Test
    public void parser_8Returned() {
        Assert.assertEquals(Parser.parser(8), "Result is: 8");
    }
}