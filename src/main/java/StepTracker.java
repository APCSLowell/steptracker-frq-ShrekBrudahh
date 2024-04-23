import java.util.ArrayList;
public class StepTracker
{
  private int dailyActiveSteps;
  private ArrayList<Integer> dailySteps;
  
  public StepTracker(int minDailySteps){
    dailyActiveSteps = minDailySteps;
    dailySteps = new ArrayList<Integer>();
  }
  
  public void addDailySteps(int steps){
    dailySteps.add(steps);
  }
  
  public int activeDays(){
    int sum = 0;
    for (int i = 0; i < dailySteps.size(); i++){
      if (dailySteps.get(i) >= dailyActiveSteps){
        sum++;
      }
    }
    return sum;
  }
  
  public double averageSteps(){
    int sum = 0;
    for (int i = 0; i < dailySteps.size(); i++){
      sum+= dailySteps.get(i);
    }
    if (dailySteps.size() == 0){
      return 0;
    }
    return sum/(double)(dailySteps.size());
  }
} 
