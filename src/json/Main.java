package json;


import java.util.ArrayList;
import java.util.List;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        testJsonUtil();
    }

    public static void testJsonUtil() {
        // Json String to Java object
        String json1 = "{\"ims\":[{\"name\":\"篮球\"},{\"name\":\"足球\"}],\"tm\":{\"number\":\"15896352635\",\"type\":\"手机号\"},\"passWord\":\"123\",\"userName\":\"admin\"}";
        UserModel um1 = JsonUtil.getObjFromJsonStr(json1, UserModel.class);
        System.out.println(um1.toString());
        // ///////////////////////////////////////////////

        // Java object to JSON String 简单的Object
        UserModel um2 = new UserModel();
        um2.setUserName("admin");
        um2.setPassWord("123");
        System.out.println(JsonUtil.getJsonStrFromObj(um2));
        // ///////////////////////////////////////////////

        // Java object to JSON String 复杂的Object
        UserModel um3 = new UserModel();
        um3.setUserName("admin");
        um3.setPassWord("123");
        List<InterestModel> ims = new ArrayList<InterestModel>();
        InterestModel im1 = new InterestModel();
        im1.setName("篮球");
        InterestModel im2 = new InterestModel();
        im2.setName("足球");
        ims.add(im1);
        ims.add(im2);
        um3.setIms(ims);
        TelModel tm = new TelModel();
        tm.setNumber("15896352635");
        tm.setType("手机号");
        um3.setTm(tm);
        String json3 = JsonUtil.getJsonStrFromObj(um3, "ims", "tm");
        System.out.println(json3);
        // ///////////////////////////////////////////////

        // List to JSON String
        UserModel um4_1 = new UserModel();
        um4_1.setUserName("admin_1");
        um4_1.setPassWord("123_1");
        List<InterestModel> ims4_1 = new ArrayList<InterestModel>();
        InterestModel im4_1_1 = new InterestModel();
        im4_1_1.setName("篮球_1");
        InterestModel im4_1_2 = new InterestModel();
        im4_1_2.setName("足球_1");
        ims4_1.add(im4_1_1);
        ims4_1.add(im4_1_2);
        um4_1.setIms(ims4_1);
        TelModel tm4_1 = new TelModel();
        tm4_1.setNumber("15896352635_1");
        tm4_1.setType("手机号_1");
        um4_1.setTm(tm4_1);

        UserModel um4_2 = new UserModel();
        um4_2.setUserName("admin_2");
        um4_2.setPassWord("123_2");
        List<InterestModel> ims4_2 = new ArrayList<InterestModel>();
        InterestModel im4_2_1 = new InterestModel();
        im4_2_1.setName("篮球_2");
        InterestModel im4_2_2 = new InterestModel();
        im4_2_2.setName("足球_2");
        ims4_2.add(im4_2_1);
        ims4_2.add(im4_2_2);
        um4_2.setIms(ims4_2);
        TelModel tm4_2 = new TelModel();
        tm4_2.setNumber("15896352635_2");
        tm4_2.setType("手机号_2");
        um4_2.setTm(tm4_2);

        List<Object> list = new ArrayList<Object>();
        list.add(um4_1);
        list.add(um4_2);
        System.out.println(JsonUtil.getJsonStrFromList(list, "User", "ims", "tm"));
        // ///////////////////////////////////////////////

    }
}
