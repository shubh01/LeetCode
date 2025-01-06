package leetcode;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {
        merge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        /*int j=0;
        for(int i=m;i<nums1.length;i++){
            nums1[i]=nums2[j];
            j+=1;
        }
        Arrays.sort(nums1);
        for(int h:nums1)
            System.out.println(h);*/


        int[] nums3 = new int[nums1.length];
        int i=0,j=0,k=0;
        while(k<nums1.length){
            System.out.println("i: "+i+" j: "+j);
            if(j<nums2.length){
                if(i<m && nums1[i]<nums2[j]){
                    nums3[k]=nums1[i];
                    k++;
                    i++;
                }else{
                    nums3[k]=nums2[j];
                    k++;
                    j++;
                }
            }else{
             nums3[k]=nums1[i];
                 k++;
                 i++;
            }
        }
        for(int h=0;h<nums3.length;h++){
            nums1[h]=nums3[h];
        }


    }


}
