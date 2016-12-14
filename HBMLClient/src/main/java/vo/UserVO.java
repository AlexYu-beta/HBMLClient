package vo;

import model.MemberType;
import model.UserType;

import java.awt.*;
import java.io.File;
import java.io.Serializable;

/**
 * Created by alex on 16-11-17.
 */
public class UserVO implements Serializable{


    private static final long serialVersionUID = 2358054794207235733L;
    /**
	 *
	 */

	int userID;
    UserType userType;
    String accountName;
    String password;
    String name;
    String contact;
    Image portrait;
    long creditValue;
    MemberType memberType;
    String memberInfo;
    int rank;
    String workid;
    int hotelid;
    //constructors for allVO
    public UserVO(int userID){
        this.userID=userID;
    }

    public UserVO(int userID, UserType userType, String accountName, String password, String name
            , String contact, Image portrait, long creditValue
            , MemberType memberType, String memberInfo, int rank
            , String workid, int hotelid) {
        this.userID = userID;
        this.userType=userType;
        this.accountName = accountName;
        this.password = password;
        this.name = name;
        this.contact = contact;
        this.portrait = portrait;
        this.creditValue = creditValue;
        this.memberType = memberType;
        this.memberInfo = memberInfo;
        this.rank = rank;
        this.workid = workid;
        this.hotelid = hotelid;
    }

    //constructors for customer
    public UserVO(int id, String pwd, String name, String contact,
                  Image image, long creditValue, MemberType memberType, String memberInfo, int rank){
        this.userID=id;
        this.userType= UserType.Customer;
        this.password=pwd;
        this.accountName=name;
        this.contact=contact;
        this.portrait=image;
        this.creditValue=creditValue;
        this.memberInfo=memberInfo;
        this.memberType=memberType;
        this.rank=rank;
    }

    //constructors for Staff
    public UserVO(int id, String pwd, String name, String contact, Image image, String workid, int hotelid){
        this.userID=id;
        this.userType= UserType.Staff;
        this.password=pwd;
        this.accountName=name;
        this.contact=contact;
        this.portrait=image;
        this.workid=workid;
        this.hotelid=hotelid;
    }

    //constructors for WebMarketer and WebManager
    public UserVO(int id, UserType userType, String pwd, String name, String contact, Image image){
        this.userID=id;
        this.userType=userType;
        this.password=pwd;
        this.accountName=name;
        this.contact=contact;
        this.portrait=image;
    }

    //getters
    public int getUserID() {
        return userID;
    }

    public UserType getUserType(){
        return userType;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public Image getPortrait() {
        return portrait;
    }

    public long getCreditValue() {
        return creditValue;
    }

    public MemberType getMemberType() {
        return memberType;
    }

    public String getMemberInfo() {
        return memberInfo;
    }

    public int getRank() {
        return rank;
    }

    public String getWorkid() {
        return workid;
    }

    public int getHotelid() {
        return hotelid;
    }

    public void setCreditValue(long creditValue) {
        this.creditValue = creditValue;
    }
}
