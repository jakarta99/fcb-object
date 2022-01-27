package tw.com.fcb.sample.cj;

public class Transfer {

    public String simple(Integer input, Integer digits){

        String output = null;

        for (int i = 0; i < digits; i++) {
            output = output + "0";
        }
        String combine = output + input;
        Integer length = combine.length();
        output = combine.substring(length-digits);

        return output;

    }

    public String format(Integer input, Integer digits){

        return String.format("%0" + digits + "d",input);

    }



}
