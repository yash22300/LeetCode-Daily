class Solution {
    public int reverse(int x) {
        
        if(x<(-1)*Math.pow(2,31)||x>Math.pow(2,31)-1)
        {
            return 0;
        }

        int reverse = 0;
        Boolean flag = false;
        if(x<0)
        {
            x = x * (-1);
            flag = true;
        }

        while(x>0)
        {
            int r = x%10;
            reverse = reverse*10 + r;
            x = x/10;
        }

        if(flag)
        {
            return reverse * (-1);
        }

        return reverse;
    }
}