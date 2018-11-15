package com.cg.bms.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.bms.dao.BankDaoImpl;

public class TestDet {
	static BankDaoImpl bankDao = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		bankDao = new BankDaoImpl();
		System.out.println("...Start Class...");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("...End Class...");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("...Test Function Start...");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("...Test Function End...");
	}

	@Test
	public void testSignIn() {
		Assert.assertNotNull(bankDao.signIn("132456", "s96"));
	}

	@Test
	public void testCreateAcc() {
		Assert.assertNotNull(bankDao.createAccount("s96", "Sai",
				"Current"));
	}

	@Test
	public void testFundTransfer() {
		Assert.assertNotNull(bankDao.transfer(2000,
				bankDao.signIn("132456", "s96"), "19876"));
	}
}
