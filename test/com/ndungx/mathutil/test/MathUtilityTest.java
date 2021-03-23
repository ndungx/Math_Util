package com.ndungx.mathutil.test;

import static com.ndungx.mathutil.MathUtility.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author NDungx
 */
public class MathUtilityTest {
    
    @Test
    public void testFactorialGivenRightArgumentReturnsGoodResult() {
        int n = 5;  // tui muốn test 5! có đúng = 120 hay ko
        long expected = 120;
        long actual = com.ndungx.mathutil.MathUtility.getFactorial(n);
        assertEquals(expected, actual);

        //mình test tiếp các trường hợp khác đúng đầu vào, đúng đầu ra
        //khỏi cần biến trung gian, chơi luôn trong lệnh
        assertEquals(720, getFactorial(6));
        assertEquals(24, getFactorial(4));
        assertEquals(6, getFactorial(3));
        assertEquals(1, getFactorial(1));
        assertEquals(1, getFactorial(0));
    }

    //điều gì xảy ra nếu đưa vào tham số sai (âm hoặc lớn hơn 20
    //theo thiết kế của hàm; đưa vào sai sẽ ném ra ngoại lệ
    //tức là cần test xem, NGOẠI LỆ NẾU CÓ ĐƯỢC NÉM RA KHÔNG  NẾU TA TEST SAI
    //THẤY NGOẠI LỆ KHI TA SAI NHƯNG MỪNG VÌ NÓ ĐÚNG
    @Test(expected = IllegalArgumentException.class)
    //có đúng là hàm này thì ném ra ngoại lệ tên là illegal argument
    //nếu đúng thì ném ra ngoại lệ cùng lên, code đúng rồi -> ra màu xanh
    public void testFactorialGivenWrongArgumentThrowException() {
        //mình test tình huống hàm phải ném ra ngoại lệ nếu tham số sai
        //ngoại lệ là không phải value để so sánh, không dùng assertEquals()
        //ta dùng chiêu khác. JUnit 4 Khác JUnit 5 ở chỗ bắt ngoại lệ
        getFactorial(-5);
    }

    //thêm chữ 'test,' vào sau 'init,compile,' ở dòng 1204 (netbeans 11.2) trong 
    // build-impl.xml để khi clean and build nếu bị lỗi logic (uncheck) sẽ không tạo file jar
    //
    // coppy 2 file jar ở \Program Files\NetBeans 8.2 RC\platform\modules\ext
    // vào folder project để server github đem về tự compiled giúp
    
}
