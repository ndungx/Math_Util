package com.ndungx.mathutil.main;

/**
 *
 * @author DELL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //tui muốn test 5! có đúng 120 ko?
        int n = 5; //n!
        long expected = 120;//hy vọng 120 trả về
        long actual = com.ndungx.mathutil.MathUtility.getFactorial(n);//thực tế hàm chạy là mấy vậy
        //mình chạy đẻ bk đúng sai???
        System.out.println("5! expected: " + expected
                + "; actual: " + actual);// kết quả trả về
        
        //tui muốn test 0 giai thừa có đúng là 1
        n = 1; //n!
        expected = 1;//hy vọng 120 trả về
        actual = com.ndungx.mathutil.MathUtility.getFactorial(n);//thực tế hàm chạy là mấy vậy
        //mình chạy đẻ bk đúng sai???
        System.out.println("5! expected: " + expected
                + "; actual: " + actual);// kết quả trả về
    }

}
//VIẾT CODE XONG THÌ PHẢI TEST CODE - NGUYÊN TẮC PHẢI THEO
//TEST NGAY KHI TỪNG HÀM, TỪNG CLASS TRC KHI RÁP CHÚNG LẠI VỚI CÁC CLASS KHÁC
//Test ngay khi xong hàm, xong class đc gọi là test mức độ 1, mức 
//Unit Test (test mức đơn vị code)
//Làm sao để test, có nhìu cách:
//1. Cách 1: sout(gọi hàm()) đẻ in ra kết quả xử lí của hàm (OOP)
//2. Cách 2: JOptionPane để popup lên kết quả xử lí của hàm (J Desktop)
//3. Cách 3: Ghi ra LOG file, ra 1 trang web (JW)
// 3 cách này thì đều phải dùng mắt đẻ xem kết quả, và tự kết luận dúng sai
//đúng: tức là hàm này chạy ra 1 giá trị = ACTUAL VALUE và ta thấy 
//ACTUAL VALUE khớp, bằng với cái giá trị mà t mong đợi, t tính trc = tay, gọi
//là EXPECTED VALUE
//ví dụ 5! thì t hy vọng expected hàm trả về 120 nhưng khốn nạn thay, hàm trả về
//đúng 120 - actual hàm chạy đúng 5!
//saiL tui test 6!, expect = 720, khốn nạn thay, chạy ra actual = 120 hàm xử lí
//sai
//4. Cách 4: máy ơi so sanh dùm t kết luận dùm luôn vì m có thể so sánh đc 
// con người ko cần nhìn kết quả để luận đúng sau, máy sẽ lo cho
// nếu tát cả tình huống chạy hàm đều đúng -> xanh
// nếu có 1 tình huống sai -> đỏ
// để làm đc điều này ta cần thư viện cho java xanh đỏ điều này cũng có ở bên c#
//, Php, JS, RUBY..
//Java: JUnit, TestNG
// C#: NUnit, xUnit, MSTest
//Php: PHUnir
//..

