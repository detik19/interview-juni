package com.nostratech.collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("com.nostratech.collections")
public class ArrayListTest {
	NostraArrayList sal = null;
	@BeforeEach
    void setupThis(){
        System.out.println("@BeforeEach executed");
        sal=new NostraArrayList();
		sal.add("Yamaha");
		sal.add("Honda");
		sal.add("Toyota");
		sal.add("Suzuki");
		System.out.println(sal.toStr());
		assertEquals(4, sal.size());

    }
	@Test
	public void testAdd() {
		sal.add("ESEMKA");
		sal.add("mitsubishi");
		
		assertEquals(6, sal.size());
	
	}
	
	
	@Test
	public void testgetIndex() {

		assertEquals(4, sal.size());
		assertEquals("Yamaha", sal.get(0));
		assertEquals("Toyota", sal.get(2));

	}
    
    
	@Test
	public void testAddIndex() {
		sal.add(1, "klm");
		assertEquals(5, sal.size());

		assertEquals("Yamaha", sal.get(0));
		assertEquals("Honda", sal.get(2));
		assertEquals("Toyota", sal.get(3));

	}
	
	
	@Test
	public void testRemove1() {
		sal.remove(0);
		assertEquals(3, sal.size());
		assertEquals("Honda", sal.get(0));
		assertEquals("Toyota", sal.get(1));


	}
	
	
	@Test
	public void testRemove2() {
		sal.remove(2);
		
		assertEquals("Yamaha", sal.get(0));
		assertEquals("Suzuki", sal.get(2));


	}
	
	@Test
	public void testClear() {
		sal.clear();
		
		assertEquals(0, sal.size());
		
		sal.add("Yamaha");
		sal.add("Honda");
		sal.add("Toyota");
		sal.add("Suzuki");
		assertEquals(4, sal.size());

		assertEquals("Yamaha", sal.get(0));
		assertEquals("Toyota", sal.get(2));

	}
}
