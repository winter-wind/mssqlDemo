/*
 * �ֻ�����׼ȷ�Լ���
 * */

package cc.mssql.mssqldemo;

public class MobileTest {

	public static void main(String[] args){
		String code = "-01wsdf8z8-5sdfsf71-604sdfsdz810";
		StringBuffer sbf = new StringBuffer();//�����ַ��ɱ����б�����
		String reg = "\\d";
		char[] ch = code.toCharArray();//ת���ַ�����
		
		for(Character chs: ch){//��������
			String sc = chs.toString();//ת���ַ���
			if(sc.matches(reg)){//����ƥ��
				sbf.append(sc);//��������ַ��ɱ�����
			}
		}
		
		//ɾ���ַ�����λ0
		String news = sbf.toString();
		String codesegment = null; 
		if(news.charAt(0)=='0'){//�����λ��0����ɾ��0
			news = news.substring(1);
			if(news.length()>=12){//Ȼ���ж��ֻ�λ���Ƿ����11λ��
				codesegment = news.substring(0, 3);
				if(new CodeSegment().CodeSegments(codesegment)){//�ж��ֻ��ſ�ʼ��λ�Ƿ��������е�����һ��
					news = news.substring(0, 11);//�����ֻ���
				}else{
					System.out.println("�ֻ��Ų�����");
					return;
				}
				System.out.println(news);//���
			}
			
		}
		
		
		
	}
}
