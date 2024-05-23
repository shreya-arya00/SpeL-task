package org.example.speldemo.entitiies;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

@Configuration
@ConfigurationProperties(prefix="testing")
public class Test {

    private int number;

    @Value("'${testing.text}.split('-')")
    private String[] text;
    private boolean flag;

    @DateTimeFormat(pattern = "hh:mm:ss")
    private LocalTime time;

    @DateTimeFormat(pattern = "dd/MM/yy")
    private LocalDate date;

    @Override
    public String toString() {
        return "Test{" +
                "number=" + number +
                ", text='" + Arrays.toString(text) + '\'' +
                ", flag=" + flag +
                ", time=" + time +
                ", date=" + date +
                '}';
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String[] getText() {
        return text;
    }

    public void setText(String[] text) {
        this.text = text;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
