import java.rmi.*;
public interface GossipInterface extends Remote{

public void hearGossip(byte[] arr,int pId) throws Exception;

}
