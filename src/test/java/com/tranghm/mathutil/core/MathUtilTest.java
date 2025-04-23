/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.tranghm.mathutil.core;

import static com.tranghm.mathutil.core.MathUtil.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author tranghm  
 */
public class MathUtilTest {
    // use DDT testing
        public static Object[][] initData() {
        return new Integer[][]{
            {1, 1},
            {2, 2},
            {5, 120},
            {6, 720}
        };
    }//DATA separate

    @ParameterizedTest
    @MethodSource(value = "initData")//initData là tên hàm cung cấp data, ngầm định tứ tự của các phần tử của mảng, map vào tham số hàm

    public void testGetFactorialGivenRightArgumentReturnWell(int input, long expected) {
        assertEquals(expected, getFactorial(input));
    }
    
    @Test
    public void testGetFactorialGivenRightArgumentReturnWell(){
        assertEquals(24, getFactorial(4));
    }
    
    //catch exception when input wrong data
    @Test
    public void testGetFactorialGivenWrongArgumentThrowException(){
//        Executable exObject = new Executable() {
//            @Override
//            public void execute() throws Throwable {
//                getFactorial(-5);
//            }
//        };
//        assertThrows(IllegalArgumentException.class, exObject);
        
//        //----- rewrite code with other style
//        Executable exObject = () -> getFactorial(-5);
//        assertThrows(IllegalArgumentException.class, exObject);
          
            //----- rewrite code with other style
        assertThrows(IllegalArgumentException.class, () -> getFactorial(-5));
        
        
    }
    
}
