package com.cmput401f17.eplscavengerhunt;

import com.cmput401f17.eplscavengerhunt.model.Response;

import org.junit.Test;

import static org.junit.Assert.*;

public class ResponseModelTest {

    @Test
    public void getResponseTest() {
        String strDummy = "Response!!";
        Response testResponse = new Response(strDummy);

        String returnedStr = testResponse.getResponseStr();

        assertEquals(strDummy, returnedStr);
    }


    @Test
    public void setResponseTest() {
        String strDummy = "Response!!";
        Response testResponse = new Response(strDummy);

        assertEquals(strDummy, testResponse.getResponseStr());
    }

    @Test
    public void isCorrectTestOnCorrect() {
        Response testResponse = new Response("testResponse");

        testResponse.markCorrect();

        assertTrue(testResponse.isCorrect());
    }

    @Test
    public void isCorrectTestOnIncorrect() {
        Response testResponse = new Response("testResponse");

        testResponse.markIncorrect();

        assertFalse(testResponse.isCorrect());
    }

    @Test
    public void markCorrectTest() {
        Response testResponse = new Response("testResponse");

        testResponse.markCorrect();

        assertTrue(testResponse.isCorrect());
    }

    @Test
    public void markIncorrectTest() {
        Response testResponse = new Response("testResponse");

        testResponse.markIncorrect();

        assertFalse(testResponse.isCorrect());
    }
}
