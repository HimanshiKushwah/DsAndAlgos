class TrapWater {
    public int trap(int[] height) {
        if (height.length <= 2) return 0;
        int ans = 0;
        for (int i = 1; i < height.length - 1; ++i) {
            int h = height[i];
            int left = 0;
            for (int j = 0; j < i; ++j) {
                left = Integer.max(left, height[j]);
            }
            int right = 0;
            for (int j = i + 1; j < height.length; ++j) {
                right = Integer.max(right, height[j]);
            }
            //System.out.println(h +" "+left+" "+ right);
            if (left < h || right < h) continue;
            ans += Integer.min(left, right) - h;
        }
        return ans;
    }
    
    public static void main(String[] args) {
    	TrapWater n = new TrapWater();
    	int[] a = {0,1,0,2,1,0,1,3,2,1,2,1};
    	System.out.println(n.trap(a));
    }
}