package com.ymm56.trade.order.center.biz.chain;

import java.util.ArrayList;
import java.util.List;

public class PermuteTest {
    public List<List<Integer>> permute(int num) {
    	int[] nums = new int[num];
    	
    	for(int i = 1 ; i <= num; i++) {
    		nums[i-1] = i;
    	}
    	
        List<List<Integer>> res = new ArrayList<>();
        int[] visited = new int[nums.length];
        backtrack(res, nums, new ArrayList<Integer>(), visited);
        return res;

    }

    private void backtrack(List<List<Integer>> res, int[] nums, ArrayList<Integer> tmp, int[] visited) {
        if (tmp.size() == nums.length) {
            res.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i] == 1) continue;
            visited[i] = 1;
            tmp.add(nums[i]);
            backtrack(res, nums, tmp, visited);
            visited[i] = 0;
            tmp.remove(tmp.size() - 1);
        }
    }
    
    public static void main(String[] args) {
    	List<List<Integer>> resultList = new PermuteTest().permute(7);
    	for(List<Integer> l : resultList) {
    		for(int i = 0; i < l.size(); i++) { 
    			if(i == l.size() - 1) {
    				System.out.print(l.get(i));
    			} else {
    				System.out.print(l.get(i) + " , ");
    			}
    		}
    		System.out.println();
    	}
		
	}
}
