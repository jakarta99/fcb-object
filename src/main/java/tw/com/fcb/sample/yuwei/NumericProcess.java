package tw.com.fcb.sample.yuwei;

public class NumericProcess {

	
	/**
	 * 左補0程式
	 * @param inputNum 輸入字串
	 * @param length 總長度
	 * @param result 結果
	 * @return
	 */
	public String leftPadding(int inputNum,int length,String result) {

		String pattern = "%"+length+"s";
		result = String.format(pattern, inputNum).replace(' ', '0');
		
		//使用StringUtils
//		result = StringUtils.leftPad(String.valueOf(inputNum), length).replace(' ', '0');
		return result;
	}
	
	/**
	 * 右補0程式
	 * @param inputNum 輸入字串
	 * @param length 總長度
	 * @param result 結果
	 * @return
	 */
	public String rightPadding(int inputNum,int length,String result) {

		String pattern = "%-"+length+"s";
		result = String.format(pattern, inputNum).replace(' ', '0');
		
		//使用StringUtils
//		result = StringUtils.rightPad(String.valueOf(inputNum), length).replace(' ', '0');
		
		return result;
		
	}
}
