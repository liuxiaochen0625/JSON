package json;

import java.util.List;

/**
 * @author Administrator
 * 
 */
public class UserModel {
    private String userName;// 用户名
    private String passWord;// 密码
    private List<InterestModel> ims;
    private TelModel tm;
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    
    public List<InterestModel> getIms() {
        return ims;
    }

    public void setIms(List<InterestModel> ims) {
        this.ims = ims;
    }

    public TelModel getTm() {
        return tm;
    }

    public void setTm(TelModel tm) {
        this.tm = tm;
    }

    @Override
    public String toString() {
        return "userName=" + userName + "; passWord=" + passWord + ";";
    }

}
