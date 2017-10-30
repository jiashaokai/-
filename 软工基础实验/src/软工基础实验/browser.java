package 软工基础实验;


import 软工基础实验.administrator;

public class browser {
	 public static void main(String[] args) {
	        // 创建游戏对象
	    	administrator lg = new administrator(60,60);
	        // 进行初始化
	        lg.randomized();
	        // 更新显示
	        lg.updata();
	        while (true) {
	            // 取得下一代
	            lg.generation();
	            try {
	                Thread.sleep(100);
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	            // 更新显示
	            lg.updata();
	        }
	        
	 }
}
