

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Server {
	static private Boolean isGenerator;
	static private String processName;
	public static String processId;
	static private int waitTime;
	public static int min;
	public static int max;
	public static int totalProcesses;
	public static int localClk;
	
	public static void main(String args[]) throws Exception
	{
		min=1;
		max=Integer.parseInt(args[1]);
		processId=args[0];
		totalProcesses=max;
		String line;
		waitTime=2;
		localClk=0;
		if(args.length==4) 
		{
			isGenerator=true;processName=args[3];
			/**************************Replicating File start************************/
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(processName)));  
			File file = new File(processName+processId);
		      file.createNewFile();
		      PrintWriter printWriter = new PrintWriter (file);
		      while((line=br.readLine()) != null){
		    	  printWriter.println (args[0]+":"+line);
				}  
		       printWriter.close ();
		       br.close();
			/*****************************Replicating File end**************************************/
		}
		else isGenerator=false;
		
		/**********************************Register Start**********************/
		//System.out.println("Server Started...");
		GossipClass gossip=new GossipClass();
		int portAddr=7680+Integer.parseInt(processId);
		LocateRegistry.createRegistry(portAddr);
		//Naming.rebind("Gossip"+args[0], gossip);
        Naming.rebind("rmi://localhost:"+portAddr+"/harsh"+processId,gossip);
		/***********************************Register End******************************/
		
		/*********************Sleep for few Minutes start**************************/
		TimeUnit.SECONDS.sleep(10);
		/*********************Sleep for few Minutes end**************************/
				
		/**************************************Reading file start***************************************/
		int i=1;
		         // System.out.println("server started");
                if(isGenerator.equals(true)){
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(processName+processId)));
		while((line=br.readLine()) != null){
			localClk=i;
                       // System.out.println("line id     "+line+" clock "+localClk);
			processGossip(line,i,-1);i++;
			//System.out.println(line);
			TimeUnit.SECONDS.sleep(waitTime);
		}
		}
		/**************************************Reading file end***************************************/
	}
	
	public static int randInt(int min, int max) {
	
	    Random rand=new Random();
	    int randomNum = rand.nextInt((max - min) + 1) + min;
	    return randomNum;
	}
	
	public static void processGossip(String msg,int clkVal,int sender_pid) throws Exception {
		// TODO Auto-generated method stub
		//System.out.println("Processing Gossip...");
		//localClk[Integer.parseInt(processId)]=clkVal;
		
		int num1=randInt(1,Server.max);
		int num2=0;//randInt(1,Server.max);
		while(num1<=0 || num1==Integer.parseInt(processId)||(sender_pid==num1&&totalProcesses>2))
		{
			//while(num1!=num2) 
			num1=randInt(1,Server.max);
			//while(num1!=Integer.parseInt(processId)) num1=randInt(1,Server.max);
			//while(num2!=Integer.parseInt(processId)) num2=randInt(1,Server.max);
		}
		while(num1==num2 || num2<=0 || num2==Integer.parseInt(processId)||(sender_pid==num2&&totalProcesses>2)) num2=randInt(1,Server.max);

		int portAddr=7680;//"rmi://localhost:"+portAddr+"/harsh"+processId,gossip
		GossipInterface gossip1=(GossipInterface) Naming.lookup("rmi://localhost:"+(portAddr+num1)+"/harsh"+num1);
		GossipInterface gossip2=(GossipInterface) Naming.lookup("rmi://localhost:"+(portAddr+num2)+"/harsh"+num2);
               // System.out.println("process:msg forwaded to"+num1+" and "+num2);
		//gossip1.hearGossip(msg.getBytes(),clkVal,Integer.parseInt(processId));
		//gossip2.hearGossip(msg.getBytes(),clkVal,Integer.parseInt(processId));
		
		gossip1.hearGossip(encode(msg,clkVal),num1);
		gossip2.hearGossip(encode(msg,clkVal),num2);

	}
	public static byte[] encode(String msg,int clkVal)
	{
		hearGossipRequestProto.hearGossipRequest.Builder obj=hearGossipRequestProto.hearGossipRequest.newBuilder();
		obj.setMsg(msg);
        obj.setClk(clkVal);
        return obj.build().toByteArray();
	}
	
	public static String[] decode(byte[] msg) throws Exception
    {
        
        hearGossipRequestProto.hearGossipRequest obj=hearGossipRequestProto.hearGossipRequest.parseFrom(msg);
       String [] temp=new String[2];
       temp[0]=obj.getMsg();
       temp[1]=String.valueOf(obj.getClk());      
       return temp;
    }
}

