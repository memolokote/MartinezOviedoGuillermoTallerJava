package banco;
import java.util.HashMap;


class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
       HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            int busqueda = 0;
            busqueda = target - nums[i];
            int resultado = map.getOrDefault(busqueda,0);
            if(resultado == 0){
                map.put(nums[i],i);
            }else{
                answer[0]=i;
                answer[1]=map.get(resultado);
            }
        

        }
        return answer;
    }
    public static void main(String[] args) {
        int [] a= {2,7,11,15};
        twoSum(a,9);
    }
}