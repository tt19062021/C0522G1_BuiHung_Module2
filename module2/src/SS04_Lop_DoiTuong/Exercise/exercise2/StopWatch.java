package SS04_Lop_DoiTuong.Exercise.exercise2;

public class StopWatch {
    private long starTime, endTime;

    public StopWatch(){
        this.starTime = System.currentTimeMillis();
    }
    public long getStarTime(){
        return this.starTime;
    }
    public long getEndTime(){
        return this.endTime;
    }
    public long start(){
       return this.starTime = System.currentTimeMillis();
    }
    public long stop(){
       return this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return  getEndTime()-getStarTime();
    }
}
