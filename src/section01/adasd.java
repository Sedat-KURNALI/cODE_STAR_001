package section01;

public class adasd {




    boolean solution(String inputString) {
        String str="";
        for( int i=inputString.length()-1;i>=0;i--){
            str=str.concat(inputString.substring(i,i+1));
        }
        if (inputString.equals(str)){
            return true;
        }else {
            return false;
        }

    }

}
