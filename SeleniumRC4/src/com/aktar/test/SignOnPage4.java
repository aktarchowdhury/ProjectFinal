package com.aktar.test;

import org.junit.Test;

public class SignOnPage4 extends WebOpen {
	@Test
	public void SignOn5() {
		selene.click("banking");
		selene.clickAt("cmlink_ProdDisp", "Banking Overview");
		selene.clickAt("cmlink_ProdDisp", "CHECKING ACCOUNTS");
		selene.clickAt("cmlink_ProdDisp", "How CitiProtects You");

	}
}
