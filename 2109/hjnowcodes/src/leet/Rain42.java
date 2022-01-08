package leet;

/**
 * @Date:2022/1/8 14:50
 * @Author:NANDI_GUO
 */
public class Rain42 {
    public static void main(String[] args) {
        int[] height = {0,2,0,2};
        System.out.println(trap(height));
    }
    public static int trap(int[] height) {
        int maxheight = -1;
        int left = height[0];
        for (int i = 1; i < height.length; i++) {
            if (left < height[i]) {
                left = height[i];
                maxheight = i;
            }
        }

        left = height[0];
        int water = 0;
        int right = 0;
        for (int i = 1; i < maxheight; i++) {
            right = height[i];
            if (right > left) {
                left = right;
            }
            water += left - right;

        }

        right = height[height.length - 1];
        for (int i = height.length - 2; i > maxheight; i--) {
            left = height[i];
            if (left > right){
                right = left;
            }
            water += right-left;

        }
        return water;
    }
}
