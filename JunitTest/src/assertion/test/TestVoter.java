package assertion.test;

import java.util.Scanner;

import org.junit.Ignore;
import org.junit.Test;

import assertion.model.Calculator;
import assertion.model.VoteEligibility;
import junit.framework.Assert;

public class TestVoter {
	
	private void checkAssertFalse(int age) {
		
		Assert.assertNotSame(true, VoteEligibility.eligibletovote(age));
		
		System.out.println("\nYes, not Eligible to Vote!!");
		System.out.println("*****************\nplease wait a while\n \nchecking with assert False method");
		Assert.assertFalse(VoteEligibility.eligibletovote(age));
		System.out.println("\nwith AssertFalse also passed ");
		
	}

	private void checkAssertTrue(int age) {
		
		Assert.assertEquals(true, VoteEligibility.eligibletovote(age));
		
		System.out.println("\nEligible to Vote!!");
		System.out.println("*****************\nplease wait a while\n \nchecking with assert True method");
		Assert.assertTrue(VoteEligibility.eligibletovote(age));
		System.out.println("\nwith AssertTrue also passed ");
		
	}
	
	Scanner sc=new Scanner(System.in);
	@Ignore("It is successfully passing, Ignore this")
	@Test
	public void addition() {
		System.out.println("Checking Add method");
		Assert.assertEquals(4, Calculator.add(2, 2));
		System.out.println("Add method tested successfully");
	}
	@Test
	public void voterEligibility() throws InterruptedException {
		System.out.println("Voter Eligibility Check");
		
		System.out.print("Enter Age :");
		int age=sc.nextInt();
		if(age<18) {
			System.out.println("Probably it seems not eligible to vote\nLet the Test be run");
			Thread.sleep(2000);
			checkAssertFalse(age);
		}
		else {
			System.out.println("It seems eligible to vote\nLet the Test be run");
			Thread.sleep(2000);
			checkAssertTrue(age);
		}
	}

	
}
