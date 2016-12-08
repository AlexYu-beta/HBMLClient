package dao;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import message.ResultMessage;
import po.UserPO;

/**
 * Created by alex on 16-11-6.
 */

public interface UserDao extends Remote{
    public ArrayList<UserPO> getUserList() throws  RemoteException;
    public ResultMessage add(UserPO po) throws RemoteException;
    public UserPO find(String id) throws RemoteException;
    public ResultMessage delete(UserPO po) throws RemoteException;
    public ResultMessage update(UserPO po) throws RemoteException;
    public ResultMessage login(String id, String pwd) throws RemoteException;
    public ResultMessage signup(UserPO po) throws RemoteException;
}
