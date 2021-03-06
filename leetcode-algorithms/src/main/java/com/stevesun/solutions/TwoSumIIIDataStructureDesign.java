package com.stevesun.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**Design and implement a TwoSum class. It should support the following operations: add and find.

 add - Add the number to an internal data structure.
 find - Find if there exists any pair of numbers which sum is equal to the value.

 For example,
 add(1); add(3); add(5);
 find(4) -> true
 find(7) -> false*/

//Your TwoSum object will be instantiated and called as such:
//TwoSum twoSum = new TwoSum();
//twoSum.add(number);
//twoSum.find(value);
public class TwoSumIIIDataStructureDesign {
    private Map<Integer, Integer> map = new HashMap();
    private List<Integer> list = new ArrayList();
    
 // Add the number to an internal data structure.
    public void add(int number) {
        list.add(number);
        map.put(number, map.getOrDefault(number, 0)+1);
    }

    // Find if there exists any pair of numbers which sum is equal to the value.
    public boolean find(int value) {
        for(int i = 0; i < list.size(); i++){
            int val1 = list.get(i);
            int val2 = value-val1;
            if(map.containsKey(val2)) {
                if(val1 == val2) {
                    if(map.get(val2) > 1) return true;
                }
                else return true;
            }
        }
        return false;
    }
}
