/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tdtrung.mathutil.main;

import com.tdtrung.mathutil.core.MathUtil;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        
        //Note : 9.txt + 10.txt
        // thử nghiệm hàm tính giai thừa coi chạy đúng như thiết kế hay ko
        // ta phải đưa ra các tính huống sử dụng hàm trong thực tế
        // ví dụ : -5 coi tính đc ko
        //          0 coi tính mấy
        //          20 coi tính mấy
        //          21 coi tính mấy
        //TEST CASE : Một tình huống hàm/app/màn hình/tính năng đc dưa vào sử dụng
        //giả lập hành vi xài của ai đó
        
        //TEST CASE: là 1 tính huống sừ dụng, xài app (hàm) mà nó bao gồm:
        //Data đầu vào cụ thể nào đó
        //Outout dầu ra ứng với xử lí của hàm/chức năng của app, dĩ nhiên dùng đầu 
        //vào để xử kí
        //Kì vọng: mong hàm sẽ trả về value nào đó ứng với input ở trên
        //So sánh để xem kết quả có như kì vọng hay ko
        
        long expected = 120; //tao kì vọng hàm ói về 120 nếu tính 5!
        int n = 5;           //input
        long actual = MathUtil.getFactorial(n);
        System.out.println("5! = " + expected + " expected");
        System.out.println("5! = " + actual + " actual ");
        
        
    }
}
