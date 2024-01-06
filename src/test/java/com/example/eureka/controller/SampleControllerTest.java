package com.example.eureka.controller;

import com.example.eureka.SampleApplication;
import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SampleApplication.class)
@WebAppConfiguration
public class SampleControllerTest {

    private MockMvc mockMvc;

    @Autowired
    WebApplicationContext webApplicationContext;


    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void test() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/message")).andDo(MockMvcResultHandlers.print()).andExpect(status
                        ().isOk())
                .andExpect(content().string(CoreMatchers.containsString("port")));
    }
}