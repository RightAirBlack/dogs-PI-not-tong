package com.right.t1;
import java.util.*;
public class main
{
static	Random ran =new Random();
static	Scanner input = new Scanner(System.in);
static	String[] head=new String[]{
		               "哦，我的上帝，",
		               "诶，见鬼，",
					   "啊，阿们，感谢主，",
					   "看，黑与白交织在一起了，",
					   "瞅，他在干嘛？",
					   "天哪，这声音，",
					   "主啊，看看这漂白了四壁的光，",
					   "因为",
					   "此外，",
					   "虽然，",
					   "请问一下",
		         };
		static String[] body =new String[]{
		           "sb.来了，祂来了，",
                   "sb.祂可是个狼人，",
				   "是祂，sb.！",
				   "sb.长的简直比玛丽太太煮的咖啡还糟糕。",
				   "我真想用马克先生的皮鞋狠狠地踢sb.的屁股。",
				   "听听，听听，sb.的声音简直比艾米小姐拉的小提琴还难听。",
				   "如同上厕所没带纸，",
				   "但是",
				   "宛如",
				   "啊，玛丽太太的咖啡又糊了",
				   "我真想用sb.的屁股狠狠地踢马克先生的皮鞋",
	};
	static String[] end =new String[]{
		               "得把玛丽太太的咖啡️给祂喝",
					   "如果你sb.在用这种翻译腔说话，我就要请上帝让你忏悔",
					   "我向伟大阿门发誓",
					   "你必须向伟大的阿们发誓",
					   "我发誓",
					   "就像上厕所带着砂纸一样",
					   "诶",
					   "求求安迪少爷了",
					   "天哪天哪，这就是你对上帝的态度",
	};
	public static void main(String[] args)
	{
		System.out.println("Hello World!");
		int j=0;
		while(true){
		System.out.println("请输入数字\n");
		String s="";
		int c=input.nextInt();
		System.out.println("请输入主语\n");
	   String name=input.next();
	  
	   
		for(int i=0;i<c;i++) {
		s+="   ";
		j=	ran.nextInt()%head.length;
		if(j<0) j*= -1;
		s+=head[j];
		j=ran.nextInt()%body.length;
		if(j<0) j*= -1;
		s+=body[j];
		j=ran.nextInt()%end.length;
		
        if(j<0) j*= -1;
		
		s+=end[j];
		s+="\n";
		}
	s=s.replace("sb.",name);
		System.out.println(s);
		

	}
}
}
