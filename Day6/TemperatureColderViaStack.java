import java.util.Stack;

public class TemperatureColderViaStack{
    public static int[] findcolderTemperatures(int[] temperatures){
        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for(int index = 0;index<temperatures.length;index++){
            while(!stack.isEmpty() && temperatures[index] < temperatures[stack.peek()]){
                int returned = stack.pop();
                result[returned] = index - returned;
            }
            stack.push(index);
        }
        return result;
    }
    public static void main(String[] args){
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = findcolderTemperatures(temperatures);
        System.out.println("Colder temperatures for each day: " + java.util.Arrays.toString(result));
    }
}