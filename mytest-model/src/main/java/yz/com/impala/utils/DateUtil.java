package yz.com.impala.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 李君祥
 * @create: 2023-08-22 16:06
 * @description: 时间工具类
 */
public class DateUtil {

    /**
     * 将一个范围的日期转换为List格式输出
     * @param startDate 20200720
     * @param endDate 20200722
     * @return [20200720,20200721,20200722]
     */
    public static List<String> getDateList(String startDate, String endDate){
        // 定义日期格式
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");

        // 解析起始日期和结束日期
        LocalDate start = LocalDate.parse(startDate, formatter);
        LocalDate end = LocalDate.parse(endDate, formatter);

        // 生成日期列表
        List<String> dateList = new ArrayList<>();
        LocalDate date = start;
        while (!date.isAfter(end)) {
            dateList.add(date.format(formatter));
            date = date.plusDays(1);
        }

        // 返回日期列表
        return dateList;
    }

}
