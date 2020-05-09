package com.example.loadclass;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * @author Sky
 * create 2019/11/18
 * email sky.li@ixiaoshuidi.com
 **/
public class OuterClass
{
    static{
        System.out.println("OuterClass static load.");
    }

    public OuterClass()
    {
        System.out.println("flag");
    }

    public OuterClass(String flag)
    {
        System.out.println("flag:"+flag);
    }

    class InnerClass
    {
        //private static String te = "";
//        static{
//            System.out.println("InnerClass static load.");
//        }
        // 非静态内部类不能拥有 静态变量 静态语句 静态方法
        private OuterClass out = new OuterClass("inner");
    }

    static class InnerStaticClass
    {
        private static OuterClass out = new OuterClass("innerStatic");
        static{
            System.out.println("InnerStaticClass static load.");
        }
        private static void load()
        {
            System.out.println("InnerStaticClass func load().");
        }
    }

    public static OuterClass getInstatnce()
    {
        return OuterClass.InnerStaticClass.out;
    }

    public static void main(String[] args)
    {
//        System.out.println("Begin");
//        OuterClass.InnerStaticClass.load();
//        // 静态内部类无需外部类实例即可调用
//        OuterClass out = OuterClass.InnerStaticClass.out;
//        OuterClass.InnerClass innerClass = out.new InnerClass();
        // 非静态内部类需要外部类实例调用

        String s ="[\n" +
                "                {\n" +
                "                    \"homeId\": \"5b86421edba6aa41250aa45c\",\n" +
                "                    \"homeName\": \"南翔翔黄公路100弄33号101室\",\n" +
                "                    \"homeType\": \"2\",\n" +
                "                    \"rooms\": [\n" +
                "                        {\n" +
                "                            \"dataType\": \"5\",\n" +
                "                            \"roomAssociationStatus\": \"2\",\n" +
                "                            \"thirdHomeId\": \"5b86421edba6aa41250aa45c\",\n" +
                "                            \"thirdRoomId\": \"5b86421edba6aa41250aa45c\",\n" +
                "                            \"thirdRoomName\": \"公共区域\",\n" +
                "                            \"uuid\": \"null,e80ac4c57b3c83937ac4d42cdadf5362,75e8ed4adadb8f8f6a68e7c39e2135e2\"\n" +
                "                        }\n" +
                "                    ]\n" +
                "                },\n" +
                "                {\n" +
                "                    \"homeId\": \"5b86425bdba6aa41250aa47c\",\n" +
                "                    \"homeName\": \"南翔翔黄公路100弄33号201室\",\n" +
                "                    \"homeType\": \"2\",\n" +
                "                    \"localHomeId\": \"10310\",\n" +
                "                    \"rooms\": [\n" +
                "                        {\n" +
                "                            \"dataType\": \"5\",\n" +
                "                            \"roomAssociationStatus\": \"1\",\n" +
                "                            \"roomId\": \"87719\",\n" +
                "                            \"roomName\": \"公共区域\",\n" +
                "                            \"thirdHomeId\": \"5b86425bdba6aa41250aa47c\",\n" +
                "                            \"thirdRoomId\": \"5b86425bdba6aa41250aa47c\",\n" +
                "                            \"thirdRoomName\": \"公共区域\",\n" +
                "                            \"uuid\": \"null,93046788f7114e86c050ea9ff48fe0ab,7847db00c6c9e5602045637b3ba844a9\"\n" +
                "                        }\n" +
                "                    ]\n" +
                "                },\n" +
                "                {\n" +
                "                    \"homeId\": \"5b8642edb0a9612837464c1e\",\n" +
                "                    \"homeName\": \"南翔翔黄公路100弄33号502室\",\n" +
                "                    \"homeType\": \"2\",\n" +
                "                    \"localHomeId\": \"10314\",\n" +
                "                    \"rooms\": [\n" +
                "                        {\n" +
                "                            \"dataType\": \"5\",\n" +
                "                            \"roomAssociationStatus\": \"1\",\n" +
                "                            \"roomId\": \"87723\",\n" +
                "                            \"roomName\": \"公共区域\",\n" +
                "                            \"thirdHomeId\": \"5b8642edb0a9612837464c1e\",\n" +
                "                            \"thirdRoomId\": \"5b8642edb0a9612837464c1e\",\n" +
                "                            \"thirdRoomName\": \"公共区域\",\n" +
                "                            \"uuid\": \"null,86a419b03eab004b472d96c73a4a8a6a,22fd32a95586e1dfad47d92d99011bbc\"\n" +
                "                        }\n" +
                "                    ]\n" +
                "                },\n" +
                "                {\n" +
                "                    \"homeId\": \"5b864443b0a9612837464c96\",\n" +
                "                    \"homeName\": \"南翔翔黄公路100弄2号602室\",\n" +
                "                    \"homeType\": \"2\",\n" +
                "                    \"localHomeId\": \"10321\",\n" +
                "                    \"rooms\": [\n" +
                "                        {\n" +
                "                            \"dataType\": \"5\",\n" +
                "                            \"roomAssociationStatus\": \"1\",\n" +
                "                            \"roomId\": \"87730\",\n" +
                "                            \"roomName\": \"公共区域\",\n" +
                "                            \"thirdHomeId\": \"5b864443b0a9612837464c96\",\n" +
                "                            \"thirdRoomId\": \"5b864443b0a9612837464c96\",\n" +
                "                            \"thirdRoomName\": \"公共区域\",\n" +
                "                            \"uuid\": \"null,eeee31a923302def75fc812e8ac884c7,a83c62beac7b0b8dc85c9f5995d76d26\"\n" +
                "                        }\n" +
                "                    ]\n" +
                "                },\n" +
                "                {\n" +
                "                    \"homeId\": \"5b86441edba6aa41250aa528\",\n" +
                "                    \"homeName\": \"南翔翔黄公路100弄2号502室\",\n" +
                "                    \"homeType\": \"2\",\n" +
                "                    \"localHomeId\": \"10320\",\n" +
                "                    \"rooms\": [\n" +
                "                        {\n" +
                "                            \"dataType\": \"5\",\n" +
                "                            \"roomAssociationStatus\": \"1\",\n" +
                "                            \"roomId\": \"87729\",\n" +
                "                            \"roomName\": \"公共区域\",\n" +
                "                            \"thirdHomeId\": \"5b86441edba6aa41250aa528\",\n" +
                "                            \"thirdRoomId\": \"5b86441edba6aa41250aa528\",\n" +
                "                            \"thirdRoomName\": \"公共区域\",\n" +
                "                            \"uuid\": \"null,56519ebdf2d173b95e2f7fa1fefd02c2,21ea0015c0b597d6eedc538f24f1d4d4\"\n" +
                "                        }\n" +
                "                    ]\n" +
                "                },\n" +
                "                {\n" +
                "                    \"homeId\": \"5b86446cdba6aa41250aa5a2\",\n" +
                "                    \"homeName\": \"南翔翔黄公路100弄3号602室\",\n" +
                "                    \"homeType\": \"2\",\n" +
                "                    \"localHomeId\": \"10322\",\n" +
                "                    \"rooms\": [\n" +
                "                        {\n" +
                "                            \"dataType\": \"5\",\n" +
                "                            \"roomAssociationStatus\": \"1\",\n" +
                "                            \"roomId\": \"87731\",\n" +
                "                            \"roomName\": \"公共区域\",\n" +
                "                            \"thirdHomeId\": \"5b86446cdba6aa41250aa5a2\",\n" +
                "                            \"thirdRoomId\": \"5b86446cdba6aa41250aa5a2\",\n" +
                "                            \"thirdRoomName\": \"公共区域\",\n" +
                "                            \"uuid\": \"null,9016150d390d3e3b18a6d6aa6bb1026f,4e807fe3cdeca48d17dc9f969087ebd5\"\n" +
                "                        }\n" +
                "                    ]\n" +
                "                },\n" +
                "                {\n" +
                "                    \"homeId\": \"5b864312b0a9612837464c2b\",\n" +
                "                    \"homeName\": \"南翔翔黄公路100弄33号601室\",\n" +
                "                    \"homeType\": \"2\",\n" +
                "                    \"rooms\": [\n" +
                "                        {\n" +
                "                            \"dataType\": \"5\",\n" +
                "                            \"roomAssociationStatus\": \"2\",\n" +
                "                            \"thirdHomeId\": \"5b864312b0a9612837464c2b\",\n" +
                "                            \"thirdRoomId\": \"5b864312b0a9612837464c2b\",\n" +
                "                            \"thirdRoomName\": \"公共区域\",\n" +
                "                            \"uuid\": \"null,80685c6c4cb54eba9ce3e541ab8a46be,99c15f84c9a11c97fd86041f2a7241f7\"\n" +
                "                        }\n" +
                "                    ]\n" +
                "                },\n" +
                "                {\n" +
                "                    \"homeId\": \"5b86427eb0a9612837464be4\",\n" +
                "                    \"homeName\": \"南翔翔黄公路100弄33号202室\",\n" +
                "                    \"homeType\": \"2\",\n" +
                "                    \"rooms\": [\n" +
                "                        {\n" +
                "                            \"dataType\": \"5\",\n" +
                "                            \"roomAssociationStatus\": \"2\",\n" +
                "                            \"thirdHomeId\": \"5b86427eb0a9612837464be4\",\n" +
                "                            \"thirdRoomId\": \"5b86427eb0a9612837464be4\",\n" +
                "                            \"thirdRoomName\": \"公共区域\",\n" +
                "                            \"uuid\": \"null,8fed2ace71c9b8b5af83fb50ed0f0e5b,ae40e70026b271b77c433a0e392d98e2\"\n" +
                "                        }\n" +
                "                    ]\n" +
                "                },\n" +
                "                {\n" +
                "                    \"homeId\": \"5b864337dba6aa41250aa4cb\",\n" +
                "                    \"homeName\": \"南翔翔黄公路100弄33号602室\",\n" +
                "                    \"homeType\": \"2\",\n" +
                "                    \"rooms\": [\n" +
                "                        {\n" +
                "                            \"dataType\": \"5\",\n" +
                "                            \"roomAssociationStatus\": \"2\",\n" +
                "                            \"thirdHomeId\": \"5b864337dba6aa41250aa4cb\",\n" +
                "                            \"thirdRoomId\": \"5b864337dba6aa41250aa4cb\",\n" +
                "                            \"thirdRoomName\": \"公共区域\",\n" +
                "                            \"uuid\": \"null,2370408dd4e00c0da96289bf5072678d,ac0ddb38446fb5a8f8e90471094cda8d\"\n" +
                "                        }\n" +
                "                    ]\n" +
                "                },\n" +
                "                {\n" +
                "                    \"homeId\": \"5b8644fadba6aa41250aa5d7\",\n" +
                "                    \"homeName\": \"南翔翔黄公路100弄4号501室\",\n" +
                "                    \"homeType\": \"2\",\n" +
                "                    \"rooms\": [\n" +
                "                        {\n" +
                "                            \"dataType\": \"5\",\n" +
                "                            \"roomAssociationStatus\": \"2\",\n" +
                "                            \"thirdHomeId\": \"5b8644fadba6aa41250aa5d7\",\n" +
                "                            \"thirdRoomId\": \"5b8644fadba6aa41250aa5d7\",\n" +
                "                            \"thirdRoomName\": \"公共区域\",\n" +
                "                            \"uuid\": \"null,354c21845d5cac146c7ad201b2fa5665,cfd327ef07181dcef877de0c6dbb42d8\"\n" +
                "                        }\n" +
                "                    ]\n" +
                "                },\n" +
                "                {\n" +
                "                    \"homeId\": \"5b8642c5dba6aa41250aa4a1\",\n" +
                "                    \"homeName\": \"南翔翔黄公路100弄33号302室\",\n" +
                "                    \"homeType\": \"2\",\n" +
                "                    \"rooms\": [\n" +
                "                        {\n" +
                "                            \"dataType\": \"5\",\n" +
                "                            \"roomAssociationStatus\": \"2\",\n" +
                "                            \"thirdHomeId\": \"5b8642c5dba6aa41250aa4a1\",\n" +
                "                            \"thirdRoomId\": \"5b8642c5dba6aa41250aa4a1\",\n" +
                "                            \"thirdRoomName\": \"公共区域\",\n" +
                "                            \"uuid\": \"null,8594efd01389df65a78a8ed2d595c41a,523158a0dbf96127029e8a821f7b96b4\"\n" +
                "                        }\n" +
                "                    ]\n" +
                "                },\n" +
                "                {\n" +
                "                    \"homeId\": \"5b8642a1b0a9612837464bf5\",\n" +
                "                    \"homeName\": \"南翔翔黄公路100弄33号301室\",\n" +
                "                    \"homeType\": \"2\",\n" +
                "                    \"rooms\": [\n" +
                "                        {\n" +
                "                            \"dataType\": \"5\",\n" +
                "                            \"roomAssociationStatus\": \"2\",\n" +
                "                            \"thirdHomeId\": \"5b8642a1b0a9612837464bf5\",\n" +
                "                            \"thirdRoomId\": \"5b8642a1b0a9612837464bf5\",\n" +
                "                            \"thirdRoomName\": \"公共区域\",\n" +
                "                            \"uuid\": \"null,cff1b25e42404cec04f83593abe1a545,206360891b8eaff2e313ba199f8426d5\"\n" +
                "                        }\n" +
                "                    ]\n" +
                "                },\n" +
                "                {\n" +
                "                    \"homeId\": \"5b8643e3b0a9612837464c6d\",\n" +
                "                    \"homeName\": \"南翔翔黄公路100弄34号202室\",\n" +
                "                    \"homeType\": \"2\",\n" +
                "                    \"rooms\": [\n" +
                "                        {\n" +
                "                            \"dataType\": \"5\",\n" +
                "                            \"roomAssociationStatus\": \"2\",\n" +
                "                            \"thirdHomeId\": \"5b8643e3b0a9612837464c6d\",\n" +
                "                            \"thirdRoomId\": \"5b8643e3b0a9612837464c6d\",\n" +
                "                            \"thirdRoomName\": \"公共区域\",\n" +
                "                            \"uuid\": \"null,5b3db32c5561115c6a8c30c266417f66,3b94a676e3d1ba868e1cd2b51f75415a\"\n" +
                "                        }\n" +
                "                    ]\n" +
                "                },\n" +
                "                {\n" +
                "                    \"homeId\": \"5b8643a0dba6aa41250aa4f6\",\n" +
                "                    \"homeName\": \"南翔翔黄公路100弄34号102室\",\n" +
                "                    \"homeType\": \"2\",\n" +
                "                    \"rooms\": [\n" +
                "                        {\n" +
                "                            \"dataType\": \"5\",\n" +
                "                            \"roomAssociationStatus\": \"2\",\n" +
                "                            \"thirdHomeId\": \"5b8643a0dba6aa41250aa4f6\",\n" +
                "                            \"thirdRoomId\": \"5b8643a0dba6aa41250aa4f6\",\n" +
                "                            \"thirdRoomName\": \"公共区域\",\n" +
                "                            \"uuid\": \"null,95e221899c0baf4f5addd85c0cc9af1a,897953286120069eb596668d03d00a78\"\n" +
                "                        }\n" +
                "                    ]\n" +
                "                },\n" +
                "                {\n" +
                "                    \"homeId\": \"5b864376dba6aa41250aa4e6\",\n" +
                "                    \"homeName\": \"南翔翔黄公路100弄34号201室\",\n" +
                "                    \"homeType\": \"2\",\n" +
                "                    \"rooms\": [\n" +
                "                        {\n" +
                "                            \"dataType\": \"5\",\n" +
                "                            \"roomAssociationStatus\": \"2\",\n" +
                "                            \"thirdHomeId\": \"5b864376dba6aa41250aa4e6\",\n" +
                "                            \"thirdRoomId\": \"5b864376dba6aa41250aa4e6\",\n" +
                "                            \"thirdRoomName\": \"公共区域\",\n" +
                "                            \"uuid\": \"null,dd49a3218af761fcdca60c44e7480045,1dc0bbeb761c9be7dd785ab8259860cb\"\n" +
                "                        }\n" +
                "                    ]\n" +
                "                },\n" +
                "                {\n" +
                "                    \"homeId\": \"5b8644d3b0a9612837464e95\",\n" +
                "                    \"homeName\": \"南翔翔黄公路100弄4号401室\",\n" +
                "                    \"homeType\": \"2\",\n" +
                "                    \"rooms\": [\n" +
                "                        {\n" +
                "                            \"dataType\": \"5\",\n" +
                "                            \"roomAssociationStatus\": \"2\",\n" +
                "                            \"thirdHomeId\": \"5b8644d3b0a9612837464e95\",\n" +
                "                            \"thirdRoomId\": \"5b8644d3b0a9612837464e95\",\n" +
                "                            \"thirdRoomName\": \"公共区域\",\n" +
                "                            \"uuid\": \"null,ca83eba81c6d79fa4ff609bd851943ff,483d632a16540b098ef272f64574a63a\"\n" +
                "                        }\n" +
                "                    ]\n" +
                "                },\n" +
                "                {\n" +
                "                    \"homeId\": \"5b8644a1b0a9612837464e7e\",\n" +
                "                    \"homeName\": \"南翔翔黄公路100弄4号301室\",\n" +
                "                    \"homeType\": \"2\",\n" +
                "                    \"rooms\": [\n" +
                "                        {\n" +
                "                            \"dataType\": \"5\",\n" +
                "                            \"roomAssociationStatus\": \"2\",\n" +
                "                            \"thirdHomeId\": \"5b8644a1b0a9612837464e7e\",\n" +
                "                            \"thirdRoomId\": \"5b8644a1b0a9612837464e7e\",\n" +
                "                            \"thirdRoomName\": \"公共区域\",\n" +
                "                            \"uuid\": \"null,afb4356154e50995c9ea6c3e94ca8a0e,7211a8f54ecabc7a7c66cb065f5a233c\"\n" +
                "                        }\n" +
                "                    ]\n" +
                "                },\n" +
                "                {\n" +
                "                    \"homeId\": \"5b864527b0a9612837464eb6\",\n" +
                "                    \"homeName\": \"南翔翔黄公路100弄4号602室\",\n" +
                "                    \"homeType\": \"2\",\n" +
                "                    \"rooms\": [\n" +
                "                        {\n" +
                "                            \"dataType\": \"5\",\n" +
                "                            \"roomAssociationStatus\": \"2\",\n" +
                "                            \"thirdHomeId\": \"5b864527b0a9612837464eb6\",\n" +
                "                            \"thirdRoomId\": \"5b864527b0a9612837464eb6\",\n" +
                "                            \"thirdRoomName\": \"公共区域\",\n" +
                "                            \"uuid\": \"null,5149fa8fc298843b3fca92fb7334774d,f67dcbe4daf656d9ff160c235e6b6ea4\"\n" +
                "                        }\n" +
                "                    ]\n" +
                "                }\n" +
                "            ]";

        JSONArray jsonArray = JSONObject.parseArray(s);
        StringBuilder uuids=new StringBuilder();
        for (Object o : jsonArray) {
            JSONObject o1 = (JSONObject) o;
            uuids.append("'").append(o1.getString("homeId")).append("'").append(",");
        }
        System.out.println(uuids);
    }

}
