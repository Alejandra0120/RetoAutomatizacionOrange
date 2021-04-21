package com.orangehrmlive.demo.testing.utils;

import cucumber.api.PendingException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import javax.net.ssl.HttpsURLConnection;
import java.net.URL;


public class ConnectionInternet implements IConnectionInternet{

    private static final Logger LOGGER = LogManager.getLogger(ConnectionInternet.class.getName());
    private final String URL = "https://orangehrm-demo-6x.orangehrmlive.com/";

    @Override
    public void validateConnection() {
        try {
            java.net.URL urlConnection = new URL(URL);
            HttpsURLConnection huc = (HttpsURLConnection) urlConnection.openConnection();
            huc.connect();
        } catch (Exception e) {
            LOGGER.error("Please, validate your internet connection and try again");
            throw new PendingException("Please, validate your internet connection and try again");
        }
    }
}
