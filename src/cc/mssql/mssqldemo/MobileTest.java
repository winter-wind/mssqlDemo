/*
 * 手机号码准确性检验
 * */

package cc.mssql.mssqldemo;

public class MobileTest {

	public static void main(String[] args){
		String code = "-01wsdf8z8-5sdfsf71-604sdfsdz810";
		StringBuffer sbf = new StringBuffer();//创建字符可变序列保存结果
		String reg = "\\d";
		char[] ch = code.toCharArray();//转成字符数组
		
		for(Character chs: ch){//遍历数组
			String sc = chs.toString();//转成字符串
			if(sc.matches(reg)){//正则匹配
				sbf.append(sc);//结果存入字符可变序列
			}
		}
		
		//删除字符串首位0
		String news = sbf.toString();
		String codesegment = null; 
		if(news.charAt(0)=='0'){//如果首位是0，则删除0
			news = news.substring(1);
			if(news.length()>=12){//然后判断手机位数是否大于11位，
				codesegment = news.substring(0, 3);
				if(new CodeSegment().CodeSegments(codesegment)){//判断手机号开始三位是否是三网中的其中一个
					news = news.substring(0, 11);//保留手机号
				}else{
					System.out.println("手机号不存在");
					return;
				}
				System.out.println(news);//输出
			}
			
		}
		
		
		
	}
}
