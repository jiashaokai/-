package ������ʵ��;


import ������ʵ��.administrator;

public class browser {
	 public static void main(String[] args) {
	        // ������Ϸ����
	    	administrator lg = new administrator(60,60);
	        // ���г�ʼ��
	        lg.randomized();
	        // ������ʾ
	        lg.updata();
	        while (true) {
	            // ȡ����һ��
	            lg.generation();
	            try {
	                Thread.sleep(100);
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	            // ������ʾ
	            lg.updata();
	        }
	        
	 }
}
