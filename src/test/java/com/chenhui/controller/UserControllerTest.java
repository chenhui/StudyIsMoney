package com.chenhui.controller;
import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.xpath;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.htmlunit.MockMvcWebClientBuilder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.gargoylesoftware.htmlunit.*;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlSubmitInput;
import com.gargoylesoftware.htmlunit.html.HtmlTextArea;
import com.gargoylesoftware.htmlunit.html.HtmlTextInput;



@RunWith(SpringRunner.class)
//@WebMvcTest(UserController.class)
@Configuration()
public class UserControllerTest {
//    @Autowired
//    private MockMvc mvc;
//
//    @Test
//    public void getUserForm() throws Exception {
//        mvc.perform(MockMvcRequestBuilders.get("/user"))
//        .andExpect(status().isOk())
//    	.andExpect(xpath("//input[@name='" + "id" + "']").exists())
//    	.andExpect(xpath("//textarea[@name='" + "name" + "']").exists());
//    } 
//    
    @Autowired
    private WebApplicationContext context;
    
    @Autowired
    private WebClient webClient;

    @Before
    public void setup() {
    	webClient = MockMvcWebClientBuilder
    		.webAppContextSetup(context)
    		.build();
    }
    
    @Test
    public void getUserFormWithHtmlUnit() throws Exception{
    	HtmlPage createUserFormPage=webClient.getPage("http://localhost:8080/user");
    	HtmlForm form = createUserFormPage.getHtmlElementById("messageForm");
    	HtmlTextInput idInput=createUserFormPage.getHtmlElementById("id");
    	idInput.setValueAttribute("1");
    	HtmlTextArea  nameInput=createUserFormPage.getHtmlElementById("name");
    	nameInput.setText("chenhui");
    	HtmlSubmitInput submit = form.getOneHtmlElementByAttribute("input", "type", "submit");
    	HtmlPage newMessagePage = submit.click();
    	
    	assertThat(newMessagePage.getUrl().toString()).endsWith("/user");
    	assertThat(newMessagePage.getTextContent().contains("Result"));
    	assertThat(newMessagePage.getTextContent().contains("id: 0"));
    }


}

