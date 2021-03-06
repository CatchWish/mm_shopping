package dps_01_build_type.dp02_factory.factory_method.example1.concrete_creator;

import dps_01_build_type.dp02_factory.factory_method.example1.concrete_product.Bmw;
import dps_01_build_type.dp02_factory.factory_method.example1.creator.Driver;
import dps_01_build_type.dp02_factory.factory_method.example1.product.Car;

/**
 * 具体工厂角色:宝马司机<br>
 * @author Administrator
 */
public class BmwDriver implements Driver {

  /**
   * 取车动作的实现<br>
   * @return Car
   */
  public Car driverCar() {
    return new Bmw();
  }

}