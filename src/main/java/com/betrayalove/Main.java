package com.betrayalove;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException, SQLException {
        List<SpbBase> list = SpbBaseParser.spbParser();
        SpbSql sql = new SpbSql();

        //        for (SpbBase value : list) //ЗАПОЛНЕНИЕ ТАБЛИЦЫ
        //            sql.addProduct(value);

        Map<Integer, Integer> map = new LinkedHashMap<>();
        int countFloors = 1;
        while (countFloors <= 28) {
            int count = sql.task1(countFloors);
            map.put(countFloors, count);
            countFloors++;
        }


        System.out.println("Первая задача:");
        createCharts(map);
//        for (var a : map.entrySet())
//            System.out.println(a.getKey() + " " + a.getValue());   //ВЫВОД ПЕРВОЙ ЗАДАЧИ В ТЕКСТОВОМ ФОРМАТЕ
        System.out.println("График с названием 'task1.png' создан\n\nПервая задача окончена " +
                "\n=======================================================\n");


        System.out.println("Вторая задача:");
        System.out.println(sql.task2());  //ВЫВОД ВТОРОЙ ЗАДАЧИ
        System.out.println("Вторая задача окончена \n=======================================================\n");

        System.out.println("Третья задача:");
        System.out.println("Улицы университетов выше 5 этажа, с известным годом постройки: \n");
        System.out.println(sql.task3()); //ВЫВОД ТРЕТЬЕЙ ЗАДАЧИ
        System.out.println("\nТретья задача окончена \n=======================================================\n");

    }

    public static void createCharts(Map<Integer, Integer> map) {
        var dataset = new DefaultCategoryDataset();
        for (var value : map.entrySet()) {
            dataset.setValue(value.getValue(), "Кол-во домов с n-ым кол-вом этажей", value.getKey());
        }

        JFreeChart chart = ChartFactory.createBarChart("График", "Кол-во этажей", "Кол-во зданий", dataset);

        try {
//          chart.setBackgroundPaint(new Color(212, 167, 219));
            Paint p = new GradientPaint(0, 0, new Color(255, 192, 203), 1000, 0, new Color(212, 167, 219));
            chart.setBackgroundPaint(p);

            ChartUtils.saveChartAsPNG(new File("task1.png"), chart, 1200, 900);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
