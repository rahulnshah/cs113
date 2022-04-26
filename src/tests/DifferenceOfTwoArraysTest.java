package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import DSA.problems.HashMaps.DifferenceOfTwoArrays;

public class DifferenceOfTwoArraysTest {

	public static DifferenceOfTwoArrays a;
	@BeforeClass
    public static void setUpBeforeClass() {
		a = new DifferenceOfTwoArrays();
    }
	@Test
	public void testfindDifference()
	{
		//DifferenceOfTwoArrays a = new DifferenceOfTwoArrays();
		int [] nums1 = {1,2,3,3};
    	int [] nums2 = {1,2,2};
    	List<List<Integer>> ans = a.findDifference(nums1, nums2);
    	List<List<Integer>> exp = new ArrayList<List<Integer>>();
    	exp.add(new ArrayList<Integer>());
    	exp.add(new ArrayList<Integer>());
    	exp.get(0).add(3);
    	assertEquals(exp,ans);
	}
	@Test
	public void testfindDifference2()
	{
		//DifferenceOfTwoArrays a = new DifferenceOfTwoArrays();
		int [] nums1 = {1,2,3,3};
    	int [] nums2 = {1,2,2,5,4};
    	List<List<Integer>> ans = a.findDifference(nums1, nums2);
    	List<List<Integer>> exp = new ArrayList<List<Integer>>();
    	exp.add(new ArrayList<Integer>());
    	exp.add(new ArrayList<Integer>());
    	exp.get(0).add(3);
    	exp.get(1).add(4); //order of insertion matters; otherwise tests fail
    	exp.get(1).add(5);
    	assertEquals(exp,ans);
	}
	@AfterClass
    public static void setUpAfterClass() {
		a = null;
    }
}
