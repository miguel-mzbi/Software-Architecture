package test;

import java.util.Collection;
import java.util.NoSuchElementException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import main.Map;
import main.MyMap;
	
public class MapTest {

	Map<Integer, String> map;

	@BeforeTest
	public void initMap() {
		this.map = new MyMap<>();
	}
	
	@BeforeMethod
	public void fillMap() {
		this.map.put(0, "0");
		this.map.put(1, "1");
		this.map.put(2, "2");
		this.map.put(3, "3");
		this.map.put(10, "10");
		this.map.put(11, "11");
		this.map.put(12, "12");
		this.map.put(13, "13");

	}
	
	@AfterMethod
	public void clearMap() {
		this.map.clear();
	}

	@Test
	public void testSize() {
		Assert.assertEquals(this.map.size(), 8);
	}
	
	@Test
	public void testEmpty() {
		Assert.assertEquals(this.map.isEmpty(), false);
		this.map.clear();
		Assert.assertEquals(this.map.isEmpty(), true);
	}
	
	@Test
	public void testClear() {
		this.map.clear();
		Assert.assertEquals(this.map.isEmpty(), true);
	}
	
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void testPutNull() throws IllegalArgumentException {
		this.map.put(null, "This should throw exception");
	}
	
	@Test
	public void testPut() {
		this.map.put(4, "4");
		Assert.assertEquals(this.map.get(11), "11");
		this.map.put(5, "5");
		this.map.put(5, "New 5");
		Assert.assertEquals(this.map.get(5), "New 5");
	}
	
	@Test
	public void testGet() {
		Assert.assertEquals(this.map.get(1), "1");
		Assert.assertEquals(this.map.get(11), "11");
		Assert.assertNull(this.map.get(null));
		Assert.assertNull(this.map.get(100));
	}
	
	@Test
	public void testGetDefault() {
		Assert.assertEquals(this.map.getOrDefault(1, "Default"), "1");
		Assert.assertEquals(this.map.getOrDefault(11, "Default"), "11");
		Assert.assertEquals(this.map.getOrDefault(null, "Default"), "Default");
		Assert.assertEquals(this.map.getOrDefault(100, "Default"), "Default");
	}
	
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void testReplaceNull() throws IllegalArgumentException {
		this.map.replace(null, "This should throw an exception");
	}
	
	@Test(expectedExceptions = NoSuchElementException.class)
	public void testReplaceNotInMap() throws NoSuchElementException {
		this.map.replace(100, "This should throw an exception");
	}
	
	@Test
	public void testReplace() {
		this.map.replace(1, "New 1");
		Assert.assertEquals(this.map.get(1), "New 1");
		this.map.replace(10, "New 10");
		Assert.assertEquals(this.map.get(10), "New 10");
	}
	
	@Test
	public void testContainsKey() {
		Assert.assertEquals(this.map.containsKey(10), true);
		Assert.assertEquals(this.map.containsKey(100), false);
		Assert.assertEquals(this.map.containsKey(null), false);
	}
	
	@Test
	public void testContainsValue() {
		Assert.assertEquals(this.map.containsValue("10"), true);
		Assert.assertEquals(this.map.containsValue("100"), false);
		Assert.assertEquals(this.map.containsValue(null), false);
	}
	
	@Test(expectedExceptions = NoSuchElementException.class)
	public void testRemoveNotInMap() throws NoSuchElementException {
		this.map.remove(100);
	}
	
	@Test(expectedExceptions = NoSuchElementException.class)
	public void testRemoveNull() throws NoSuchElementException {
		this.map.remove(null);
	}
	
	@Test
	public void testRemove() {
		Assert.assertEquals(this.map.remove(10), "10");
		Assert.assertEquals(this.map.remove(1), "1");
		Assert.assertEquals(this.map.remove(2), "2");
		Assert.assertEquals(this.map.remove(12), "12");
	}
	
	@Test
	public void testKeyCollection() {
		Collection<Integer> keys = this.map.keys();
		Assert.assertEquals(keys.size(), 8);
		Assert.assertEquals(keys.contains(0), true);
		Assert.assertEquals(keys.contains(1), true);
		Assert.assertEquals(keys.contains(2), true);
		Assert.assertEquals(keys.contains(3), true);
		Assert.assertEquals(keys.contains(10), true);
		Assert.assertEquals(keys.contains(11), true);
		Assert.assertEquals(keys.contains(12), true);
		Assert.assertEquals(keys.contains(13), true);
		Assert.assertEquals(keys.contains(100), false);
		this.map.clear();
		keys = this.map.keys();
		Assert.assertEquals(keys.size(), 0);
	}
	
	@Test
	public void testValueCollection() {
		Collection<String> values = this.map.values();
		Assert.assertEquals(values.size(), 8);
		Assert.assertEquals(values.contains("0"), true);
		Assert.assertEquals(values.contains("1"), true);
		Assert.assertEquals(values.contains("2"), true);
		Assert.assertEquals(values.contains("3"), true);
		Assert.assertEquals(values.contains("10"), true);
		Assert.assertEquals(values.contains("11"), true);
		Assert.assertEquals(values.contains("12"), true);
		Assert.assertEquals(values.contains("13"), true);
		Assert.assertEquals(values.contains("100"), false);
		this.map.clear();
		values = this.map.values();
		Assert.assertEquals(values.size(), 0);
	}
}
