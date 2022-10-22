import java.util.HashMap;

public class IDandPasswords {

    HashMap<String, String> logininfo = new HashMap<String,String>();

    IDandPasswords(){
        logininfo.put("Ronaldo,","Giorgina");
        logininfo.put("Brad", "Pitt");
        logininfo.put("Tarantino", "Password");
    }

    protected HashMap getLoginInfo(){
        return logininfo;
    }

}
