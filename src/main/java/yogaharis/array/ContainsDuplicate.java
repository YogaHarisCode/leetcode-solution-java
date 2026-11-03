package yogaharis.array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (var num : nums){
            if (!set.add(num)){
                return true;
            }
        }

        return false;
    }
}
