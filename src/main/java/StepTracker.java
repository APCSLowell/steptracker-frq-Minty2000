import java.util.ArrayList;
public class StepTracker
{
 private int days, int steps, int tdays, int ts;
 
 StepTracker(int s){
    steps =s;
   days= 0;
  tdays=0;
  ts= 0;
 }

 public void  addDailySteps(int x){
  steps += x;
  ts++;
  if (x >= steps ){
days ++;
  }
 }
 public int activeDays(){
  return days;
 }

 public double averageSteps(){
if (ts == 0){
return 0.0;
}else 
 return ts/days;
 }
 /* to be implemented here */
} 
