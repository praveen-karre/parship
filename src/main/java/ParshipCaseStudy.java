public class ParshipCaseStudy {

    public static void main(String args[]) {
        String result = "";
        //
        for(int i=1;i<=30;i++){
            //
            if(i%(3*5)==0) {
                result = result.concat(" parship");
            } else if(i%5==0) {
                result = result.concat(" ship");
            } else if(i%3 == 0) {
                result = result.concat(" par");
            } else {
                result = result.concat(" " + i);
            }
        }
        System.out.println(result.trim());
    }
}
