package com.aktar.test;

import org.junit.Test;

public class SignOnPage2 extends WebOpen {
	@Test
	public void SignOn3() {
		selene.click("SignonForm");
		selene.type("usernameMasked", "samuel");
		selene.type("pwd", "Aaa6789");
		selene.check("rememberuserid");
		selene.click("find-submit");
	}
}
