package com.example.Finance.DeliveryApi.Controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")

public class DeliveryCourier {
    private static final Logger LOG = LoggerFactory.getLogger(DeliveryCourier.class);

    @RequestMapping(value = "/DeliveryGet", method = RequestMethod.GET)
    public String getCouriers()
    {
        return "Hello";
    }

}
