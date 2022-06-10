/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tdtrung.mathutil.core;

/**
 *
 * @author ASUS
 */
public class MathUtil {
    //trong class này cung cấp cho ai đó nhiều hàm xử lí toán học
    //clone class Math của JDK
    //hàm thư viện xài chung cho ai đó, ko cần lưu lại trạng thái/ giá trị 
    //chon thiết kế là hàm static
    
    //hàm tính giai thừa!!!
    //n! = 1.2.3.4... n
    //ko có giai thừa âm
    //0! = 1! = 1 quy ước
    //giai thừa hàm đồ thị dốc đứng, tăng nhanh về giá trị
    //20! là 18 con số 0, vừa kịp đử cho kiểu long của Java
    //21! tràn kiểu long
    // bài này quy ước tính n! trong khoảng từ 0..20
    public static long getFactorial(int n){
        
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invailid argument. N must be between 0..20");
        
        if (n == 0 || n == 1)
            return 1; //kết thúc cuộc chới sớm nếu nhận những đầu vào đặc biệt
        
        long product = 1; //tính nhân dồn, thuật toán heo đất, ốc bu dồn thịt
        
        for (int i = 2; i <= n; i++) 
            product *= i; // product = product *i
    
        return product;
    }
    
    
    
}