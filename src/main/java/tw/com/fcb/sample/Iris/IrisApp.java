package tw.com.fcb.sample.Iris;

import java.util.Scanner;

public class IrisApp {

	public static void main(String[] args) {
		int numData = 12;
        System.out.println(String.format("%08d",numData));
        
//        Scanner strNum = new Scanner(System.in);
//        System.out.println("請輸入任意數字：");
//        String dataNum = strNum.nextLine();
//        System.out.println("請輸入資料呈現長度(右靠左補零)：");
//        boolean flag = true;
//        do{
//            try{
//                String inNum = strNum.nextLine();
//                int len = Integer.valueOf(inNum);
//                if (dataNum.length() > len ){
//                    System.out.println("資料呈現長度不得小於(" + dataNum + ")長度=" + dataNum.length());
//                }else{
//                    GetFormat strF1 = new GetFormat();
//                    strF1.setLen(len);
//                    System.out.println("out=" + strF1.formatZeros(dataNum));
//                    break;
//                }
//            } catch(NumberFormatException e){
//                System.out.println("資料呈現長度非數字型態!請重新輸入「資料呈現長度(右靠左補零)」：");
//            }
//        }while (flag);

	}

}
