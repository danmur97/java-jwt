package com.auth0.jwtdecodejava;

import com.auth0.jwtdecodejava.interfaces.Payload;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

public class JWTDecoderTest {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void getHeader() throws Exception {
    }

    @Test
    public void getPayload() throws Exception {
        JWTDecoder decoder = new JWTDecoder("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiYWRtaW4iOnRydWV9.TJVA95OrM7E2cBab30RMHrHDcEfxjoYZgeFONFh7HgQ");
        Payload jwt = decoder.getPayload();
        assertThat(jwt.getSubject(), is(notNullValue()));
        assertThat(jwt.getSubject(), is("1234567890"));
    }

    @Test
    public void getSignature() throws Exception {

    }

}