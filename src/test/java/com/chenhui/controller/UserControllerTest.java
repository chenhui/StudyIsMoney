package com.chenhui.controller;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlSubmitInput;
import com.gargoylesoftware.htmlunit.html.HtmlTextArea;
import com.gargoylesoftware.htmlunit.html.HtmlTextInput;
import com.gargoylesoftware.htmlunit.httpclient.HtmlUnitBrowserCompatCookieHeaderValueFormatter;

@RunWith(SpringRunner.class)
@WebMvcTest(UserController.class)
public class UserControllerTest {
    
    @Autowired
    private WebClient webClient;

    
	@Test
	public void getUserForm() throws Exception {
		HtmlPage page = this.webClient.getPage("http://localhost:8080/user");
//		assertThat(page.getBody().getTextContent()).isEqualTo("hello world test my swap!");
		assertThat(page.getElementById("id")).isExactlyInstanceOf(HtmlTextInput.class);
		assertThat(page.getElementById("text")).isExactlyInstanceOf(HtmlTextArea.class);
	}
	
	
//    @Before
//    public void setup() {
//    	webClient = MockMvcWebClientBuilder
//    		.webAppContextSetup(context)
//    		.build();
//    }
//    
//    @Test
//    public void getUserForm() throws Exception{
//    	HtmlPage createUserFormPage=webClient.getPage("http://localhost:8080/user");
//    	HtmlForm form = createUserFormPage.getHtmlElementById("messageForm");
//    	HtmlTextInput idInput=createUserFormPage.getHtmlElementById("id");
//    	idInput.setValueAttribute("1");
//    	HtmlTextArea  nameInput=createUserFormPage.getHtmlElementById("name");
//    	nameInput.setText("chenhui");
//    	HtmlSubmitInput submit = form.getOneHtmlElementByAttribute("input", "type", "submit");
//    	HtmlPage newMessagePage = submit.click();
//    	
//    	assertThat(newMessagePage.getUrl().toString()).endsWith("/user");
//    	assertThat(newMessagePage.getTextContent().contains("Result"));
//    	assertThat(newMessagePage.getTextContent().contains("id: 0"));
//    }
//

}
