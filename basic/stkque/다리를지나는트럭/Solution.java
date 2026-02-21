package stkque.다리를지나는트럭;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0;
        int totalWeight = 0;

        Deque<Integer> bridge = new ArrayDeque<>();
        for (int i = 0; i < bridge_length; i++) {
          bridge.offerLast(0);
        }
        Deque<Integer> trucks = new ArrayDeque<>();
        for(int a : truck_weights) {
          trucks.offerLast(a);
        }

        while (!trucks.isEmpty() || totalWeight > 0) {
          time++;
          totalWeight -= bridge.pollFirst();
          if(!trucks.isEmpty() && weight >= totalWeight + trucks.peekFirst()) {
            int truck = trucks.pollFirst();
            bridge.offerLast(truck);
            totalWeight += truck;
          }
          else bridge.offerLast(0);
        }
        return time;
    }
}