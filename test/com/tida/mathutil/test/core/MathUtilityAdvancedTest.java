/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.tida.mathutil.test.core;

import com.tida.mathutil.core.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author boyvi
 */
//framework: tải về và làm theo cú pháp/yêu cầu framework đó
@RunWith(value = Parameterized.class)
//báo vs JUNIT và JVM rằng, class này sẽ tách data ra khỏi 
//câu lệnh assertEquals()
//về logic, khi run class này, JUNIT sẽ tự sinh ra thêm
//code để fill data vào trong hàm assertE() cho mình
//mình bị phải viết code theo cách JUNIT yêu cầu
//thì mới sửa dc bad smell
//dùng code theo cách thức bị ép tuân thủ logic nào dó
//TA ĐANG XÀI FRAMEWORK
public class MathUtilityAdvancedTest {
//  chuẩn bị data mảng 2 chiều

    @Parameterized.Parameters
    public static Object[][] initData() {
        int a[] = {5, 10, 15, 20};

        return new Object[][]{
            {1, 0},
            {1, 1},
            {2, 2},
            {6, 3},
            {24, 4},
            {120, 5},
            {720, 6}
        };

    }
//máp 1 dòng gòm 2 cột vào 2 biến n và expected
//    JUNIT sẽ tự loop qua từng dòng của mảng để gán
//    data các cột vào 2 biến tương ứng
//    map vào thằng index 1
    @Parameterized.Parameter(value = 1)
    public int n;
    
    
//    map vào thằng index 0 của data[][]
    @Parameterized.Parameter(value = 0)
    public long exected;

//    test
    @Test
    public void testFactorialGivenRightArgumentRunWell() {
        assertEquals(exected, MathUtility.getFactorial(n));
    }

}
