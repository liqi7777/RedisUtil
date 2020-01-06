package com.example.webservice.hangzhouplatlease.testHangzhou;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.webservice.hangzhouplatlease.company.service.impl.RentQyService;
import com.example.webservice.hangzhouplatlease.company.service.impl.RentQyServiceException_Exception;

import java.util.UUID;

/**
 * @author Sky
 * create 2020/01/06
 * email sky.li@ixiaoshuidi.com
 **/
public class TestPlatLease {

    public static void main(String[] args) {
        String token = UUID.randomUUID().toString();
        JSONObject htjson = new JSONObject();
        htjson.put("qyhtbh", "BYHI20199911");
        htjson.put("fwcode", "24001");
        htjson.put("htqdsj", "2019-05-01");
        htjson.put("zlqssj", "2020-05-01");
        htjson.put("fkzq", "2");
        htjson.put("fkfs", "1");
        htjson.put("jzfs", "2");
        htjson.put("khh", "支付宝");
        htjson.put("jzyhzh", "1300000000");
        htjson.put("yjje", "2000");
        htjson.put("zjje", "2000");
        htjson.put("zzjje", "24000");
        String htjsonstr = htjson.toString();
        //当事人
        JSONArray dsrlist = new JSONArray();
//房东
        JSONObject fd = new JSONObject();
        fd.put("dsrmc", "XX 有限公司");
        fd.put("dsrlx", "1");
        fd.put("zjlb", "2013");
        fd.put("zjhm", "MA2018IJDHXXXX");
        fd.put("sjhm", "1300000000");
        fd.put("frdbxm", "李四");
        fd.put("frdbzjlb", "2000");
        fd.put("frdbzjhm", "330105198711051531");
        fd.put("dsrlb", "1");
        fd.put("gx", "0");
        dsrlist.add(fd);
        JSONObject zk = new JSONObject();
        zk.put("dsrmc", "张三");
        zk.put("dsrlx", "2");
        zk.put("zjlb", "2000");
        zk.put("zjhm", "330105198711061533");
        zk.put("sjhm", "1300000001");
        zk.put("dsrlb", "2");
        zk.put("gx", "0");
        dsrlist.add(zk);
        String dsrjsonstr = dsrlist.toString();
        RentQyService rentQyService = new RentQyService();
        try {
            String result = rentQyService.getRentQyServiceHttpSoap11Endpoint().saveHt(token, htjsonstr, dsrjsonstr);
            System.out.println("调用返回结果:" + result);
        } catch (RentQyServiceException_Exception e) {
            e.printStackTrace();
        }
    }
}
