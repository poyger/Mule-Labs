package com.mulesoft.training;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.mule.api.MuleException;
import org.mule.api.MuleMessage;
import org.mule.api.client.MuleClient;
import org.mule.tck.junit4.FunctionalTestCase;

public class NegateTest extends FunctionalTestCase {
	@Test
	public void testNegate1() throws MuleException {
		MuleClient client = muleContext.getClient();
		Integer inte = new Integer(5);
		MuleMessage reply = client.send("vm://queue1", inte, null, 5000);
		assertNotNull(reply);
		assertNotNull(reply.getPayload());
		assertTrue(reply.getPayload() instanceof Integer);
		Integer result = (Integer) reply.getPayload();
		assertEquals(result.intValue(), -25);
	}

	@Override
	protected String getConfigResources() {
		// TODO Auto-generated method stub
		return "src/main/app/junit.xml";
	}
}