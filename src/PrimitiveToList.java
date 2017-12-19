import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimitiveToList {
    //Java8

    //convert int[] to List<Integer>
    public static void main(String[] args)
    {
        int nums[] = new int[] {1,2,3,4,5};

        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
    }
}
