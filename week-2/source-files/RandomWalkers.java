public class RandomWalkers
{
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);


        int count = 0;
        float averageStepsTaken = 0;
        while(count < trials)
        {
            int coordinateX = 0;
            int coordinateY = 0;
            int steps = 0;

            while(Math.abs(coordinateX - 0) + Math.abs(coordinateY - 0) < r)
            {
                int direction = (int)(Math.random() * 4.0);

                if(direction == 0)
                {
                    // step up
                    coordinateY++;
                }
                else if(direction == 1)
                {
                    // step right
                    coordinateX++;
                }
                else if(direction == 2)
                {
                    // step down
                    coordinateY--;
                }
                else
                {
                    // step left
                    coordinateX--;
                }

                steps++;
            }

            averageStepsTaken = (count * averageStepsTaken + steps) / ++count;
        }

        System.out.println("average number of steps = "+averageStepsTaken);

    }
}