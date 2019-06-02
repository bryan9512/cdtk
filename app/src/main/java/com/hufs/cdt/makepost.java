package com.hufs.cdt;

import com.google.firebase.database.Exclude;

import java.util.HashMap;
import java.util.Map;

public class makepost {

    public String mykey;
    public String id;
    public String address;
    public String jibunadd;
    public String speceficaddress;
    public String price;
    public String floor;
    public String room;
    public String option;
    public String guan;
    public String parking;
    public String seol;
    public String date;
    public String ipju;
    public String roomkind;

    public makepost(){
    }

    public  makepost(String id,String mykey, String address,String jibunadd, String speceficaddress,String price,String floor,String room, String option, String guan, String parking, String seol,String date,String ipju,String roomkind ){
        this.id=id;
        this.mykey=mykey;
        this.address=address;
        this.jibunadd=jibunadd;
        this.speceficaddress=speceficaddress;
        this.price=price;
        this.floor=floor;
        this.room=room;
        this.option=option;
        this.guan=guan;
        this.parking=parking;
        this.seol=seol;
        this.date=date;
        this.ipju=ipju;
        this.roomkind=roomkind;
    }

    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();

        result.put("uid", id);
        result.put("keys",mykey);
        result.put("address", address);
        result.put("jibun_address",jibunadd);
        result.put("specefic",speceficaddress);
        result.put("price", price);
        result.put("floor", floor);
        result.put("room", room);
        result.put("option", option);
        result.put("guan",guan);
        result.put("parking",parking);
        result.put("seol",seol);
        result.put("date",date);
        result.put("ipju",ipju);
        result.put("roomkind",roomkind);
        return result;
    }
}