package com.luban.dubbo_spi.impl;

import com.luban.dubbo_spi.api.Car;
import org.apache.dubbo.common.URL;

/**
 * *************书山有路勤为径***************
 * 鲁班学院
 * 往期资料加木兰老师  QQ: 2746251334
 * VIP课程加安其拉老师 QQ: 3164703201
 * 讲师：周瑜老师
 * *************学海无涯苦作舟***************
 */
public class Car2Wrapper implements Car{

    private Car car;

    public Car2Wrapper(Car car) {
        this.car = car;
    }

    @Override
    public void getColor() {
        System.out.println("before2");
        car.getColor();
        System.out.println("after2");
    }

    @Override
    public void getColorForUrl(URL url) {
        System.out.println("before2ForUrl");
        car.getColorForUrl(url);
        System.out.println("after2ForUrl");
    }
}
