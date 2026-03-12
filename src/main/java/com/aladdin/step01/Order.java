package com.aladdin.step01;

public record Order(String orderId, int price, String customerGrade) {
    // Java 17의 Record를 활용하여 불변 객체로 데이터를 정의함
}
