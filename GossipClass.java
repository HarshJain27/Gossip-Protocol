

import java.rmi.server.UnicastRemoteObject;
import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class GossipClass extends UnicastRemoteObject implements GossipInterface //extends UnicastRemoteObject
{
	protected GossipClass() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void hearGossip(byte[] arr,int pId) throws Exception {
		// TODO Auto-generated method stub
		//System.out.println("Hearing Gossip...");
               // System.out.println("hear: msg receved from "+pId+" msg is "+new String(arr));
		int i;
		//for(i=0;i<clk.length;i++) System.out.print(clk[i]);
		//System.out.println("\n");
		String str[]=new String[2];
		str=Server.decode(arr);
		int clk=Integer.parseInt(str[1]);
		if(clk<= Server.localClk)
		{
			System.out.println("Reject"+ str[0]);
			writeToFile("Reject"+ str[0],pId);
			return;
		}
		else
		{
			System.out.println("Accept"+ str[0]);
			writeToFile("Accept"+ str[0],pId);
			Server.localClk=clk;
                  //      System.out.println("local clock updated "+Server.localClk);
		}
		//clk[pId]= Server.localClk[Integer.parseInt(Server.processId)]
		Server.processGossip(str[0],clk,pId);
		
	}
	void writeToFile(String str,int pId) throws FileNotFoundException, IOException
	{
		FileWriter fw = new FileWriter("output"+pId,true);    
	    fw.write(str+"\n");
	    fw.close();
	}

}
