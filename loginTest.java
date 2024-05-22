/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.loginandregister;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class loginTest {
    
    public loginTest() {
    }

   
    @org.junit.jupiter.api.Test
    public void testCheckusername() {
        System.out.println("checkusername");
        boolean expResult = false;
        boolean result = login.checkusername();
        assertEquals(expResult, result);
     
    }

    @org.junit.jupiter.api.Test
    public void testCheckPasswordcomplexity() {
        System.out.println("checkPasswordcomplexity");
        boolean expResult = false;
        boolean result = login.checkPasswordcomplexity();
        assertEquals(expResult, result);
        
    }

    @org.junit.jupiter.api.Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        String expResult = "";
        String result = login.returnLoginStatus();
        assertEquals(expResult, result);
       
    }

    @org.junit.jupiter.api.Test
    public void testMyHeader() {
        System.out.println("myHeader");
        login instance = new login();
        instance.myHeader();
        
    }

    @org.junit.jupiter.api.Test
    public void testChecktaskDescription() {
        System.out.println("checktaskDescription");
        String taskDescription = "";
        boolean expResult = false;
        boolean result = login.checktaskDescription(taskDescription);
        assertEquals(expResult, result);
        
    }
    
}
