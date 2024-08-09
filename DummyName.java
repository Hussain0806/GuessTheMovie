public class DummyName {
    public static StringBuilder getDummyName(int movieLength, StringBuilder randomMovie){
        StringBuilder currentName = new StringBuilder();
        for(int i = 0;i<movieLength;i++){
            if(randomMovie.charAt(i) == ' ') {
                currentName.append(" ");
            }
            else{
                currentName.append("_");
            }
        }
        return currentName;
    }
    public static Boolean validChar(char c){
        if(c>='a'&& c<='z'){
            return true;
        }
        else{
            return false;
        }
    }


}
