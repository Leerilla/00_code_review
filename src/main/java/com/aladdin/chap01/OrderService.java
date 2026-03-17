package com.aladdin.chap01;

import java.util.List;

public class OrderService {
    // [리뷰 대상 코드] 학생들은 이 코드에 피드백을 남겨야 합니다.
    public int calc(List<Order> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i).getPrice();
        }
        return sum;
    }
}