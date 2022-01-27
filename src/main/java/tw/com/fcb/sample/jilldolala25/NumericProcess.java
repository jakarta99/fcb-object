package tw.com.fcb.sample.jilldolala25;

import org.apache.commons.lang3.StringUtils;

import java.text.DecimalFormat;

public class NumericProcess {

    public String FromatNum(int numlen){
        String formatNum = "0";
        for (int i = 1; i < numlen; i++) {
            formatNum = formatNum.concat("0");
        }
        return formatNum;
    }
    public String DecimalFormat(int b,int len){
        return new DecimalFormat(FromatNum(len)).format(b);
    }
    //length
    //substring
    //indexof
    public  String SubStringFormat(String b,int len){
        String str3 = FromatNum(len) + b;
        int totLength = str3.length();
        return  str3.substring(totLength-str3.lastIndexOf(b),totLength);
    }

    public  String StringFormat(int b,int len){
        return  String.format("%"+"0"+len+ "d",b);
    }
    //padingleft
    public String PaddingLeft(String str1,int length){
        if(str1.length() > length)
        {
            return str1;
        }else{

            return  StringUtils.leftPad(str1,length,'0');
        }
    }

    //contact
    public String ContactProcess(String a,String b){
        String str1 = a.concat(b);
        return  str1.concat(a);
    }


    //replace
    //split

    //toUpperCase
    //toLowerCase
    //valueOf
}
