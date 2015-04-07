package com.diosoft.taining;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class ArraysHelperTest {

    @Test
    public void testLeftUnion() throws Exception {
        // initialize variable inputs
        int[] leftArray = {3, 6, 2, 4};
        int[] rightArray = {3, 6, 2, 4, 1};

        int[] expectedValue = {3, 6, 2, 4, 3, 6, 2, 4};

        // initialize class to test
        ArrayHelper testClass = new ArrayHelper();

        // invoke method on class to test
        int[] returnedValue = testClass.leftUnion(leftArray, rightArray);

        // assert return value
        assertArrayEquals(expectedValue, returnedValue);

    }

    @Test
    public void testLeftUnionWithException() throws Exception {
        // initialize variable inputs
        int[] leftArray = {3, 6, 2, 4};
        int[] rightArray = {3, 6, 2, 4, 1};

        String expectedValue = "Wrong Values";

        // initialize class to test
        ArrayHelper testClass = new ArrayHelper();

        // invoke method on class to test
        try {
            testClass.leftUnion(leftArray, rightArray);
            fail("Exception Should be thrown");
        }
        catch (MyEception exception) {
            assertEquals(expectedValue, exception.getErrorCode());
        }

        // assert return value

    }

}