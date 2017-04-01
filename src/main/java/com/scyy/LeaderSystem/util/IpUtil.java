package com.scyy.LeaderSystem.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.Properties;

public class IpUtil {
	public static String getMacAddress(){
        Enumeration<NetworkInterface> ni;
		try {
			ni = NetworkInterface.getNetworkInterfaces();
			 while(ni.hasMoreElements()){  
		            NetworkInterface netI = ni.nextElement();  
		            
		            byte[] bytes = netI.getHardwareAddress();  
		            if(netI.isUp() && netI != null && bytes != null && bytes.length == 6){  
		                StringBuffer sb = new StringBuffer();  
		                for(byte b:bytes){  
		                     //与11110000作按位与运算以便读取当前字节高4位  
		                     sb.append(Integer.toHexString((b&240)>>4));  
		                     //与00001111作按位与运算以便读取当前字节低4位  
		                     sb.append(Integer.toHexString(b&15));  
		                     sb.append("-");  
		                 }  
		                 sb.deleteCharAt(sb.length()-1);  
		                 return sb.toString().toUpperCase();   
		            }  
		        }  
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("获取Mac地址失败");
		}  		
		return null;
	}
	
	public static boolean check(){
		boolean flag = false;
		String localMac = getMacAddress();
		
		Properties prop = new Properties();
		InputStream input = null;
		try {
			input = IpUtil.class.getClassLoader().getResourceAsStream("mac.properties");
			prop.load(input);
			Enumeration<Object> enumr = prop.elements();
			while(enumr.hasMoreElements()){
				String value = (String)enumr.nextElement();
				if(value !=null){
					flag = localMac.equals(value);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("读取mac.properties文件失败");
		}finally{
			try {
				input.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return flag;
	}
}
