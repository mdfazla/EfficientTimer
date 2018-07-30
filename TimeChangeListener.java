/**
 * Created by Md.Fazla Rabbi OPu on 7/30/2018.
 */

public interface TimeChangeListener {

    public void onTick(); //Notify based on interval time
    public long getInterval(); //Time that you want to get notified. Default is 1 second.
}
