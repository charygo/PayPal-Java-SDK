package com.paypal.base.credential;

import org.testng.annotations.Test;

import com.paypal.base.credential.TokenAuthorization;

public class TokenAuthorizationTest {

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void illegalArgumentExceptionTest() {
		TokenAuthorization tokenAuth = new TokenAuthorization(null, null);
	}
}
