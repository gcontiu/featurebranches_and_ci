package com;

import org.junit.Test;
import org.junit.Assert;

/**
 * Created by gelu on 9/5/15.
 */
public class EmployeeTest {

    @Test
    public void ageGetter() {
        Employee employee = new Employee(30, "Gelu");
        Assert.assertEquals(30, employee.getAge());
    }
}
