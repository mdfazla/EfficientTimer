# EfficientTimer
In our Java or Android project sometimes we need to use multiple timer for various purpose. Sometimes we need long running timer.As a result multiple timer instances are created that means multiple thread are running and causes performance issues.To solve this problem i make a long running timer where you dont need to create any timer instances just register with TimeChangeListener with your interval time and you will be notified.
 
  # Usage

  Suppose your class is "TimerUser"  where you want to use a timer. 
        
        class TimerUser implements TimeChangeListener
        {
           public TimerUser(){
           
           }
           
           public void startTimer(){
              EfficientTimer.start(this);
           }
           public void stopTimer(){
              EfficientTimer.removeObserver(this);
           }
        
             @Override
             public void onTick() {
               ///Get notification at your interval time///
               /// You you want to update any UI make sure update it from UI thread.
             }

             @Override
             public long getInterval() {
             return 2000; //notify me every 2 seconds
             }
        
        }
      
      Thats it..
