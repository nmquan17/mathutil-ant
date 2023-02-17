/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.tida.mathutil.test.core;

import com.tida.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Admin
 */
public class MathUnilityTest {
//

    @Test(expected = Exception.class)
    public void testFactorialGivenWrongArgumentThrowsException() {
        MathUtility.getFactorial(-5);
//nếu chỉ viết lệnh này đúng 1 mình thì
//có nghĩa là ta chưa bắt, t chưa so sánh liệu rằng có ngoai lệ
//ta phải cho ngoại lệ = (expected = IllegalArgumentException)
//bắt dc ngoại lệ thì đi ngược vs kết quả của func

//n:5 => đỏ vì nó ngoại lệ
        //Test case #6: n = -5, expected: hy vọng thấy ngoại lệ
        //tên là IllegalArgumentException
    }

    @Test
    // biến hàm ở dưới này thành public void main
    // hình thức 
    public void testRedGreenSignal() {
        Assert.assertEquals(6969, 6969);

    }

    @Test
    public void voidtestFactorialGivenRightArgumentReturnsWell() {
        // test case #1: test getF() with n = 0 
        // expected : 1
        // 
        int n = 0;
        long expected = 1;
        long actual = MathUtility.getFactorial(n);
        Assert.assertEquals(expected, actual);

        // test case #2: test getF() with n = 1 
        // expected: 1
        // test ham getF() voi n = 1 
        Assert.assertEquals(1, MathUtility.getFactorial(n));

        // test case #3: test getF() with n = 6 
        // expected: 720 hy vong 6! = 720
        // test ham getF() voi n = 1 
        Assert.assertEquals(720, MathUtility.getFactorial(6));
        Assert.assertEquals(120, MathUtility.getFactorial(5));

//        viết kiểu assertequals(expected, actual) 
//lặp đi lặp lại -> code bốc mùi bad smell
//nhươc điểm đoạn code trên:
//trộn lẫn giữa lệnh so sánh và các data dùng đểtest
//vì trộn lẫn nên ta khó nhìn hết đầy đủ các test case
//nguyên lí nghịch lí thuốc trừ sâu có khả năng xuất hiện
//ta sẽ fix code bốc mùi lặp lại này bằng 1 kĩ thuật mới
//DDT - DATA DRIVEN TESTING
    }

}
