package dao;

import message.ResultMessage;
import po.UserPO;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by alex on 16-11-6.
 */

public interface UserDao extends Remote{
    public UserPO getUserData(int id) throws  RemoteException,Exception;

    public UserPO getUserData(String accountName) throws RemoteException,Exception;
   
    public ResultMessage addUser(UserPO po) throws RemoteException,Exception;
   
    public ResultMessage deleteUser(int id) throws RemoteException,Exception;
   
    public ResultMessage modifyUser(UserPO po) throws RemoteException,Exception;
   
    public ResultMessage login(String accountName, String pwd) throws RemoteException,Exception;
   
    public ResultMessage signup(UserPO po) throws RemoteException,Exception;
}
