package dps_02_structure_type.dp04_decorator.example2.concrete_decorator;

import dps_02_structure_type.dp04_decorator.example2.decorator.Finery;

/**
 * 具体装饰（Concrete Decorator）角色：负责给构件对象"贴上"附加的责任。<br>
 * 大体恤<br>
 * @author Administrator
 */
public class TShirts extends Finery {

  /**
   * 展示自己
   */
  public void show() {
    System.out.print("大体恤 ");
    super.show();
  }

}
