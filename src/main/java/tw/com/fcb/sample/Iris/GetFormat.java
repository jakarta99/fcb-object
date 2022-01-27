package tw.com.fcb.sample.Iris;

public class GetFormat {
	private int lenNum = 8;
    private String s1 = "0";

    public String formatZeros(String dataNum){
        for(int i=1; i < lenNum - dataNum.length();i++){
            s1 = s1 + "0";
        }
        return s1 + dataNum;
    }

    public int getLen() {
        return lenNum;
    }

    public void setLen(int lenNum) {
        this.lenNum = lenNum;
    }
}
