public class Calculate {
     public static double calculateAverage(int[] marks) throws InvalidScoreException{
        if(marks.length != 3){
            throw new ArrayIndexOutOfBoundsException("\"There should be exactly 3 subjects.");
        }
        int sum = 0;
        for(int i=0; i<3; i++){
            if(marks[i] < 0){
                throw new InvalidScoreException("Score can't be smaller then 0.");
            }
            if(marks[i] > 100){
                throw new InvalidScoreException("Score can't be greater then 100.");
            }
            sum += marks[i];
        }

        return sum / 3.0;

     }
}