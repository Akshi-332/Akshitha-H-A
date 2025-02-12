import java.util.Arrays;

public class Rotation {
    public static void main(String[] args) {
        String[] myTechStack = {"Node", "Django", "Vue", "Express", "Spring", "Flask", "Angular", "React", "Hibernate"};
        int shift = 3, storeIndex = 0;
        int size = myTechStack.length;
        String[] anitClock = new String[size];
        String[] clock = new String[size];
        System.out.println(Arrays.toString(myTechStack));
        for(int index = 0; index < size; index++){
            storeIndex = (index-shift+size)%size;
            anitClock[storeIndex] = myTechStack[index];
        }
        System.out.println(Arrays.toString(anitClock));
        for(int index = 0; index < size; index++){
            storeIndex = (index+shift+size)%size;
            clock[storeIndex] = myTechStack[index];
        }
        System.out.println(Arrays.toString(clock));
    }
}