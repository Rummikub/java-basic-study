package com.sist.common;

public class Function {
	/*
	 *  	��Ʈ��ũ (CS)
	 *  		���� => Ŭ���̾�Ʈ�� ��û�� �޾� ó��
	 *  		Ŭ�� => ��û�ϰ� ����޾� Ŭ���̾�Ʈ ���α׷��� ���
	 *  
	 *  		1) Ŭ���̾�Ʈ���� ����� ���� ������ �Ѵ�  => Thread�̿�
	 *  		2) Ŭ���̾�Ʈ ��ü���� ó�� X => �׻� ������ ���ؼ� ó���ؾ� ������ �ȴ�
	 *  		3)  ��Ʈ���� �̿��� ���α׷�
	 *  				====
	 *  				���� => ����Ʈ ��Ʈ�� => OutputStream
	 *  				���� => ���ڽ�Ʈ�� => BufferedReader
	 *  
	 */
  // LOGIN  
	public static final int LOGIN=100; // id=st.nextToken();   �����¸��
	public static final int MYLOG=110; // �α��� => ���Ƿ� ����
	
	// WAITROOM
	public static final int MAKEROOM=200; // ������ ���
	public static final int ROOMIN =210; // �濡 ����
	public static final int ROOMOUT=220;
	public static final int ROOMADD=230; // �ٸ� ����� �濡 �� ��
	public static final int MYROOMOUT=240; // ���ӹ濡�� ������ ��ȯ�Ǵ� ȭ��
	public static final int WAITUPDATE=250; // ����� ����Ʈ ������Ʈ
	public static final int POSCHANGE=260; //���� > ���ӹ����� ��ȯ
	public static final int WAITCHAT=270; //���� ä��
	public static final int ROOMCHAT=280;
	
	// �ʴ�-����
	public static final int KANG=300; // ���� ���� ��Ű��
	public static final int INVITE=310;
	public static final int INVITE_YES=320;
	public static final int INVITE_NO=330;
	
	//EXIT
	public static final int EXIT=900;
	public static final int MYEXIT=910;


	/*
	 * Server 
	 * Function.LOGIN => id | pw| sex| loc = waitVc����
	 *
	 *	Client
	 * Function.LOGIN => id | pw| sex| loc = table�� ���
	 */
}
