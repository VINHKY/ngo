package com.ngovinhky;

public class MultiplicationTable {
    public static void main(String[] args) {
        // In bảng cửu chương từ 1 đến 10 theo hàng ngang
        System.out.println("BẢNG CỬU CHƯƠNG THEO HÀNG NGANG:\n");

        for (int i = 1; i <= 10; i++) {
            // In lần lượt các phép tính trên cùng một dòng
            for (int j = 1; j <= 10; j++) {
                System.out.print(i + " x " + j + " = " + (i * j) + "\t");
            }
            System.out.println(); // Xuống dòng sau khi in xong 1 bảng
        }
    }
}
