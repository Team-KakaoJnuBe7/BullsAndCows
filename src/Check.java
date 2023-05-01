public class Check {
    public int[] checkNumber(int[] a,int[] b){
        int[] result=new int[2];
        String origin="";
        String input="";

        for(int i=0;i<4;i++){
            origin+=a[i];
            input+=b[i];
        }

        int countBulls=0, countCows=0; //Bulls가 strike, Cows가 ball
        for(int i=0;i<4;i++) {
            if (origin.contains(String.valueOf(input.charAt(i)))) {
                if (origin.charAt(i) == input.charAt(i)) countBulls++;
                else countCows++;
            }
        }
        result[0]=countBulls;
        result[1]=countCows;
        return result;
    }
}
