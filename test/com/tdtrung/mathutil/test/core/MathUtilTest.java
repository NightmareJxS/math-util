/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.tdtrung.mathutil.test.core;

import com.tdtrung.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author ASUS
 */
public class MathUtilTest {
    // đây là class sẽ xử dụng các hàm của thư viê/framework JUnit
    // để kiểm thử/kiểm tra code chính - hàm tinhsGiaiThua() bên
    // class cỏe.MathUtil
    // viết code để test code bên kia!!!
    
    // có quy tắc đặc tên hàm kiểm thử
    //  nhưng thường sẽ là nói lên mục đích của các case/tình huống kiểm thử
    // tình huống xài hàm theo kiểu thành công và thất bại!!!
    
    // hàm dưới đây là tính huongos test hàm chạy thành công, trả về ngon
    // ta sẽ xài hàm kiểu well - đưa 5!, 6!, ko chơi đưa -5!, -6!
    
    // @Test JUnit sẽ phối hợp với JVM để chạy hàm này
    // @Test phía hậu trg chính là public static void main()
    // Có nhiều @Test ứng cơi nhiều case khác nhau để kiểm thử hàm tính giai thừa
    @Test
    public void testGetFactorialGivenRightArgumentReturnWell(){
        int n = 0; //test thử tình huống tử tế đầu vào, mày phải chạy đúng
        long expected = 1; //hi vọng 0! = 1
        //long actual = ;//gọi hàm cần test bên core/app chính/code chính
        long actual = MathUtil.getFactorial(n);
        
        //so sánh expected vs. actual dùng xanh xanh đỏ đỏ, framework
        Assert.assertEquals(expected, actual);
        
        
        //gộp thêm cài case thành công/đưa đầu vào ngon!!! hàm phải tính ngon
        Assert.assertEquals(1, MathUtil.getFactorial(1));// tui muốn 1! == 1
        Assert.assertEquals(2, MathUtil.getFactorial(2));// tui muốn 2! == 2
        Assert.assertEquals(6, MathUtil.getFactorial(3));// tui muốn 3! == 6
        Assert.assertEquals(24, MathUtil.getFactorial(4));// tui muốn 4! == 24
        Assert.assertEquals(120, MathUtil.getFactorial(5));// tui muốn 5! == 120
        Assert.assertEquals(120, MathUtil.getFactorial(6));// tui muốn 6! == 720
        
        
        //Hàm giúp so sánh 2 giá trị nào đó có giống nhau ko
        //nếu giống nhau -> thảy màu xanh đèn đường - đường thông, code ngon
        //                  ít nhất cho case đang test
        //nếu ko giống nhau -> thảy màu đỏ đèn đường
        //                      hàm ý expected và actual ko giống nhau

    }
    
    
    // hàm getF() ta thiết kế có 2 tình huống xử lí
    // 1. đưa data tử tế trong [0..20] -> tính đúng đc n! - done
    // 2. đưa data vào cà chớn, âm , > 20; Thiết kế của hàm là ném ngoai lệ
    // tao kì vọng ngoại lệ xuất hiện khi n < 0 || n > 20
    // rất mong ngoại lệ xuất hiện với n cà chớn này
    
    // nếu hàm nhận vào n < 0 hoặc n > 20 và hàm ném ra ngoại lệ
    // HÀM CHẠY ĐÚNG NHƯ THIẾT KẾ -> Xanh phải xuất hiện
    // nếu hàm nhận vào n < 0 hoặc n > 20 và hàm éo ném ra ngoại lệ
    // sure, hàm chạy sai thiết kế, sai kì vọng, màu đỏ
    
    //test case:
    //input: -5
    //expected: IlleagalArgumentException xuất hiện
    // tình huống bất thường, ngoại lệ, ngoài dự tính, dữ liệu
    // là những thứ ko thể đo lượng so sánh theo kiểu value
    // mà chỉ có thể đo lường = cách chings có xuất hiện hay ko
    //assertEquals() ko dùng để so sánh 2 ngoại lệ
    //      equals() là bằng nhau hay ko trên value!!!
    
    // màu đỏ , do hàm đúng là có ném ngoại lệ thật 
    //          nhưng ko phải  ngoại lệ như kì vọng
    //          ko phải hàm ném sai
//    @Test(expected = NumberFormatException.class)
//    public void testGetFactorialGivenWrongArgumentThrowException(){
//        MathUtil.getFactorial(-5); // hàm @Test chạy, hay hàm getF() chạy
//                                    // sẽ ném về ngoại lệ NumberFormat
//    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowException(){
        MathUtil.getFactorial(-5); // hàm @Test chạy, hay hàm getF() chạy                                
    }
    
    
    
    // cách khác để bắt ngoại lệ xuất hiện, viết tự nhiên hơn!!!
    // xài lambda
    // Test case: hàm sẽ ném về ngoại lệ nếu nhận lại 21
    // Tui cần thấy màu xanh khi chơi với 21!
    @Test
    public void testGetFactorialGivenWrongArgumentThrowException_LambdaVersion(){
//        Assert.assertThrows(tham số 1: loại ngoại lệ muốn so sánh,
//                                tham số 2: đoạn code chạy văng ra ngoại runnable)
        Assert.assertThrows(IllegalArgumentException.class, 
                            () -> MathUtil.getFactorial(21));

        //MathUtil.getFactorial(-5); // hàm @Test chạy, hay hàm getF() chạy                                
    }
    
    
    
    // Bắt ngoại lệ, xem hàm có ném về ngoại lệ hay ko khi n cà chớn
    // có ném, tức là hàm chyaj đúng thiết kế -> xanh
    @Test
    public void testGetFactorialGivenWrongArgumentThrowException_TryCatch(){
        // Chủ động kiểm soát ngoại lệ
        try {
            
            MathUtil.getFactorial(-5);  
            
        } catch (Exception e) {
            // bắt try catch là Junit sẽ ra màu xanh do đã chủ động kiểm soát ngoại lệ
            // nhưng ko chắc ngoại lệ mình cần có xuất hiện hay ko???
            // có đoạn code kiểm soát đúng ngoại lệ IllegalArgumentException xh
            Assert.assertEquals("Invailid argument. N must be between 0..20", e.getMessage());
            
            
        }
        
                                      
    }
    
}
