package tw.com.fcb.sample.jilldolala25;

import org.apache.commons.lang3.StringUtils;

import java.text.DecimalFormat;

public class NumericProcess {


    public String DecimalFormat(int b){

        String result1 = new DecimalFormat("00000000").format(b);

        return result1;
    }
    //length
    //substring
    //indexof
    public  String SubStringFormat(String b){
        String str1 = "00000000";
        String str3 = str1 + b;
        int totLength = str3.length();
        String result2 = str3.substring(totLength-str3.lastIndexOf(b),totLength);
        return  result2;
    }

    public  String StringFormat(int b){
        String result3 = String.format("%08d",b);
        return  result3;
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
        String str2 = str1.concat(a);
        return  str2;
    }


    //replace
    //split

    //toUpperCase
    //toLowerCase
    //valueOf
}
