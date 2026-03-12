package com.aladdin.step01;

import java.util.List;

public class DiscountCalculator {

    /**
     * 고객 등급에 따른 기본 할인율을 반환합니다.
     */
    public double getBaseDiscountRate(String customerGrade) {
        // Java 17의 향상된 switch 문(Switch Expressions) 적용
        double value = switch (customerGrade.toUpperCase()) {
            case "VIP" -> 0.20;
            case "GOLD" -> 0.10;
            case "NORMAL" -> 0.05;
            default -> 0.0;
        };
        return value;
    }

    /**
     * 주문 목록과 추가 할인율을 받아 최종 결제 금액을 계산합니다.
     */
    public double calculateTotal(List<Order> order_list, double additionalDiscount) {
        double total = 0;

        for (Order order : order_list) {
            // [리뷰 포인트] 반복문 내에서 무거운 조회나 중복 계산이 발생할 여지가 있음
            double baseRate = getBaseDiscountRate(order.customerGrade());

            // [리뷰 포인트] additionalDiscount에 대한 경계값(음수, 100% 초과 등) 검증이 없음
            double finalRate = baseRate + additionalDiscount;

            total += order.price() * (1 - finalRate);
        }

        return total;
    }
}