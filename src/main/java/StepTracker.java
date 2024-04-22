import java.util.ArrayList;
public class StepTracker
{
 private int days,  minsteps,  totalDay, ts;
 
 StepTracker(int s){
    minsteps =s;
   days= 0;
  totalDay=0;
  ts= 0;
 }

 public void  addDailySteps(int x){
  minsteps += x;
  ts++;
  if (x >= minsteps ){
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
 return (double)ts/totalDay;
 }
 /* to be implemented here */
} 
