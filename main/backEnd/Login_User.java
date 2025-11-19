package backEnd;

/**
 * @author
 * Date: 11/10/2025
 * Purpose:
 */

public class Login_User {

    private String name;
    private int userNum;

    //constructor

    /**
     *
     * @param name
     * @param userNum
     */
    public Login_User(String name, int userNum){
        this.name = name;
        this.userNum userNum;
    }

    //getters

    /**
     *
     * @return name
     */
    public String getName() {return name;}

    /**
     *
     * @return userNum
     */
    public String getUserNum() {return userNum;}

    //setters

    /**
     *
     * @param name
     */
    public void setName(String name){this.name = name;}

    /**
     *
     * @param userNum
     */
    public void setUserNum(String userNum){this.userNum = userNum;}



}