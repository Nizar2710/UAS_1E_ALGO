import java.util.ArrayList;
import java.util.Scanner;

public class UAS1E {
    private static String String_msg;
    private String getUserName;

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getWhatYouPosts() {
        return WhatYouPosts;
    }

    public void setWhatYouPosts(String whatYouPosts) {
        WhatYouPosts = whatYouPosts;
    }

    private String UserID;
    private String UserName;
    private String WhatYouPosts;
    public UAS1E(){

    }
    static class Messages{
        public void setUserID(String UserID){}
        public void setUserName(String UserName){}
        public void SetWhatYouPosts(String msg){}
    }
    private void setMY_MESSAGES(ArrayList<Messages> xmsg){}

    public static void main(String[] args) {
        UAS1E social=new UAS1E();
        social.setUserID(" 001 ");
        social.setUserName(" Nizar ");
        System.out.println(" USER ID : " + social.getUserID());
        System.out.println(" USER NAME : " + social.getUserName());
        int jum_msg=3;
        Scanner sc = new Scanner(System.in);
        ArrayList<UAS1E.Messages> xMsg = new ArrayList<>();
        for(int index=0;index<jum_msg;index++){
            Messages msg = new Messages();
            msg.setUserID(social.getUserID());
            msg.setUserName(social.getUserName);
            System.out.println(" Post Message " + index + " = ");
            String_msg = sc.nextLine();
            xMsg.add(msg);
        }
        social.setMY_MESSAGES(xMsg);

        //TODO :
        //BUATLAH MATHOD Show Posts untuk menampilkan pesan yang telah di posying oleh user
        social.ShowPosts(social);
    }

    public void ShowPosts(UAS1E profil) {
        //Your code here
    }
}
