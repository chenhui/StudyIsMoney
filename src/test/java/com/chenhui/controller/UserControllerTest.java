package com.chenhui.controller;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.net.MalformedURLException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlTextArea;
import com.gargoylesoftware.htmlunit.html.HtmlTextInput;

@RunWith(SpringRunner.class)
@WebMvcTest(UserController.class)
public class UserControllerTest {
    
    @Autowired
    private WebClient webClient;
    
    private HtmlPage page;
    
    @Before
    public void setup() throws FailingHttpStatusCodeException, MalformedURLException, IOException{
    	page=this.webClient.getPage("http://localhost:8080/user");
    }

    
	@Test
	public void getUserForm() throws Exception {
		assertThat(page.getElementById("id")).isExactlyInstanceOf(HtmlTextInput.class);
		assertThat(page.getElementById("text")).isExactlyInstanceOf(HtmlTextArea.class);
		assertThat(page.getFormByName("user")).isExactlyInstanceOf(HtmlForm.class);
	}
	
	@Test
	public void postUserForm() throws Exception{
		HtmlForm form=page.getFormByName("user");
		form.getInputByName("id").setValueAttribute("1");
		form.getTextAreaByName("name").setText("chenhui");
		HtmlPage listUserPage=form.getInputByName("submitButton").click();
		assertThat(listUserPage.getBody().getTextContent().contains("id: 1"));
		assertThat(listUserPage.getBody().getTextContent().contains("name: chenhui"));
	}
	
	
}
