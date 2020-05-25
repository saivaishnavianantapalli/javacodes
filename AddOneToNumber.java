import java.io.*;
import java.util.*;

public class Solution{
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int len = A.size();
        int sum = A.get(len-1)+1;
        if(sum <= 9){
            A.set(len-1,sum);
        }
        else{
            A.set(len-1,sum%10);
            int carry = 1;
            int i=len-2;
            for(;i >= 0;i--){
                sum = A.get(i)+carry;
                if(sum <= 9){
                    A.set(i,sum);
                    break;
                }
                else{
                    A.set(i,sum%10);
                    carry = 1;
                }
            }
            if(i == -1){
                A.add(0,1);
            }
        }
        int z=0;
        for(;z < A.size();){
            if(A.get(z) == 0){
                z++;
            }
            else
                break;
        }
        for(int p=z-1;p >= 0;p--){
            A.remove(p);
        }
        return A;
    }
}

