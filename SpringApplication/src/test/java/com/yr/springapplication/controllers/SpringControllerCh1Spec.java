package com.yr.springapplication.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.yr.springapplication.controller.SpringControllerCh1;

@ExtendWith(SpringExtension.class)
@WebMvcTest(value = SpringControllerCh1.class)
@WithMockUser
public class SpringControllerCh1Spec {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getCall() throws Exception {

        RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
                "/c1").accept(
                MediaType.APPLICATION_JSON);

        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        System.out.println(result.getResponse());

        String expected = "This is a get call";
        assertEquals(expected, result.getResponse().getContentAsString());
    }

    @Test
    public void getCallwithPath() throws Exception {

        RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
                "/c1/abcd").accept(
                MediaType.APPLICATION_JSON);

        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        System.out.println(result.getResponse());

        String expected = "This is a get call with id : abcd";
        assertEquals(expected, result.getResponse().getContentAsString());
    }

    @Test
    public void postCall() throws Exception {

        RequestBuilder requestBuilder = MockMvcRequestBuilders.post(
                "/c1").accept(
                MediaType.APPLICATION_JSON);

        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        System.out.println(result.getResponse());

        String expected = "This is a Post call";
        assertEquals(expected, result.getResponse().getContentAsString());
    }

    @Test
    public void putCall() throws Exception {

        RequestBuilder requestBuilder = MockMvcRequestBuilders.put(
                "/c1").accept(
                MediaType.APPLICATION_JSON);

        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        System.out.println(result.getResponse());

        String expected = "This is a Put call";
        assertEquals(expected, result.getResponse().getContentAsString());
    }

    @Test
    public void deleteCall() throws Exception {

        RequestBuilder requestBuilder = MockMvcRequestBuilders.delete(
                "/c1").accept(
                MediaType.APPLICATION_JSON);

        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        System.out.println(result.getResponse());

        String expected = "This is a Delete call";
        assertEquals(expected, result.getResponse().getContentAsString());
    }
}
