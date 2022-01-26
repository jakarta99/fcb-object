package tw.com.fcb.sample.jilldolala25;

import java.text.DecimalFormat;

public class NumericProcess {


    public String DecimalFormat(int b){

        String result1 = new DecimalFormat("00000000").format(b);

        return result1;
    }

    public  String SubStringFormat(String b){
        String str1 = "00000000";
        int originLength = str1.length();
        int inputLength = b.length();
        String str3 = str1 + b;
        int totLength = str3.length();
        String result2 = str3.substring(totLength-str3.lastIndexOf(b),originLength + inputLength);
        return  result2;
    }

    public  String StringFormat(int b){
        String result3 = String.format("%08d",b);
        return  result3;
    }

    //contact
    //indexOf
    //length
    //replace
    //split
    //substring
    //toUpperCase
    //toLowerCase
    //valueOf
}
