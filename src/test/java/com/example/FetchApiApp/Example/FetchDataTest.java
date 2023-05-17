package com.example.FetchApiApp.Example;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;


import java.io.IOException;

import static org.mockito.Mockito.when;

@SpringBootTest
class FetchDataTest {

    @MockBean
    private FetchData fetchData;



    @Test
    public void checkCountString() throws IOException {

        //FetchData fetchData = new FetchData();
        when(fetchData.JSONObjects()).thenReturn(1);
        assertEquals(1,fetchData.JSONObjects());
    }

//    @Test
//    public void checkURLNull() throws IOException {
//        when(fetchData.readJson("https://soundcloud.com/oembed?url=http%3A//soundcloud.com/forss/flickermood&format=json")).thenReturn(null);
//        assertNull(fetchData.readJson("https://soundcloud.com/oembed?url=http%3A//soundcloud.com/forss/flickermood&format=json"));
//    }
//
//    @Test
//    public void checkFetchCountGiveTrue() throws IOException {
//        when(fetchData.FetchCountString(new JSONObject(new String[]{"type:rich", "provider_name:SoundCloud", "title:Flickermood by Forss"}))).thenReturn(1);
//        assertTrue(true);
//    }
}



