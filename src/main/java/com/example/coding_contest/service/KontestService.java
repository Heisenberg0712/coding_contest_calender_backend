package com.example.coding_contest.service;

import com.example.coding_contest.constants.URL;
import com.example.coding_contest.models.KontestAll;
import com.example.coding_contest.models.helper.Converter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
public class KontestService {
    private final WebClient webClient = WebClient.create(URL.BASEURL);

    public KontestAll[] getAllKontest(){
        String json = webClient.get()
                .uri(URL.GETALL)
                .retrieve()
                .bodyToMono(String.class)
                .block();
        try{
            return Converter.fromJsonString(json);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
