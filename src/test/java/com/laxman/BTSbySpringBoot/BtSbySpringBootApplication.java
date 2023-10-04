package com.laxman.BTSbySpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


import org.json.JSONObject;

@SpringBootApplication
public class BtSbySpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(BtSbySpringBootApplication.class, args);
	}

}
