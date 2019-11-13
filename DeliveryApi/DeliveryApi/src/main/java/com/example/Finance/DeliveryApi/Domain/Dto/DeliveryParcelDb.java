package com.example.Finance.DeliveryApi.Domain.Dto;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;


public class DeliveryParcelDb {
    @Id
    public ObjectId id;
    public String name;
    public int PhoneNumber;
    public String addr1;
    public String addr2;
    public String city;
    public String PinCode;
    public int inv;
    public int courier_id;




}
