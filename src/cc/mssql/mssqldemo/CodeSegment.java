package cc.mssql.mssqldemo;

public class CodeSegment {

	public CodeSegment(){
		
	}
	
	public boolean CodeSegments(String code){
		switch (code) {
		//移动号段：
		case "134": return true;
		case "135": return true;	
		case "136": return true;	
		case "137": return true;
		case "138": return true;
		case "139": return true;
		case "147": return true;
		case "150": return true;
		case "151": return true;	
		case "152": return true;	
		case "157": return true;
		case "158": return true;
		case "159": return true;
		case "172": return true;
		case "178": return true;
		case "182": return true;	
		case "183": return true;	
		case "184": return true;
		case "187": return true;
		case "188": return true;
		
		//联通号段：
		case "130": return true;
		case "131": return true;
		case "132": return true;
		case "145": return true;
		case "155": return true;
		case "156": return true;
		case "171": return true;
		case "175": return true;
		case "176": return true;
		case "185": return true;
		case "186": return true;
		
		//电信号段：
		case "133": return true;
		case "149": return true;
		case "153": return true;
		case "173": return true;
		case "177": return true;
		case "180": return true;
		case "181": return true;
		case "189": return true;
		
		//虚拟运营商:
		case "170": return true;
		
		//不再以上号码段,返回假
		default:return false; 
		}
	}
	
	
}

          

       

 