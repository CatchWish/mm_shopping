package dps_03_action_type.dp07_observer.example3.concrete_observer;

import dps_03_action_type.dp07_observer.example3.concrete_subject.Secretary;
import dps_03_action_type.dp07_observer.example3.observer.Observer;

/**
 * 具体观察者角色:喜欢看NBA的员工<br>
 * @author Administrator
 */
public class NBAObserver implements Observer {

  /**名字*/
  private String name;
  /**前台*/
  private Secretary sub;

  /**
   * 构造函数<br>
   * @param name
   * @param sub
   */
  public NBAObserver(String name, Secretary sub) {
    this.name = name;
    this.sub = sub;
  }

  /**
   * 改变自己状态的方法
   */
  public void update() {
    System.out.println(sub.getAction() + "," + name + " 关闭NBA直播,继续工作!");
  }

}
