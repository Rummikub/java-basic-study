package davinci.server;
import davinci.common.DavinciFunction;
import java.io.*;
import java.net.*;
import java.util.*;



public class DavinciServer implements Runnable {

	private ServerSocket ss;
	private final int PORT=8888;

	public DavinciServer()
	{
		try
		{
			ss=new ServerSocket(PORT);
			System.out.println("Server start....");
		}catch(Exception ex) {}
	}
	// ���ӽ� ó��
	public void run()
	{
		try
		{
			while(true)
			{
				//������ �ߴٸ� => Ŭ���̾�Ʈ�� ���� ���� => IP,PORT(Socket)
				Socket s=ss.accept();
				//s ( Ŭ���� ���� ip, port) => Thread �� ���� ( ������� ����)
				Client client=new Client(s);
				client.start();
			}
		}catch(Exception ex) {}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DavinciServer server=new DavinciServer();
		new Thread(server).start();
	}
	// ���� Ŭ���� ��� ��� �κ� ( �� Ŭ���̾�Ʈ���� ���� �۾� )
	class Client extends Thread 
	{
		String id,name,sex,pos;
		//pos=> ����ġ
		int avatar;
		//���
		Socket s; // ������
		// ������
		OutputStream out;
		// �ޱ�
		BufferedReader in;
	
		public Client(Socket s)
		{
			try
			{
				this.s=s;
				out=s.getOutputStream();  // Ŭ���� ������ġ => �о �� �ְ� ����
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				//Inputstreamreader ���ͽ�Ʈ�� => byte �� 2byte�� ��ȯ�ؼ� �о��
			}catch (Exception ex) {}
		}
	//=====================================����� �ڵ�============================//
		public void run()
		{
			 // 100| id | �̸� |����
			try
			{
				while(true)
				{
					String msg=in.readLine(); // Ŭ���� ���۰�
					System.out.println("Client=>"+msg);
					StringTokenizer st=
										new StringTokenizer(msg,"|");
					int protocol=Integer.parseInt(st.nextToken());
					switch(protocol)
					{
							case DavinciFunction.GAMESTART:
							{
								break;
							}
							case DavinciFunction.MYPICKDUMMY:
							{
					
								break;
							}
					
							case DavinciFunction.PICKDUMMY:
							{
								String rn=st.nextToken();
								String yid=st.nextToken();
						      }
					}
				}
			}catch (Exception ex) {}
		}
	}
}