package lop_va_doi_tuong_trongJAVA.stopwatch;

import java.time.LocalDateTime;
import java.util.Date;

public class StopWatch {
    private long startTime;
    private long endTime;

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public StopWatch() {
        startTime = new Date().getTime();
    }
    public void start(){
         this.startTime = new Date().getTime();
    }
    public void stop(){
        this.endTime = new Date().getTime();
    }
    public long getElapsedTime(){
        return this.endTime - this.startTime;
    }
    public static void main(String[] args) {

    }
}
