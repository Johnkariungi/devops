package com.devops;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.devops.web.i18n.I18NService;

import junit.framework.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DevopsApplicationTests {
 /*Integration test*/
	@Test
	public void contextLoads() {
	}
	
	@Autowired
	private I18NService i18NService;

	@SuppressWarnings("deprecation")
	@Test
	private void testMessageByLocaleService() throws Exception {
		String expectedResult = "Bootstrap starter template";
		String messageId = "index.main.callout";
		String actual = i18NService.getMessage(messageId);
		Assert.assertEquals("The actual and expected strings don't match", expectedResult, actual);
	}

}
