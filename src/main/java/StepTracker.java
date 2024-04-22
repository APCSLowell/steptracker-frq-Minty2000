import java.util.ArrayList;
public class StepTracker
{
 private int adays,  minsteps,  totalDay, ts;
 
 StepTracker(int s){
    minsteps =s;
   adays= 0;
  totalDay=0;
  ts= 0;
 }

 public void  addDailySteps(int x){
  ts += x;
  totalDay++;
  if (x >= minsteps ){
adays ++;
  }
 }
 public int activeDays(){
  return adays;
 }

 public double averageSteps(){
if (ts == 0){
return 0.0;
}else 
 return (double)ts/totalDay;
 }
 /* to be implemented here */
} 
